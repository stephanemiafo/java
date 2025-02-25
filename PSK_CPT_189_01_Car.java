/*
----------------------------------------------------------------------------------------------------------
    Name:		PSK_CPT_189_01_Car
    Author:		Patrick_Stephane_Keuagho
    Language:	Java
    Date:		2025-02-22
    Purpose:	The purpose of this program is to define a Car class that will be used by other programs
                and it will have constructors, getters, and setters.
----------------------------------------------------------------------------------------------------------
    Change Log
----------------------------------------------------------------------------------------------------------
    Who		Date		Reason
    PSK		2025-02-22	Original Version of Code
----------------------------------------------------------------------------------------------------------
*/

package PSK_Examples;

public class PSK_CPT_189_01_Car {
    // Instance variables
    private String strMake;
    private String strModel;
    private int intYear;

    // Constructor to initialize the car's properties
    public PSK_CPT_189_01_Car(String make, String model, int year) {
        strMake = make;
        strModel = model;
        intYear = year;
    }

    // Getter for Make
    public String getMake() {
        return strMake;
    }

    // Setter for Make
    public void setMake(String strNewMake) {
        strMake = strNewMake;
    }

    // Getter for Model
    public String getModel() {
        return strModel;
    }

    // Setter for Model
    public void setModel(String strNewModel) {
        strModel = strNewModel;
    }

    // Getter for Year
    public int getYear() {
        return intYear;
    }

    // Setter for Year
    public void setYear(int intNewYear) {
        intYear = intNewYear;
    }

    // Method to check if the car is antique (more than 45 years old)
    public boolean isAntique() {
        int intCurrentYear = 2025; // Assuming we are in 2025
        return (intCurrentYear - intYear) > 45;
    }

    // toString method to return car details as a string
    @Override
    public String toString() {
        return strMake + " " + strModel + " (" + intYear + ")";
    }
}
