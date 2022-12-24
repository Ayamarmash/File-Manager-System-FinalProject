package Logger;


import java.io.File;


public class Logger {

    private static final Logger instance = new Logger();
    private static File logFile;
    protected String env = System.getProperty("user.dir");
    public  String logname = "Logger";


    public static Logger getInstance(){
        return instance;
    }

    public static Logger getInstance(String withName){
        return instance;
    }

    public void createLogFile(){
    }

    private Logger(){
    }

    public static void logInfo(String message){
    }

    public static void logDebug(String message){
    }

    public static void logWarning(String message){
    }

    public static void logError(String message){
    }

}

