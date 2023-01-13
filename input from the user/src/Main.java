import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        System.out.println("taking input from the user");
        Scanner ayush = new Scanner(System.in);
        System.out.println("enter number 1");
        int a = ayush.nextInt();
       System.out.println("enter number 2");
int b = ayush.nextInt();
int sum = a+b;
        System.out.println(sum);
      System.out.println("enter number 3");
        int c = ayush.nextInt();
        System.out.println("enter no 4");
        int d = ayush.nextInt();
       int multi = c*d;
       System.out.println(c*d);
        System.out.println("enter no 5");
float e = ayush.nextFloat();
       System.out.println("enter no 6");
float f = ayush.nextFloat();
float ay = e-f;
     System.out.println(ay);
      boolean d1= ayush.hasNextBigInteger();
        System.out.println( 7);
String ayus= ayush.next();
       System.out.println(ayus);
       String ayush1 = ayush.nextLine();
       System.out.println(ayush1);

    }
}