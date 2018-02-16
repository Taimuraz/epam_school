import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class HackerAdvanced {
    public static int b = 2;
    void doo( int a){
        a = 4;
        b = a;
    }

    public static void main(String[] args) {
        HackerAdvanced h = new HackerAdvanced();
        h.doo(2);
        System.out.println(h.b);
    }

    class Prime {
        void checkPrime(int... numbers) {
            for (int num : numbers) {
                if (isPrime(num)) {
                    System.out.print(num + " ");
                }
            }
            System.out.println();
        }

        boolean isPrime(int n) {
            if (n < 2) {
                return false;
            }
            int sqrt = (int) Math.sqrt(n);
            for (int i = 2; i <= sqrt; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }


    

    class Add {
        void add(int... numbers) {
            InputStream in = System.in;
            BufferedReader br=new BufferedReader(new InputStreamReader(in));

            StringBuffer sb = new StringBuffer();
            int sum = 0;
            for (int num : numbers) {
                sb.append(num + "+");
                sum += num;
            }
            sb.setCharAt(sb.length() - 1, '=');
            sb.append(sum);
            System.out.println(sb);
        }
    }

    class Student{}
    public static void javaReflection (){
        Class student = Student.class;
        Method[] methods = student.getDeclaredMethods();


        ArrayList<String> methodNames = new ArrayList<>();
        for (Method method : methods) {
            methodNames.add(method.getName());
        }

        Collections.sort(methodNames);
        for (String name: methodNames) {
            System.out.println(name);
        }
    }

    interface PerformOperation{
        boolean operate(int a);
    }

    public PerformOperation isOdd(){
        return (a)->{
            if( a%2 != 0)
                return true;
            else
                return false;
        };
    }

    public PerformOperation isPrime(){
        return n -> {
            if (n < 2) {
                return false;
            }
            int sqrt = (int) Math.sqrt(n);
            for (int i = 2; i <= sqrt; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        };
    }

    public PerformOperation  isPalindrome(){
        return n -> {
            String original = Integer.toString(n);
            String reversed = new StringBuilder(Integer.toString(n)).reverse().toString();
            return original.equals(reversed);
        };
    }


    public static void javMD5() throws NoSuchAlgorithmException {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        scan.close();

        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(str.getBytes());
        byte[] digest = md.digest();

        for (byte b : digest) {
            System.out.format("%02x", b);
        }
    }

    public static void javaSHA256(String[] args) throws NoSuchAlgorithmException {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        scan.close();

        MessageDigest md = MessageDigest.getInstance("SHA-256");
        md.update(str.getBytes());
        byte[] digest = md.digest();

        for (byte b : digest) {
            System.out.format("%02x", b);
        }
    }


}
