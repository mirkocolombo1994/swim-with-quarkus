package com.swim.dto;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class Exercise {

    private int times;
    private int repeat;
    private String description;
    private int rest;
    private List<Tags> tags;


}
