package user.userDao;

import org.apache.ibatis.annotations.Mapper;
import user.Pojo.menu;

import java.util.List;
@Mapper
public interface Userdao {
    List<menu> get();
}
