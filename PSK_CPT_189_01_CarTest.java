/*
----------------------------------------------------------------------------------------------------------
    Name:		PSK_CPT_189_01_CarTest
    Author:		Patrick_Stephane_Keuagho
    Language:	Java
    Date:		2025-02-22
    Purpose:	The purpose of this program is to be the DRIVER program to be run to instantiate and 
    updates ­several Car objects.
----------------------------------------------------------------------------------------------------------
    Change Log
----------------------------------------------------------------------------------------------------------
    Who		Date		Reason
    PSK		2025-02-22	Original Version of Code
----------------------------------------------------------------------------------------------------------
*/

package PSK_Examples;

public class PSK_CPT_189_01_CarTest {
    public static void main(String[] args) {
        // Creating Car objects
        PSK_CPT_189_01_Car car1 = new PSK_CPT_189_01_Car("Ford", "Mustang", 1967);
        PSK_CPT_189_01_Car car2 = new PSK_CPT_189_01_Car("Toyota", "Corolla", 2010);
        PSK_CPT_189_01_Car car3 = new PSK_CPT_189_01_Car("Chevrolet", "Impala", 1975);

        // Display details
        System.out.println(car1);
        System.out.println("Is it an antique? " + car1.isAntique());

        System.out.println(car2);
        System.out.println("Is it an antique? " + car2.isAntique());

        System.out.println(car3);
        System.out.println("Is it an antique? " + car3.isAntique());

        // Updating car2's model and year
        car2.setModel("Camry");
        car2.setYear(1995);
        System.out.println("\nUpdated " + car2);
        System.out.println("Is it an antique? " + car2.isAntique());
    }
}
