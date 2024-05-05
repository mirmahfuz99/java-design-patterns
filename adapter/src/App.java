public class App {
    public static void main(String[] args) throws Exception {
        
        var captain = new Captain(new FishingBoatAdapter());
        captain.row();

    }
}
