package HW_1.PineappleFactory;

public class Factory {
    public DepartmentOfJam departmentOfJam;
    public DepartmentOfFructose departmentOfFructose;

    public Factory(DepartmentOfJam departmentOfJam, DepartmentOfFructose departmentOfFructose) {
        this.departmentOfJam = departmentOfJam;
        this.departmentOfFructose = departmentOfFructose;
    }
}
