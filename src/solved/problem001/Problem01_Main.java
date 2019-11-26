package problem001;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Problem01_Main {
    public static void main(String[] args) {
        System.out.println(sumOfMultiplesLessThanMax(Arrays.asList(3,5), 1000));
    }

    private static int sumOfMultiplesLessThanMax(List<Integer> inputs, int max){
        Set<Integer> multiples = new HashSet<>();
        inputs.forEach(input -> {
            for (int i = input; i < max; i += input) {
                multiples.add(i);
            }
        });
        return multiples.stream().mapToInt(Integer::intValue).sum();
    }
}
