public class BMW extends Car{
    public BMW() {
    }

    public BMW(String model, String color, String maxSpeed) {
        super(model, color, maxSpeed);
    }

    @Override
    public void gas() {
        System.out.println("jurup baratat");
    }

    @Override
    public void brake() {
        System.out.println("toktop kaldy");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
