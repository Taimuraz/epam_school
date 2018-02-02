import javax.sound.midi.Soundbank;

import static jdk.nashorn.internal.objects.Global.print;

class Insect{
    private int i = 9;
    protected int j;
    Insect(){
        System.out.println(" i = " + i + " , " + "j = " + j);
        j = 39;
    }
    static int printInit(String s) {
        System.out.println(s);
        return 47;
    }
    private static int x1 = printInit("Поле Insect.x1 инициализированно.");
}

class Stat{
    static int printInit(String s) {
        System.out.println(s);
        return 47;
    }
    private int k = printInit("Поле Stat.k инициализированно.");
    private static int x2 = printInit("Поле Stat.x2 инициализированно.");
}

public class Beetle{

    Beetle(){
//        System.out.println("k = " + k);
//        System.out.println("k = " + k);
    }

    public static void main(String[] args) {
        Stat.printInit("");
    }
}
