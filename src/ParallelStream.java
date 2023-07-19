import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ParallelStream {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            numbers.add(i);
        }

        // 순차 스트림 처리
        Stream<Integer> sequentialStream = numbers.stream();
        sequentialStream.forEach(num -> System.out.print(num + " "));

        System.out.println("\n---");

        // 병렬 스트림 처리, 순서보장X
        Stream<Integer> parallelStream = numbers.parallelStream();
        parallelStream.forEach(num -> System.out.print(num + " "));
    }
}
