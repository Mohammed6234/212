/**
 * This class creates the moons through a constructor. Also contains method to move the moons
 * @author Mohammed Patel
 */

public class Moon extends SolarObject
{
    int planetAngle;
    int planetDistance;
    int moonAngle;
    int distance;
    int diameter;
    SolarSystem window;


    /**
	 * Creates a moon through the parameters and puts it onto the window
	 *
	 * @param window the window in which to draw the moon is
	 * @param planetAngle the angle at which the moon should appear in relative to the planet
     * @param planetDistance the distance to the planet of the sun
     * @param distance the distance of the moon to the planet
     * @param diamater the diameter of the moon
	 */
    public Moon(SolarSystem window, int planetAngle, int planetDistance, int moonAngle, int distance, int diameter)
    {
        
        window.drawSolarObjectAbout(distance, moonAngle, 10, "white", planetDistance, planetAngle);
        this.planetAngle = planetAngle;
        this.moonAngle = moonAngle;
        this.planetDistance = planetDistance;
        this.window = window;
        this.distance = distance;
        this.diameter = diameter;
    }

    public void movePlanet()
    {
        window.drawSolarObjectAbout(distance, moonAngle-3, diameter, "white", planetDistance, planetAngle+1);
        planetAngle++;
        moonAngle= moonAngle-3;
    }
    public void movePlanetOpposite()
    {
        window.drawSolarObjectAbout(distance, moonAngle+2, diameter, "white", planetDistance, planetAngle+1);
        planetAngle--;
        moonAngle= moonAngle+2;
    }



}
