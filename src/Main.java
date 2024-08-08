public class Main {
    public static void main(String[] args) {
        User ivan = new User("Ivan", 22);
        System.out.println("Hello, " +ivan.getName()+ "!");
        Dog dog = new Dog("Bobik");
        System.out.println("Dog: " + dog.getName());
    }
}