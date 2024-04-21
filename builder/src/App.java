
public class App {
    public static void main(String[] args) throws Exception {
        var doctor = new Person.PersonBuilder("Mr Rakib", "100")
                            .withPersonProfession(Profession.DOCTOR).build();

    
        System.out.println(doctor.toString());
    }
}
