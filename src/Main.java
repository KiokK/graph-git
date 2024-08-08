public class Main {
    public static void main(String[] args) {
        User ivan = new User("Ivan", 22);
        System.out.println("Hello, " +ivan.getName()+ ", "+ivan.getAge()+" y.o.");
        Car car = new Car(450, "BMV");
        System.out.println("Car: " + car.getModel() + ", speed: " + car.getSpeed() + " (km/h)");
    }
}