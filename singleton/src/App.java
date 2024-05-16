public class App {
    public static void main(String[] args) throws Exception {
        Singleton singleton = Singleton.getInstance("One");
        Singleton anotherSingleton = Singleton.getInstance("Two");


        System.out.println(singleton.value);
        System.out.println(anotherSingleton.value);
    }
}
