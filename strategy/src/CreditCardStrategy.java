public class CreditCardStrategy implements PaymentStrategy{

    private String name;
    private String cardName;
    private String CVV;
    private String dateOfExperi;


    public CreditCardStrategy(String name, String cName, String cvv, String dateOfExpire){
        this.name = name;
        this.cardName = cName;
        this.CVV = cvv;
        this.dateOfExperi = dateOfExpire;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid with credit/debit card");
    }
    
}
