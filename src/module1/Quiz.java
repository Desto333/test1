package module1;

import java.security.MessageDigest;

public class Quiz {
    public static void main(String[] args) {
        System.out.println(doubleExpression(0.1, 0.2, 0.3));
        System.out.println(0.1 + 0.2);
        System.out.println(Math.abs(0.1) + Math.abs(0.2));
    }

    public static boolean doubleExpression(double a, double b, double c) {
        boolean result;
        double aRes = Math.abs(a);
        double bRes = Math.abs(b);
        double cRes = Math.abs(c);
        if ((aRes + bRes) == cRes)
            result = true;
        else
            result = false;
        return result;
    }

}
