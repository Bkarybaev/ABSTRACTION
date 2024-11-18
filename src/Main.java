public class Main {
    public static void main(String[] args) {
        Car car1 = new BMW("BMW x6","black","300");
        Car car2 = new BMW("BMW x5","red","200");
        Car car3 = new Mers("Luparick","black","500");
        Car car4 = new Mers("e 124","white","600");
        car1.gas();
        car2.gas();
        car3.gas();
        car4.gas();
        car1.brake();
        car2.brake();
        car3.brake();
        car4.brake();

    }
}