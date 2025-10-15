package net.engineeringdigest.journalApp.Controller;

import net.engineeringdigest.journalApp.ReadConfigFiles.AppConfigReader;
import net.engineeringdigest.journalApp.ReadConfigFiles.AppProperties;
import net.engineeringdigest.journalApp.ReadConfigFiles.CustomConfig;
import net.engineeringdigest.journalApp.ReadConfigFiles.EnvReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

@RestController
public class HealthCheck {

    @GetMapping("health-check")
    public String healthCheck(){
        return "OK";
    }

    @PostConstruct
    public void init() {
        System.out.println("✅ HealthCheck in Application initialized at: " + java.time.LocalTime.now());
    }

}
