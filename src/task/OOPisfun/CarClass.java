package task.OOPisfun;

public class CarClass {

    public static void main (String[] args){

        Car c = new Car("Tesla model s", "Silver", 4);
        c.display();

        Car Merc = new Car("G45", "Gun Metal Grey", 5);
        Merc.display();

        /*Car ferrari; //Object declaration
        ferrari = new Car(); //memory allocation - both can be in one line
        ferrari.model = "Ferrari F50";
        ferrari.colour = "Red";
        ferrari.seats = 2;
        ferrari.display();

        Car Tesla = new Car();
        Tesla.model = "Model X";
        Tesla.colour = "White";
        Tesla.seats = 7;
        Tesla.display();

        Car Audi = new Car();
        Audi.model = "SQ8";
        Audi.colour = "Grey";
        Audi.seats = 8;
        Audi.display();*/

       /* Car BMW = new Car();
        BMW.initialize("X7", "Black", 7);
        BMW.display();*/



    }
}