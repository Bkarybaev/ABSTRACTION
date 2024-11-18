package farmanimal;

public abstract class Animals {
    private String weight;
    private int age;
    private char gender;
    private String nickName;

    public Animals() {
    }

    public Animals(String weight, int age, char gender, String nickName) {
        this.weight = weight;
        this.age = age;
        this.gender = gender;
        this.nickName = nickName;
    }

    @Override
    public String toString() {
        return "Animals{" +
                "weight='" + weight + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", nickName='" + nickName + '\'' +
                '}';
    }
}
