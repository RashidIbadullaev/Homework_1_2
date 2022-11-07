public class Grandfather {

    private String name;
    private int age;
    private Habits habits;

    private Profession profession;

    public Grandfather(String name, int age, Habits habits, Profession profession) {
        this.name = name;
        this.age = age;
        this.habits = habits;
        this.profession = profession;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Profession getProfession() {
        return profession;
    }

    public Habits getHabits() {
        return habits;
    }

}
