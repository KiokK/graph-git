public class Main {
    public static void main(String[] args) {
        User ivan = new User("Ivan", 22);
        System.out.println("Hello, " +ivan.getName()+ ", "+ivan.getAge()+" y.o.\n");
        Dog dog = new Dog("Bobik");
        System.out.println("Dog: " + dog.getName());
        Car car = new Car(430, "BMV X7");
        System.out.println("Car: " + car.getModel() + ", speed: " + car.getSpeed() + " (km/h)");
    }
}
