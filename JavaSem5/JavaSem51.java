package JavaSem5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JavaSem51 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите 2 слова через пробел: ");
        String[] wordsArr = in.nextLine().split(" ");
        in.close();
        System.out.println(isIzomorf(wordsArr));
    }
    public static boolean isIzomorf(String[] arr) {
        if(arr[0].length() != arr[1].length()){
            return false;
        }

        Map<Character,Character> words = new HashMap<>();
        char mKey;
        char mVal;

        for(int i = 0; i < arr[0].length(); i++){
            mKey = arr[1].charAt(i);
            mVal = arr[0].charAt(i);

            if(words.containsKey(mKey)){
                if(words.get(mKey) != mVal){
                    return false;
                }
            }
            words.put(mKey, mVal);
        }
        Map<Character,Character> wordsRevers = new HashMap<>();
        for(int i = 0; i < arr[0].length(); i++){
            mKey = arr[1].charAt(i);
            mVal = arr[0].charAt(i);

            if(wordsRevers.containsKey(mKey)){
                if(wordsRevers.get(mKey) != mVal){
                    return false;
                }
            }
        }
        return true;
    }
}
