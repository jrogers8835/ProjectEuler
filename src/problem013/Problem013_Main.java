package problem013;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Problem013_Main {
    static List<List<Integer>> inputNumber;
    public static void main(String[] args) {
        populateInputNumbers();
    }
    
    private static void populateInputNumbers(){
        String fileName = "./inputfile.txt";
        try(Stream<String> stream = Files.lines(Paths.get(fileName))){
            stream.forEach(line ->{
//                inputNumber.add(Arrays.asList(Arrays.stream(line.split("")).map(string -> Integer.parseInt(string)).collect(Collectors.toList())));
            });
        } catch (IOException e){
            e.printStackTrace();
        }
        
        inputNumber.forEach(line -> line.forEach(System.out::println));
    }
}
