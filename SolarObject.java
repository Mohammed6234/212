public class SolarObject 
{
     String name;
     SolarSystem windowPlanet;
     double anglePlanet=0;
     int distance =0;
     int diameter =0;
     String colour ="";
    

    public SolarObject()
    {

    }

    /**
	 * Creates a planet through the parameters and puts it onto the window
	 *
	 * @param window the window in which to draw the planet is
	 * @param angle the angle at which the planet shoudl appear in relative to the sun
     * @param distance the distance to the sun of the planet
     * @param diameter the size of the planet
     * @param colour the colour of the planet
     * @param name name of the planet
	 */
    public SolarObject(SolarSystem window, int angle, int distance, int diameter, String colour,String name)
    {
        this.name = name;
        this.windowPlanet = window;
        this.anglePlanet = angle;
        this.distance = distance;
        this.diameter = diameter;
        this.colour = colour;

    }

    public void draw()
    {
        windowPlanet.drawSolarObject(distance, anglePlanet, diameter, colour);
    }
    public void movePlanet()
    {

    }

    public void getName(String name)
    {
        this.name = name;
    }
}
