/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bach.utils;

/**
 *
 * @author ngoba
 */
public class MathUtility {

    //fake class Math giống như thật 
    //Math.sqrt .abs() .pow(). sin() .PI
    public static final double PI = 3.1415; //xài MathUtility.PI
    //tính n! =1.2.3.4...n

    public static long getFactorial(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("n must between 0..20");
        }
        if (n == 0 || n == 1) {
            return 1;
        }

        //k sai else,co else tru diem
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;

        }
        return result;
    }

}
