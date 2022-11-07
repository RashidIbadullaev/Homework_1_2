public class Father extends Grandfather{


    public Father(String name, int age, Habits habits, Profession profession) {
        super(name, age, habits, profession);
    }

    final public void habit(){
        System.out.println("Idet na raboty");
    }

    public String getInfo(){
        return "Age: " + getAge() +
                "\nName: " + getName() +
                "\nHabits: " + getHabits() +
                "\nProfession: " + getProfession().getProfession() +
                "\nExperience " + getProfession().getExperience();
    }
}
