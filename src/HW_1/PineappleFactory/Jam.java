package HW_1.PineappleFactory;

public class Jam {
    private ImmutableFruit immutableFruit;
    private int water;
    private int sugar;

    public static class Builder{
        private Jam jam;

        public Builder() {
            jam = new Jam();
        }

        public Builder withFruit(ImmutableFruit fruit){
            this.jam.immutableFruit = fruit;
            return this;
        }
        public Builder withWater(int water){
            this.jam.water = water;
            return this;
        }
        public Builder withSugar(int sugar){
            this.jam.sugar = sugar;
            return this;
        }

        public Jam build(){
            System.out.println("Create new jam");
            return jam;
        }
    }

    @Override
    public String toString() {
        return "Jam with " + immutableFruit.getType();
    }
}
