import java.util.Scanner;
class StudentDetails{
    static String name;
    static int rollNo;

    StudentDetails(String name, int rollNo){
        this.name = name;
        this.rollNo = rollNo;
    }

    void Display(){
        System.out.println("Student name is: " + name);
        System.out.println("Student rollNo is: " + rollNo);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the student name: ");
        name = sc.nextLine();
        System.out.println("Enter the student rollNo: ");
        rollNo = sc.nextInt();
        StudentDetails sd = new StudentDetails(name, rollNo);
        sd.Display();
        StudentDetails ds = new StudentDetails("Sudharshan", 24985);   
        ds.Display();
    }
}