package Singleton;

public class Singleton {

    private static Singleton instance = null;

    public int number;
    private Singleton()
    {
        number = 8;
    }

    public static Singleton getInstance()
    {
        if(instance==null)
        {
            instance = new Singleton();
        }
        return instance;
    }


}
