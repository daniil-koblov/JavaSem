package JavaSem1;

import java.util.Arrays;

public class JavaSem14 {
    public static void main(String[] args){
        int[] arr = {3, 2, 2, 3, 3, 3, 3};
        int a = arr.length - 1;
        int b = 3;
        for (int i = 0; i < a; i++) {
            if(arr[i] == b){
                while(arr[i] == arr[a]){
                    a --;
                }
                int c = arr[i];
                arr[i] = arr[a];
                arr[a] = c;
            }
            a -= 1;
        System.out.println(Arrays.toString(arr));
    }
}
}