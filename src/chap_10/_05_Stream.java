package chap_10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class _05_Stream {
    public static void main(String[] args) {
        // 스트림

        // 스트림 생성
        // Array.stream
        int[] scores = {100, 95, 90, 85, 80};
        IntStream scoreStream = Arrays.stream(scores);

        String[] langs = {"python", "java", "javascript", "c", "c++", "c#"};
        Stream<String> langStream = Arrays.stream(langs);

        // Collection.stream()
        List<String> langList = new ArrayList<>();
        // langList.add("python");
        // langList.add("java");

        langList = Arrays.asList("python", "java", "javascript", "c", "c++", "c#");
        System.out.println(langList.size());
        Stream<String> langListStream = langList.stream();
        System.out.println("---------------");

        // Stream.of()
        Stream<String> langListOfStream = Stream.of("python", "java", "javascript", "c", "c++", "c#");

        // 스트림 사용
        // 중간 연산 (intermediate operation)
            // filter, map, sorted, distinct, skip, ...
        // 최종 연산 (terminal operation)
            // count, min, max, sum, forEach, ...

        // 90점 이상 점수 출력
        Arrays.stream(scores).filter(x -> x >= 90).forEach(x -> System.out.println(x));
        Arrays.stream(scores).filter(x -> x >= 90).forEach(System.out::println);
        System.out.println("---------------");

        // 90점 이상 사람 수
        long count = Arrays.stream(scores).filter(x -> x >= 90).count();
        System.out.println(count);
        System.out.println("---------------");

        // 90점 이상인 점수들의 함
        int sum = Arrays.stream(scores).filter(x -> x >= 90).sum();
        System.out.println(sum);
        System.out.println("---------------");

        // 정렬
        Arrays.stream(scores).filter(x -> x >= 90).sorted().forEach(System.out::println);
        System.out.println("---------------");

    }
}
