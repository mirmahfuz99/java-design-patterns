public enum Profession {
    DOCTOR, ENGINEER, TEACHER;

    @Override
    public String toString(){
        return name().toLowerCase();
    }
}
