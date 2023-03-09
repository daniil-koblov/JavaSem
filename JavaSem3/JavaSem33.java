package JavaSem3;

import java.util.ArrayList;
import java.util.List;

public class JavaSem33 {
    public static void main(String[] args) {
        List<String> strNum = new ArrayList<>();
        strNum.add("apple");
        strNum.add("3");
        strNum.add("gray");
        strNum.add("sky");
        strNum.add("24");
        System.out.println(strNum);
        List<String> newStrNum = new  ArrayList<>();
        for (String item : strNum){
            try{
                Integer.parseInt(item);
            }catch (Exception e){
                newStrNum.add(item);
            }
        }
        System.out.println((newStrNum));
    }
}
