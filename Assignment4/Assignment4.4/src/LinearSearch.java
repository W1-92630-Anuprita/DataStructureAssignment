import java.util.Scanner;

public class LinearSearch {

    int arr[]={-1,1,2,4,4,6,3,8,5,4,34,44};

    void linearSearch(int[] arr,int key, int occ){
        int occ1=0;
        int pos=-1;
        for (int i = 0; i < arr.length; i++) {

            if(key==arr[i]){

                occ1++;
                if(occ==occ1) {
                    pos = i;
                    break;
                }
            }
        }
        if (pos==-1)
            System.out.println("element not found");
        else if(occ<=occ1)
            System.out.println("element found with "+occ1+"th occourance at "+pos+" position");
        else
            System.out.println("element found but not at "+occ+"th occourance");
    }

    public static void main(String[] args) {
        LinearSearch ls=new LinearSearch();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number: ");
        int key=sc.nextInt();
        System.out.println("enter no of occourance: ");
        int occ=sc.nextInt();
        ls.linearSearch(ls.arr, key, occ);
    }
}