public class Employee {

/*Design and implement the classes that represent a simple employee system at a company:-
class Employee
 Each employee in the company has variables representing his name and salary.
 Each employee has accessor method for name & salary and a mutator method for salary
 Each employee has method calculateSalary() that calculates & sets the value of salary.
 An employee can be either a full time employee representd by class FullTimeEmployee or a part
time employee represented by class PartTimeEmployee
 No objects should be created directly from class Employee*/

    private String name ;
    private String sqalary;

    public String getName() {
        return name;
    }

    public String getSqalary() {
        return sqalary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void calculateSalary(String sqalary) {
        this.sqalary = sqalary;
    }



}
