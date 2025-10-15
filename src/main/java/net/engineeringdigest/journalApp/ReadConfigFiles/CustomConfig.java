package net.engineeringdigest.journalApp.ReadConfigFiles;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:config/app-info.properties")
public class CustomConfig {

    @Value("${project.owner}")
    private String owner;

    @Value("${project.location}")
    private String location;

    public void printDetails() {
        System.out.println("Using Custom Config: ");
        System.out.println("Owner: " + owner);
        System.out.println("Location: " + location);
    }
}

