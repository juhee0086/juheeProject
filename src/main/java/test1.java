import java.util.Scanner;

public class test1 {
    static int max(int a, int b, int c, int d) {
        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;
        if (d > max) max = d;

        return max;
    }

    static int min(int a, int b, int c, int d) {
        int min = a;
        if (b < min) min =b;
        if (c < min) min =c;
        if (d < min) min =d;

        return min;
    }

    static int med(int a, int b, int c) {
        if(a <= b)
            if(b <= c)
                return b;
            else if(a <= c)
                return a;
            else
                return c;

        return a;
    }

    public static void main(String[] args) {
//        System.out.println("max: "+ max(3,3,5,7));
//        System.out.println("min: "+ min(3,1,7,-1));
        System.out.println("med: "+ med(3,1,7));

    }
}
