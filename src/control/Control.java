package control;

import logger.Logger;
import database.Database;
import database.MySQL;
import java.sql.Connection;

public class Control {
    static Logger log;
    public static void main(String[] args) {
         Database db = new MySQL();
        Connection mysql = db.getConnection();
    }
}
