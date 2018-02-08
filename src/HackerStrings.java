import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class HackerStrings {
    public static void main(String[] args) {
//        String p = "[AZ[a-z](a-z)";

//        Pattern.compile(p);

    }

    public static void StringTokens() {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        s = s.trim();

        if (s.equals("")) {
            System.out.println(0);
            return;
        }
        String[] tokens = s.split("[ !,?._'@]+");
        System.out.println(tokens.length);
        for (String token : tokens) {
            System.out.println(token);
        }
        scan.close();
    }

    public static void PatternSyntaxChecker() {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while (testCases-- > 0) {
            String pattern = in.nextLine();
            try {
                Pattern.compile(pattern);
                System.out.println("Valid");
            } catch (PatternSyntaxException exception) {
                System.out.println("Invalid");
            }
        }
    }

    class MyRegex {
        String num = "([01]?\\d{1,2}|2[0-4]\\d|25[0-5])";
        String pattern = num + "." +  num + "." +  num + "." + num;
    }

    public static void ContentExtractor(){
        Scanner scan  = new Scanner(System.in);
        int testCases = Integer.parseInt(scan.nextLine());
        while (testCases-- > 0) {
            String line = scan.nextLine();
            boolean matchFound = false;
            Pattern r = Pattern.compile("<(.+)>([^<]+)</\\1>");
            Matcher m = r.matcher(line);
            while (m.find()) {
                System.out.println(m.group(2));
                matchFound = true;
            }
            if (!matchFound) {
                System.out.println("None");
            }
        }
        scan.close();
    }

    public static void duplicateWords(){
        String regex = "\\b(\\w+)(\\W+\\1\\b)+";
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());

        while (numSentences-- > 0) {
            String input = in.nextLine();

            Matcher m = p.matcher(input);
            while (m.find()) {
                input = input.replaceAll(m.group(), m.group(1));
            }
            System.out.println(input);
        }

        in.close();
    }
}


