package tester;

import static com.app.core.Student.sdf;
import static utils.ValidationUtils.convertCource;
import static utils.ValidationUtils.prnUnique;

import java.util.ArrayList;
import java.util.Scanner;

import com.app.core.Student;

import custom_exception.StudentHandlingException;

public class TestStudentList {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {

			ArrayList<Student> studentList = new ArrayList<>();
			boolean exit = false;
			while (!exit) {
				System.out.println("1. Add student details  ");
				System.out.println("2. Fetch Student details with PRN");
				System.out.println("3. Display All student details");
				System.out.println("4. Cancel Admission");
				System.out.println("5. Update GPA");
				System.out.println("10. Exit");
				try {

					switch (sc.nextInt()) {
					case 1:
						System.out.println(
								"Enter Student Detail PRN name Email password courceType GPA BirthDate(dd-MM-yy");
						studentList.add(new Student(prnUnique(sc.next(), studentList), sc.next(), sc.next(), sc.next(),
								convertCource(sc.next()), sc.nextDouble(), sdf.parse(sc.next())));
						break;
					case 2:
						System.out.println("Enter PRN to Fetch that Details");
						String str1 = sc.next();
						Student st = new Student(str1);
						if (studentList.contains(st)) {
							int index = studentList.indexOf(st);
							System.out.println(studentList.get(index).toString());
						} else {
							throw new StudentHandlingException("Invalid PRN");
						}
						break;
					case 3:
						System.out.println("Student deatils");
						for (Student s1 : studentList) {
							System.out.println(s1);
						}
						break;
					case 4:
						System.out.println("Enter student PRN to remove that student");
						String stud1 = sc.next();
						Student st1 = new Student(stud1);
						if (studentList.contains(st1)) {
							studentList.remove(studentList.indexOf(st1));

							System.out.println("Student removed..!!");
						} else
							throw new StudentHandlingException("PRN number is invalid");
						break;
					case 5:

						System.out.println("Enter student PRN to update GPA");
						String stud2 = sc.next();
						Student st2 = new Student(stud2);
						if (studentList.contains(st2)) {
							System.out.println("Enter newGPA");
							double newGPA = sc.nextDouble();
							studentList.get(studentList.indexOf(st2)).setGpa(newGPA);
							System.out.println("GPA update Successfully..!!");
						} else
							throw new StudentHandlingException("PRN number is invalid");
						break;
					case 10:
						exit = true;
						break;
					}
				} catch (Exception e) {
					e.printStackTrace();
				}// read off the pending tokes from the scanner till new line
				sc.nextLine();
			}
		}
	}
}
