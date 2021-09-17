
package com.core;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import com.core.Student;

//import custom_exception.StudentHandlingException;

//import static com.app.student.Student.*;
//	import static com.core.validate.ValidationRules.*;
	
	import com.core.CustomerException;

import static com.core.Student.sdf;
import static com.core.Validation.convertCourse;
import static com.core.Validation.prnUnique;

	public class Tester {

		public static void main(String[] args) {

			try (Scanner sc = new Scanner(System.in)) {
				ArrayList<Student> studList = new ArrayList<>();
				/*for (Student s : studList)
					System.out.println(s);*/
				boolean flag = false;
				while (!flag) {
					System.out.println(
							"Options 1. Add Student \n2. Fetch Student details \n3. Display student details \n4. Cancel admission \n5. Update GPA \n6. Exit");
					try {
						switch (sc.nextInt()) {
						case 1:
							System.out.println("Enter Student details : prn, \nname, \nemail, \npassword, \ncourseType,  \nGPA,  \ndob ");
							studList.add(new Student(prnUnique(sc.next(), studList), sc.next(), sc.next(), sc.next(),
									convertCourse(sc.next()), sc.nextDouble(), sdf.parse(sc.next())));
						
							
							
							
							System.out.println("New student added");
							break;

						case 2:
							System.out.println("Enter prn : ");

							int index = studList.indexOf(new Student(sc.next()));
							if (index == -1)
								throw new CustomerException("Invalid PRN...");

							System.out.println(studList.get(index));

							break;

						case 3:
							if (studList.size() == 0) {
								System.out.println("No Student details available");
								break;
							}
							System.out.println("Student details : ");
							for (Student s : studList) {
								System.out.println(s);
							}
							break;

						case 4:
							System.out.println("Enter the student PRN");
							/*index = studList.indexOf(new Student(sc.next()));
							if (index == -1)
								throw new CustomerException("Invalid PRN...");
							studList.remove(index);
							System.out.println("Student has been successfully removed!");
							break;
*/						System.out.println("Enter student PRN to remove that student");
String stud1 = sc.next();
Student st1 = new Student(stud1);
if (studList.contains(st1)) {
	studList.remove(studList.indexOf(st1));

	System.out.println("Student removed..!!");
} else
	throw new Exception("PRN number is invalid");
break;

						case 5:
							System.out.println("Enter the student PRN");
							index = studList.indexOf(new Student(sc.next()));
							if (index == -1)
								throw new CustomerException("Invalid student PRN");
							System.out.println("Enter GPA ");
							studList.get(index).setGPA(sc.nextDouble());
							System.out.println("GPA has been successfully updated");
							break;

						case 6:
							flag = false;
							break;
						}
					} catch (Exception e) {
						e.printStackTrace();
					}
					sc.nextLine();
				}

			}

		}

		private static String prnUnique(String next, Object studentList) {
			// TODO Auto-generated method stub
			return null;
		}
	}













