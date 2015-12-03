package by.bsuir.utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabaseUtil {

    public static Integer getLastInsertId(Connection connection){
        try(PreparedStatement statement = connection.prepareStatement("SELECT LAST_INSERT_ID();");
            ResultSet resultSet = statement.executeQuery()){
            if(resultSet.next()){
                return new Integer(resultSet.getInt(1));
            }
        } catch (SQLException e) {
            System.out.println("Error in DatabaseUtil.getLastInserId; RIDIRECT THIS MESSEGE TO LOGGER!!!");
            System.out.println(e.getMessage());
        }
        return null;
    }
}
