package MaasHesaplayici;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Azizhan Tutucu",2000,45,1985);
        employee.tax();
        employee.bonus();
        employee.raiseSalary();
        employee.toPrint();

    }
}
