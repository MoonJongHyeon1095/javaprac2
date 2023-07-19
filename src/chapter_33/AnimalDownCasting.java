package chapter_33;

public class AnimalDownCasting {
    public static void main(String[] args) {
        //다운캐스팅 가능
        Animal animal = new Bird();
        checkBirdAndFly(animal);

        //에러, 부모 클래스로 찍은 인스턴스에서 바로 다운캐스팅 불가능
        Animal animal2 = new Animal();
        checkBirdAndFly(animal2);

        //에러, 다른 자식 클래스로 찍은 인스턴스에서 바로 다운캐스팅 불가능
        Animal animal3 = new Person();
        checkBirdAndFly(animal3);


        }
    static void checkBirdAndFly(Animal animal) {
        if (animal instanceof Bird) {
            Bird bird = (Bird) animal;
            bird.fly();
        } else {
            System.out.println("너는 새가 아니야");
        }
    }
}
