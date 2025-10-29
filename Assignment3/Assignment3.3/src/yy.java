import java.util.Scanner;

class Employee {
    int empId;
    String name;
    double salary;
    Employee prev, next;

    Employee(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
        this.prev = null;
        this.next = null;
    }
}



class EmployeeList {
    Employee head = null, tail = null;



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeeList list = new EmployeeList();
        int choice;

        do {
            System.out.println("\n--- Employee Menu ---");
            System.out.println("1. Add Employee");
            System.out.println("2. Display All Employees");
            System.out.println("3. Search Employee by Name");
            System.out.println("4. Delete Employee by ID");
            System.out.println("5. Update Salary by ID");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Salary: ");
                    double salary = sc.nextDouble();
                    list.addEmployee(id, name, salary);
                    break;
                case 2:
                    list.displayEmployees();
                    break;
                case 3:
                    System.out.print("Enter Name to Search: ");
                    String searchName = sc.nextLine();
                    list.searchByName(searchName);
                    break;
                case 4:
                    System.out.print("Enter ID to Delete: ");
                    int delId = sc.nextInt();
                    list.deleteById(delId);
                    break;
                case 5:
                    System.out.print("Enter ID to Update Salary: ");
                    int updId = sc.nextInt();
                    System.out.print("Enter New Salary: ");
                    double newSal = sc.nextDouble();
                    list.updateSalary(updId, newSal);
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 0);

        sc.close();
    }



    void addEmployee(int empId, String name, double salary) {
        Employee newEmp = new Employee(empId, name, salary);
        if (head == null) {
            head = tail = newEmp;
        } else {
            tail.next = newEmp;
            newEmp.prev = tail;
            tail = newEmp;
        }
    }

    void displayEmployees() {
        if (head == null) {
            System.out.println("No employees found.");
            return;
        }
        Employee temp = head;
        while (temp != null) {
            System.out.println("ID: " + temp.empId + ", Name: " + temp.name + ", Salary: " + temp.salary);
            temp = temp.next;
        }
    }

    void searchByName(String targetName) {
        Employee temp = head;
        boolean found = false;
        while (temp != null) {
            if (temp.name.equalsIgnoreCase(targetName)) {
                System.out.println("Found: ID: " + temp.empId + ", Name: " + temp.name + ", Salary: " + temp.salary);
                found = true;
            }
            temp = temp.next;
        }
        if (!found) System.out.println("Employee not found.");
    }

    void deleteById(int targetId) {
        Employee temp = head;
        while (temp != null) {
            if (temp.empId == targetId) {
                if (temp == head) head = temp.next;
                if (temp == tail) tail = temp.prev;
                if (temp.prev != null) temp.prev.next = temp.next;
                if (temp.next != null) temp.next.prev = temp.prev;
                System.out.println("Employee deleted.");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Employee ID not found.");
    }

    void updateSalary(int targetId, double newSalary) {
        Employee temp = head;
        while (temp != null) {
            if (temp.empId == targetId) {
                temp.salary = newSalary;
                System.out.println("Salary updated.");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Employee ID not found.");
    }
}