package HW3.Task4;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        List<Pair<String, Integer>> pairList = List.of(new Pair<>("Word", 4),
//                new Pair<>("Integer", 7),
//                new Pair<>("Service", 7));
//        System.out.println(pairList);
        String[] words = {"Selection", "Calculate", "Program", "Terminal", "Chat", "Cat", "Animal", "Chocolate"};
        Pair<String, Byte>[] pairs = new Pair[words.length];
        byte pairIndex = 0;
        for (String word : words) {
            pairs[pairIndex++] = new Pair<>(word, ((byte)word.length()));
        }
        System.out.println(Arrays.toString(pairs));
    }
}
