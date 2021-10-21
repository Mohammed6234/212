import java.util.ArrayList;
/**
 * This class creates the window for the planets and runs the movement and initialisation of the planets
 * @author Mohammed Patel
 */
public class SolarDriver 
{
    SolarSystem newWindow = new SolarSystem(900,900);
    ArrayList<Planet> arrayOfPlanets = new ArrayList<>();
    Sun newSun = new Sun(newWindow); //create sun
    

    /**
	 * The main driver class which calls the planets constructors and moves the planets
	 */
    public static void main(String[] args)
    {
        SolarDriver start = new SolarDriver();
        
        
        start.createPlanets();
        //Moon earthMoon = new Moon(start.newWindow,0,100,50);
        
        start.movePlanets();
        
        
        
        
    }

    public void createPlanets()
    {
         arrayOfPlanets.add(new Planet(newWindow,0,100,50,"blue")); //create earth
         arrayOfPlanets.add(new Planet(newWindow,70,70,40,"red"));
         arrayOfPlanets.add(new Moon(newWindow, 0, 100, 10));
    }

    public void movePlanets()
    {
        while(true)
        {
            newSun.repaintSun();
            for(int i=0; i< arrayOfPlanets.size() ;i++)
            {
                arrayOfPlanets.get(i).movePlanet();
            }
            
    
            newWindow.finishedDrawing();
        }
    }
       
    

    
}
