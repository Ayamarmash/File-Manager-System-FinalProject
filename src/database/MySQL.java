package database;

import logger.Logger;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQL implements Database{
    private static MySQL MySql = null; // Singleton
    Logger logger;
    private String LocalDataBaseURL = "jdbc:mysql://localhost:3306/mydb";
    private String user = "root";
    private String password = "1234";
    Connection connectionDataBase = null;

    public Connection getConnection()
    {
        return connectionDataBase;
    }
}
