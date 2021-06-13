public class Car {
    public String model;
    public String color;
    public String fuelType;
    public String makeYear;

    public Car(){

    }
    public Car(String model, String makeYear, String fuelType){
        this.model = model;
        this.makeYear = makeYear;
        this.fuelType = fuelType;

    }

    public void startEngine() {
        System.out.println("Silnik"+ this.model + "został uruchomiony");

    }

    public void stopEngine(String percent){
        System.out.println("silnik został zwolniony o"+ percent);
    }
}