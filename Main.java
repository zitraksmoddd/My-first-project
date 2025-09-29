abstract class Employee {
    abstract void work();
}

class Programmer extends Employee {
    void work() {
        System.out.println("Программист пишет код.");
    }
}

class Designer extends Employee {
    void work() {
        System.out.println("Дизайнер рисует макет.");
    }
}

class Tester extends Employee {
    void work() {
        System.out.println("Тестировщик проверяет программу.");
    }
}

public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
            new Programmer(),
            new Designer(),
            new Tester()
        };

        for (Employee employee : employees) {
            employee.work();
        }
    }
}

