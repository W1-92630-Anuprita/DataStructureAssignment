import java.util.Arrays;

public class InsertSort {

    int arr[]={20,90,40,30,10,80};

    void insSort(){
        for (int i = 0; i < arr.length; i++) {

            for (int j = i; j>0 ; j--) {
                if(arr[j]>arr[j-1]){
//                    System.out.println("I: "+i+ Arrays.toString(arr));
                    int temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }

}
