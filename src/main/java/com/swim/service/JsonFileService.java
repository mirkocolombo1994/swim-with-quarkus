package com.swim.service;

import com.google.gson.Gson;
import com.swim.dto.ConfigFile;
import com.swim.dto.Style;
import jakarta.enterprise.context.ApplicationScoped;
import lombok.extern.slf4j.Slf4j;

import java.io.InputStreamReader;
import java.io.Reader;
import java.util.List;
import java.util.Objects;

@ApplicationScoped
@Slf4j
public class JsonFileService {

    public ConfigFile getConfigFile(String path){
        ConfigFile result;
        result = new Gson().fromJson(getFile(path), ConfigFile.class);
        return result;
    }

    public List<Style> getAllStyles(String path) {
        ConfigFile result;
        result = new Gson().fromJson(getFile(path), ConfigFile.class);
        return result.getStyles();
    }

    private Reader getFile(String path){
        return new InputStreamReader(Objects.requireNonNull(this.getClass().getResourceAsStream(path)));
    }

}

