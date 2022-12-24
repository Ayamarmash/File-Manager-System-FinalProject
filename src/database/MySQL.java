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
        if(MySql==null)
        {
            MySql =  new MySQL();
            try {
                connectionDataBase = DriverManager.getConnection(LocalDataBaseURL, user, password);
                logger.logInfo("Create Connection to DataBase");
            }
            catch (SQLException e) {
                logger.logError(e.getMessage());
            }
        }
        return connectionDataBase;
    }
}