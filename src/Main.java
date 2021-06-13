import java.awt.*;

public class Main {
    public static void main(String args[]){
        System.out.println("HelloWorld");
        System.out.println("CześćPaweł");

        Car Multipla = new Car();
        Car Citroen = new Car("C5", "brown", "petrol+dutchLPG");

        Multipla.startEngine();
        Citroen.startEngine();
    }
}
