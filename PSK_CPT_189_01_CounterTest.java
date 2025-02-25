
/*
----------------------------------------------------------------------------------------------------------
    Name:		PSK_CPT_189_01_CounterTest
    Author:		Patrick_Stephane_Keuagho
    Language:	Java
    Date:		2025-02-22
    Purpose:	The purpose of this program is to be a Driver program to be run in order to test the 
    Counter's Objects and its methods.
----------------------------------------------------------------------------------------------------------
    Change Log
----------------------------------------------------------------------------------------------------------
    Who		Date		Reason
    PSK		2025-02-22	Original Version of Code
----------------------------------------------------------------------------------------------------------
*/
package PSK_Examples;

public class PSK_CPT_189_01_CounterTest {
    public static void main(String[] args) {
        // Create two counter objects
        PSK_CPT_189_01_Counter cntCounter_1 = new PSK_CPT_189_01_Counter();
        PSK_CPT_189_01_Counter cntCounter_2 = new PSK_CPT_189_01_Counter();

        // Now, method calls are correctly placed inside main()
        cntCounter_1.click();
        cntCounter_1.click();
        System.out.println("Counter 1 count: " + cntCounter_1.getCount()); //Expect 2

        cntCounter_2.click();
        cntCounter_2.click();
        System.out.println("Counter 2 count: " + cntCounter_2.getCount()); //Expect 2

        // Reset counter 1 and test again
        cntCounter_1.reset(); 
        System.out.println("Counter 1 after reset: " + cntCounter_1.getCount()); //Expect 0

        // Reset counter 2 and test again
        cntCounter_2.reset(); 
        System.out.println("Counter 2 after reset: " + cntCounter_2.getCount()); //Expect 0
    }
}