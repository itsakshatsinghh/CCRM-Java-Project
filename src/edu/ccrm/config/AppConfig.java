package edu.ccrm.config;

import java.nio.file.Path;
import java.nio.file.Paths;


public class AppConfig {
    private static AppConfig instance;

    private Path dataDir;
    private Path backupDir;

    private AppConfig() {
        
        dataDir = Paths.get("data");
        backupDir = Paths.get("backup");
    }

    public static synchronized AppConfig getInstance() {
        if (instance == null) {
            instance = new AppConfig();
        }
        return instance;
    }

    //config load karne ke liye
    public void loadConfig() {
        
        System.out.println("AppConfig: Data directory set to " + dataDir.toAbsolutePath());
    }

    public Path getDataDir() { return dataDir; }
    public Path getBackupDir() { return backupDir; }
}
