package com.fabio.javacompletoudemy.secao021aula226e227.application;

import com.fabio.javacompletoudemy.secao021aula226e227.db.DB;

import java.sql.Connection;

public class Program {
    public static void main(String[] args) {
        Connection conn = DB.getConnection();
        DB.closeConnection();
    }
}
