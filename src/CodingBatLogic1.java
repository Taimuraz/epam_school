public class CodingBatLogic1 {
    public static void main(String[] args) {
        lastDigit(23, 19, 13);
    }

    public static boolean lastDigit(int a, int b, int c) {
        int fitst = a%10;
        int second = b%10;
        int third = c%10;

        if( a==b || a==c || b==c){
            return true;
        }

        return false;
    }

}
