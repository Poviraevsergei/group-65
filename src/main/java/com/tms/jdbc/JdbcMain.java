package com.tms.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class JdbcMain {
    public static void main(String[] args) throws SQLException {
        //1. регистрация драйвера
        Connection connection = null;
        try {
            Class.forName("org.postgresql.Driver");

            //2. создание соединения
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/group_65_db", "postgres", "root"); //URL(host,port,database_name), login, password

            //3. создание PrepareStatement
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM users");
            //statement.setLong(1, 2);

            //4. Отправка запроса
            //boolean result = statement.execute(); - выполняет, но результат не дает(только true/false)
            //int result = statement.executeUpdate(); - выполняет, возвращает сколько строк изменил.
            //ResultSet resultSet = statement.executeQuery(); - выполняет и отдает результат(ResultSet)
            ResultSet resultSet = statement.executeQuery();

            //5. достаем данные из запроса
            ArrayList<User> userList = new ArrayList<>();
            while (resultSet.next()) {
                User user = new User();
                user.setId(resultSet.getLong("id"));
                user.setUsername(resultSet.getString("username"));
                user.setIsAdult(resultSet.getBoolean("is_adult"));
                user.setAge(resultSet.getInt("age"));
                userList.add(user);
            }
            System.out.println(userList);
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        } finally {
            connection.close();
        }
    }
}
