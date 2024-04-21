public class Person {
    
    //required parameters
    private String name;
    private String age;

    //Optional Parameters
    private Profession personProfession;
    private HairColor personHairColor;

    private Person(PersonBuilder personBuilder){
        this.name = personBuilder.name;
        this.age = personBuilder.age;
    }

    @Override

    public String toString(){

        var sb = new StringBuilder();
        sb.append("This is ").append(personProfession)
                                    .append(" named")
                                    .append(name);
        return sb.toString();
    }



    public static class PersonBuilder{
    
        //required parameters
        private String name;
        private String age;
    
        //Optional Parameters
        private Profession personProfession;
        private HairColor personHairColor;
    
        public PersonBuilder(String name, String age){
            this.name = name;
            this.age = age;
        }
    
        public PersonBuilder withPersonProfession(Profession profession){
            this.personProfession = profession;
            return this;
        }
    
        public PersonBuilder withPersonHairColor(HairColor hairColor){
            this.personHairColor = hairColor;
            return this;
        }
    
        public Person build(){
            return new Person(this);
        }
    }
    

}
