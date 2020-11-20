/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bach.utils.test;

import static bach.utils.MathUtility.*;//cau lenh chi co tu JDK5 va chi danh cho static
import java.sql.SQLException;
//tuc la khi choi import static ,thi moi ham static trong class nay 
//khi goi thi khong can ten class cham, goi nhu C,vi hieu ngam da cham roi.
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ngoba
 */
public class MathUtilityTest {
    //class nay la class xai bo thu vien JUnit dung de test code theo dang xanh do thay vo nhin bang mat nhu ben 
    //main() sout()
    //2 file.jar da duoc add vao project va ta thoai mai xai cac ham cua no 
    //trong thu vien nay co n ham dac biet deu co ten xuat phat la assertX(expected va actual dua vao)
    //neu no thay expected khong co bang actual , no thay mau red
    //                     co bang ,no thay mau xanh 
    //quy tac xanh do : neu tat ca xanh --> ket luan xanh
    //neu co it nhat 1 do eo quan tam con lai 
    //>>>.ket luan red
    //dam bao: ham chay dung moi case , truong hop

    @Test //bien ham sau day thanh public static void main() muon run thi nhan shift+ F6
    //quy tac dat ten cua nghe tester ,QC
    public void getFactorial_RunsWell_IfValidArgument() {
        assertEquals(120, getFactorial(5));//cach de test case
        assertEquals(720, getFactorial(6));
        assertEquals(24, getFactorial(4));
        assertEquals(1, getFactorial(0));
    }
   @Test(expected = IllegalArgumentException.class)
   //@Test(expected = SQLException.class)
    public void getFactorial_ThrowsException_IfInvalidArgument() {
        //ngoai le khong phai la value de assert()
        //chi co the chup no lai
        getFactorial(-5);
       
        
    }
}
