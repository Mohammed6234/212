import java.util.ArrayList;
import java.util.Random;
/**
 * This class creates the window for the planets and runs the movement and initialisation of the planets
 * @author Mohammed Patel
 */
public class SolarDriver 
{
    SolarSystem newWindow = new SolarSystem(1000,900);
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

     /**
	 * Method to initialise all planets and moons and store them in solar objects for ease of movement
	 */
    public void createPlanets()
    {
        arrayOfAllSolarObjects.add(new Planet(newWindow,0,250,50,"blue")); //create earth
        arrayOfAllSolarObjects.add(new Planet(newWindow,70,100,40,"red")); //create mars
        arrayOfAllSolarObjects.add(new Planet(newWindow,140,375,60,"orange")); // jupiter
        arrayOfAllSolarObjects.add(new Planet(newWindow,230,50,20,"magenta")); // venus


        arrayOfAllSolarObjects.add(new Moon(newWindow, 0, 250, 10,30,5)); //earths moon
        arrayOfAllSolarObjects.add(new Moon(newWindow,70,100,10,27,5)); //mars 1st moon
        arrayOfAllSolarObjects.add(new Moon(newWindow,70,100,180,27,5)); //mars 2nd moon

      

        for(int i=0; i<950; i++)
        {
            Random r = new Random();
            int angle = r.nextInt(360);
            int distance = r.nextInt(150);
            arrayOfAllSolarObjects.add(new Asteroids(newWindow, angle, distance));
        }
        
        
        int jupiterAngle =0;
        int jupiterMoonDistance =5;
        for(int i =0; i<18; i++)
        {
            arrayOfAllSolarObjects.add(new Moon(newWindow,140,375,jupiterAngle,35,jupiterMoonDistance));
            jupiterAngle = jupiterAngle + 20;
            if(jupiterMoonDistance==5)
                jupiterMoonDistance = jupiterMoonDistance +5;
            else
                jupiterMoonDistance = jupiterMoonDistance -5;
        }
    }

     /**
	 * The method to move planets by running through array list and calling the overriden movePlanet method
	 */
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
