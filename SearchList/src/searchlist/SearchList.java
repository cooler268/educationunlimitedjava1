package searchlist;
import java.util.ArrayList;
public class SearchList {

    public static void main(String[] args) {
        ArrayList<Integer> a1 = new ArrayList();
        a1.add(11);
        a1.add(9);
        a1.add(16);
        a1.add(36);
        a1.add(44);
        a1.add(24);
        a1.add(39);
        a1.add(23);
        a1.add(38);
        a1.add(49);
        System.out.println( a1.size());
        System.out.println(a1);
        boolean found = false;
        if (a1.contains(39)){
            System.out.println("Done");
        }
        
                
    }
    
}
