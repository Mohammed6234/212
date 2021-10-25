import java.util.ArrayList;
import java.util.Random;
/**
 * This class creates the window for the planets and runs the movement and initialisation of the planets
 * @author Mohammed Patel
 */
public class SolarDriver 
{
    SolarSystem newWindow = new SolarSystem(1500,1200);
    Sun newSun = new Sun(newWindow); //create sun
    ArrayList<SolarObject> arrayOfAllSolarObjects = new ArrayList<>();
    

    /**
	 * The main driver class which calls the planets constructors and moves the planets
	 */
    public static void main(String[] args)
    {
        SolarDriver start = new SolarDriver();
        start.createPlanets();
        start.movePlanets();
    }

    public void createPlanets()
    {
        arrayOfAllSolarObjects.add(new Planet(newWindow,0,250,50,"blue")); //create earth
        arrayOfAllSolarObjects.add(new Planet(newWindow,70,100,40,"red")); //create mars
        arrayOfAllSolarObjects.add(new Planet(newWindow,0,375,60,"orange"));

        arrayOfAllSolarObjects.add(new Moon(newWindow, 0, 250, 10,30)); //earths moon
        arrayOfAllSolarObjects.add(new Moon(newWindow,70,100,10,27)); //mars 1st moon
        arrayOfAllSolarObjects.add(new Moon(newWindow,70,100,180,27)); //mars 2nd moon

      

        for(int i=0; i<950; i++)
        {
            Random r = new Random();
            int angle = r.nextInt(360);
            int distance = r.nextInt(150);
            arrayOfAllSolarObjects.add(new Asteroids(newWindow, angle, distance));
        }
        
        
    }

    public void movePlanets()
    {
        while(true)
        {
            newWindow.finishedDrawing();
            newSun.repaintSun();
            for(int i=0; i< arrayOfAllSolarObjects.size() ; i++)
            {
                arrayOfAllSolarObjects.get(i).movePlanet();
            }
            
    
           // newWindow.finishedDrawing();
        }
    }
       
    

    
}
