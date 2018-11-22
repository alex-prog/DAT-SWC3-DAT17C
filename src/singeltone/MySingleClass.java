package singeltone;

public class MySingleClass {
//    private static MySingleClass instance = new MySingleClass();
    private static MySingleClass instance;

    private MySingleClass(){}

    public static synchronized MySingleClass getInstance(){
        if (instance == null) {
            instance = new MySingleClass();
        }
        return instance;
    }

}
