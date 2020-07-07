package user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.core.env.ConfigurableEnvironment;

@SpringBootApplication
@EnableDiscoveryClient
public class UserSangStart {
    public static void main(String[] args) {

        //SpringApplication.run(UserSangStart.class,args);
        SpringApplication application = new SpringApplication(UserSangStart.class);
        ConfigurableEnvironment environment = application.run(args).getEnvironment();
        System.out.println("启动成功");
        System.out.println("根地址: \t\thttp://localhost:" + environment.getProperty("server.port"));
    }
}
