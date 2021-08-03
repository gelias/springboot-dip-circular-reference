package io.circulardependency.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ClazzBService {
    //@Autowired
    private ClazzAService clazzAService;

    public ClazzBService(ClazzAService clazzAService) {
        this.clazzAService = clazzAService;
    }
}
