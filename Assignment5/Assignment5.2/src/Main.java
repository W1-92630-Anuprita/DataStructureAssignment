import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        InsertSort is=new InsertSort();
        System.out.println("before: "+ Arrays.toString(is.arr));
        is.insSort();
        System.out.println("after: "+ Arrays.toString(is.arr));


    }
}
