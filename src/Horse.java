public class Horse extends Animals{

    public Horse(int weight, int age, String gender, String nickName) {
        super(weight, age, gender, nickName);
    }

    @Override
    public String toString() {
        return "Horse: "+super.toString();
    }
}

