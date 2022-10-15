public class Aula4 {
    public static void main(String[] args) {

        byte b1;
        short s1 = 1000;

        b1 = (byte) s1;

        int i1 = 100;
        long l1;

        l1 = i1;

        int i2;
        long l2 = 10000000000000L;

        i2 = (int) l2;

        int i3;
        long l3 = 1000L;

        i3 = (int) l3;

        double d1;
        float f1 = 10.5f;

        d1 = f1;

        float f2;
        float f3;
        double d2 = 100000.555d;

        f2 = (float) d2;

        double d3 = 100000.00000000000000000000000000000000000000000000000000004445564545d;

        f3 = (float) d3;

        int i4;
        float f4 = 35.555f;

        i4 = (int) f4;

        System.out.println("b1: " + b1);
        System.out.println("l1: " + l1);
        System.out.println("i2: " + i2);
        System.out.println("i3: " + i3);
        System.out.println("d1: " + d1);
        System.out.println("f2: " + f2);
        System.out.println("f3: " + f3);
        System.out.println("i4: " + i4);


    }

}
