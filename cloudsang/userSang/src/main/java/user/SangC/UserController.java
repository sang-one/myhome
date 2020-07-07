package user.SangC;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import user.Pojo.menu;
import user.Sangservices.UserService;

import java.util.List;

@RestController
@RequestMapping("menu")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value="get",method = RequestMethod.GET)
    public List<menu> getid() {

        return userService.query();
    }
}
