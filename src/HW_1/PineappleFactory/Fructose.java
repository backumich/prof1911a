package HW_1.PineappleFactory;

public class Fructose {

    private ParametersFruit parametersFruit;
    private double volume;

    public Fructose(ImmutableFruit fruit) {
        this.parametersFruit = fruit.getType();
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Fructose " + "parametersFruit = " + parametersFruit + ", volume=" + volume;
    }
}
