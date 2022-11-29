package org.exceptionHandling;
import javax.lang.model.element.Name;
import java.util.GregorianCalendar;
import java.util.InputMismatchException;
import java.util.Scanner;
public class CandidateTest {
    public static void main(String[] args){

        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Your Name");
            String Name= sc.next();
            if(!(Name.matches("^[a-zA-Z]*$"))){
                throw new InputMismatchException();
//&&(

            }
            System.out.println("Enter Your Gender M or F");
            Character Gender =sc.next().charAt(0);
            if(!(Gender.charValue()=='M'||Gender.charValue()=='F')){
                throw new InputMismatchException();
//
            }
            System.out.println("Enter your Salary ");
            double Salary=sc.nextInt();


            //System.out.println(Gender.charValue());

//        else {
//            throw new InputMismatchException();
//        }
            if(Salary<1000){
                throw new MyException("Salary can not be less than 10000");
            }
            Candidate candidate=new Candidate(Name,Gender,Salary);
            System.out.println(candidate.getName());
            System.out.println(candidate.getGender());
            System.out.println(candidate.getSalary());

        }
        catch (InputMismatchException|MyException e){
            if(e instanceof InputMismatchException)
                System.out.println("InputMismatchException Occured");
            if(e instanceof MyException){
                System.out.println("InvalidSalaryException");
            }


        }



    }
}
