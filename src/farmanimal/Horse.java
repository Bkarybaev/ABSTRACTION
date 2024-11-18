package farmanimal;

public class Horse extends Animals{
    private String color;
    public Horse() {
    }

    public Horse(String weight, int age, char gender, String nickName,String color) {
        super(weight, age, gender, nickName);
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString() +
                " color='" + color;
    }
}
