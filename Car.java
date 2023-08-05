public class Car {
    private int code;
    private Route RoutObject=new Route();
   private double maxCapacity;
    public Car(){
    }
    public Car(int code,Route R, double maxCapacity) {
        this.code = code;
        this.RoutObject=R;
        this.maxCapacity = maxCapacity;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Route getRoutObject() {
        return RoutObject;
    }

    public void setRoutObject(Route routObject) {
        RoutObject = routObject;
    }

    public double getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(double maxCapacity) {
        this.maxCapacity = maxCapacity;
    }
}
