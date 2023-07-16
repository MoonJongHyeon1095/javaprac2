package chapter_28;

public class Jedi {
    private String name;
    private String force;
    private int age;

    public void showMyself(){
        System.out.printf("Jedi 인스턴스 : name: %s, force: %s, age: %d \n", name, force, age);
    }

    //힙 메모리에 저장된 인스턴스의 주소를 반환하는 메서드
    public Jedi returnMyself(){
        return this;
    }

    //this는 각각 생성될 인스턴스를 가리킴
    //1번 생성자
    public Jedi(String name){
        //아래 2번 인스턴스 생성자로 오버로딩
        this(name, "unknown");
    }

    //2번 생성자
    public Jedi(String name, String force){
        //아래 3번 인스턴스 생성자로 또 오버로딩
        this(name, force, -1);
    }

    //3번 생성자
    public Jedi(String name, String force, int age) {
        this.name = name;
        this.force = force;
        this.age = age;
    }

}
