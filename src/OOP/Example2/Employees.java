package OOP.Example2;

public class Employees {
    private String name;
    private int salary;
    private String dob;

    public Employees(String name, int salary, String dob) {
        setName(name);
        setSalary(salary);
        setDob(dob);
    }

    public int ageCalculator() {
        String bday = dob.substring(dob.length() -4);
        return 2022 - Integer.parseInt(bday);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }
}
