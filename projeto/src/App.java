import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static ArrayList<Employee> funcionarios = new ArrayList<Employee>();
    public static int NUMBER_OF_EMPLOYEES = 5;

    public static void main(String[] args) throws Exception {
        int numberOfEmployees = NUMBER_OF_EMPLOYEES;

        createEmployees(numberOfEmployees);
        scanEmployeesSalary(funcionarios);
        printEmployees(funcionarios);
    }

    public static void createEmployees(int numberOfEmployees) {
        for (int i = 0; i < numberOfEmployees; i++) {
            Employee employee = new Employee();
            employee.setId(i + 1);
            funcionarios.add(employee);
        }
    }

    public static void scanEmployeesSalary(ArrayList<Employee> employees) {
        Scanner scanner = new Scanner(System.in);

        for (Employee employee : employees) {
            System.out.printf("Digite o salário bruto do funcionário %d: ", employee.getId());
            double grossIncome = scanner.nextDouble();
            employee.setGrossIncome(grossIncome);
        }

        System.out.println();
        scanner.close();
    }

    public static void printEmployees(ArrayList<Employee> employees) {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}