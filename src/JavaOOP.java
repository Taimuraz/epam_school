import java.util.ArrayList;
import java.util.Scanner;



public class JavaOOP {
    class A{}
    public static void main(String[] args) {

    }

    //======================================= Inheritance
    class Arithmetic{
        int add( int a, int b){
            return a + b;
        }
    }
    class Adder extends Arithmetic{
    }
    //=======================================

    interface AdvancedArithmetic{
        int divisor_sum(int n);
    }

    class MyCalculator implements AdvancedArithmetic{
        public int divisor_sum( int n){
            int sum = 0;
            for( int i = 1; i <= n; i ++){
                if( n % i == 0){
                    sum += i;
                }
            }
            return sum;
        }
    }





    static class Student{}
    static class Rockstar{}
    static class Hacker{}

    static public class InstanceOFTutorial{

        static String count(ArrayList mylist){
            int a = 0,b = 0,c = 0;
            for(int i = 0; i < mylist.size(); i++){
                Object element=mylist.get(i);
                if(element instanceof Student)
                    a++;
                if(element instanceof Rockstar)
                    b++;
                if(element instanceof Hacker)
                    c++;
            }
            String ret = Integer.toString(a)+" "+ Integer.toString(b)+" "+ Integer.toString(c);
            return ret;
        }

        public static void main(String []args){
            ArrayList mylist = new ArrayList();
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            for(int i=0; i<t; i++){
                String s=sc.next();
                if(s.equals("Student")){
                    mylist.add(new Student());
                }
                if(s.equals("Rockstar"))mylist.add(new Rockstar());
                if(s.equals("Hacker"))mylist.add(new Hacker());
            }
            System.out.println(count(mylist));
        }
    }

    static class Singleton{
        private volatile static Singleton instance;
        public static String str;
        private Singleton() {}

        static Singleton getSingleInstance() {
            if (instance == null) {
                synchronized (Singleton.class) {
                    if (instance == null) {
                        instance = new Singleton();
                    }
                }
            }
            return instance;
        }


    }



}
