package org.exceptionHandling;
// Create Employee class with fields empId, empName and salary
// While creating employee object if the empId already exist then
// throw a custom exception "IDExistException"
// and display a message "emp Id already exist"
// Steps: When you create new employee object, first create an EmpList ArrayList
// check EmpList to see if id already exist
// If it's there then throw the exception
// if id is not there then add a new object to the collection





import java.util.ArrayList;
import java.util.Scanner;
public class EmployeeTest {
    public static void main(String[] args) throws MyException {
        ArrayList<Employee> employees =new ArrayList<>();
        Employee e1 =new Employee(01,"Abhi",2000);
//        Employee e2=null;
//        Employee e3=null;
        employees.add(e1);
        Scanner sc=new Scanner(System.in);
      //  int i=1;

  //      try{
            //System.out.println("Enter Q to Quit");
            while (true){
                System.out.println("Enter Employee ID");
                int emplId= sc.nextInt();
                System.out.println("Enter Employee Name");
                String emplName= sc.next();
                System.out.println("Enter Employee Salary");
                double salary= sc.nextDouble();
                ArrayList<Employee> employee1 =new ArrayList<>();
                //employee1.add(e1);
                //Employee e3=new Employee()


                for(Employee employee:employees) {

                    try {

                        if (employee.getEmpId() == emplId) {
                            throw new MyException("emp Id already exist");
                            // break;

                        } else {
                            employee1.add(new Employee(emplId, emplName, salary));

                            System.out.println(employee1);
                        }

                    }
                    catch (MyException E){
                        System.out.println(E);
                        //break;
                    }
                }

                System.out.println("Q to quite");
                char choice = sc.next().charAt(0);
                if(choice=='Q'){
                    break;
                }


            }

    //    }



    }
}
