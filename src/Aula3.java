public class Aula3 {

    public static void main(String[] args) {

        System.out.println("PrePos");
        prePos();

        System.out.println("Aritmetica");
        aritmetica();
        System.out.println("Atribuições");
        atribuicoes();
        System.out.println("Precedencia");
        precedencia();


    }

    private static void prePos() {
        int a = 10;

        int b = ++a;
        int c = a--;
        int d = a;

        System.out.println("b: " + b);
        System.out.println("c: " + c);
        System.out.println("d: " + d);


    }

    private static void aritmetica() {

        int e = 10;
        int f = 20;
        int g = 30;
        int h = 40;
        int i = 50;

        int r1 = e+f;
        int r2 = g-f;
        int r3 = h*f;
        int r4 = h/e;
        int r5 = i%f;

        System.out.println("e+f: " + r1);
        System.out.println("g-f: " + r2);
        System.out.println("h*f: " + r3);
        System.out.println("h/e: " + r4);
        System.out.println("i%f: " + r5);
    }

    private static void atribuicoes() {

        int j = 1500;
        short k = 15;
        long l = 500L;
        int m = 35;
        float n = 3.5f;
        double o = n;

        System.out.println("d:" + o);

        j += 5; // j = 1500 + 5
        k -= 3; // k = 15 - 3
        l /= 2; // l = 500 / 2
        n *= 2; // n = 3.5 * 2
        m %= 2; // m = 35 % 2

        System.out.println("j:" + j);
        System.out.println("k:" + k);
        System.out.println("l:" + l);
        System.out.println("n:" + n);
        System.out.println("m:" + m);

        j = k = (short) m;

        System.out.println("j:" + j);
        System.out.println("k:" + k);

    }

    private static void precedencia() {

        int i = 10;
        int j = 20;
        int k = 30;

        int r = i++ + --j * k; // 10 + 19 * 30 => 10 + 570 => 580

        System.out.println("r: " + r);
        System.out.println("i: " + i);

        int s = k / --i % 3 + 1; // 30 / 10 % 3 + 1 => 0 + 1 => 1

        System.out.println("s: " + s);

        System.out.println("i: " + i);

        int t = 10;

    }
}