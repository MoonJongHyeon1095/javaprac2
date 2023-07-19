import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Reduce {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // 1. 초기값과 이항 연산자를 사용하여 스트림의 요소를 축소
        int sum = numbers.stream().reduce(0, (a, b) -> a + b);
        System.out.println("Sum: " + sum); // Output: Sum: 15

        // 2. 초기값 없이 이항 연산자만 사용하여 스트림의 요소를 축소
        Optional<Integer> product = numbers.stream().reduce((a, b) -> a * b);
        product.ifPresent(p -> System.out.println("Product: " + p)); // Output: Product: 120
    }
}