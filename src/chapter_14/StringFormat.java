package chapter_14;

public class StringFormat {
    public static void main(String[] args) {
        String str1 = "Happy";
        String str2 = String.valueOf(123);

        String result = String.format("%s, %S", str1, str1);

        System.out.println("%s"); //그냥 %s 출력
        System.out.println("%S");
        System.out.println(result); //Happy, HAPPY


        int a = 10;
        result = String.format("%d", a);
        System.out.println(result); //10

        result = String.format("%015d", a); //15자리 0으로 채움
        System.out.println(result);

        float b = 3.141592f;
        result = String.format("%f, %.1f, %.2f, %.3f", b, b, b, b);
        System.out.println(result);

    }

}
