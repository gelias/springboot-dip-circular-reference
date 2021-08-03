package io.circulardependency.api.model;

public class AppStatusResponse {
    private final String applicationName;
    private final String version;
    private final int value;

    public AppStatusResponse(String applicationName, String version, int value) {
        this.applicationName = applicationName;
        this.version = version;
        this.value = value;
    }
}
