public class Item {
    private String upcCode;
    private int price;

    Item(String upc, int price){
        this.upcCode = upc;
        this.price = price;
    }

    public String getupcCode(){
        return upcCode;
    }


    public int getPrice(){
        return price;
    }
}
