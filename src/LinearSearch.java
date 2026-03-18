import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LinearSearch {
    public static void main(String[] args) {
        List<Integer> partlist = new ArrayList<>(100000);

        for(int i = 0; i < 100_000_000; i++){
            partlist.add(i);
        }
        Iterator<Integer> elements = partlist.iterator();
        long startTime = System.currentTimeMillis();
        while(elements.hasNext()){
            elements.next();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken: " + (endTime - startTime) + "ms");
    }
}
