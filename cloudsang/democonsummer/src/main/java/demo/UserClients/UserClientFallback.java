package demo.UserClients;

import demo.pojo.menu;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserClientFallback implements UserClient {
    @Override
    public List<menu> query() {
        return null;
    }
}
