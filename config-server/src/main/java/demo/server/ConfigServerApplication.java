package demo.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.util.StringUtils;

@SpringBootApplication
@EnableConfigServer
public class ConfigServerApplication {
    public static void main(String[] args) {
        final String defaultProfile = "git";
        final String profileValues = System.getProperty("spring.profiles.active");

        if (StringUtils.isEmpty(profileValues)) {
            System.setProperty("spring.profiles.active", defaultProfile);
        }

        SpringApplication.run(ConfigServerApplication.class, args);
    }
}
