import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Map.Entry;


public class Counter<E> {
    private HashMap<E, Integer> counts;/* TODO
The HashMap should accomodate a generic class for the keys and Integer for the value*/

    public Counter(E[] things){

        counts = new LinkedHashMap<>();

        for(int i=0; i<things.length; i++){

            if(counts.containsValue(things[i])){
                counts.put(things[i], counts.get(i)+1);
            }
            else
            {
                counts.put(things[i], 1);
            }
        }


/* TODO
Loop through the elements of "things" and use the HashMap "counts"
to store the elements of things as keys, and the number of times they
appear in the array as values. Check the instructions. */
    }

    public Integer getCount(E element){
        if(!counts.containsKey(element))
            counts.put(element, 1);
        else
            counts.put(element, counts.get(element)+1);
        return counts.get(element);
        /* TODO 
This just returns the specific count for an element. It is a wrapper
for a getting the value of the HashMap given the key "element" */
    }

    public int getSize(){
        return this.counts.size();
    }

    public E mostFrequent(){

      int times = 1;
      E temp = null;
      Set<Entry<E, Integer>> temps = counts.entrySet();
      for(Entry<E, Integer> entry: temps){
          if( entry.getValue() > times){
              temp = entry.getKey();
              times = entry.getValue();
          }
      }

/* TODO 
Returns the most frequent key in the HashMap*/
        return temp;
    }
}
