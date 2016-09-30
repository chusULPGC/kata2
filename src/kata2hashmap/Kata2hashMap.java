package kata2hashmap;

import java.util.HashMap;

public class Kata2hashMap {
    
    public static void main(String[] args) {
        //Integer [] vector ={2,1,3,1,4,6,100,100,2,100};
       // Double [] vector ={2.1,1.1,3.2,1.1,4.4,6.1,100.1,100.1,2.1,100.9};
        String [] vector = {"Ana","Elena","Jesús","Ruth","Pedro","Juan","Ana",
            "Elena","Pedro","Juan","Elena","Ruth"};
        
     Histogram<String> histogram = CalculateHistogram.computeHistogram(vector);
        
        for (Object key : histogram.keySet()){
            System.out.println(key+" --> "+histogram.get(key));
        }
    }
}
