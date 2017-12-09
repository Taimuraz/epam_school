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
}
