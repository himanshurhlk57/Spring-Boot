import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Comparator interface contains a method compare(Employee emp1, Employee em2) we just need to implement it;

// The compare method need to return -1, 0, 1
// -1 -> Negative number denotes that the first element should be treated smaller than the second element;
// 0 -> Zero denotes that both of these elements should be treated as equal;
// 1 -> Positive number indicates that the first element should be treated greater than the second element;


class IntegerReversecomparator implements Comparator<Integer>{
	public int compare(Integer num1, Integer num2){
		
//This is the default condition it will sort it in the ascending order as return -1 indicates that num1 is smaller than num2
// And so return 1 indicates that num1 is greater than num2;
// Output - 1 2 3 5 6 7 8

// 1 ->
		// if(num1<num2){ // I want to consider num1 smaller than num2 in sorted order as well
		// 	return -1;
		// }
		// if(num1>num2){ // I want to consider num1 is greater than num2 in sorted order as well if it is actually greater than this.
		// 	return 1;
		// }
		// return 0;
		
		// 2-> 
		//This will sort in descending order
		// Output -> 8 7 6 5 3 2 1 
		// if(num1<num2){
		// 	return 1;
		// }
		// if(num1>num2){
		// 	return -1;
		// }
		// return 0;
		
		// 3 -> // there's a compareTo method in Integer which return some negative, positive and zero based on their natural ordering.
     // Sort in ascending order.
	// return num1.compareTo(num2); 

      }
    }

    class WorkAtTech{
      public static void main (String[] args) throws java.lang.Exception{
        Integer[] arr = {3,1,2,5,8,6,7};
        Arrays.sort(arr, new IntegerReversecomparator());
        for(int i = 0; i<arr.length; i++){
          System.out.print(arr[i] + " ");
        }
        System.out.println();
      }
    }

    // comaprator implememntation on Employee object

    // Q. Write a program to sort Employee objects based on salary using Comparator
    package Practise;


    import java.util.ArrayList;
    import java.util.Collections;
    import java.util.Comparator;
    import java.util.List;
    
    class Employee{
        private double salary;
        private String name;
        private int age;
    
        Employee(double salary, String name, int age){
            this.salary = salary;
            this.name = name;
            this.age = age;
        }
    
        public double getSalary(){
            return salary;
        }
    
        public String getName(){
            return name;
        }
    
        public int getAge(){
            return age;
        }
    
    }
    
    class SortBasedOnSalary implements Comparator<Employee> {
        public int compare(Employee employee1, Employee employee2){
            if(employee1.getSalary() < employee2.getSalary()){
                return -1;
            }
            if(employee1.getSalary() > employee2.getSalary()){
                return 1;
            }
            return 0;
            
    //        or 
            return Double.compare(employee1.getSalary(), employee2.getSalary());
        }
    }
    
    public class ComPractise{
        public static void main(String[] args){
            List<Employee> list = new ArrayList<>();
            list.add(new Employee(30000, "Himanshu Kumar", 26));
            list.add(new Employee(28000, "Rohan Kumar", 27));
            list.add(new Employee(27000, "Sohan Kumar", 29));
            list.sort(new SortBasedOnSalary());
            for(Employee employee : list){
                System.out.println(employee.getName() + " " + employee.getSalary() + " " + employee.getAge());
            }
        }
    }