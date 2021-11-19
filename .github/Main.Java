import java.util.Scanner;

// <Amari Lombel> 5b 11/19/21 8:22 am

public class Student() {
    //these are intance variable
    private int studentID;
    private int studentID;
    private double gradepointAverage;
    private String studentName;  
}
    //create intructor
    public Student() {
        this.studentID = 0;
        this.gradeLevel = 0;
        this.gradepointAverage = 0;
        this.studentName = "";        
    }
// value constructor
 public Student(int studentID, int gradeLevel, double gradepointAverage, String studentName,){
    this.studentID = studentID;
    this.gradeLevel = 9;
    this.gradepointAverage = 4.0;
    this.studentName = studentName; 
 }
//creating methods 
public static void calcGPA() {
    int grade0;
    int grade1;
    int grade2;
    int grade3;
    double newGPA;

    import java.util.Scanner;
    Scanner myScanner = new Scanner(System.in);
    
    
    system.out.println("what is the first grade");
    grade0 = myScanner.nextint();
    system.out.println("what is the second grade");
    grade1 = myScanner.nextint();
    system.out.println("what is the third grade");
    grade2 = myScanner.nextint();
    system.out.println("what is the fourth grade");
    grade3 = myScanner.nextint();

    // GPA calculator
    newGPA =(grade0 + grade1 + grade2 + grade3) / 4;
    system.out.println("this is you GPA")
    system.out.println(newGPA);
}




public static void newLine() {
    system.out.println()
    
}

public static void threeLine() {
    newLine();
    newLine();
    newLine();
}
public static void main(String[]args) {
    Student student0 = new Student();
    Student student1 = new Student(12345678,11,0.57"Dr.Strange");
    
    System.out.println("Hello there");
    threeLine();
    System.out.println("General Kenobi");
    calcGPA();
    
}

     
    // Parameter and Arguments
    public static void assignLunch(int gradeLevel) {
        String lunchPeriod;
            
            if (gradeLevel == 9){
                lunchPeriod == "thrid lunch";
                system.out.print("this student has ");
                system.out.println (lunchPeriod);
            }else if (gradeLevel == 10){
                 lunchPeriod == "second lunch";
                system.out.print("this student has ");
                system.out.println (lunchPeriod);
            }else if (gradeLevel == 11){
                lunchPeriod == "first lunch";
                system.out.print("this student has ");
                system.out.println (lunchPeriod);
            }else {
                lunchPeriod == "outsude luch";
                system.out.print("this student has ");
                system.out.println (lunchPeriod);
            }
        
    }

    public static void  assignLunchMultiple(int gradelevel, double gradepointAverage )
        String lunchPeriod;
    // And, Or,Not - Boolen Operaters 
    // && -- And
    // || -- Or 
    // ! -- not

    if (gradelevel == 9 || gradepointAverage <= 1.5) {
        lunchPeriod = ("Frist Lunch");
        system.out.println (" This student has ");
        system.out.println(lunchPeriod)
    }else if (gradeLevel == 10 && gradepointAverage >2.0){
        lunchPeriod == "second lunch";
       system.out.print("this student has ");
       system.out.println (lunchPeriod);
   }else if (gradeLevel == 11 && ( gradepointAverage != 0.0)){
       lunchPeriod == "first lunch";
       system.out.print("this student has ");
       system.out.println (lunchPeriod);
   }else {
       lunchPeriod == "outsude luch";
       system.out.print("this student has ");
       system.out.println (lunchPeriod);


    public static void mathPractice() {
        int x;
        int y;
        Scanner myScanner = new Scanner(system.in);
        x = myScanner.nextInt();
        x = myScanner.nextInt();
        System.out.println(Math.min(x,y));
        int lowest;
        lowest=math.min(x,y);
        System.out.println(lowest);
           
       }






    }






    }

}
