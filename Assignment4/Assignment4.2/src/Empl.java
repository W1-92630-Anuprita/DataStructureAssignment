import java.util.Scanner;

public class Empl {
    int empid;
    String empName;
    double sal;

    public Empl(int empid, String empName, double sal) {
        this.empid = empid;
        this.empName = empName;
        this.sal = sal;
    }

    public Empl() {
    }
}

class Main{

//    static void accept(Scanner sc, Empl empl){
//        System.out.println("enter employee id");
//        empl.empid=sc.nextInt();
//        System.out.println("enter employee name");
//        empl.empName=sc.nextLine();
//        System.out.println("enter employee salary");
//        empl.sal=sc.nextDouble();
//
//    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Empl empl=new Empl();
//        accept(sc,empl);
        Empl empArr[]=new Empl[10];
        empArr[0] = new Empl(101, "Alice", 50000.0);
        empArr[1] = new Empl(102, "Bob", 52000.0);
        empArr[2] = new Empl(103, "Charlie", 54000.0);
        empArr[3] = new Empl(104, "Diana", 56000.0);
        empArr[4] = new Empl(105, "Ethan", 58000.0);
        empArr[5] = new Empl(106, "Fiona", 60000.0);
        empArr[6] = new Empl(107, "George", 62000.0);
        empArr[7] = new Empl(108, "Hannah", 64000.0);
        empArr[8] = new Empl(109, "Ian", 66000.0);
        empArr[9] = new Empl(110, "Julia", 68000.0);

        System.out.println("enter searchid: ");
        int searchId=sc.nextInt();
        int pos=search(empArr,searchId);
        if(pos==-1){
            System.out.println("no employee found");
        }
        else {
            System.out.println("employee found");
        }

        System.out.println("enter searchName: ");
        sc.nextLine();
        String searchName=sc.nextLine();
        int found=search(empArr,searchName);
        if(found==-1){
            System.out.println("no employee found");
        }
        else {
            System.out.println("employee found");
        }





    }

    static int search(Empl[] emplArr,int searchId){
        for (int i = 0; i < emplArr.length; i++) {
            if(emplArr[i].empid==searchId){
                return i;
            }
        }
        return -1;
    }


    static int search(Empl[] emplArr,String searchName){
        for (int i = 0; i < emplArr.length; i++) {
            if(emplArr[i].empName.equals(searchName)){
                return i;
            }
        }
        return -1;
    }

}
