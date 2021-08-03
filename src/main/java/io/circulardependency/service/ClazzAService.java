package io.circulardependency.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ClazzAService {
    //@Autowired
    private ClazzBService clazzBService;

    public ClazzAService(ClazzBService clazzBService) {
        this.clazzBService = clazzBService;
    }
}
