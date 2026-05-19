//Arrays
import java.util.ArrayList;
import java.util.Scanner;
public class MyMain{
    public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("How many students do you want in your list: ");
		int nums = sc.nextInt();
		
	ArrayList<String> students = new ArrayList<>();
	for(int i = 0;i<nums;i++){
		System.out.println("Enter the name of  student   " + (i+1));
		String tempValue = sc.next();
		students.add(tempValue);
	}
	
	System.out.println("The students are: " );
	for(int i = 0 ;i<students.size();i++){
		System.out.print(students.get(i) + " ,");	
	}
	System.out.print("\n");
	
	if(students.size() >= 2){
		System.out.println("Enter the new name of the student: ");
		String newname = sc.next();
		students.set(1,newname);
		students.add(newname);
	}else{
		System.out.println("Not enough students to replace the second element ");
	}
	students.remove(students.size()-1);
	System.out.println("The updated list is " + students);
	}
	
}