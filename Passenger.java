public abstract class Passenger {
   private String name;
    private String ID;
    private  Car CarObject=new Car();
    private double trip_cost;

    public Passenger(String name, String ID, Car c) {
        this.name = name;
        this.ID = ID;
        CarObject = c;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public Car getCarObject() {
        return CarObject;
    }

    public void setCarObject(Car c) {
        CarObject = c;
    }

    public double getTrip_cost() {
        return trip_cost;
    }

    public void setTrip_cost(double trip_cost) {
        this.trip_cost = trip_cost;
    }



     public abstract void CostOfTrip() throws Exception;

}
