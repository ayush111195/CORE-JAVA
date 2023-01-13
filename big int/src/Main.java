import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        BigInteger A = scan.nextBigInteger();
        BigInteger B = scan.nextBigInteger();
        if(((int) Math.log10(A.intValue())+1)<200 &&((int) Math.log10(B.intValue()) + 1)<200);
        //  if(((int) Math.log10(A.intValue())+1)<200 && ((int) Math.log10(B.intValue())+1)<200){
        {
            System.out.println(A.add(B));
            System.out.println(A.multiply(B));
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}