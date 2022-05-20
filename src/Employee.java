public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;
    public  Employee(String name,double salary,int workHours,int hireYear){
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;
    }
    public double tax(){
        double tax=0.0;
        if(salary>1000){
            tax=salary*0.03;
        }else{
            tax=0.0;
        }
        return tax;
    }
    public double bonus(){

        int bonus=0;
        if(workHours>40){
            bonus = (workHours-40)*30;
        }
        return bonus;
    }
    public double raiseSalary(){
        int year=2021;
        int diff=year-hireYear;
        double raise=0;
        if(diff>=20){
            raise=salary*0.15;
        }else if(diff>=10){
            raise=salary*0.10;
        }else{
            raise=salary*0.05;
        }
        return raise;
    }
    public void Print(){
        System.out.println("Name : "+ name);
        System.out.println("Salary : "+salary);
        System.out.println("Work Hours : "+workHours);
        System.out.println("Hiring Year : "+hireYear);
        double tax=tax();
        System.out.println("Tax : " +tax);
        double bonus=bonus();
        System.out.println("Bonus : "+bonus);
        double raiseSalary=raiseSalary();
        System.out.println("Raise : "+raiseSalary);
        double newSalary=salary-tax+bonus;
        System.out.println("Salary with tax and bonus : "+newSalary);
        double totalSalary=salary+raiseSalary;
        System.out.println("Total Salary : "+totalSalary);


    }
}
