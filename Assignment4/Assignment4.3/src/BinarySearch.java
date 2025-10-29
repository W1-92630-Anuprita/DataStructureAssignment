import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args) {
        int arr[]={99,76,55,44,33,23,21,10,4,3};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter key: ");
        int key=sc.nextInt();
        int found=binSearch(arr,key,0,arr.length-1);
        if(found==-1){
            System.out.println("not found");
        }
        else
            System.out.println("found at "+found);

    }

    static int binSearch(int[] arr,int key, int left, int right){
        int mid=(left+right)/2;
        if(key==arr[mid]){
            return mid;
        }
        else if(arr[mid]>key){
            return binSearch(arr, key, mid+1, right);
        }
        else  if(arr[mid]<key){
            return binSearch(arr, key, left, mid);
        }
        return -1;
    }
}
