public class Singleton {
    private static Singleton instance;
    public String value;



    private Singleton(String value){
        try {
            Thread.sleep(100);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        this.value = value;
    }

    public static Singleton getInstance(String value) {
        if(instance == null){
            instance = new Singleton(value);
        }
        return instance;
    }
}