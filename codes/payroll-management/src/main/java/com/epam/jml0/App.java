package com.epam.jml0;


public class App
{
    public static void main( String[] args ) throws PayrollException {

        
            FullTimeEmployee employee1 = new FullTimeEmployee(101, "Alice", "Accounts", 20000.0, 2000);
            double overtimeSalary = employee1.overTimePay(20, employee1.getBaseSalary());
            double salary = employee1.calculateSalary() + overtimeSalary;
            System.out.println("Overtime salary for employee1 : " + overtimeSalary);

            FullTimeEmployee employee2 = new FullTimeEmployee(102, "Bob", "HR", 300000, 3000);
            double overtimeSalary2 = employee2.overTimePay(20, 0);
            double salary2 = employee2.calculateSalary() + overtimeSalary;
            System.out.println("Overtime salary for employee2: " + overtimeSalary2);




/*
        //Generics
        PayrollGenerics payrollGenerics = new PayrollGenerics();

        Employee employee1 = new FullTimeEmployee(1,"Alice","IT",50000.0,5000);
        Employee employee2 = new PartTimeEmployee(2,"David","HR",3000,20);
        Employee employee3 = new FullTimeEmployee(32,"Aakash","Accounts",20000.0,2000.0);
        Employee employee4 = new PartTimeEmployee(22,"Elena","Developers",2000,15);
        Employee employee5 = new FullTimeEmployee(10,"Karen","Finance",30000,3000);

        List<Employee> employsList = new ArrayList<>();
        employsList.add(employee1);
        employsList.add(employee2);
        employsList.add(employee3);
        employsList.add(employee4);
        employsList.add(employee5);

        System.out.println("Payroll Processing for List");
        PayrollGenerics.processPayroll(employsList);

        Set<Employee> employeeSet = new HashSet<>();
        employeeSet.add(employee1);
        employeeSet.add(employee2);
        employeeSet.add(employee3);
        employeeSet.add(employee4);
        employeeSet.add(employee5);

        System.out.println("Payroll Processing for Set");
        PayrollGenerics.processPayroll(employeeSet);


        /*
        //Custom Annotation
        PayrollSystem payrollSystem = new PayrollSystem();
        processPayroll(payrollSystem);

        /*
        //Sorting

        ArrayList<Employee> employs = new ArrayList<>();
        employs.add(new FullTimeEmployee(1,"Alice","IT",50000.0,5000));
        employs.add(new PartTimeEmployee(2,"David","HR",3000,20));
        employs.add(new FullTimeEmployee(32,"Aakash","Accounts",20000.0,2000.0));
        employs.add(new PartTimeEmployee(22,"Elena","Developers",2000,15));
        employs.add(new FullTimeEmployee(10,"Karen","Finance",30000,3000));

        System.out.println("Sorting by natural ordering");
        Collections.sort(employs);

        for(Employee employee:employs){
           employee.display();
        }

        employs.sort(EmployeeFiltering.byDepartment);

        System.out.println("Sorting by department");
        for(Employee employee:employs){
            employee.display();
        }

        employs.sort(EmployeeFiltering.bySalary);

        System.out.println("Sorting by salary");
        for(Employee employee:employs){
            employee.display();
        }

        ArrayList<Employee> itEmployee = new ArrayList<>(EmployeeFiltering.searchByDepartment(employs,"IT"));

        System.out.println("Displaying IT Employees");
        if(!itEmployee.isEmpty()) {
            for (Employee employee : itEmployee) {
                employee.display();
            }
        }
        else{
            System.out.println("List is empty to display");
        }

        Employee employ = EmployeeFiltering.searchByName(employs,"Aakash");

        System.out.println("Displaying the employee according after filtering the name");
        if(employ!=null) {
            employ.display();
        }
        else{
            System.out.println("Employee not found");
        }


         */





/*
        //Collections

        EmployeeBenefitsMap employeeBenefitsMap = new EmployeeBenefitsMap();
        employeeBenefitsMap.addBenefit(101,"Insurance");
        employeeBenefitsMap.addBenefit(102,"Bonus");
        employeeBenefitsMap.addBenefit(103,"Performance");
        employeeBenefitsMap.display();

        PayrollTasksList payrollTasksList = new PayrollTasksList();
        payrollTasksList.addTask("Collect Employee hours");
        payrollTasksList.addTask("Calculate Salaries");
        payrollTasksList.addTask("Generate Pay Slips");
        payrollTasksList.display();

        EmployeeRecordsHashSet employeeRecordsHashSet = new EmployeeRecordsHashSet();
        employeeRecordsHashSet.addRecord("John");
        employeeRecordsHashSet.addRecord("Andrew");
        employeeRecordsHashSet.addRecord("Aakash");
        employeeRecordsHashSet.display();

        PayRollQueue payRollQueue = new PayRollQueue();
        payRollQueue.addPayroll("Employee A : 10_000");
        payRollQueue.addPayroll("Employee B : 20_000");
        payRollQueue.display();
*/

        /*

        Employee fullTimeEmployee = new FullTimeEmployee(101,"Anand","Accounts",80000.0,10000.0);
        Employee partTimeEmployee = new PartTimeEmployee(102,"Bunny","Enginnering",20.0,150);
        EmployeeContract fullTimeContract = new FullTimeEmployeeContract(103,"Research","Chetana");
        EmployeeContract partTimeContract = new PartTimeEmployeeContract(104,"Engineering","Divya");

        fullTimeEmployee.display();
        fullTimeEmployee.displaySalaryDetails();
        fullTimeContract.defineWorkHours();
        fullTimeContract.assignProject();
        //System.out.println("Calculated Salary:"+fullTimeEmployee.calculateSalary());

        partTimeEmployee.display();
        partTimeEmployee.displaySalaryDetails();
        partTimeContract.defineWorkHours();
        partTimeContract.assignProject();
        //System.out.println("Calculated Salary:"+partTimeEmployee.calculateSalary());
        EmploymentType contractor = new Contractor("Anand",50,180.0);
        EmploymentType permanentEmployee = new PermanentEmployee("Bunny",100000.0);
        contractor.display();
        permanentEmployee.display();
*/


    }
}
