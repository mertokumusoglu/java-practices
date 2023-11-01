package SalaryCalculatorWithOop;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }
    public double tax() {
        if (this.salary <= 1000) {
            return 0;
        }
        else {
            return (this.salary * 0.03);
        }
    }
    public double bonus() {
         if (workHours <= 40) {
             return 0;
         }
         else {
             return 30 * (workHours - 40);
         }
    }
    public double raiseSalary() {
        int currentYear = 2023;
        if (currentYear - this.hireYear < 10 && currentYear - this.hireYear > 0) {
            return this.salary * 0.05;
        }
        else if (currentYear - this.hireYear < 20 && currentYear - this.hireYear > 10) {
            return this.salary * 0.10;
        }
        else if (currentYear - hireYear < 0) {
            return 0;
        }
        else {
            return this.salary * 0.15;
        }
    }
    public void print() {
        System.out.println("Çalışanın adı: " + this.name);
        System.out.println("Çalışanın maaşı: " + this.salary);
        System.out.println("Haftalık çalışma saati: " + this.workHours);
        System.out.println("Başlangıç yılı: " + this.hireYear);
        System.out.println("Vergi: " + tax());
        System.out.println("Bonus: " + bonus());
        System.out.println("Maaş artışı: " + raiseSalary());
        System.out.println("Vergi ve bonuslar ile maaş: " + (salary + bonus() - tax()));
        System.out.println("Toplam maaş: " + (salary + bonus() + raiseSalary() - tax()));
    }
}
