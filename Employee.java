public class Employee {
    public static void main(String[] args) {
        Emp e = new Emp();
        e.getter();

    }
}

class Emp {
    int id = 101;
    String name = "reema";
    String desi = "manager";
    long salary = 70000;

    void getter() {

        System.out.println("Employ Id = " + id);
        System.out.println("Employ Name = " + name);
        System.out.println("Employe Designation = " + desi);
        System.out.println("Employe Salary = " + salary);

    }
}