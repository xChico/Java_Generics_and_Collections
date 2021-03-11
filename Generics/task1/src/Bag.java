import java.util.ArrayList;
//import java.util.Arrays;
import java.util.Random;
public class Bag<T> {
    ArrayList<T> objects;
    public Bag(){

        objects = new ArrayList<>();
    }
    public void add(T object)throws BagException {
     if(object==null){
         throw new BagException("Cannot add null to a Bag");
        }
     else
        objects.add(object);
    }
    /*
 code the add method described. It should be public and not
 return anything. Just take in a parameter and  throw an
 exception. Read the documentation for this.*/
    public T drawOne(){
        Random rand = new Random();
        int min =0;
        int randomInd = rand.nextInt((objects.size() - min));
        return objects.get(randomInd);
    }
 /*
Code the drawOne method here. It should not take any
parameters. It should return a generic object. More on the
task description.*/

    public ArrayList<T> drawMany(int howMany){
        ArrayList<T> listTwo = new ArrayList<T>();
        T value;
        for(int i=0; i<howMany; i++){
           value= this.drawOne();
           listTwo.add(value);
        }
        return listTwo;



/* TODO
howMany is the number of elements to draw. 
Create an ArrayList of the generic type and "drawOne" as
many times as you need, putting the element drawn in the ArrayList.
Then return it. */
    }

    public void add(T element,double prob) throws BagException{
//

        /* TODO 
Check that the probability is between 0 and 1. Otherwise
throw an exception. */        // This is a way to add elements in a given proportion.
        if(prob < 0 || prob > 1  ){
            throw new BagException("Probability should be between 0 and 1");
        }
        else
        {
        int tot = (int)Math.round(objects.size()*prob);
        for(int i=0;i<tot;i++) {
            System.out.println("Adding " + i);
            objects.add(element);
        }
        }
    }
}
