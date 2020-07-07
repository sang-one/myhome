package demo.UserClients;

import demo.config.FeignConfig;
import demo.pojo.menu;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(value = "user",path ="menu" ,fallback = UserClientFallback.class,configuration = FeignConfig.class)
public interface UserClient {
    @GetMapping("get")
    List<menu> query();
}
