
package tester;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
import cust_exception.*;
import com.app.core.CourseType;
import com.app.core.Student;
import java.util.Date;

import static utils.CollectionUtils.populateSampleData;
import static utils.CollectionUtils.showDetails;
import static utils.ValidationUtils.*;
import static com.app.core.Student.sdf;

public class TestStudent {

	public static void main(String[] args) {
		// try-with-resources
		try (Scanner sc = new Scanner(System.in)) {
			// init
			// add populated list to students ref
			ArrayList<Student> studentList = populateSampleData();
			boolean exit = false;
			// start
			while (!exit) {
				System.out.println("Options");
				System.out.println("1.Enter Student Details:");
				System.out.println("2.Display Student Details:");
				System.out.println("3.Fetch Student Details From PRN:");
				System.out.println("4.Cancel Admission:");
				System.out.println("5.Update GPA:");
				System.out.println("6.Print Student Detail In Specific Course:");
				System.out.println("7.Sort By PRN Number:");
				System.out.println("8.Sort By GPA:");
				System.out.println("9.Sort by GPA & Course:");
				System.out.println("10.Removed Failed Students:");
				System.out.println("11.Display Details In Reverse:");

				System.out.println("100.Exit");

				try {
					//switch-case [choice]
					switch (sc.nextInt()) {
					case 1:
						//Enter the new Student details
						//1st check : for duplication if not then -> add o/w throw a customer exception
						
						System.out.println("Enter Student Details : Prn ,Name ,Email ,Password ,Gpa ,Dob ,Course-Category");
						studentList.add(new Student(checkDuplicatePrn(sc.next(), studentList), sc.next(), sc.next(), sc.next(),sc.nextDouble(),sdf.parse(sc.next()),CourseType.valueOf(sc.next().toUpperCase())));
						System.out.println("Student Details Added & Updated Successfully!!");
						break;
						
					case 2:
						//display all student details
						//showDetails(students) -> utils.CollectionUtils
						
						System.out.println("Display All Details");
						for (Student s2 : studentList)// for-each is nothing but implicit Iterator<E> i/f
							System.out.println(s2);
						break;
					case 3:
						//fetch the student details
						//1st check : for validate prn no. if student present -> show the details [using get() method]
						
						System.out.println("Fetch Student Detials From PRN");
						System.out.println("Enter PRN Number:");
						Student s1 = new Student(sc.next());

						if (studentList.contains(s1)) {
							int index = studentList.indexOf(s1);
							System.out.println(studentList.get(index));
							// System.out.println(s1);
						} else
							throw new StudentHandlingException("PRN You Entered Is Not Exits.....!!");
						break;
					case 4:
//						System.out.print("Enter student prn no. : ");
//						index = validatePrn(sc.next(), students);
//						System.out.println(students.remove(index));
//						System.out.println("Student removed successfully!!!");
						System.out.print("Enter student prn no. : ");
						System.out.println(studentList.remove(new Student(sc.next())));
						System.out.println("Student removed successfully!!!");						
						break;
//						System.out.println("Cancel Admission");
//						System.out.println("Enter PRN Number:");
//						Student s3 = new Student(sc.next());
//						if (studentList.contains(s3)) {
//							int index = studentList.indexOf(s3);
//							studentList.remove(s3);
//							System.out.println("Student Detail Removed Successfully..!!");
//
//						} else
//							throw new StudentHandlingException("PRN You Entered Is Not Exits.....!!");
//						break;
					case 5:
						System.out.println("Enter PRN To Update GPA Of Student:");
						Student s4 = new Student(sc.next());
						if (studentList.contains(s4)) {
							System.out.println("Enter updated GPA:");
							double newGPA = sc.nextDouble();
							studentList.get(studentList.indexOf(s4)).setGPA(newGPA);
							System.out.println("Student GPA Updated Successfully......!!");
						} else
							throw new StudentHandlingException("PRN You Entered Is Not Exits.....!!");
						break;
					case 6:

						// enter course name and dob [display data present after this date]
						// using for-each : iterate through the given list
						// 1st check : for the course equality : s.getType() == checkCourse
						// all data members of enum class are having same ref :: hence we can use ==
						// operator
						// instead of equals() method
						// 2nd check : date should be after the given date

						System.out.print("Enter course name : ");		
						CourseType c = CourseType.valueOf(sc.next().toUpperCase());
						System.out.println("Enter starting date : ");
						Date d = sdf.parse(sc.next());
						for(Student s : studentList) {
							if(s.getType() == c) {
								if(s.getDob().after(d))
								System.out.println("Name : "+s.getName() +" Cource : "+c+"  Dob : "+sdf.format(s.getDob()));
							}
						}
						break;

					case 7:
						// Sort [ Natural Ordering ] : java.util.Comparable<T>
						// public int compareTo(T o)
						// Student class must implement Comparable i/f and override compareTo() method
						// sort as per PRN no.
						Collections.sort(studentList);
						showDetails(studentList);
						break;
					case 8:
						//Sort student details as per GPA  , using custom ordering & anonymous inner class
						//Sort [Custom ordering] : anonymous inner class (TestStudent$1.class)
						//compare as per the gpa of students
						//Double : wrapper class already implements Comparable i/f
						//				hence use comparedTo() method
						Collections.sort(studentList, new Comparator<Student>() {
							public int compare(Student s1, Student s2) {
								return ((Double)s1.getGpa()).compareTo(s2.getGpa());
							}
						});
						break;
					case 9:
						//Sort student details as per course & GPA   , using custom ordering & anonymous inner class
						//Sort [Custom ordering] : anonymous inner class (TestStudent1$2.class)
						//1st : sort as per course type : enum course converted to String type
						//                                            String class already implements Comparable i/f
						
							Collections.sort(studentList, new Comparator<Student>() {
								public int compare(Student s1, Student s2) {
									int ret = (s1.getType().toString()).compareTo(s2.getType().toString());
									System.out.println(s1.getType()+" : "+s2.getType()+" : "+ret);
									if(ret == 0) {
										return ((Double)s1.getGpa()).compareTo(s2.getGpa());
									}
									return ret;
								}
							});					
							break;
					case 10:
						//Remove  details of failed students from the list
						//(Failed if GPA < 5)
//						ArrayList<Student>arr = new ArrayList<>();
//						for(Student s : studentList) {
//							if(s.getGpa() < 5.0 ) {
//								System.out.println("Failed student : "+s.getName()+" gpa : "+s.getGpa());
//								studentList.remove(s);
//								arr.add(s);
//								studentList.removeAll(arr);
//								System.out.println("Student has been removed!!!");
//							}
//						}
//						studentList.removeAll(arr);
						ListIterator<Student> itr = studentList.listIterator();
						while(itr.hasNext()) {
							Student stud = itr.next();
							if(stud.getGpa() < 5.0) {
								System.out.println("Failed student : "+stud.getName()+", gpa : "+stud.getGpa());
								itr.remove();
								System.out.println("Student has been removed!!!");
							}
						}
						break;
					case 11:
						//reverse the student list
						//using ListIterator
							ListIterator<Student> itr1 = studentList.listIterator(studentList.size());
							while(itr1.hasPrevious()) {
								System.out.println(itr1.previous());
							}					
							break;
					case 100:
						exit = true;
						System.out.println("Exit From Student Application successfully...!!");
						break;
					}
				} catch (Exception e) {
					e.printStackTrace();
				}

				sc.nextLine();

			}

		}

	}
}
