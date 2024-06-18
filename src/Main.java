public class Main {
    public static void main(String[] args) {
        Car car = new Car("Ford", "Mustang", 1969, 10, 10);
        Truck truck = new Truck("Ford", "F150", 2002, 100, 10, 500);
        System.out.println("Car fuel efficiency: " + car.calculateFuelEfficiency());
        System.out.println("Truck fuel efficiency: " + truck.calculateFuelEfficiency());
    }
}