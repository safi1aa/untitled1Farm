import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Cow[] cow = {new Cow(200, 3, "woman", "cat"),
                new Cow(500, 5, "woman", "Shorthorn"),
                new Cow(400, 7, "woman", "reta"),
                new Cow(300, 4, "Boy", "xaxa"),
                new Cow(530, 6, "woman", "milk"),
                new Cow(100, 2, "Boy", "jojo"),
        };
        System.out.println(Arrays.toString(cow));


        Sheep[] sheep = {
                new Sheep(30, 6, "Boy", "Romanovskaya"),
                new Sheep(40, 7, "woman", "tyty"),

        };

        System.out.println(Arrays.toString(sheep));




        Horse[] horse = {
                new Horse(600, 25, "Boy", "wind"),
                new Horse(900, 30, "woman", "roza"),
        };
        System.out.println(Arrays.toString(horse));

        Farm farm = new Farm("SanShangLiang", "Bitmain", cow, horse, sheep);
        Farm farm1 = new Farm("Ranch", "fatima", cow, horse, sheep);
        System.out.println(farm);
        System.out.println(farm1);
    }
}