/*
----------------------------------------------------------------------------------------------------------
    Name:		PSK_CPT_189_01_Counter
    Author:		Patrick_Stephane_Keuagho
    Language:	Java
    Date:		2025-02-22
    Purpose:	The purpose of this program is to define a Counter class to count peopple as they enter a 
    room
----------------------------------------------------------------------------------------------------------
    Change Log
----------------------------------------------------------------------------------------------------------
    Who		Date		Reason
    PSK		2025-02-22	Original Version of Code
----------------------------------------------------------------------------------------------------------
*/

package PSK_Examples;

public class PSK_CPT_189_01_Counter {
    // Property of the counter class
    private int intCount;  //Varaiable to store the count.

    // Constructor
    public PSK_CPT_189_01_Counter() {
        intCount = 0; // Initializing the count to 0.
    }
    
    // Incrementing the count
    public void click() {
        intCount++;  // Increment the count
    }

    // Getters
    public int getCount() {
        return intCount; //Extract the current value of count.
    }

    //Reset the counter to 0.
    public void reset() {
        intCount = 0; //Reset the counter to 0
    }
    
}
