package HW_1.PineappleFactory;

import java.util.ArrayList;
import java.util.List;

public class DepartmentOfFructose implements Department {
    private DepartmentOfFructose departmentOfFructose;
    private List<Fructose> fructoses;

    private DepartmentOfFructose() {
        //fructoses = new ArrayList<>();
    }

    public DepartmentOfFructose addDepartmentOfFructose() {
        if (this.departmentOfFructose == null) {
            departmentOfFructose = new DepartmentOfFructose();
        }
        return departmentOfFructose;
    }

    @Override
    public void create(ImmutableFruit fruit) {
        Fructose fructose = new Fructose(fruit);
        fructose.setVolume(fruit.getSugar() * 0.8);
        fructoses.add(fructose);
        System.out.println("Create new volume fructose: " + fructose.getVolume());
    }

    public void showListFructose(){
        for (Fructose f : fructoses){
            System.out.println(f);
        }
    }
}
