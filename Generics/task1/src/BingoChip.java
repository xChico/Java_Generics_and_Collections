public class BingoChip<T, K>{
    private T one;
    private K two;

    public BingoChip(T one, K two){
        this.one = one;
        this.two = two;
    }
    @Override
    public String toString(){
        return "Chip:" + this.one + "-" + this.two;

    }


}




/* TODO
Implement this class.
Use the instructions and check how it is used in Task.java*/

