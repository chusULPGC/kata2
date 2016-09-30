package kata2hashmap;

import java.util.HashMap;
public class Histogram {
    
    private final int[] vector;

    public Histogram(int[] vector) {
        this.vector = vector;
    }

    public int[] getVector() {
        return vector;
    }
    
    public HashMap<Integer,Integer> getHistogram(){
        HashMap<Integer,Integer> histo= new HashMap<>();
        
        for (int key : vector) {
            if (!histo.containsKey(key)){
                histo.put(key, 0);
                histo.put(key, histo.get(key)+1);
            }
        }
    
    return histo;
    }
 
    
}
