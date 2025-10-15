package net.engineeringdigest.journalApp.Controller;

import net.engineeringdigest.journalApp.ReadConfigFiles.AppConfigReader;
import net.engineeringdigest.journalApp.ReadConfigFiles.AppProperties;
import net.engineeringdigest.journalApp.ReadConfigFiles.CustomConfig;
import net.engineeringdigest.journalApp.ReadConfigFiles.EnvReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReadConfig {

    @Autowired
    private AppConfigReader appConfigReader;

    @Autowired
    private AppProperties appProperties;

    @Autowired
    private CustomConfig customConfig;

    @Autowired
    private EnvReader envReader;

    @GetMapping("read-config")
    public void readConfig(){

        //🧠 Best Practice
        //Use @ConfigurationProperties for multiple related values.
        //Use @Value for simple or individual property injections.
        //Use Environment when you don’t know property keys at compile-time.

        //Using @Value
        //This is the most direct and simple way.
        appConfigReader.printAppDetails();
        System.out.println();

        //Using @ConfigurationProperties
        //This approach is best for grouped or structured properties.
        showDetails();
        System.out.println();

        //Using Custom Config
        customConfig.printDetails();
        System.out.println();

        //Using Environment Object
        envReader.showEnvValues();
        System.out.println();

    }

    public void showDetails() {
        System.out.println("Using @ConfigurationProperties: ");
        System.out.println("App: " + appProperties.getName());
        System.out.println("Version: " + appProperties.getVersion());
        System.out.println("Description: " + appProperties.getDescription());
    }
}
