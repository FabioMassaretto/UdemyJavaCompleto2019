package com.fabio.javacompletoudemy.secao021aula233.application;

import com.fabio.javacompletoudemy.secao021aula233.db.DB;
import com.fabio.javacompletoudemy.secao021aula233.db.DbIntegrityException;

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
                    "DELETE FROM department " +
                            "WHERE " +
                            "Id = ?"
            );

            prepSt.setInt(1,2);

            int rowAffected = prepSt.executeUpdate();

            System.out.println("Done! Rows affected: " + rowAffected);
        } catch (SQLException e) {
            throw new DbIntegrityException(e.getMessage());
        } finally {
            DB.closeStatement(prepSt);
            DB.closeConnection();
        }
    }
}
