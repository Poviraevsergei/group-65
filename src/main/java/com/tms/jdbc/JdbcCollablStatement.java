package com.tms.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;

public class JdbcCollablStatement {
    public static void main(String[] args) {
        Connection connection;
        try {
            Class.forName("org.postgresql.Driver");

            //2. создание соединения
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/group_65_db", "postgres", "root"); //URL(host,port,database_name), login, password
            CallableStatement statement = connection.prepareCall("{call find_max_salary_by_age(?)}");
            statement.registerOutParameter(1, Types.INTEGER);
            statement.setInt(1, 56);
            statement.execute();

            int result = statement.getInt(1);
            System.out.println(result);
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
    }
}
