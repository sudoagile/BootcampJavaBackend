package org.example;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {
    private static final String url = "jdbc:postgresql://localhost:5432/aeropuerto2";
    private static  final String usuario = "postgres";
    private static  final String password = "123456";
    private static Connection connection;

    public static Connection getConnection()
    {
        if (connection==null){

            try{
                connection = DriverManager.getConnection(url, usuario, password);
            }
            catch (Exception e)
            {
                System.out.println(e.getCause());
            }
        }


    }

}
