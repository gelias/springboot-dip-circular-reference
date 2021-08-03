package io.circulardependency.api;

import io.circulardependency.api.model.AppStatusResponse;
import io.circulardependency.service.ClazzAService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = { "", "/status"})
public class StatusController {

    @Autowired
    private ClazzAService versionService;

    @Value("${version}")
    private String version;

    @Value("${spring.application.name}")
    private String applicationName;

    @GetMapping(produces = "application/json")
    public AppStatusResponse status() {
        return new AppStatusResponse(applicationName, version, HttpStatus.OK.value());
    }
}
