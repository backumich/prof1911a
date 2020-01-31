package HW_1.PineappleFactory;

public class ImmutableFruit {
    private ParametersFruit type;
    private double weight;
    private double juiciness;
    private double sugar;

    public ImmutableFruit(ParametersFruit type, double weight, double juiciness, double sugar) {
        //if (checkType(type)){
        //    this.type = type;
        //}
        this.type = type;
        this.weight = weight;
        this.juiciness = juiciness;
        this.sugar = sugar;
        System.out.println("Create new fruit with weight " + weight + ", sugar " + sugar
                + ", juiciness " + juiciness);
    }

    public ImmutableFruit setWeight(double weight) {
        ImmutableFruit immutableFruit = new ImmutableFruit(this.type, weight, this.juiciness, this.sugar);
        return immutableFruit;
    }

    public ImmutableFruit setJuiciness(double juiciness) {
        ImmutableFruit immutableFruit = new ImmutableFruit(this.type, this.weight, juiciness, this.sugar);
        return immutableFruit;
    }

    public ImmutableFruit setSugar(double sugar) {
        ImmutableFruit immutableFruit = new ImmutableFruit(this.type, this.weight, this.juiciness, sugar);
        return immutableFruit;
    }
    public ImmutableFruit setType (ParametersFruit parametersFruit) {
        return new ImmutableFruit(type, this.weight, this.juiciness, sugar);
    }

    public ParametersFruit getType() {
        return type;
    }
    public double getWeight() {
        return weight;
    }

    public double getJuiciness() {
        return juiciness;
    }

    public double getSugar() {
        return sugar;
    }

    public boolean checkType(String type){
        boolean correctType = false;
        ParametersFruit[] types = ParametersFruit.values();
        for (ParametersFruit t : types) {
            if (type.equalsIgnoreCase(t.toString())) {
                correctType = true;
            }
        }
        return correctType;
    }
}
