public class project1 {
String fullName;
String id;
float gpa;
int creditHours;
public String getFullName() {
return fullName;
}
public void setFullName(String fullName) {
this.fullName = fullName;
}
public String getId() {
return id;
}
public void setId(String id) {
this.id = id;
}
public float getGpa() {
return gpa;
}
public void setGpa(float gpa) {
this.gpa = gpa;
}
public int getCreditHours() {
return creditHours;
}
public void setCreditHours(int creditHours) {
this.creditHours = creditHours;
}
  
public void studentInvoice(project1 student) {
float totalFees = 0;

System.out.println("Student name: "+student.fullName);
System.out.println("credit hours: "+student.creditHours);
if(student.getGpa() >= 3.85) {
  
System.out.println("total fees: "+(float) (((236.45*student.getCreditHours()+52)*25)/100)+"$"+" with discount");
} else {
System.out.println("total fees: "+(float) 236.45*student.getCreditHours()+52+"$"+" without discount");
}
  
  
}
}


Faculty.java:

public class Faculty {
String fullName;
String id;
String department;
String rank;
public String getFullName() {
return fullName;
}
public void setFullName(String fullName) {
this.fullName = fullName;
}
public String getId() {
return id;
}
public void setId(String id) {
this.id = id;
}
public String getDepartment() {
return department;
}
public void setDepartment(String department) {
this.department = department;
}
public String getRank() {
return rank;
}
public void setRank(String rank) {
this.rank = rank;
}
  
}



TestData.java:
import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;
public class TestData {
public static void main(String[] args) {
  
int input = 0;
project1 student = new project1();
project1 student2 = new project1();
Faculty faculty = new Faculty();
Scanner scan = new Scanner(System.in);
  
ArrayList<String> departmentList = new ArrayList<String>();
departmentList.add("mathematics");
departmentList.add("engineering");
departmentList.add("arts");
departmentList.add("science");
  
do {
  
System.out.println("1. Enter the information of the faculty");
System.out.println("2. Enter the information of two students");
System.out.println("3. Print tution invoice");
System.out.println("4. print facutly information");
System.out.println("5. Exit program");
System.out.println("Enter Your choice");
  
input = scan.nextInt();
  
if(input == 1) {
System.out.println("Faculty Name:");
faculty.setFullName(scan.next());
System.out.println("ID:");
faculty.setId(scan.next());
System.out.println("Department:");
String department = scan.next();
if(departmentList.contains(department)) {
faculty.setDepartment(department);
} else {
System.out.println("please enter valid department");
faculty.setDepartment(scan.next());
}
System.out.println("Rank:");
String rankString = scan.next();
if(rankString.equalsIgnoreCase("professor") ||rankString.equalsIgnoreCase("adjunct") ) {
faculty.setRank(rankString);
} else {
System.out.println("please enter valid rank");
faculty.setDepartment(scan.next());
}
  
System.out.println("Thanks!!!!!!");
  
System.out.println("-----------------------------------------------------------");
}
  
if(input == 2) {
  
if((student.getFullName() != null)) {
System.out.println("Student information is already available you want to update");
System.out.println("Yes or No");
String input1 = scan.next();
if("yes".equals(input1)) {
System.out.println("Enter student information");
  
System.out.println("Student 1 information");
System.out.println("Student Name:");
student.setFullName(scan.next());
System.out.println("ID:");
student.setId(scan.next());
System.out.println("GPA:");
student.setGpa(scan.nextFloat());
System.out.println("Credit hours:");
student.setCreditHours(scan.nextInt());
  
  
System.out.println("Student 1 information");
System.out.println("Student Name:");
student2.setFullName(scan.next());
System.out.println("ID:");
student2.setId(scan.next());
System.out.println("GPA:");
student2.setGpa(scan.nextFloat());
System.out.println("Credit hours:");
student2.setCreditHours(scan.nextInt());
  
  
  
}
} else {
  
  
System.out.println("Enter student information");
    System.out.println("Student 1 information");
System.out.println("Student Name:");
student.setFullName(scan.next());
System.out.println("ID:");
student.setId(scan.next());
System.out.println("GPA:");
student.setGpa(scan.nextFloat());
System.out.println("Credit hours:");
student.setCreditHours(scan.nextInt());
  
  
System.out.println("Student 2 information");
System.out.println("Student Name:");
student2.setFullName(scan.next());
System.out.println("ID:");
student2.setId(scan.next());
System.out.println("GPA:");
student2.setGpa(scan.nextFloat());
System.out.println("Credit hours:");
student2.setCreditHours(scan.nextInt());
}
  
  
  
System.out.println("Thanks!!!!!");
  
System.out.println("-----------------------------------------------------------"); }
  
if(input == 4) {
  
System.out.println("name: "+faculty.getFullName()+" id: "+faculty.id+" department: "+faculty.getDepartment()+" rank: "+faculty.rank);
System.out.println("Thanks!!!!!");
  
System.out.println("-----------------------------------------------------------");
}
if(input == 3) {
System.out.println("Which student invoice you want "+student.getFullName()+ " OR "+student2.fullName);
String studentName = scan.next();
if(student.getFullName().equalsIgnoreCase(studentName)) {
  
student.studentInvoice(student);
} else if(student2.getFullName().equalsIgnoreCase(studentName)) {
  
student2.studentInvoice(student2);
} else {
System.out.println("OOPS!!!! Entered invalid name");
}
  
System.out.println("Thanks!!!!!");
System.out.println("-----------------------------------------------------------");
}
}
while(input != 5); System.out.println("Good Bye!!!");System.exit(0);
}
}