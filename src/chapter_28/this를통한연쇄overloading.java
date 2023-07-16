package chapter_28;

public class this를통한연쇄overloading {
    public static void main(String[] args) {
        Jedi jedi1 = new Jedi("Anakin");
        Jedi jedi2 = new Jedi("Luke", "LightSide");
        Jedi jedi3 = new Jedi("Yoda", "LightSide", 500);

        jedi1.showMyself();
        jedi2.showMyself();
        jedi3.showMyself();

        Jedi jedi11 = jedi1.returnMyself();
        Jedi jedi22 = jedi2.returnMyself();
        Jedi jedi33 = jedi3.returnMyself();
        System.out.println(jedi11);
        System.out.println(jedi22);
        System.out.println(jedi33);
    }
}
