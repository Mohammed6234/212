import java.util.Random;
public class Asteroids extends Planet {

    private SolarSystem windowPlanet;
    private double anglePlanet=0;
    private int distance =0;
    private int diameter =1;
    private String colour ="white";
    
    
    /**
     * Constructor to create asteroids
     * @param window window of solar window
     * @param angle angle of asteroids
     * @param distance distance from Sun
     */
    public Asteroids(SolarSystem window, int angle,int distance)
    {
        super(window, angle, distance, 1, "white","asteroids",1);
        this.windowPlanet = window;
        this.anglePlanet = angle;
        this.distance = distance;
        
        
    }

     /**
	 * Moves the asteroids by changing the angle and redrawing as the finsihedDrawing class clears the screen
	 */
    public void movePlanet()
    {
     
        Random r = new Random();
        int randomiseMovement = r.nextInt(2);

        if(randomiseMovement==1)
            windowPlanet.drawSolarObject(distance, anglePlanet+0.5, diameter, colour);
        else
            windowPlanet.drawSolarObject(distance, anglePlanet-0.5, diameter, colour);
    }
    
}
