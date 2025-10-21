package Miscellaneous_InterviewPrograms;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OccurenceOfEachCharacterInString {
    public void count(String s){
        Map<Character,Long> countMap=s.chars()
                .mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }
}
