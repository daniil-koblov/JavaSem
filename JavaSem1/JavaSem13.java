package JavaSem1;

public class JavaSem13 {
    public static void main(String[] args){
        int[] arr = {1, 1, 0, 1, 1, 1};
        int count = 0;
        int maxi = 0;
        for(int i = 0; i < arr.length; i++){
            if (arr[i] == 1){
                count++;
                if (maxi < count){
                    maxi = count;
                }
            }
            else{
                count = 0;
            }
        }
        System.out.println(maxi);
    }
}
