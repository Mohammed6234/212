/**
 * This class creates the planets through a constructor. Also contains method to move the planets
 * @author Mohammed Patel
 */
public class Planet extends SolarObject
{
    
    private double velocity;
    /**
	 * Creates a planet through the parameters and puts it onto the window
	 *
	 * @param velocity takes in velocity that planet needs to move at
	 */
    public Planet(SolarSystem window, int angle, int distance, int diameter, String colour,String name,double velocity)
    {
        
        //window.drawSolarObject(distance, angle, diameter,colour);
        this.windowPlanet = window;
        this.colour = colour;
        this.distance = distance;
        this.diameter = diameter;
        this.anglePlanet = angle;
        this.name = name;
        this.velocity = velocity;
        getName(name);
        
    }   
    
  
     /**
     * draws the planet using the method defined in solar window
     */
    @Override
    public void draw()
    {
        windowPlanet.drawSolarObject(distance, anglePlanet, diameter,colour);
    }
    /**
	 * Moves the planet by changing the angle and redrawing as the finsihedDrawing class clears the screen
	 */
    public void movePlanet()
    {
        
        windowPlanet.drawSolarObject(distance, anglePlanet+velocity, diameter,colour);
        anglePlanet = anglePlanet + velocity;

    }

   
    
    
}
