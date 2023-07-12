import java.util.Arrays;
import java.util.Scanner;

public class MovieRating {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int age = scanner.nextInt();
        System.out.println(Arrays.toString(args));
        int age = Integer.parseInt(args[0]);

        String rating = getMovieRating(age);
        System.out.println("영화 관람 등급: " + rating);
    }

    private static String getMovieRating(int age) {
        if (age < 0) {
            return "유아 관람불가";
        } else if (age < 12) {
            return "전체 관람가";
        } else if (age < 15) {
            return "12세 이상 관람가";
        } else if (age < 19) {
            return "15세 이상 관람가";
        } else {
            return "청소년 관람불가";
        }
    }
}
