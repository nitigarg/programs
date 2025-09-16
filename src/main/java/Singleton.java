public class Singleton {
    private static volatile Singleton instance;

    // throwing Runtime exception inside constructor will prevent breaking due to Reflection
    private Singleton() {
        if (instance != null) {
            throw new RuntimeException("Use getInstance()");
        }
    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized(Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    // this will prevent breaking singleton from Serialization
    protected Object readResolve() {
        return getInstance();
    }

    //this will prevent breaking singleton from cloning
    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}
