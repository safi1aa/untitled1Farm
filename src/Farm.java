import java.util.Arrays;
import java.util.Scanner;

public class Farm {

    private String address;
    private String Name;

    private Cow[] cows;
    private Horse[] horses;
    private Sheep[] sheep;

    public Farm(String address, String name, Cow[] cows, Horse[] horses, Sheep[] sheep) {
        this.address = address;
        Name = name;
        this.cows = cows;
        this.horses = horses;
        this.sheep = sheep;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Cow[] getCows() {
        return cows;
    }

    public void setCows(Cow[] cows) {
        this.cows = cows;
    }

    public Horse[] getHorses() {
        return horses;
    }

    public void setHorses(Horse[] horses) {
        this.horses = horses;
    }

    public Sheep[] getSheep() {
        return sheep;
    }

    public void setSheep(Sheep[] sheep) {
        this.sheep = sheep;
    }

    @Override
    public String toString() {
        return "Farm: " +
                "address: " + address + "\n" +
                "Name: " + Name + "\n" +
                "cows: " + Arrays.toString(cows) + "\n"+
                "horses: " + Arrays.toString(horses) + "\n"+
                "sheep: " + Arrays.toString(sheep);
    }
}
