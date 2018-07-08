package domain;

public class User {
    private Integer id;
    private String name;
    private String emp;
    private double salary;

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setEmp(String emp) {
        this.emp = emp;
    }

    public String getEmp() {
        return emp;
    }

    @Override
    public String toString(){
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", emp='" + emp + '\'' +
                ", salary=" + salary +
                '}';
    }
}
