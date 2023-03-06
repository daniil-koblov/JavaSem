package JavaSem2;

public class JavaSem21 {
    public static void main(String[] args) {
        String str = System.console().readLine();
        char[] chars = str.toCharArray(); 
        StringBuilder strOutput = new StringBuilder();
        int count = 1;
        for (int i = 0; i < chars.length; i++) {
            if(i != chars.length - 1){
                if(chars[i] == chars[i + 1]){
                    count ++;
                }
                else{
                    strOutput.append(String.valueOf(chars[i]) + count);
                    count = 1;
                }
            }
            else{
                if(chars[i] == chars[i - 1]){
                    strOutput.append(String.valueOf(chars[i]) + count);
                }
                else{
                    strOutput.append(String.valueOf(chars[i]) + 1);
                }
            }
        }
        System.out.println(strOutput);
    }
}