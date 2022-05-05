package Unit3.ArraysPractice;
/* Done: 1,2,3,4,6,7,8,
* Missing: 5,9,10,11
*/
import java.util.ArrayList;
import java.util.Collections;

public class Practice {
    public static void main(String[] args) {

        ArrayList<String> things = new ArrayList<String>(); 

        things.add("cars");
        things.add("fruit");
        things.add("race cars");
        things.add("Money");
        things.add("Lists");
        things.add("Classes");
        things.add("Boring tests");
        things.add(0, "McLaren");


        for(int x = 0; x<20; x++){
        System.out.println(things);
        }

        System.out.println(things.get(7));

        things.remove(7);
        System.out.println(things);
       
        System.out.println(things.contains("race cars"));   // true
        System.out.println(things.contains("McLaren"));     // true
        System.out.println(things.contains("non"));    // false
        

        Collections.sort(things);
        for (Object i : things){
           System.out.println(i);
        }

        
    }
}
