import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Comparator;
import java.util.Scanner;


public class HackerBigNumbers {
    public static void main(String[] args) {

    }


    public static void primalityTest(){
        Scanner in = new Scanner(System.in);
        BigInteger n = in.nextBigInteger();
        in.close();
        if( n.isProbablePrime(1)){
            System.out.println("prime");
        }else{
            System.out.println("not prime");
        }
    }



    public static void bigInteger(){
        Scanner scan  = new Scanner(System.in);
        BigInteger a = new BigInteger(scan.nextLine());
        BigInteger b = new BigInteger(scan.nextLine());
        System.out.println(a.add(b));
        System.out.println(a.multiply(b));
    }

    public static void bigDecimal(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String [] s = new String[n+2];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        sc.close();

        Comparator<String> cmpr = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                BigDecimal a = new BigDecimal(o1);
                BigDecimal b = new BigDecimal(o2);
                return b.compareTo(a);
            }
        };

        for(String elem : s){
            System.out.println(elem);
        }
    }

}
