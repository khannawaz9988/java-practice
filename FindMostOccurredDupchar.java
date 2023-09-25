import java.util.HashMap;
import java.util.*;
public class FindMostOccurredDupchar {
    public static void main(String[] args) {
        String str = "nawazahmedkhan";
        char[] charArray = str.toCharArray();

        Map<Character,Integer>inputMapWithValueCount = new HashMap<>();
        for(Character input:charArray ){
            if(inputMapWithValueCount.containsKey(input)){
                int prvVal = inputMapWithValueCount.get(input);
                inputMapWithValueCount.put(input,prvVal+1);
            }else {
                inputMapWithValueCount.put(input,1);
            }

        }
        System.out.println(inputMapWithValueCount);
        int highestDuplicateVal = 0;
        int highestDupKey = 0;
        for (Map.Entry<Character,Integer> entry: inputMapWithValueCount.entrySet()){
            if(entry.getValue() > highestDuplicateVal){
                highestDuplicateVal = entry.getValue();
                highestDupKey = entry.getKey();
            }
        }
        System.out.println("The input which is duplicated most of the time is :"+highestDupKey);
        System.out.println("No. of times duplicated :"+ highestDuplicateVal);
    }




}
