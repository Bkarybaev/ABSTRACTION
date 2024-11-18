public class Mers extends Car{
    public Mers() {
    }

    public Mers(String model, String color, String maxSpeed) {
        super(model, color, maxSpeed);
    }

    @Override
    public void gas() {
        System.out.println("alga ketty");
    }

    @Override
    public void brake() {
        System.out.println("artca ketty");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
