
/**
 * This class creates the window for the planets and runs the movement and initialisation of the planets
 * @author Mohammed Patel
 */
public class SolarDriver 
{
    SolarSystem newWindow = new SolarSystem(900,900);
    

    /**
	 * The main driver class which calls the planets constructors and moves the planets
	 */
    public static void main(String[] args)
    {
        SolarDriver start = new SolarDriver();
        Sun newSun = new Sun(start.newWindow); //create sun
        Planet newEarth = new Planet(start.newWindow,0,100,50,"blue"); //create earth
        Planet newMars = new Planet(start.newWindow,70,70,40,"red");
        
        int i =0;
        int j=70;
        while(true)
        {
            newSun.repaintSun();
            newEarth.movePlanet(i);
            newMars.movePlanet(j);
            i++;
            j++;
    
            start.newWindow.finishedDrawing();
        }
        
        
    }

    public void createPlanets()
    {

    }
       
    

    
}
