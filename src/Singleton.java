public class Singleton {

    static Singleton instance;

    private Singleton ()
    {

    }

    private static Singleton getInstance()
    {
        if (instance == null)
            instance = new Singleton();

        return instance;
    }
}
