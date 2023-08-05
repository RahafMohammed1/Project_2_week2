public class Main {
    public static void main(String[] args) {
        Route R1=new Route("Alremal","Tuwaiq Academy",200);
        Route R2=new Route("Bark Avenue mall","Alremal",50);

        Car C1=new Car(1453,R1,5);
        Car C2=new Car(1565,R2,6);
        Passenger p= new Subscribers_passengers("Rahaf", "110292658", C1);;
        Passenger p1=new Non_Subscribers_Passengers("Aysha", "123456765", C2, true);

            Passenger[] passengers={p,p1};
            for (int i = 0; i < passengers.length; i++) {
                try{
                    passengers[i].CostOfTrip();
                }catch (Exception e)
                {
                    System.out.println(e.getMessage());

                }

            }
        }


    }