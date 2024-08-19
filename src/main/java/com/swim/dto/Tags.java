package com.swim.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Tags {
    LIGHT("L"),
    NORMAL("N"),
    TECHNIC("T"),
    AEROBIC("A"),
    ANAEROBIC("Z");

    private String tag;


}
