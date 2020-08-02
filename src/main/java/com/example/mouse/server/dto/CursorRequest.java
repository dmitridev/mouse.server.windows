package com.example.mouse.server.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class CursorRequest {
    int x;
    int y;
    boolean leftButton;
    boolean rightButton;
    boolean scrollUp;
    boolean scrollDown;
    boolean scrollLeft;
    boolean scrollRight;

    public String toString() {
        return String.format("{\"x\":\"%d\",\"y\":\"%d\"}", x, y);
    }

}
