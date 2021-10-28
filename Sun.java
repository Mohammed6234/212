/**
 * This class creates the sun through a constructor. Also contains method to repaint the sun
 * @author Mohammed Patel
 */

public class Sun extends SolarObject
{
    SolarSystem windowStore;

    /**
     * This class creates the sun through a constructor
     * @param window the window which the sun needs to be drawn in
     */
    public Sun(SolarSystem window)
    {
        window.drawSolarObject(0, 0, 70,"yellow");
        windowStore = window;
    }

    /**
     * This class repaints the sun everytime without having to create a new Sun in the driver class
     */
    public void repaintSun()
    {
        windowStore.drawSolarObject(0, 0, 70,"yellow");
    }

}
