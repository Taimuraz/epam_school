public class CodingBatRecursion1 {



    public int factorial(int n) {
        if( n == 1) return 1;
        return n * factorial( n -1);
    }

    public int bunnyEars(int bunnies) {
        if( bunnies == 0) return 0;
        return 2 + bunnyEars( bunnies -1 );
    }

    public int count8(int n) {
        if (n == 0) return 0;
        if (n >= 88 && n % 100 == 88) return 2 + count8(n / 10);
        if (n % 10 == 8) return 1 + count8(n / 10);
        return count8(n / 10);
    }

    public int powerN(int base, int n) {
        if (n == 0) return 1;
        return base * powerN(base, n - 1);
    }

    public int countX(String str) {
        if( str.length() == 0) return 0;
        if( str.charAt(str.length() -1) =='x')
            return 1 + countX(str.substring(0, str.length() -1));
        else
            return 0 + countX(str.substring(0, str.length() -1));
    }


    public int countHi(String str) {
        if( str.length() == 1 || str.length() == 0)  return 0;
        if( str.substring(str.length() - 2, str.length()).equals("hi")){
            return 1 + countHi(str.substring(0 , str.length() - 1));
        }else{
            return countHi(str.substring(0 , str.length() - 1));
        }
    }


    public String changeXY(String str) {
        if (str.length() == 0) return str;
        if (str.charAt(0) == 'x') return "y" + changeXY(str.substring(1));
        return str.charAt(0) + changeXY(str.substring(1));
    }

    public String changePi(String str) {
        if (str.length() < 2) return str;
        if (str.substring(0, 2).equals("pi"))
            return "3.14" + changePi(str.substring(2));
        return str.charAt(0) + changePi(str.substring(1));
    }

    public String noX(String str) {
        if (str.length() == 0) return "";
        if (str.charAt(0) == 'x') return noX(str.substring(1));
        return str.charAt(0) + noX(str.substring(1));
    }

    public boolean array6(int[] nums, int index) {
        if (nums.length == 0) return false;
        if (index == nums.length - 1) return nums[index] == 6;
        if (nums[index] == 6) return true;
        return array6(nums, index + 1);
    }

    public int array11(int[] nums, int index) {
        if (index == nums.length) return 0;
        if (nums[index] == 11) return 1 + array11(nums, index + 1);
        return array11(nums, index + 1);
    }

    public boolean array220(int[] nums, int index) {
        if (nums.length < 2 || index == nums.length - 1) return false;
        if (nums[index + 1] == nums[index] * 10) return true;
        return array220(nums, index + 1);
    }

    public String allStar(String str) {
        if( str.length() == 0){
            return "";
        }else
        if( str.length() == 1){
            return str.substring(0,1) + allStar(str.substring(1));
        }else{
            return str.substring(0,1) + '*' + allStar(str.substring(1));
        }
    }



    public String pairStar(String str) {
        if (str.length() < 2) return str;
        if (str.charAt(0) == str.charAt(1))
            return str.charAt(0) + "*" + pairStar(str.substring(1));
        return str.charAt(0) + pairStar(str.substring(1));
    }

    public String endX(String str) {
        if (str.length() == 0) return str;
        if (str.charAt(0) == 'x')
            return endX(str.substring(1)) + "x";
        return str.charAt(0) + endX(str.substring(1));
    }

    public int countPairs(String str) {
        if (str.length() < 3) return 0;
        if (str.charAt(0) == str.charAt(2))
            return 1 + countPairs(str.substring(1));
        return countPairs(str.substring(1));
    }

    public int countAbc(String str) {
        if (str.length() < 3) return 0;
        if (str.substring(0, 3).equals("abc")
                || str.substring(0, 3).equals("aba"))
            return 1 + countAbc(str.substring(1));
        return countAbc(str.substring(1));
    }


    public int count11(String str) {
        if (str.length() < 2) return 0;
        if (str.substring(0, 2).equals("11"))
            return 1 + count11(str.substring(2));
        return count11(str.substring(1));
    }


    public String stringClean(String str) {
        if (str.length() < 2) return str;
        if (str.charAt(0) == str.charAt(1))
            return stringClean(str.substring(1));
        return str.charAt(0) + stringClean(str.substring(1));
    }


    public int countHi2(String str) {
        if (str.length() < 2) return 0;
        if (str.substring(0, 2).equals("hi"))
            return 1 + countHi2(str.substring(2));
        if (str.charAt(0) == 'x' && str.length() >= 3) {
            if (str.substring(1, 3).equals("hi"))
                return countHi2(str.substring(3));
            return countHi2(str.substring(1));
        }
        return countHi2(str.substring(1));
    }

    public String parenBit(String str) {
        if (!str.substring(0, 1).equals("("))
            return parenBit(str.substring(1));
        return (str.substring(0, str.indexOf(")") + 1));
    }

    public boolean nestParen(String str) {
        if (str.equals("") || str.equals("()")) return true;
        if (str.charAt(0) == '(' && str.charAt(str.length() - 1) == ')')
            return nestParen(str.substring(1, str.length() - 1));
        return false;
    }

    public int strCount(String str, String sub) {
        if (str.length() < sub.length()) return 0;
        if (str.substring(0, sub.length()).equals(sub))
            return 1 + strCount(str.substring(sub.length()), sub);
        return strCount(str.substring(1), sub);
    }

    public boolean strCopies(String str, String sub, int n) {
        if (str.length() < sub.length()) return (n <= 0);
        if (str.substring(0, sub.length()).equals(sub))
            return strCopies(str.substring(1), sub, n - 1);
        return strCopies(str.substring(1), sub, n);
    }


    public int strDist(String str, String sub) {
        if (str.indexOf(sub) == -1) return 0;
        if (str.substring(0, sub.length()).equals(sub)
                && str.substring(str.length() - sub.length())
                .equals(sub))
            return str.length();
        if (!str.substring(0, sub.length()).equals(sub))
            return strDist(str.substring(1), sub);
        // case: (!str.substring(str.length()-sub.length()).equals(sub))
        return strDist(str.substring(0, str.length() - 1), sub);
    }

    public static void main(String[] args) {
    }

}
