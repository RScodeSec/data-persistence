package com.rs.message;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MessageDAO {
    public static void createMessageDB(Message message){
        Conexion cnx = new Conexion();
        try {
            Connection connection = cnx.getConection();
            PreparedStatement ps =null;
            try {
                String query = "INSERT INTO message(message, author) VALUES(?,?)";
                ps = connection.prepareStatement(query);
                ps.setString(1, message.getMessage());
                ps.setString(2, message.getAuthor());
                ps.executeUpdate();
                System.out.println("Message created!!");
            }catch (SQLException ex){
                System.out.println(ex);
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
    public static  void readMessageDB(){
        Conexion cnx = new Conexion();
        try {
            Connection connection = cnx.getConection();
            PreparedStatement ps =null;
            ResultSet rs = null;
            try {
                String query = "SELECT * FROM message";
                ps = connection.prepareStatement(query);
                rs = ps.executeQuery();
                while (rs.next()){
                    System.out.println("ID: "+rs.getInt("id") +
                            "\nMessage: "+rs.getString("message")+
                            "\nAuthor: "+rs.getString("author")+
                            "\nDate: "+rs.getString("date"));
                    System.out.println();

                }

            }catch (SQLException ex){
                System.out.println("I can't read message ");
                System.out.println(ex);
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
    public static void deleteMessageDB(int id_message){
        Conexion cnx = new Conexion();
        try {
            Connection connection = cnx.getConection();
            PreparedStatement ps =null;
            try {
                String query = "DELETE FROM message WHERE id =?";
                ps = connection.prepareStatement(query);
                ps.setInt(1, id_message);
                ps.executeUpdate();
                System.out.println("message was deleted");

            }catch (SQLException ex){
                System.out.println("could not be deleted message");
                System.out.println(ex);
            }
        }catch (Exception e){
            System.out.println(e);
        }

    }
    public static void updateMessageDB(Message message){
        Conexion cnx = new Conexion();
        try {
            Connection connection = cnx.getConection();
            PreparedStatement ps =null;
            try {
                String query = "UPDATE  message SET message =? WHERE id =?";
                ps = connection.prepareStatement(query);
                ps.setString(1, message.getMessage());
                ps.setInt(2, message.getId_message());
                ps.executeUpdate();
                System.out.println("message update successful");

            }catch (SQLException ex){
                System.out.println("could not be updated message");
                System.out.println(ex);
            }
        }catch (Exception e){
            System.out.println(e);
        }

    }
}
