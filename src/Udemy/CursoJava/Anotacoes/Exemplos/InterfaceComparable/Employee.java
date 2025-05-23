package Udemy.CursoJava.Anotacoes.Exemplos.InterfaceComparable;

public class Employee implements Comparable<Employee> {

    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee other) {
        return name.compareTo(other.getName());
        // caso queira ordernar por salario é so salary.compareT(other.getSalary())
        // e se quiser de forma decrecente é  -salary.compareT(other.getSalary())
    }
}
