package farmanimal;

import java.util.Arrays;

public class Farm {
    private String address;
    private Animals[] cows = new Cow[6];
    private Animals[] sheep = new Sheep[4];
    private Horse[] horses = new Horse[4];
    private String ownerName;
    int count;
    int count1;
    int count2;

    public Farm(String address,String ownerName) {
        this.address = address;
        this.ownerName = ownerName;
    }

    public void addAll(Animals cows, Animals sheep, Horse horses){
        this.cows[count++] = cows;
        this.sheep[count1++] = sheep;
        this.horses[count2++] = horses;
    }
    public void addAll(Animals cows, Animals sheep){
        this.cows[count++] = cows;
        this.sheep[count1++] = sheep;
    }
    public void addAll(Animals cows){
        this.cows[count++] = cows;
    }

    @Override
    public String toString() {
        return "Farm{" +
                "address='" + address + '\'' +
                ", cows=" + Arrays.toString(cows) +
                ", sheep=" + Arrays.toString(sheep) +
                ", horses=" + Arrays.toString(horses) +
                ", ownerName='" + ownerName + '\'' +
                ", count=" + count +
                ", count1=" + count1 +
                ", count2=" + count2 +
                '}';
    }
}
