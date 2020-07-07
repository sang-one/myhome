package demo.UserService;

import demo.UserClients.UserClient;
import demo.pojo.menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Userservices {
    @Autowired
    UserClient UserClient;

    public List<menu> query() {
        return UserClient.query();
    }
}
