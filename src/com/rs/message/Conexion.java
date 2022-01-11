package com.rs.message;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    public Connection getConection(){
        Connection connection  =null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/message_app","root","");
            if(connection !=null){
                System.out.println("Connection successful");
            }

        }catch (SQLException e){
            System.out.println(e);

        }
        return connection;
    }

}
