import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> someBingoNumbers = Arrays.asList(
                "N40", "n43",
                "B12", "B60",
                "G12", "G14", "G45",
                "I10", "I15", "I12",
                "O4", "O12", "O19"
        );
//        List<String> gnumbers = new ArrayList<>();
//        someBingoNumbers.forEach(o1 -> {
//            if (o1.startsWith("G")) {
//                gnumbers.add(o1);
////                System.out.println(o1);
//            }
//        });
//        gnumbers.sort((o1, o2) -> o1.compareTo(o2));
//        gnumbers.forEach(o1 -> System.out.println(o1));
        Collections.sort()
        List gnumbers = someBingoNumbers.stream()
                .map(String::toUpperCase)
                .filter(s->s.startsWith("G"))
                .sorted()
                .forEach(System.out :: println;
    }
}
