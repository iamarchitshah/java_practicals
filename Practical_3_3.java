import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Practical_3_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();
        
        BigInteger bi = new BigInteger(n);
        
        if(bi.isProbablePrime(1)){
            System.out.println("prime");
        }
        else{
            System.out.println("not prime");
   
        }

        bufferedReader.close();
    }
}
