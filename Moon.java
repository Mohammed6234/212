public class Moon 
{
    int planetAngle;
    int planetDistance;
    int moonAngle;
    SolarSystem window;

    public Moon(SolarSystem window, int planetAngle, int planetDistance, int moonAngle)
    {
        super(window, angle, distance, diameter, colour);
        window.drawSolarObjectAbout(40, moonAngle, 10, "white", planetDistance, planetAngle);
        this.planetAngle = planetAngle;
        this.moonAngle = moonAngle;
        this.planetDistance = planetDistance;
        this.window = window;
    }

    public void movePlanet()
    {
        window.drawSolarObjectAbout(40, moonAngle-2, 10, "white", planetDistance, planetAngle+1);
        planetAngle++;
        moonAngle= moonAngle-2;
    }



}
