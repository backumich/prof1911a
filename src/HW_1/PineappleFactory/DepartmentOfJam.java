package HW_1.PineappleFactory;

import java.util.ArrayList;
import java.util.List;

public class DepartmentOfJam implements Department{
    private static DepartmentOfJam departmentOfJam;
    private List<Jam> jams;

    private DepartmentOfJam() {
        jams = new ArrayList<>();
    }

    public static DepartmentOfJam addDepartment(){
        if (departmentOfJam == null){
            departmentOfJam = new DepartmentOfJam();
        }
        return departmentOfJam;
    }

    @Override
    public void create(ImmutableFruit fruit) {
        Jam jam = new Jam.Builder()
                .withFruit(fruit)
                .build();
            jams.add(jam);
        System.out.println("Create new jam with " + fruit.getType().toString());
    }

    public void showListOfJam(){
        for (Jam j : jams){
            System.out.println(j);
        }
    }
}
