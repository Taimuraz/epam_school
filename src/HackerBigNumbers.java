import java.math.BigInteger;
import java.util.Scanner;

public class HackerBigNumbers {
    public static void main(String[] args) {
    }
    public static void bigInteger(){
        Scanner scan  = new Scanner(System.in);
        BigInteger a = new BigInteger(scan.nextLine());
        BigInteger b = new BigInteger(scan.nextLine());
        System.out.println(a.add(b));
        System.out.println(a.multiply(b));
    }


}
