package versioncontrol;

import logger.Logger;

import java.sql.;
import java.util.ArrayList;
import java.util.Scanner;

public class Export implements VersionControl{
    @Override
    public void Snap(Connection database) {

        rollback(database);
    }
    Logger log;
    int version;
    private ArrayList<String> tables;
    private String databaseName;

   
    }
}
