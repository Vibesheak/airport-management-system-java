package coe528lab1;
public class NonMember extends Passenger{

    public NonMember(String name, int age){
        super(name, age);
    }

    @Override
    public double applyDiscount(double p){
        if (this.age > 65){
            System.out.println("You are over 65! Applying 10% discount...");
            return p - (p*(0.1));
        }
        System.out.println("Sorry, no discounts available...");
        return p;
    }
}
