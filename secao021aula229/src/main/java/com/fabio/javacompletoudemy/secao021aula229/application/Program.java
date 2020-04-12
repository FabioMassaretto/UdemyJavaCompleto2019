package com.fabio.javacompletoudemy.secao021aula229.application;

import com.fabio.javacompletoudemy.secao021aula229.db.DB;
import com.fabio.javacompletoudemy.secao021aula229.db.DbException;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Program {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Connection conn = null;
        PreparedStatement st = null;

        try {
            conn = DB.getConnection();

            /*
            st = conn.prepareStatement(
                    "INSERT INTO seller" +
                            "(Name, Email, BirthDate, BaseSalary, DepartmentId)" +
                            "VALUES (?, ?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);

            st.setString(1, "Carl Purple");
            st.setString(2, "carlpurple@gmail.com");
            st.setDate(3, new Date(sdf.parse("25/04/1985").getTime()));
            st.setDouble(4, 3000.0);
            st.setInt(5, 4);
            */
            st = conn.prepareStatement(
                    "INSERT INTO department (Name) VALUES('D1'), ('D2')",
                            Statement.RETURN_GENERATED_KEYS
            );

            int rowAffected = st.executeUpdate();

            if(rowAffected > 0) {
                ResultSet rs = st.getGeneratedKeys();
                while (rs.next()) {
                    int id = rs.getInt(1);
                    System.out.println("Done! Id = " + id);
                }
            } else {
                System.out.println("No rows affected!");
            }

            System.out.println("Done! Rows Affected: " + rowAffected);

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DB.closeStatement(st);
            DB.closeConnection();
        }
    }
}
