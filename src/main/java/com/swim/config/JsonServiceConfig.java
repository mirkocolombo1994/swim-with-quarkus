package com.swim.config;

import io.smallrye.config.ConfigMapping;
import jakarta.inject.Singleton;

@ConfigMapping(prefix = "jsonservice")
@Singleton
public interface JsonServiceConfig {

    String jsonFilePath();

}
