package eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.core.env.ConfigurableEnvironment;


@EnableEurekaServer
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class EurekaDemoApplication {
    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(EurekaDemoApplication.class);
        ConfigurableEnvironment ev = application.run(args).getEnvironment();
        System.out.println("启动成功");
        System.out.println("根地址: \t\thttp://localhost:" + ev.getProperty("server.port"));
    }
}
