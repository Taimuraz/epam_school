import java.util.Scanner;

public class HackerRank {
    public static void main(String[] args) {

    }

    public static void  javaOutputFormatting(){
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for(int i = 0; i < 3; i ++){
            String s1 = sc.next();
            int x = sc.nextInt();
            for( int j = 0; j < 15 - s1.length(); j ++)
                s1 += " ";
            System.out.printf("%15s%03d%n");
        }
        System.out.println("================================");
    }

    public static void javaLoops_1(){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        for( int i = 0; i < 10; i ++){
            System.out.printf("%d x %d = %d%n", N, i+1, N * (i+1));
        }

    }

    public static void javaLoops_2(){
        Scanner in = new Scanner(System.in);
        int sum = 0;
        int pow = 1;
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            sum += a + b;
            System.out.printf("%d ",sum);
            for(int j=1;j<n;j++){
                for(int k=0;k<j;k++)
                    pow *= 2;
                sum += pow*b;
                System.out.printf("%d ",sum);
                pow = 1;
            }
            sum = 0;
            System.out.printf("%n");
        }
        in.close();

    }
}
