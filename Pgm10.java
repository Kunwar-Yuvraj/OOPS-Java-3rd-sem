/*
Develop an application with an abstract Bank class consisting of below
features:
a) Bank_Type(National/International)
b) getRoi() is an abstract method
c) deposit()
d) offerCreditCard
 Identify various (atleast 4) banks which will extend bank class with
below conditions:
o If the bank is type of nationalized the roi is 7% else 8%. The interest
is offered only if the term deposit is minimum of 3years.
o If the bank is international, then it can offer platinum credit card
otherwise not.
Override one of the methods and use the concept of dynamic method
dispatch.
*/


import java.util.Scanner;


abstract class Bank{
    Scanner sc = new Scanner(System.in);
    
    String bankType;
    float balance;
    String cc;
    int years;
    
    Bank(String bankType){
        this.bankType = bankType;
    }

    abstract float getRoi();

    String offerCC(int termDeposit){
        if (termDeposit >= 3){
            cc = "Offered";
        }
        else{
            cc = "Not Offered";
        }
        return cc;
    }

    void deposit(){
        System.out.println("Enter balance: ");
        float amt = sc.nextFloat();
        this.balance += amt;
        System.out.println("Enter term deposit years: ");
        this.years = sc.nextInt();
    }

    boolean offerCC(String bankType){
        this.bankType = bankType;
        return bankType.equals("International");
    }

    void display(){
        System.out.println(bankType + "\t" + getRoi() + "\t" + offerCC(bankType) + "\t" + years + "\t" + balance);
    }
}


class NationalBank extends Bank{
    NationalBank(){
        super("National");
    }

    float getRoi(){
        if (super.years >= 3)
            return 0.07f;
        return 0.0f;
    }
}


class InternationalBank extends Bank{
    InternationalBank(){
        super("International");
    }
    float getRoi(){
        if (super.years >= 3)
            return 0.08f;
        return 0.0f;
    }
}


public class Pgm11{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Number of banks: ");
        int n = sc.nextInt();
        Bank banks[] = new Bank[n];

        for (int i = 0; i < n; i++){
            System.out.print("Enter Bank Type (International/ National): ");
            String bankType = sc.next();

            if (bankType.equals("International")){
                banks[i] = new InternationalBank();import java.util.Scanner;


abstract class Bank{
    Scanner sc = new Scanner(System.in);
    
    String bankType;
    float balance;
    String cc;
    int years;
    
    Bank(String bankType){
        this.bankType = bankType;
    }

    abstract float getRoi();

    String offerCC(int termDeposit){
        if (termDeposit >= 3){
            cc = "Offered";
        }
        else{
            cc = "Not Offered";
        }
        return cc;
    }

    void deposit(){
        System.out.println("Enter balance: ");
        float amt = sc.nextFloat();
        this.balance += amt;
        System.out.println("Enter term deposit years: ");
        this.years = sc.nextInt();
    }

    boolean offerCC(String bankType){
        this.bankType = bankType;
        return bankType.equals("International");
    }

    void display(){
        System.out.println(bankType + "\t" + getRoi() + "\t" + offerCC(bankType) + "\t" + years + "\t" + balance);
    }
}


class NationalBank extends Bank{
    NationalBank(){
        super("National");
    }

    float getRoi(){
        if (super.years >= 3)
            return 0.07f;
        return 0.0f;
    }
}


class InternationalBank extends Bank{
    InternationalBank(){
        super("International");
    }
    float getRoi(){
        if (super.years >= 3)
            return 0.08f;
        return 0.0f;
    }
}


public class Pgm11{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Number of banks: ");
        int n = sc.nextInt();
        Bank banks[] = new Bank[n];

        for (int i = 0; i < n; i++){
            System.out.print("Enter Bank Type (International/ National): ");
            String bankType = sc.next();

            if (bankType.equals("International")){
                banks[i] = new InternationalBank();
                banks[i].deposit();
            }
            else if (bankType.equals("National")){
                banks[i] = new NationalBank();
                banks[i].deposit();
            }
            else {
                System.out.println("Enter valid Bank Type. Try again!");
                i--;
            }
        }

        System.out.println("ACCOUNT TYPE\tROI\tCREDIT CARD\tTERM YEARS\tBALANCE\");
        for (int i = 0; i < n; i++){
            banks[i].display();
        }
    }
}
            }
            else if (bankType.equals("National")){
                banks[i] = new NationalBank();
            }
            else {
                System.out.println("Enter valid Bank Type. Try again!");
                i--;
                continue;
            }x
        }

        System.out.println("ACCOUNT TYPE\tROI\tCREDIT CARD\tTERM YEARS\tBALANCE\");
        for (int i = 0; i < n; i++){
            banks[i].display();
        }
    }
}
