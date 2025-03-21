package CreationalPatterns.SingletonPattern;


class AppSettingsWith {
    // Step 1: Private static instance of the class
    private static AppSettingsWith instance;

    private String databaseUrl;
    private String apiKey;

    //Step 2 : Private constructor to prevent direct object creation
    private AppSettingsWith(){
        //Read settings from a config file
        databaseUrl = "jdbc:mysql://localhost:3306/mydatabase";
        apiKey = "12345-ABCDE";
    }

    //Step 3: Public static method to get the single instance
    public static AppSettingsWith getInstance(){
        if(instance==null){
            instance = new AppSettingsWith();
        }
        return instance;
    }

    public String getDatabaseUrl(){
        return databaseUrl;
    }
    public String getApiKey(){
        return apiKey;
    }
}
public class WithSingletonPattern {
    public static void main(String[] args) {
        AppSettingsWith appSettings = AppSettingsWith.getInstance(); //change this code
        AppSettingsWith appSettingsCopy = AppSettingsWith.getInstance();

        System.out.println(appSettingsCopy.getApiKey());
        System.out.println(appSettings.getApiKey());

        //More memory
        System.out.println(appSettings==appSettingsCopy);

    }
}
