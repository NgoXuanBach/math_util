/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package math.utlis;

import bach.utils.MathUtility;

/**
 *
 * @author ngoba
 */
public class MathUtil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // ta test thử hàm của ta 
        //dùng mắt để so sánh kết quả thực tế khi chạy và kết quả ta mong đợi 
        long expected = 120;//ta mong nhận được kết quả 120 nếu gọi hàm 5
        long actual = MathUtility.getFactorial(5);
        System.out.println("5!:Expected: " + expected + ";Actual" + actual);
        //expected: 720 if tính 6!
        System.out.println("6!:"+MathUtility.getFactorial(6));
        //expected: 1 if tính 0!
        System.out.println("0!:"+MathUtility.getFactorial(0));
//expectd: IllegalArgumentException if tính -5;

      System.out.println("-5!:"+MathUtility.getFactorial(-5));
    }

}
