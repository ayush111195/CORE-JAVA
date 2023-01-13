import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int age = 11;
        if (age > 18) {
            System.out.println("hey boy u can drive!");
        } else {
            System.out.println("hey boy u can't drive!");
        }
        int age1 = 16;
        if (age1 == 16) {
            System.out.println("hey boy u can drive!");
        } else {
            System.out.println("hey boy u can't drive!");
        }
        int age2 = 22;
        boolean age3 = (age == 16);
        if (age3) {
            System.out.println("hey boy u can drive");
        } else {
            System.out.println("hey boy u can't drive");
            //---------------------------------------------------------------------------
            System.out.println("for logical and---");
            boolean a1 = true;
            boolean a2 = false;
            if (a1 && a2) {
                System.out.println("y");
            } else {
                System.out.println('N');
            }
            //dono true honge tabhi true hoga ...
            //---------------------------------------------------------------------------------
            System.out.println("for logical or---");
            if (a1 || a2) {
                System.out.println("y");
            } else {
                System.out.println("n");
            }
        }
        // ek bhi true to true hoga......
        //----------------------------------------------------------------------------------------
        System.out.println("for logical not");
        boolean a3 = true;
        boolean a4 = false;
        System.out.println(!a3);
        System.out.println(!a4);
        //-------------------------------------------------------------------------------------
                               //if(else if case)
        Scanner ayush = new Scanner(System.in);
        System.out.println("enter your age--");
        int age7 = ayush.nextInt();
        if (age7 >= 56) {
            System.out.println("you are experienced");}
        else if (age7>46){
            System.out.println("you are semiexperienced");}
        else if(age7>36) {
            System.out.println("you are semi semiexperienced");}
        else {
            System.out.println("you r not experienced");}
        //---------------------------------------------------------------------------------------
                                      //switch case--
        Scanner arpit=new Scanner(System.in);
        System.out.println("enter your age");
        int age8=arpit.nextInt();
        switch(age8){
            case 18:
                System.out.println("hey now u are adult");
                break;
            case 23:
                System.out.println("hey now u are ready to job");
                break;
            case 60:
                System.out.println("now u are retired");
                break;
            default:
                System.out.println("enjoy your day!!");}
        // -----------------------------------------------------------------------------------------------
                                //switch(var)-----ye int,char,string
        String var="ayushgupta";
        switch (var) {
            case "ayushgupta":
                System.out.println("you are a good boy");
                break;
            case "z":
                System.out.println("you are monkey");}
    }}