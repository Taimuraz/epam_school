import java.util.InputMismatchException;
import java.util.Scanner;

public class JavaExceptionsHandling {

    public static void main(String[] args) {
        try{
            System.out.println(power(10, -5));
        }catch (Exception e){
            System.out.println(e.getClass().getName());
        }

    }

    public static long power(int n, int p) throws Exception {
          long result = 0;
          if( n < 0 || p < 0){
              throw new Exception("");
          }

          return result;
    }




    public static void javaTryCatch(){
        Scanner scan = new Scanner(System.in);
        try {
            int x = scan.nextInt();
            int y = scan.nextInt();
            System.out.println(x/y);
        } catch (InputMismatchException e) {
            System.out.println(e.getClass().getName());
        } catch (ArithmeticException e) {
            System.out.println(e.getClass().getName() + ": / by zero");
        }
    }


    static class MyCalculator {
        long power(int n, int p) throws Exception{
            long res = 1;
            if( n < 0 || p < 0){
                throw new Exception("n or p should not be negative.");
            }else
            if( n == 0 & p == 0){
                throw new Exception("n and p should not be zero.");
            }else{
                for( int i = 0; i < p; i ++){
                    res = res * n;
                }
            }
            return res;
        }
    }



}
