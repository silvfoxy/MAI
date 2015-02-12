package something;

import java.io.IOException;
import java.text.DecimalFormat;

/**
 * Created by FokinaA on 24.12.2014.
 */
public class math_dihot {
    public static void main(String[] args) throws IOException {
        double l = -1.0;
        double r = 0.0;

        double ans = dihot_for_first_derivative(l, r);
        System.out.println(new DecimalFormat("#0.0000").format(ans).replace(',', '.'));

        l = -2.0;
        r = 1.0;
        ans = dihot_for_second_derivative_plus(l, r);
        System.out.println(new DecimalFormat("#0.0000").format(ans).replace(',', '.'));
        l = -3.0;
        r = -2.5;
        ans = dihot_for_second_derivative_minus(l, r);
        System.out.println(new DecimalFormat("#0.0000").format(ans).replace(',', '.'));

    }
    public static int first_derivative (double x){
        double a = Math.pow(x+2, 2*(x+2));
        double b = Math.pow(Math.E, -x);
        if ((int) (a*10000) == (int) (b*10000))
            return 0;
        if ((int) (a*10000) > (int) (b*10000))
            return 1;
        return -1;
    }
    public static double dihot_for_first_derivative (double l, double r){
        double tmp = (l+r)/2.0;
        if (first_derivative(tmp)>0) return dihot_for_first_derivative(l, tmp);
        if (first_derivative(tmp)<0) return dihot_for_first_derivative(tmp, r);
        else return tmp;
    }
    public static int second_derivative (double x){
        double a = Math.pow(x+2, 2);
        double b = Math.pow(Math.E, (3*x+8)/a);
        if ((int) (a*10000) == (int) (b*10000))
            return 0;
        if ((int) (a*10000) > (int) (b*10000))
            return 1;
        return -1;
    }
    public static double dihot_for_second_derivative_plus (double l, double r){
        double tmp = (l+r)/2.0;
        if (second_derivative(tmp)>0) return dihot_for_second_derivative_plus(l, tmp);
        if (second_derivative(tmp)<0) return dihot_for_second_derivative_plus(tmp, r);
        else return tmp;
    }
    public static double dihot_for_second_derivative_minus (double l, double r){
        double tmp = (l+r)/2.0;
        if (second_derivative(tmp)<0) return dihot_for_second_derivative_minus(l, tmp);
        if (second_derivative(tmp)>0) return dihot_for_second_derivative_minus(tmp, r);
        else return tmp;
    }
}
