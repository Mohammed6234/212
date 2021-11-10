import java.util.ArrayList;
import java.util.Random;

/**
 * This class creates the window for the planets and runs the movement and initialisation of the planets
 * @author Mohammed Patel
 */
public class SolarDriver implements SolarSystemController
{
   
    SolarSystemGUI newGUI = new SolarSystemGUI();

    SolarSystem newWindow = new SolarSystem(1000,900);
    ArrayList<SolarObject> arrayOfAllSolarObjects = new ArrayList<>();
    

    /**
	 * The main driver class which calls the planets constructors and moves the planets
	 */
    public static void main(String[] args)
    {
        
        SolarDriver start = new SolarDriver();
        start.newGUI.addSolarSystemController(start);
        start.createPlanets();
        start.movePlanets();
    }

     /**
	 * Method to initialise all planets and moons and store them in solar objects for ease of movement
	 */
    public void createPlanets()
    {
        arrayOfAllSolarObjects.add(new SolarObject(newWindow,0, 0, 70,"yellow","Sun"));
        arrayOfAllSolarObjects.add(new Planet(newWindow,0,250,50,"blue","earth",1)); //create earth
        arrayOfAllSolarObjects.add(new Planet(newWindow,70,100,40,"red","mars",1)); //create mars
        arrayOfAllSolarObjects.add(new Planet(newWindow,140,375,60,"orange","jupiter",1)); // jupiter
        arrayOfAllSolarObjects.add(new Planet(newWindow,230,50,20,"magenta","venus",1)); // venus

        arrayOfAllSolarObjects.add(new Moon(newWindow,0,250,0,30,10,40,"Earths Moon",arrayOfAllSolarObjects.get(1),"white"));
        

        for(int i=0; i<950; i++)
        {
            Random r = new Random();
            int angle = r.nextInt(360);
            int distance = r.nextInt(150);
            arrayOfAllSolarObjects.add(new Asteroids(newWindow, angle, distance));
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
            arrayOfAllSolarObjects.get(0).draw();
            for(int i=0; i< arrayOfAllSolarObjects.size() ; i++)
            {
                arrayOfAllSolarObjects.get(i).movePlanet();
            }
            
    
           // newWindow.finishedDrawing();
        }
    }

    public void add(String name, double orbitalDistance, double initialAngle, double size, double speed, String colour)
    {  
        arrayOfAllSolarObjects.add(new Planet(newWindow,(int)initialAngle,(int)orbitalDistance,(int)size,colour,name,speed)); 
    }
    public void add(String name, double orbitalDistance, double initialAngle, double size, double speed, String colour,String parentName)
    {
        SolarObject temp;
        for (SolarObject solarObject : arrayOfAllSolarObjects) {
            if(solarObject.name.equalsIgnoreCase(parentName))
            {
                temp = solarObject;
                arrayOfAllSolarObjects.add(new Moon(newWindow,(int)temp.anglePlanet,temp.distance,(int)initialAngle,(int)orbitalDistance,(int)size,speed,name,temp,colour));
            }
            
        }
      
        
    }
    public void remove(String name)
    {
        //System.out.println("Clicked");
        for(int i=0; i<arrayOfAllSolarObjects.size();i++)
        {
            //System.out.println(arrayOfAllSolarObjects.get(i).name);
            if(arrayOfAllSolarObjects.get(i).name.equalsIgnoreCase(name) )
            {
                
                arrayOfAllSolarObjects.remove(i);
            }
        }
    }

    
       
    

    
}
