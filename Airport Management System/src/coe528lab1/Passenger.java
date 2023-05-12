package coe528lab1;
public abstract class Passenger {
    String name;
    int age;
    public Passenger(String name, int age){
        this.name= name;
        this.age= age;
    }
    public abstract double applyDiscount(double p);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

}
