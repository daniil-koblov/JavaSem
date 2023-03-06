package JavaSem2;

import java.io.File;
import java.io.FileWriter;

// написать Test 100 раз в файл 
public class JavaSem23{
    public static void main(String[] args) {
        String str = "Test\n";
        StringBuilder strOutput = new StringBuilder();
        for (int i = 0; i < 100; i++){
            strOutput.append(str);
        }
        System.out.println(saveInFile(strOutput.toString()));
    }

    public static boolean saveInFile(String inputString) {
        try {
            String pathProject = System.getProperty("user.dir");
            String pathFile = pathProject.concat("/save.txt");
            File fileToSave = new File(pathFile);
            try {
                fileToSave.canWrite();                
            } catch (Exception e) {
                fileToSave.createNewFile();  
            }
            FileWriter writeToFile = new FileWriter(pathFile);  // или "new FileWriter(pathFile,true);" если нужно добавлять с записанному.
            writeToFile.write(inputString);
            writeToFile.close();
        } catch (Exception e) {
            System.out.println("catch");
        } finally {
            System.out.println("finally");
        }

        return true;
    }
}