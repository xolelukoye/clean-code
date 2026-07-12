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

    public static ConfigurationManager getInstance() {
        if (configurationManager == null) {
            configurationManager = new ConfigurationManager();
        }
        return configurationManager;
    }
}
