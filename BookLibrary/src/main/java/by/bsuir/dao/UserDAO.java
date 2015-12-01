package by.bsuir.dao;

import by.bsuir.Model.User;
import java.util.List;

public interface UserDAO {
    void add(User user);
    void update(User user);
    User get(Integer id);
    void delete(Integer id);
}
