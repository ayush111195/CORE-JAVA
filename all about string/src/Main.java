import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // String name =new String("ayush") ;
       // System.out.println(name);
                     //or
        // String name= "ayush gupta";
        //System.out.println(name);
        int a = 234;
        float b = 67.543216f;
                          //print(only)----
        //System.out.print(a+b);
        //print akela likhne ke baad koi jgh mhi milti
                         // print(ln)------
        //System.out.println(a+b);
                          //print (print f)-----
       //System.out.printf("the value of a is %d and the value of b is %f", a, b);
       //agr hum %f main change kare ex-%.2f= ismain ans main bass 2 decimal tak hi answer dega
        //System.out.printf("the value of a is %d and the value of b is %.2f",a,b);
       //%.2f=%8.2f ismain ans main 8 spaice show karega kyunki . ke pehle 8 lg gya h
    //   System.out.printf("the value of a is %d and the value of b is %8.2f",a,b);
                          //format-----
    //    System.out.format("the value of a is %d and the value of b is %f", a, b);
       // Scanner ayush= new Scanner(System.in);
       // String st = ayush.next();
       // System.out.println(st);
       // yhan par (next) akela h to hum string main ek hi word le skte h
       // String st = ayush.nextLine();
       // System.out.println(st);
       // next ke sath (line) lg jne se hum puri line le skte h

                  //find the length of string----

       // String name = "JayPrakash";
       // int v= name.length();
       // System.out.println(v);
       // System.out.println(name.length());

                  //change to lower case----

        // String a1=name.toLowerCase();
        //System.out.println(a1);
        //System.out.println(name.toLowerCase());

                 //change to upper case------

       // String b1 = name.toUpperCase();
       // System.out.println(b1);
       // System.out.println(name.toUpperCase());

                   //trim the string-----

        String name1=       "Jay Prakash";
        // String c1=name1.trim();
        //System.out.println(c1);
        // System.out.println(name1.trim());

                    // substring(in start)-----

        //String d1=name1.substring(5);
        //System.out.println(d1);
        // System.out.println(name1.substring(5));

                   // substring(in start,in end)------

       // ismain agr hum (2,5) input lete h to start to 2 se hoga pr end 5 pr na ho kr uske ek pehle
        //  wale mtlb ki 4 pr hoga
        // String e1=name1.substring(2,5);
       // System.out.println(e1);
       // System.out.println(name1.substring(2,5));

                     //replace the char----

       // String f1=name1.replace("r","s");
       // System.out.println(f1);
       // System.out.println(name1.replace("r","s"));
       // System.out.println(name1.replace("jay","jai"));

                    //name start with------

       // System.out.println(name1.startsWith("jay"));

                   //name ends  with------

        //System.out.println(name1.endsWith("h"));

                  // char at (any point)

        //System.out.println(name1.charAt(5));

                  // index of ( no con)-----
//        System.out.println(name1.indexOf("pr"));

//                  // index of-------
//        System.out.println(name1.indexOf("s",4));
//        //index of wale main ek limit set ho jati h ki etne ke baad se search karna start karega

//                   //last index of(no con)---
//        System.out.println(name1.lastIndexOf("k"));

//                    //last index of----
//        System.out.println(name1.lastIndexOf("k",6));

//                     // equal-----
        System.out.println(name1.equals("jayprakash"));

//                     // equal ignore case----
//        System.out.println(name1.equalsIgnoreCase("jay prakash"));
////---------------------------------------------------------------------------------------------------------
  }
}

