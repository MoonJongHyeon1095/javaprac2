package w3d4;

public class Student {
    private String 이름;
    private int 학번;
    private String 전공;
    private int 학년;

    public Student(String 이름, int 학번, String 전공, int 학년) {
        this.이름 = 이름;
        this.학번 = 학번;
        this.전공 = 전공;
        this.학년 = 학년;
    }

    public void set이름(String 이름) {
        this.이름 = 이름;
    }

    public void set학번(int 학번) {
        this.학번 = 학번;
    }

    public void set전공(String 전공) {
        this.전공 = 전공;
    }

    public void set학년(int 학년) {
        this.학년 = 학년;
    }

    public String get이름() {
        return 이름;
    }

    public int get학번() {
        return 학번;
    }

    public String get전공() {
        return 전공;
    }

    public int get학년() {
        return 학년;
    }
}
