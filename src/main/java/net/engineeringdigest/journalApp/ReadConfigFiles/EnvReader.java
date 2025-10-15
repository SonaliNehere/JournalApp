package net.engineeringdigest.journalApp.ReadConfigFiles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class EnvReader {

    @Autowired
    private Environment env;

    public void showEnvValues() {
        System.out.println("Using Environment Object: ");
        String name = env.getProperty("app.name");
        String version = env.getProperty("app.version");
        System.out.println(name + " - " + version);
    }
}

