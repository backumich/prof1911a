package HW_1.PineappleFactory;

public class Proxy {
    private Department department;

    public Proxy(Department department) {
        this.department = department;
    }

    public void checkFruit(ImmutableFruit fruit){
        if (fruit.getJuiciness() >= 0.30){
            department.create(fruit);
            System.out.println("Fruit is good");
        } else{
            System.out.println("this fruit is spoiled");
        }
    }
}
