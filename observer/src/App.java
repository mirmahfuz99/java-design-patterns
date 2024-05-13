//initialization code

public class App {
    public static void main(String[] args) throws Exception {
        Editor editor = new Editor();

        editor.events.subscribe("open", new EmailNotificationListener("admmin@example.com"));


        try {
            editor.openFile("test.txt");

        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
