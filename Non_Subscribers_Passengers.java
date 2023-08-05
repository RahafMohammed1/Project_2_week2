public class Non_Subscribers_Passengers extends Passenger{
    private boolean discount_coupon;
    private double discountPercent=10;

    public Non_Subscribers_Passengers(String name, String ID, Car c,boolean discount_coupon) {
        super(name, ID, c);
        this.discount_coupon=discount_coupon;
    }
    @Override
    public void CostOfTrip() throws Exception {
        if(getCarObject().getMaxCapacity()==0)
            throw new Exception("the car dose n't reserved because the maximum capacity of the car was equal to zero In.");
        if(discount_coupon==true)
        {
            double p = discountPercent/100;
            double trip_price=getCarObject().getRoutObject().getTrip_price();
            setTrip_cost((1-p)*trip_price);
        }
        else
        {
            setTrip_cost(getCarObject().getRoutObject().getTrip_price());
        }



        System.out.println("The information of Non Subscribers passenger " );
        System.out.println("passenger name: " + getName() + "   " + "passenger ID: " + getID());
        System.out.println("Is Has discount coupon? "+discount_coupon);
        System.out.println("the Car Information : ");
        System.out.println("The Car code:" + getCarObject().getCode() + "  " + "The Capacity : " + getCarObject().getMaxCapacity());
        System.out.println("The Route Information : ");
        System.out.println("start pick up address----------------------------destination address");
        System.out.println("   " + getCarObject().getRoutObject().getStart_pick_up_address() + "-----------------------------------" + getCarObject().getRoutObject().getDestination_address());
        System.out.println("The Route Price = "+getCarObject().getRoutObject().getTrip_price()+" SR");
        System.out.println("The Trip Cost = " + getTrip_cost() + " SR");
        System.out.println();
        System.out.println("**********************************************************");
        System.out.println();

    }
}
