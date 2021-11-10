/**
 * This class creates the moons through a constructor. Also contains method to move the moons
 * @author Mohammed Patel
 */

public class Moon extends SolarObject
{
    
    double moonAngle;
    double velocity;
    int planetDistance;
    SolarObject orbit;


    /**
	 * Creates a moon through the parameters and puts it onto the window
	 *
	 * @param window the window in which to draw the moon is
	 * @param planetAngle the angle at which the moon should appear in relative to the planet
     * @param planetDistance the distance to the planet of the sun
     * @param distance the distance of the moon to the planet
     * @param diamater the diameter of the moon
	 */
    public Moon(SolarSystem window, int planetAngle, int planetDistance, int moonAngle, int distance, int diameter,double velocity,String name,SolarObject orbit,String colour)
    {
        
        //window.drawSolarObjectAbout(distance, moonAngle, 10, "white", planetDistance, planetAngle);
        this.anglePlanet = planetAngle;
        this.moonAngle = moonAngle;
        this.planetDistance = planetDistance;
        this.windowPlanet = window;
        this.distance = distance;
        this.diameter = diameter;
        this.velocity = velocity;
        this.name = name;
        this.orbit = orbit;
        this.colour = colour;
    }

    @Override
    public void draw()
    {
        windowPlanet.drawSolarObjectAbout(distance, moonAngle, diameter, colour, planetDistance, anglePlanet);
    }

    public void movePlanet()
    {
        windowPlanet.drawSolarObjectAbout(distance, moonAngle-velocity, diameter, colour, orbit.distance,orbit.anglePlanet);
        moonAngle = moonAngle - velocity;
    }
   



}
