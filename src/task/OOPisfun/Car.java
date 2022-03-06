package task.OOPisfun;

public class Car {

    public String model;
    public String colour;
    public int seats;

    Car(String model, String colour, int seats){
        this.model = model;
        this.colour = colour;
        this.seats = seats;
    }

    public void display(){
        System.out.println("Model is : " + model);
        System.out.println("Colour is : " + colour);
        System.out.println("Number of seats is : " + seats);
    }


   /* public void initialize(String x7, String black, int i) {
        model = "BMW";
        colour = "black";
        seats = 7;
    }*/
}
