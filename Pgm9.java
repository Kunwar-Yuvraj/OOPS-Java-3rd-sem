/*
Given that an EMPLOYEE class contains the following members:
Members: Employee ID, Employee Name, Department name & Basic
Pay 
Methods: To read each employee details, to calculate Gross Pay and
to print the employee details. Develop an application to read data of N
employees and com pute the Gross Pay and Net Pay of each employee.
Gross Pay = Basic Pay + DA + HRA (DA = 58% of Basic Pay, HRA =
16% of Basic Pay)
Net Pay = Gross– Income Tax
Income Tax calculated as follows:
Gross Pay - Up to2 lakhs -Nil
Above 2 and up to3 lakhs - 10% of the Gross
Pay Above 3 and up to5 lakhs - 15% of the Gross
Pay and
Above 5 lakhs 30 % of the Gross Pay, an additional charge of 2% of the
tax will be added to total tax
*/


import java.util.Scanner;


class Employee{
    Scanner sc = new Scanner(System.in);
    
    int id;
    String name;
    String dep;
    float basic;
    float gross;
    float net;

    void clacGross(){
        this.gross = basic + (.58f * basic) + (.16f * basic);
    }

    void calcNet(){
        if (this.gross <= 200000){
            this.net = this.gross - 0;
        }
        else if (this.gross <= 300000){
            this.net = this.gross - (0.1f * this.gross);
        }
        else if (this.gross <= 500000){
            this.net = this.gross - (0.15f * this.gross);
        }
        else{
            this.net = this.gross - (.3f * this.gross);
            this.net += .02f * this.net;
        }
    }

    void getDetails(){
        System.out.print("Enter ID: ");
        this.id = sc.nextInt();
        System.out.print("Enter name: ");
        this.name = sc.next();
        System.out.print("Enter department: ");
        this.dep = sc.next();
        System.out.print("Enter basic pay: ");
        this.basic = sc.nextFloat();

        clacGross();
        calcNet();
    }

    void display() {
        System.out.printf("%-5d%-15s%-15s%-10.2f%-10.2f%-10.2f%n", id, name, dep, basic, gross, net);
    }
}


public class Pgm9{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of employees: ");
        int n = sc.nextInt();

        Employee employees[] = new Employee[n];
        
        for (int i = 0; i < n; i++){
            employees[i] = new Employee();
            employees[i].getDetails();
        }

        System.out.println("ID\tNAME\tDEPARTMENT\tBASIC\tGROSS\tNET");

        for (int i = 0; i < n; i++){
            employees[i].display();
        }
    }
}
