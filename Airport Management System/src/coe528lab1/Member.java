package coe528lab1;
public class Member extends Passenger{

    int yearsOfMembership;

    public Member(String name, int age){
        super(name, age);
    }
    @Override
    public double applyDiscount(double p){
        if (yearsOfMembership > 5){
            System.out.println("Applying 10% discount...");
            return p - (p*(0.1));
        }
        else if(yearsOfMembership > 1){
            System.out.println("Applying 50% discount...");
            return p - (p*(0.5));
        }
        else
            return p;
    }
}
