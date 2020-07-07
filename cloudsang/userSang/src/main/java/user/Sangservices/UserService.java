package user.Sangservices;


import org.springframework.stereotype.Service;
import user.Pojo.menu;

import java.util.List;

@Service
public interface UserService {
    List<menu> query() ;
}
