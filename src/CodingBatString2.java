import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CodingBatString2 {
    public static void main(String[] args) {
        String data = "codexxcodecopecooe";
        String a = "Hiabc";
        String b = "bc";
        endOther(a,b);
    }


    public boolean xyBalance( String str){
        boolean xopen = false;
        for( int i = 0; i < str.length(); i ++){
            if( str.charAt(i) == 'x' ){
                xopen = true;
            }
            if( str.charAt(i) == 'y' && xopen){
                xopen = false;
            }


        }
        if( xopen ){
            return false;
        }
        return true;
    }


    public boolean bobThere(String str) {
        if( str.length() >= 3){
            for( int i = 0; i < str.length()-2; i ++){
                if( str.charAt(i)  == 'b' && str.charAt(i+2)  == 'b'){
                    return true;
                }
            }
        }
        return false;
    }


    public static boolean endOther(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();
        boolean test1 = a.length() >= b.length() && a.substring(a.length() - b.length()).equals(b);
        boolean test2 = b.length() >= a.length() && b.substring(b.length() - a.length()).equals(a);
        return test1 || test2;
    }


    public static int countCode(String str) {
        int count = 0;
        for (int i = 0; i < str.length()-3; i++){
            if (str.charAt(i) == 'c' && str.charAt(i+1) == 'o' && str.charAt(i+3) == 'e'){
                count++;
            }
        }
        return count;
    }

    public static String mixString(String a, String b) {
        String res = "";
        if( a.length() > b.length() ){
            for( int i = 0; i < a.length(); i++){
                if( i <= b.length() - 1){
                    res = res + a.charAt(i) + b.charAt(i);
                }else{
                    res = res + a.charAt(i);
                }
            }
        }else
        if( a.length() < b.length()){
            for( int i = 0; i < b.length(); i++){
                if( i <= a.length() - 1){
                    res = res + a.charAt(i) + b.charAt(i);
                }else{
                    res = res + b.charAt(i);
                }
            }
        }else
        if(a.length() == b.length()){
            for( int i = 0; i < b.length(); i++){
                res = res + a.charAt(i) + b.charAt(i);
            }
        }

        return res;
    }

    public static String repeatEnd(String str, int n) {
        String res = "";
        if( str.length() >= n){
            for( int i = 0; i < n; i ++){
                res += str.substring(str.length() - n, str.length());
            }
        }
        return res;
    }

    public static String repeatSeparator(String word, String sep, int count) {
        String res = "";
        for( int i =0; i < count; i ++){
            if(  i == (count-1) || count == 1 ){
                res = res + word;
            }else{
                res = res + word + sep;
            }

        }

        return res;
    }

    public static boolean prefixAgain(String str, int n) {
        String prefix = str.substring(0, n);
        for( int i = n; i <= str.length() - n; i++){
            if( str.substring(i, i + n).equals(prefix) ){
                return true;
            }
        }
        return false;
    }

    public static boolean xyzMiddle(String str) {
        int len = str.length();
        if (len < 3) return false;
        if (len % 2 == 1)
            return str.substring(len/2 - 1, len/2 + 2).equals("xyz");
        return str.substring(len/2 - 2, len/2 + 1).equals("xyz")
                || str.substring(len/2 - 1, len/2 + 2).equals("xyz");
    }

    public static String getSandwich(String str) {
        int first = str.indexOf("bread");
        int last = str.lastIndexOf("bread");
        if (first == last) return "";
        return str.substring(first+5, last);
    }

    public static boolean sameStarChar(String str) {
        for (int i = 1; i < str.length()-1; i++)
            if (str.charAt(i) == '*' && str.charAt(i-1) != str.charAt(i+1))
                return false;
        return true;
    }

    public String zipZap(String str) {
        for (int i = 0; i < str.length()-2; i++)
            if (str.charAt(i) == 'z' && str.charAt(i+2) == 'p')
                str = str.substring(0,i+1) + str.substring(i+2);
        return str;
    }

    public String starOut(String str) {
        while (str.indexOf('*') != -1) {
            if (str.equals("*")) return "";
            int starPos = str.indexOf('*');
            int secondStar = str.indexOf('*', starPos+1);
            if (secondStar - starPos == 1) {
                str = str.substring(0,starPos) + str.substring(secondStar);
                continue;
            }
            if (starPos == 0) str = str.substring(starPos+2);
            else if (starPos == str.length()-1)
                str = str.substring(0, str.length()-2);
            else str = str.substring(0, starPos-1) + str.substring(starPos+2);
        }
        return str;
    }

    public String plusOut(String str, String word) {
        int start = 0;
        int end = str.indexOf(word);
        while (end != -1) {
            for (int i = start; i < end; i++)
                str = str.substring(0,i) + "+" + str.substring(i+1);
            start = end + word.length();
            end = str.indexOf(word, start);
        }
        for (int i = start; i < str.length(); i++)
            str = str.substring(0,i) + "+" + str.substring(i+1);
        return str;
    }

    public String wordEnds(String str, String word) {
        String res = "";
        int pos = str.indexOf(word);
        while (pos != -1) {
            if (pos != 0) res += str.charAt(pos-1);
            if (pos + word.length() == str.length()) break;
            res += str.charAt(pos + word.length());
            pos = str.indexOf(word, pos+1);
        }
        return res;
    }

    public String oneTwo(String str) {
        if(str.length() < 3) return "";
        String result = "";
        for(int i = 0;i < str.length() -2;i += 3){
            result = result + str.substring(i + 1, i + 3) + str.substring(i, i + 1);
        }
        return result;
    }

}
