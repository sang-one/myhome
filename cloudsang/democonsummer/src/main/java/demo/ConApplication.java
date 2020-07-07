package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.core.env.ConfigurableEnvironment;

@SpringBootApplication
@EnableHystrix
@EnableDiscoveryClient
@EnableFeignClients
public class ConApplication {
    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(ConApplication.class);
        ConfigurableEnvironment ev = application.run(args).getEnvironment();
        System.out.println("启动成功");
        System.out.println("接口"+ ev.getProperty("server.port"));
    }

}
