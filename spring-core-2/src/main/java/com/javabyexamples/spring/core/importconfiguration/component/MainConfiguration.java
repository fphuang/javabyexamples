package com.javabyexamples.spring.core.importconfiguration.component;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(ImpressionService.class)
public class MainConfiguration {

}