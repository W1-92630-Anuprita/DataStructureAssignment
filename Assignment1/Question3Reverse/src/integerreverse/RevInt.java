package integerreverse;

import java.util.Scanner;

public class RevInt {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size");
        int size=sc.nextInt();
        System.out.print("Enter elements: ");
        int arr[]=new int[size];
        for (int i = 0; i < size; i++) {
            arr[i]= sc.nextInt();
        }
//        String s=sc.next();
//        int n = Integer.parseInt(s);
        Stack st=new Stack(size);
//        int temp=n;
        for (int i = 0; i < size; i++) {
            st.push(arr[i]);
        }
        for (int i = 0; i < size; i++) {
            System.out.print(st.pop()+" ");
        }

    }

}
