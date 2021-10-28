/**
 * This class creates the planets through a constructor. Also contains method to move the planets
 * @author Mohammed Patel
 */
public class Planet extends SolarObject
{
    SolarSystem windowPlanet;
    int anglePlanet=0;
    int distance =0;
    int diameter =0;
    String colour ="";
    String name ="";
    
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
    public Planet(SolarSystem window, int angle, int distance, int diameter, String colour,String name)
    {
        window.drawSolarObject(distance, angle, diameter,colour);
        windowPlanet = window;
        this.colour = colour;
        this.distance = distance;
        this.diameter = diameter;
        this.anglePlanet = angle;
        this.name = name;
        getName(name);
        
    }    

    
    /**
	 * Moves the planet by changing the angle and redrawing as the finsihedDrawing class clears the screen
	 */
    public void movePlanet()
    {
        windowPlanet.drawSolarObject(distance, anglePlanet+1, diameter,colour);
        anglePlanet++;

    }

    public void movePlanetOpposite()
    {
        windowPlanet.drawSolarObject(distance, anglePlanet-1, diameter,colour);
        anglePlanet--;
    }
    
    
}
