import java.util.Scanner;

public class LinearSearch {

    int arr[]={-1,1,2,4,6,3,8,5,34,44};

    void linearSearch(int[] arr,int key){
        int pos=-1;
        for (int i = 0; i < arr.length; i++) {
            if(key==arr[i]){
                pos=i;
            }
        }
        if (pos==-1)
            System.out.println("element not found");
        else
            System.out.println("element found at "+pos+" position");

    }

    public static void main(String[] args) {
        LinearSearch ls=new LinearSearch();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number: ");
        int key=sc.nextInt();
        ls.linearSearch(ls.arr, key);
    }
}
