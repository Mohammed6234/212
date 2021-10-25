import java.util.Random;
public class Asteroids extends Planet {

    SolarSystem windowPlanet;
    double anglePlanet=0;
    int distance =0;
    int diameter =1;
    String colour ="white";
    
    

    public Asteroids(SolarSystem window, int angle,int distance)
    {
        super(window, angle, distance, 1, "white");
        this.windowPlanet = window;
        this.anglePlanet = angle;
        this.distance = distance;
        
        
    }

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
