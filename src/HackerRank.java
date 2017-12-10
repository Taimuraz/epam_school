import java.util.Scanner;

public class HackerRank {
    public static void main(String[] args) {

    }

    public static void javaOutputFormatting() {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();
            for (int j = 0; j < 15 - s1.length(); j++)
                s1 += " ";
            System.out.printf("%15s%03d%n");
        }
        System.out.println("================================");
    }

    public static void javaLoops_1() {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        for (int i = 0; i < 10; i++) {
            System.out.printf("%d x %d = %d%n", N, i + 1, N * (i + 1));
        }

    }

    public static void javaLoops_2() {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        int pow = 1;
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            sum += a + b;
            System.out.printf("%d ", sum);
            for (int j = 1; j < n; j++) {
                for (int k = 0; k < j; k++)
                    pow *= 2;
                sum += pow * b;
                System.out.printf("%d ", sum);
                pow = 1;
            }
            sum = 0;
            System.out.printf("%n");
        }
        in.close();

    }

    public static void javaDataTypes(){

        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {
            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=Byte.MIN_VALUE && x<=Byte.MAX_VALUE)System.out.println("* byte");
                if(x>=Short.MIN_VALUE && x<= Short.MAX_VALUE)System.out.println("* short");
                if(x>=Integer.MIN_VALUE && x<= Integer.MAX_VALUE)System.out.println("* int");
                if(x>=Long.MIN_VALUE && x<= Long.MAX_VALUE)System.out.println("* long");
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }
        }
    }

    public static void javaEndOfFIle(){
        Scanner sc = new Scanner(System.in);
        int count = 1;
        String s = "";
        while(sc.hasNext()){
            s = sc.nextLine();
            System.out.printf("%d %s%n", count, s);
            count ++;
        }
        sc.close();
    }

    public static void javaStaticInitializerBlock(){
//        static int B;
//        static int H;
//        static boolean flag;
//        static {
//            try{
//                Scanner sc= new Scanner(System.in);
//                flag = true;
//                B = sc.nextInt();
//                H = sc.nextInt();
//                if( B <= 0 || H <= 0){
//                    flag = false;
//                    throw new Exception();
//                }
//                sc.close();
//            }catch(Exception e){
//                System.out.println("java.lang.Exception: Breadth and height must be positive");
//            }
//        }
    }
}

