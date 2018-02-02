import javax.print.attribute.standard.Finishings;
import java.util.Random;

import static java.lang.System.*;
import static jdk.nashorn.internal.objects.Global.print;

class Value{
    int i;
    public Value(int i){
        this.i = i;
    }

}

class FinalData{
    private static Random rand = new Random(47);
    private  String id;
    public FinalData( String id){
        this.id = id;
    }
    private final int valueOne = 9;
    private final static int VALUE_TWO = 99;
    public final static int VALUE_THREE = 39;
    private final int i4 = rand.nextInt(2000);
    static final int INT_5 = rand.nextInt(2000);
    private Value v1 = new Value(11);
    private final Value v2 = new Value(22);
    private static final Value v3 = new Value(33);
    private final int[] a = { 1, 2, 3, 4, 5, 6};
}

class EmptyFinal{
    private final int pf1;
    private static final int pf2 = 10;
       EmptyFinal() {
        pf1 = 0;
        out.println(pf2);
    }
}

class Parent{
    public void count(){
        System.out.println("Parent.");
    }
}

class Doughter extends Parent{
    @Override
    public void
    count(){
        System.out.println("Daughter.");
    }
}



public class JavaEccel {
    public static void main(String[] args) {
        Doughter d = new Doughter();

    }
}
