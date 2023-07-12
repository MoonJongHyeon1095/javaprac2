import java.util.Scanner;

public class DecodeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        String[] numbersArray = input.split(" ");
        int[] numbers = new int[numbersArray.length];

        for (int i = 0; i < numbersArray.length; i++) {
            numbers[i] = Integer.parseInt(numbersArray[i]);
        }

        String decodedMessage = decodeNumbers(numbers);
        System.out.println("디코딩 결과:");
        System.out.println(decodedMessage);
    }

    public static String decodeNumbers(int[] numbers) {
        StringBuilder decodedMessage = new StringBuilder();

        for (int number : numbers) {
            // UTF-16 디코딩
            decodedMessage.append((char) number);
        }

        return decodedMessage.toString();
    }
}
