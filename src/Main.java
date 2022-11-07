public class Main {
    public static void main(String[] args) {

        Father father = new Father("Rustam", 46, Habits.SMOTRET_TELEVZOR,
                new Profession("Engineer", 10));
        Son son = new Son("Rashid", 21, Habits.DELAT_ZARIADKY,
                new Profession("Programmist", 5));
        Son son1 = new Son("Rinat", 18, Habits.CHITAT_GAZETY,
                new Profession("Zhurnalist", 3));
        System.out.println();
        System.out.println(father.getInfo());
        System.out.println();
        System.out.println(son.getInfo());
        System.out.println();
        System.out.println(son1.getInfo());
    }
}