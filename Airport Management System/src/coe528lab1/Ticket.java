package coe528lab1;
public class Ticket {
    Passenger passenger;
    Flight flight;
    double price;
    static int number= 0;

    public Ticket(Passenger p, Flight flight, double price){
        this.passenger = p;
        this.flight = flight;
        this.price = price;
        number++;
    }
    //although a ticket number is created for each ticket, the number is not included in the overrriden toString
    @Override
    public String toString(){
        return this.passenger.name +", Flight " +this.flight.getflightNumber()
                +", " +this.flight.getorigin() +" to " +this.flight.getdestination()
                +", " +this.flight.getdepartureTime() +", original price: $"
                +this.flight.getoriginalPrice() +", ticket price: " +this.price;
    }
    public Passenger getPassenger() {
        return passenger;
    }
    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }
    public Flight getFlight() {
        return flight;
    }
    public void setFlight(Flight flight) {
        this.flight = flight;
    }
    public double getPrice() {return price; }
    public void setPrice(double price) {
        this.price = price;
    }
    public static int getNumber() {
        return number;
    }
    public static void setNumber(int numbTickets) {
        number = numbTickets;
    }

}
