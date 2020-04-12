package com.fabio.javacompletoudemy.secao021aula229.application;

import com.fabio.javacompletoudemy.secao021aula229.db.DB;
import com.fabio.javacompletoudemy.secao021aula229.db.DbException;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Program {
    public static void main(String[] args) {
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;

        try {
            conn = DB.getConnection();
            st = conn.createStatement();

            String sql = "select * from department";
            rs = st.executeQuery(sql);

            while(rs.next()) {
                System.out.println(rs.getInt("Id")  + ", " + rs.getString("Name"));
            }
        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        } finally {
            DB.closeResultSet(rs);
            DB.closeStatement(st);
            DB.closeConnection();
        }
    }
}
