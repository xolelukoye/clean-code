package practice2.task2;

public class Logger {

    private static Logger logger;

    private Logger() {
    }

    public static synchronized Logger getInstance() {
        if (logger == null) {
            logger = new Logger();
        }
        return logger;
    }

    public void printLogInfo(String message) {
        System.out.println("INFO: " + message);
    }

    public void printLogError(String message) {
        System.out.println("ERROR: " + message);
    }

    public void printLogWarning(String message) {
        System.out.println("WARNING: " + message);
    }
}
