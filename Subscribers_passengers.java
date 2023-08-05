public class Subscribers_passengers extends  Passenger {
    private double discountPercent=50;

    public Subscribers_passengers(String name, String ID, Car c) {
        super(name, ID, c);
    }

    @Override
    public void CostOfTrip() throws Exception {
        if(getCarObject().getMaxCapacity()==0)
            throw new Exception("the car dose n't reserved because the maximum capacity of the car was equal to zero In.");
        double p = discountPercent/100;
        double trip_price=getCarObject().getRoutObject().getTrip_price();
        setTrip_cost((1-p)*trip_price);

        System.out.println("The information of Subscriber passenger " );
        System.out.println("passenger name: " + getName() + "   " + "passenger ID: " + getID());
        System.out.println("The Car Information : ");
        System.out.println("The Car code:" + getCarObject().getCode() + "  " + "The Capacity : " + getCarObject().getMaxCapacity());
        System.out.println("the Route Information : ");
        System.out.println("start pick up address----------------------------destination address");
        System.out.println("   " + getCarObject().getRoutObject().getStart_pick_up_address() + "-----------------------------------" + getCarObject().getRoutObject().getDestination_address());
        System.out.println("The Route Price "+getCarObject().getRoutObject().getTrip_price()+" SR");
        System.out.println("The Trip Cost = " + getTrip_cost() + " SR");
        System.out.println();
        System.out.println("**********************************************************");
        System.out.println();

    }
}
