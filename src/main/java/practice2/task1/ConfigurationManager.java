package practice2.task1;

public class ConfigurationManager {

    private static ConfigurationManager configurationManager;

    private String dataBaseUrl;
    private String username;
    private String password;
    private String storagePath;
    private String logLevel;
    private String logFilePath;

    private ConfigurationManager() {
    }

    public String getDataBaseUrl() {
        return dataBaseUrl;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getStoragePath() {
        return storagePath;
    }

    public String getLogLevel() {
        return logLevel;
    }

    public String getLogFilePath() {
        return logFilePath;
    }

    public void setDataBaseUrl(String dataBaseUrl) {
        this.dataBaseUrl = dataBaseUrl;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setStoragePath(String storagePath) {
        this.storagePath = storagePath;
    }

    public void setLogFilePath(String logFilePath) {
        this.logFilePath = logFilePath;
    }

    public void setLogLevel(String logLevel) {
        this.logLevel = logLevel;
    }

    public static synchronized ConfigurationManager getInstance() {
        if (configurationManager == null) {
            configurationManager = new ConfigurationManager();
        }
        return configurationManager;
    }
}
