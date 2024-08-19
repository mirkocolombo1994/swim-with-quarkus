package com.swim.dto;

import com.google.gson.annotations.SerializedName;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class ConfigFile {

    @SerializedName("pool_length")
    private int poolLength;
    private List<Style> styles;

}
