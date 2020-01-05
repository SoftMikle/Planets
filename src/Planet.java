public class Planet implements AstronomicalBody{

    double GRAVITATIONAL_CONSTANT = 6.6740800E-11;

    private double planetMass;
    private double planetRadius;
    private double lowestPoint;
    private double highestPoint;
    String planetName;

    public Planet(){

    }

    public Planet(String planetName, double planetMass, double planetDiameter){
        this.planetName = planetName;
        this.planetMass = planetMass;
        this.planetRadius = planetDiameter;
    }

    public Planet(double planetMass, double planetDiameter, double lowestPoint, double highestPoint, String planetName) {
        this.planetMass = planetMass;
        this.planetRadius = planetDiameter;
        this.lowestPoint = lowestPoint;
        this.highestPoint = highestPoint;
        this.planetName = planetName;
    }

    @Override
    public void showWeightOnSurface(double objectMass){
        System.out.println("The weight of the object on the " + planetName + " surface is " + (GRAVITATIONAL_CONSTANT * planetMass * objectMass / Math.pow(planetRadius, 2)));
    }
    public void showWeightOnSurface(double objectMass, double height){
        System.out.println("The weight of the object on the " + planetName + " and height of " + " meters is " + (GRAVITATIONAL_CONSTANT * planetMass * objectMass / Math.pow(planetRadius + height , 2)));
    }

    public void showMinAndMaxSurfaceGravity(){
        System.out.println("The gravity in the highest planet point reaches " + GRAVITATIONAL_CONSTANT * planetMass / Math.pow(planetRadius + highestPoint, 2) + " N");
        System.out.println("The gravity in the lowest planet point reaches " + GRAVITATIONAL_CONSTANT * planetMass / Math.pow(planetRadius - Math.abs(lowestPoint), 2) + " N");
    }

    public double getPlanetMass() {
        return planetMass;
    }

    public double getPlanetRadius() {
        return planetRadius;
    }

    public double getLowestPoint() {
        return lowestPoint;
    }

    public void setLowestPoint(double lowestPoint) {
        this.lowestPoint = lowestPoint;
    }

    public double getHighestPoint() {
        return highestPoint;
    }

    public void setHighestPoint(double highestPoint) {
        this.highestPoint = highestPoint;
    }

    public String getPlanetName() {
        return planetName;
    }

    public void setPlanetName(String planetName) {
        this.planetName = planetName;
    }
}
