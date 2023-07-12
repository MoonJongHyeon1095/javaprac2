package chapter_14;

public class Encoding {
    public static void main(String[] args) {
        //'Z' -> int
        char ch1 = 'Z';
        System.out.println(ch1);
        System.out.println((int)ch1);

        //Int -> char
        // 65~90 A~Z, 96~122 a~z
        int num = 66;
        System.out.println(num); // 66
        System.out.println((char)num); // B


        char smallA = 'a'; // 96
        char largeA = 'A'; // 65
        boolean result = smallA > largeA;
        System.out.println(result); //true

        //유니코드
        char hangul = '\uAC00';
        System.out.println(hangul);

        //특수 \t \n \'
        char s1 = '\t';
        char s2 = '\n';
        char s3 = '\'';
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);




    }
}
