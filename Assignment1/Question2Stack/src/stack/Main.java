package stack;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        File f=new File("C:\\Users\\Laxman\\Videos\\classword\\webjava\\day4\\demo1day4\\log.txt");
//        Scanner file= null;
//        try {
//            file = new Scanner(f);
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }
//        file.forEachRemaining(i-> System.out.println(i));
        int choice=-1;
        Stack q=new Stack(4);
        do{
            System.out.print("0: exit\n" +
                    "1: push\n" +
                    "2: pop\n" +
                    "3: read\n" +
                    "Enter choice: " );
            choice=sc.nextInt();
            switch (choice) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    try {
                        System.out.print("Enter element(in number): ");
                        int n = sc.nextInt();
                        q.push(n);

                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case 2:
                    try {
                        int res = q.pop();
                        if (res == -10122) {
                            System.out.println("The stack is already empty");
                        }
                        System.out.println("Element popped ");


                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                    break;
                case 3:
                    if (q.peek() == -10122)
                        System.out.println("no elements to show");
                    else
                        System.out.println(q.peek());
            }
        }while(choice !=-1);

    }

}



