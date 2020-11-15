package hw4;

import java.util.*;

public class Main {

    public static void changeSalaryForOld(List<Employee> employees, double salaryChange, int ageLimit){
        for(Employee emp : employees){
            if(emp.getAge() > ageLimit ){
                emp.setSalary(emp.getSalary()+salaryChange);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Employee> emps = new ArrayList<Employee>();
        emps.add(new Employee("Alo Alu Lulov", "bobo", "11-11", 1000.0, 25));
        emps.add(new Employee("Balo Alu Lulov", "bobo", "11-11", 2000.0, 35));
        emps.add(new Employee("Calo Alu Lulov", "boba", "11-11", 3000.0, 45));
        emps.add(new Employee("Dalo Alu Lulov", "boba", "11-11", 4000.0, 55));
        emps.add(new Employee("Eloe Alu Lulov", "bobu", "11-11", 5000.0, 65));

        System.out.println(emps.get(0).getFullname());
        System.out.println(emps.get(0).getJobTitle());

        changeSalaryForOld(emps, 5000, 45);

        float sumSalary = 0;
        int sumAge = 0;
        for(Employee emp : emps){
            sumAge += emp.getAge();
            sumSalary += emp.getSalary();

            if(emp.getAge() > 40) {
                System.out.println(emp.toString());
            }
        }

        System.out.println(String.format("Average age   : %10.2f", (double)sumAge/emps.size()));
        System.out.println(String.format("Average salary: %10.2f", sumSalary/emps.size()));


    }
}
