package com.example.mouse.server.MouseController;

import com.example.mouse.server.dto.CursorRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.awt.event.InputEvent;

@RestController
@RequestMapping("/mouse")
@RequiredArgsConstructor
public class MouseController {
    private final Robot bot;
    private int x = 0;
    private int y = 0;

    @PostMapping("/move")
    public void postCursorInfo(@RequestBody CursorRequest request) {
        bot.mouseMove(
            (int) MouseInfo.getPointerInfo().getLocation().getX() + request.getX(),
            (int) MouseInfo.getPointerInfo().getLocation().getY() + request.getY());
    }

    @PostMapping("/left")
    public void postLeftButtonClick(@RequestBody CursorRequest request) {
        if (request.isLeftButton())
            bot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        else
            bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
    }

    @PostMapping("/right")
    public void postRightButtonClick(@RequestBody CursorRequest request) {
        if (request.isRightButton())
            bot.mousePress(InputEvent.BUTTON3_DOWN_MASK);
        else
            bot.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);
    }

    @PostMapping("/scroll/up")
    public void postScrollButtonUp(@RequestBody CursorRequest request) throws InterruptedException {
        bot.mouseWheel(-1);
    }

    @PostMapping("/scroll/down")
    public void postScrollButtonDown(@RequestBody CursorRequest request) throws InterruptedException {
        bot.mouseWheel(1);
    }


    @GetMapping
    public String get() {
        return "Here";
    }
}
