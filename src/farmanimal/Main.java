package farmanimal;

public class Main {
    public static void main(String[] args) {
        Animals cow1 = new Cow("300",23,'m',"muha");
        Animals cow2 = new Cow("400",3,'f',"fera");
        Animals cow3 = new Cow("350",43,'m',"muha");
        Animals cow4 = new Cow("340",33,'f',"fdsa");
        Animals cow5 = new Cow("230",24,'m',"muha");

        Animals sheep1 = new Sheep("443",22,'f',"bare");
        Animals sheep2 = new Sheep("443",22,'f',"bare");
        Animals sheep3 = new Sheep("443",22,'f',"bare");

        Horse horse1 = new Horse("443",22,'f',"bare","black");
        Horse horse2 = new Horse("443",22,'f',"bare","black");

        Farm farm = new Farm("bishkek 121","Kanchoro");
        farm.addAll(cow1,sheep1,horse1);
        farm.addAll(cow2,sheep2,horse2);
        farm.addAll(cow3,sheep3);
        farm.addAll(cow4);
        farm.addAll(cow5);

        System.out.println(farm);


    }
}
