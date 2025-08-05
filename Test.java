package arryaListOperation;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		ArrayList<Student> std = new ArrayList<Student>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Student Management System:");
		while (true) {
			System.out.println("Enter Your Choice");
			System.out.println("1:Add Student");
			System.out.println("2: View All Students");
			System.out.println("3:Remove/ Delete Student");
			System.out.println("4: Update Student");
			System.out.println("5: Exit");

			System.out.println("");

			int choice = sc.nextInt();
			if (choice == 5) {
				break;
			}
			switch (choice) {
			case 1:
				System.out.println("Enter Student Id");
				int id = sc.nextInt();
				System.out.println("Enter Student Name");
				String name = sc.next();
				System.out.println("Enter Student Marks");
				double marks = sc.nextDouble();
				std.add(new Student(id, name, marks));
				System.out.println("Student added Successfully...");
				break;

			case 2:
				 if (std.isEmpty()) {
                     System.out.println("No students found.");
                 } else {
                     System.out.println("\n--- Student List ---");
                     for (Student s : std) {
                         System.out.println(s);
                     }
                 }
                 break;

			case 3:
				System.out.print("Enter ID of student to delete: ");
                int deleteId = sc.nextInt();
                Student IdPresent = null;
                for (Student s : std) {
                    if (s.getId() == deleteId) {
                    	IdPresent = s;
                        break;
                    }
                }
                if (IdPresent != null) {
                    std.remove(IdPresent);
                    System.out.println("Student Deleted Successfully!");
                } else {
                    System.out.println("Student with ID " + deleteId + " not found.");
                }
                break;
                
                
			case 4:
				 System.out.print("Enter ID of student to update: ");
                 int updateId = sc.nextInt();
                 boolean flag = false;
                 for (Student s :std) {
                     if (s.getId() == updateId) {
                         sc.nextLine(); 
                         System.out.print("Enter New Name: ");
                         s.setName(sc.nextLine());
                         System.out.print("Enter New Marks: ");
                         s.setMarks(sc.nextDouble());
                         System.out.println("Student Updated Successfully!");
                         flag = true;
                         break;
                     }
                 }
                 if (!flag) {
                     System.out.println("Student with ID " + updateId + " not found.");
                 }
                 break;
                         

				}
				

			}

		}

	

}

