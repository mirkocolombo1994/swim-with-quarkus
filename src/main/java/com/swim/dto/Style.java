package com.swim.dto;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class Style {

    private String style;
    private String label;
    private List<Exercise> exercies;

}
