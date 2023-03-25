package JavaSem6;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class JavaSem62 {
    public static void main(String[] args) {
        CatSem62 catOne = new CatSem62();
        catOne.setAge(15);
        catOne.setName("Popa");
        catOne.setHeight(25);
        catOne.setOwnerName("Vasiliy");
        catOne.setSex("male");
        catOne.setWeight(5);

        CatSem62 catTwo = new CatSem62();
        catTwo.setAge(13);
        catTwo.setName("Pipa");
        catTwo.setHeight(23);
        catTwo.setOwnerName("Vasilisa");
        catTwo.setSex("female");
        catTwo.setWeight(4);
        
        CatSem62 catThree = new CatSem62();
        catThree.setAge(15);
        catThree.setName("Papa");
        catThree.setHeight(23);
        catThree.setOwnerName("Vasiliy");
        catThree.setSex("female");
        catThree.setWeight(4);
        
        CatSem62 catFour = new CatSem62();
        catFour.setAge(15);
        catFour.setName("Papa");
        catFour.setHeight(23);
        catFour.setOwnerName("Vasiliy");
        catFour.setSex("female");
        catFour.setWeight(4);

        HashMap<Integer, CatSem62> catMap = new HashMap<>();
        catMap.put(1, catOne);
        catMap.put(2, catTwo);
        catMap.put(3, catThree);
        catMap.put(4, catFour);
        System.out.println(catMap);

        Set<CatSem62> catSet = new HashSet<>();
        catSet.add(catOne);
        catSet.add(catTwo);
        catSet.add(catThree);
        catSet.add(catFour);
        System.out.println(catMap);
    }
}
