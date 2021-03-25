package homeWork;

import javax.naming.Name;

/**
 *  @author Anu Bhagat
 * @version1
 * <P>This class will printout the 3 employees name, joining year, gender, address and salary of them </P>
 */

public class Employee {

    /**
     *<P>Printing the 3 employees details </P>
     *
     */

    // Declaring the variables

    String name;
    int yearOfJoining;
    char gender;
    String address;
    float salary;


    public static void main(String[] args) {

     // creating the objects
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        Employee employee3 = new Employee();

        // Printing the Name, year of joining, gender, address and salary by using print command
        System.out.println("Name\t JoiningYear\t Gender\t\tAddress\t\t Salary");

      // Declaring the values of Employee 1 like his name, year of joining, gender, address and salary
        employee1.name = "Robert";
        employee1.yearOfJoining = 1994;
        employee1.gender = 'M';
        employee1.address = "abcfdr";
        employee1.salary = 12000.00f;

        // Printing the values
        System.out.printf("%s\t\t%d\t\t\t%c\t\t%s\t\t%.2f\n", employee1.name,employee1.yearOfJoining,employee1.gender,employee1.address,employee1.salary);

        // Declaring the values for employee 2
        employee2.name = "Samanth";
        employee2.yearOfJoining = 2000;
        employee2.gender = 'F';
        employee2.address = "fdufuf";
        employee2.salary = 177769.40f;

        // Printing the values
        System.out.printf("%s\t\t%d\t\t\t%c\t\t%s\t\t%.2f\n", employee2.name,employee2.yearOfJoining,employee2.gender,employee2.address,employee2.salary);

       // declaring the Employee 3 values
        employee3.name = "John";
        employee3.yearOfJoining = 2012;
        employee3.gender = 'M';
        employee3.address = "26B-";
        employee3.salary = 45000.00f;

        //Printing the values of employee 3
        System.out.printf("%s\t\t%d\t\t\t%c\t\t%s\t\t%.2f\n", employee3.name,employee3.yearOfJoining,employee3.gender,employee3.address,employee3.salary);


    }

}
