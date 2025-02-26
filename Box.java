package PSK_Examples;

public class Box {
    // Properties of the class
    private float fltHeight, fltWidth, fltDepth;
    private boolean blnFull;

    //Constructor
    public Box() {
        // Initializing the properties with their initial values (No Box).
        fltHeight = 0.0f;
        fltWidth = 0.0f;
        fltDepth = 0.0f;
        blnFull = false;
    }
    public Box(float newHeight, float newWidth, float newDepth) {
        // Modifying the values of the properties.
        fltHeight = newHeight;
        fltWidth = newWidth;
        fltDepth = newDepth;
        blnFull = false;
    }

    // Accessors or getters
    public float getHeight() {
        return fltHeight; // Extracting the value of height
    }

    public float getWidth() {
        return fltWidth; // Extracting the value of the width
    }

    public float getDepth() {
        return fltDepth; // Extracting the value the depth
    }

    public boolean getFull() {
        return blnFull;  // Extracting whether the value of if the box is full or not.
    }

    //Mutators or Setters
    public void setHeight(float newHeight) {
        fltHeight = newHeight; // Setting the private height
    }

    public void setWidth(float newWidth) { // Setting the private width
        fltWidth = newWidth;
    }

    public void setDepth(float newDepth) { // Setting the private depth
        fltDepth = newDepth;
    }

    public void setFull(boolean needsFilling) {
        blnFull = needsFilling; // Setting the private value of full.
    }

    //Design the output for every object in the print command.
    @Override
    public String toString() {
        return "The box has a height of " + fltHeight + " a width of " + fltWidth + " and a depth of " + fltDepth + "."
                + " Is it true or false that the box is full? " + blnFull;
    }
}
