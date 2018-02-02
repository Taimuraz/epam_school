import java.util.*;
import java.text.NumberFormat;


public class HackerRank {
    public static void main(String[] args) {
        javaStringTokens();
    }

    public static void javaStringTokens(){
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();
        String[] tokens = s.split("[A-Za-z !,?._'@]+");
        System.out.println(tokens.length);

        for(int i = 0; i < tokens.length; i ++){
            System.out.println(tokens[i]);
        }

    }

    public static void javaAnagrams(String a, String b) {
        a = a.toUpperCase();
        b = b.toUpperCase();
        char[] tmp = a.toCharArray();
        Arrays.sort(tmp);
        a = new String(tmp);
        tmp = b.toCharArray();
        Arrays.sort(tmp);
        b = new String(tmp);

        if (a.equals(b)) {
            System.out.println("Anagrams");
        } else {
            System.out.println("Not Anagrams");

        }
    }

    public static void javaStringReverse() {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        if (A.equals(new StringBuilder(A).reverse().toString())) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }

    public static void javaSubstringCompartions() {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
        ArrayList subs = new ArrayList();
        for (int i = 0; i < s.length() - (k - 1); i++) {
            subs.add(s.substring(i, i + k));
        }
        Collections.sort(subs);
        System.out.println(subs);
//        System.out.println(subs.get(subs.size() - 1 ));
    }

    public static void javaSubstring() {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        System.out.printf(S.substring(start, end));

    }

    public static void javaStringIntroduction() {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        System.out.println(A.length() + B.length());
        if ((int) A.charAt(0) > (int) B.charAt(0)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        A = A.toUpperCase().charAt(0) + A.substring(1);
        B = B.toUpperCase().charAt(0) + B.substring(1);

        System.out.printf("%s %s", A, B);
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

    public static void javaDataTypes() {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            try {
                long x = sc.nextLong();
                System.out.println(x + " can be fitted in:");
                if (x >= Byte.MIN_VALUE && x <= Byte.MAX_VALUE) System.out.println("* byte");
                if (x >= Short.MIN_VALUE && x <= Short.MAX_VALUE) System.out.println("* short");
                if (x >= Integer.MIN_VALUE && x <= Integer.MAX_VALUE) System.out.println("* int");
                if (x >= Long.MIN_VALUE && x <= Long.MAX_VALUE) System.out.println("* long");
            } catch (Exception e) {
                System.out.println(sc.next() + " can't be fitted anywhere.");
            }
        }
    }

    public static void javaEndOfFIle() {
        Scanner sc = new Scanner(System.in);
        int count = 1;
        String s = "";
        while (sc.hasNext()) {
            s = sc.nextLine();
            System.out.printf("%d %s%n", count, s);
            count++;
        }
        sc.close();
    }

    public static void javaStaticInitializerBlock() {
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

    public static void javaDateAndTime() {
        Calendar c = Calendar.getInstance();
        c.setTime(new Date(2015, 8, 5));
        String[] days = {
                "FIRST",
                "SUNDAY",
                "MONDAY",
                "TUESDAY",
                "WEDNESDAY",
                "THURSDAY",
                "FRIDAY",
                "SATURDAY"
        };
        int day_of_week = c.get(Calendar.DAY_OF_WEEK);
        System.out.print(day_of_week);
    }

    public static void isPolindrome() {
        String text = "Madam, I'm Adam!";
        text = text.replaceAll("[^A-Za-z1-9]+", "");
        text = text.toUpperCase();
        System.out.print(text);

    }

    public static void arrMerge(int[] arr1, int[] arr2) {
        int[] big;
        int[] small;
        int[] result = new int[arr1.length + arr2.length];
        if (arr1.length > arr2.length) {
            big = arr1;
            small = arr2;
        } else {
            big = arr2;
            small = arr1;
        }
        int k = 0;
        for (int i = 0; i < big.length; i++) {
            if (i < small.length) {
                result[k] = Math.min(big[i], small[i]);
                result[k + 1] = Math.max(big[i], small[i]);
            }
            k += 2;
        }
        System.out.print(Arrays.toString(result));
    }

    public static void javaCurrencyFormatter() {
        NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("en", "in"));
        System.out.println(nf.format(10.0));
    }
}



