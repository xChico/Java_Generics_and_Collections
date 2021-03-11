public class BagException extends Exception{
    public BagException(String msg){

        super(msg);
    }
    public BagException(String msg, Throwable thr){
        super(msg, thr);
    }

}
