package by.bsuir.dao;

import by.bsuir.Model.User;
import by.bsuir.db.DatabaseManager;
import by.bsuir.utils.DatabaseUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDAOImpl implements UserDAO {

    // Test code for db connection.
    //public static void main ( String [] args) {
    //    User user = new User(1, 1, "login", "password");
    //    UserDAOImpl userDAOImpl = new UserDAOImpl();
    //    userDAOImpl.add(user);
    //    System.out.println(user.getId());
    //}

    public void add(User user){
        try(Connection connection = DatabaseManager.getConnection();
            PreparedStatement statement = connection.prepareStatement(
                    "INSERT INTO Users (id, groupId, login, password) " +
                            "VALUES(DEFAULT, ?, ?, ?);")){
            statement.setString(1, user.getGroupId().toString());
            statement.setString(2, user.getLogin());
            statement.setString(3, user.getPassword());
            statement.executeUpdate();
            Integer insertId = DatabaseUtil.getLastInsertId(connection);
            if(insertId != null){
                user.setId(insertId);
            } else {
                throw new Exception("Can't insert user.");
            }
        } catch (SQLException e) {
            System.out.println("SQLException in UserDAOImpl.add; FIX OUTPUT IN LOGGER.");
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception in UserDAOImpl.add; FIX OUTPUT IN LOGGER.");
            System.out.println(e.getMessage());
        }
    }

    public void update(User user){
    }

    public User get(Integer id){
        return new User(1, 1, "", "");
    }

    public void delete(Integer id){
    }
}
