package net.engineeringdigest.journalApp.ReadConfigFiles;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AppConfigReader {

    @Value("${app.name}")
    private String appName;

    @Value("${app.version}")
    private String appVersion;

    @Value("${app.description}")
    private String appDescription;

    public void printAppDetails() {
        System.out.println("Using @Value: ");
        System.out.println("App Name: " + appName);
        System.out.println("Version: " + appVersion);
        System.out.println("Description: " + appDescription);
    }
}
