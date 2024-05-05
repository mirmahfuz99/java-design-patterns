public class FishingBoatAdapter implements RowingBoat{


    private final FishingBoat boat;


    public FishingBoatAdapter() {
        boat = new FishingBoat();
    }


    public final void row(){
        boat.sail();
    }

    
}
