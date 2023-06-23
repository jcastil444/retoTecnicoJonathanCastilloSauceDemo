package com.sura.saucedemo.data;

import com.sura.saucedemo.log.Log4jData;
import com.sura.saucedemo.pages.PageIngreso;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public class UserDTO {
    private final Connection connection;
    Log4jData log4jData;

    public UserDTO() {
        this.connection = new MySQLConnection("localhost", "3306", "dataUsers",
                "root", "123456").getMySQLConnection();
        log4jData = new Log4jData(PageIngreso.class.getSimpleName());

    }

    public Map<Integer, User> getUsers() {

        Map<Integer, User> userMap = new HashMap<>();
        try {
            String sqlQuery = "Select * From dataUsers";

            ResultSet resultSet = connection.createStatement().executeQuery(sqlQuery);

            while (resultSet.next()) {
                Integer id = resultSet.getInt("id");
                String userName = resultSet.getString("user");
                String lastName = "lastName";
                String password = resultSet.getString("password");
                String postalCode = "postalCode";

                User user = new User(id, userName, lastName, password, postalCode);
                userMap.put(id, user);
            }
        } catch (SQLException sqlException) {
            log4jData.getLogger().error(sqlException.getMessage());
        }

        return userMap;
    }
}
