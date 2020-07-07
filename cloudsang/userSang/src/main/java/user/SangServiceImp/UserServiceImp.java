package user.SangServiceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import user.Pojo.menu;
import user.Sangservices.UserService;
import user.userDao.Userdao;

import java.util.List;

@Service
public class UserServiceImp implements UserService {

    @Autowired
    Userdao userdao;
    @Override
    public List<menu> query() {
        return userdao.get();
    }
}
