package com.fabio.javacompletoudemy.secao021aula230.application;

import com.fabio.javacompletoudemy.secao021aula230.db.DB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Program {
    public static void main(String[] args) {

        Connection conn = null;
        PreparedStatement prepSt = null;
        try {
            conn = DB.getConnection();
            prepSt = conn.prepareStatement(
                    "UPDATE seller " +
                            "SET BaseSalary = BaseSalary + ? " +
                            "WHERE " +
                            "(DepartmentId = ?)"
            );

            prepSt.setDouble(1, 200.0);
            prepSt.setInt(2, 2);

            int rowAffected = prepSt.executeUpdate();

            System.out.println("Done! Rows affected: " + rowAffected);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DB.closeStatement(prepSt);
            DB.closeConnection();
        }
    }
}
