package Fabrika;

public class Employee {
    String name;
    int salary;
    double netSalary;
    int workHours;
    int hireYear;
    private int bonus;

    Employee(String Name,int Salary, int WorkHours,int HireYear){
        name = Name;
        salary = Salary;
        netSalary = Salary;
        workHours = WorkHours;
        hireYear = HireYear;
        bonus = (this.workHours > 40)? (this.workHours - 40)*30:0;
        netSalary += this.bonus + salaryRaise()-tax();
    }
    double tax(){
        if(this.salary <1000){
            return 0;
        }
        else{
            return this.salary * 0.03f;
        }
    }
    double salaryRaise(){
        int workedYears = 2021-this.hireYear ;
        if(workedYears<10){
            return this.salary *0.05;
        }
        else if(workedYears>9 && workedYears<20){
            return this.salary * 0.1;
        }
        else{
            return this.salary * 0.15;
        }
    }
    @Override
    public String toString() {
        return ("Adı: " + this.name + "\nMaaşı: " + this.salary + "\nÇalışma Saati: " + this.workHours + "\nBaşlangıç Yılı: " + hireYear + "\nVergi: " + this.tax() + "\nBonus: " + this.bonus + "\nBu yılki maaş artışı: " + this.salaryRaise() + "\nNet maaş: " + this.netSalary + "\nBrüt maaş: " + this.salary);
    }
}
