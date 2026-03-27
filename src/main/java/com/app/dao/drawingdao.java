package com.app.dao;
import java.sql.*;
import com.app.util.DBConnection;

public class DrawingDAO {

    public static void save(String data) {
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(
                "INSERT INTO drawings(data) VALUES(?)"
            );
            ps.setString(1, data);
            ps.executeUpdate();
            con.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}