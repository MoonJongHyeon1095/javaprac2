package chapter_15;

public class Literal {
    public static void main(String[] args) {
        int num = 0b1010; //2진법
        int num2 = 0xAC; //16진법
        System.out.println(num); //10
        System.out.println(num2); //172

        double num3 = 5.22E5; //10의 5승 곱한다
        double num4 = 2.55E-3; //10의 -3승 곱한다
        System.out.println(num3);
        System.out.println(num4);

        //null은 참조형 타입에만 가능하다
        String str = null;
        //int myInt = null; 불가능
        System.out.println(str);
    }
}
