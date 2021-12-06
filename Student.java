import java.util.Scanner;

// <Amari Lombel> 5b 11/19/21 8:57 am v1.6

public class Student {
    //these are intance variable
    private int studentID;
    private int gradeLevel;
    private double gradepointAverage;
    private String studentName;  

    //create intructor
    public Student() {
        this.studentID = 0;
        this.gradeLevel = 0;
        this.gradepointAverage = 0;
        this.studentName = "";        
    }
// value constructor
 public Student(int studentID, int gradeLevel, double gradepointAverage, String studentName){
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

    
    Scanner myScanner = new Scanner(System.in);
    
    
    System.out.println("what is the first grade");
    grade0 = myScanner.nextInt();
    System.out.println("what is the second grade");
    grade1 = myScanner.nextInt();
    System.out.println("what is the third grade");
    grade2 = myScanner.nextInt();
    System.out.println("what is the fourth grade");
    grade3 = myScanner.nextInt();

    // GPA calculator
    newGPA =(grade0 + grade1 + grade2 + grade3) / 4;
    System.out.println("this is you GPA");
    System.out.println(newGPA);
}




public static void newLine() {
    System.out.println();
    
}

public static void threeLine() {
    newLine();
    newLine();
    newLine();
}

     
    // Parameter and Arguments
    public static void assignLunch(int gradeLevel) {
        String lunchPeriod;
            
            if (gradeLevel == 9){
                lunchPeriod = "thrid lunch";
                System.out.print("this student has ");
                System.out.println (lunchPeriod);
            }else if (gradeLevel == 10){
                 lunchPeriod = "second lunch";
                System.out.print("this student has ");
                System.out.println (lunchPeriod);
            }else if (gradeLevel == 11){
                lunchPeriod = "first lunch";
                System.out.print("this student has ");
                System.out.println (lunchPeriod);
            }else {
                lunchPeriod = "outsude luch";
                System.out.print("this student has ");
                System.out.println (lunchPeriod);
            }
        
    }

    public static void  assignLunchMultiple(int gradeLevel, double gradepointAverage){
        String lunchPeriod;
    // And, Or,Not - Boolen Operaters 
    // && -- And
    // || -- Or 
    // ! -- not

    if (gradeLevel == 9 || gradepointAverage <= 1.5) {
        lunchPeriod = ("Frist Lunch");
        System.out.println (" This student has ");
        System.out.println(lunchPeriod);
    }else if (gradeLevel == 10 && (gradepointAverage >2.0)){
        lunchPeriod = "second lunch";
       System.out.print("this student has ");
       System.out.println (lunchPeriod);
   }else if (gradeLevel == 11 && ( gradepointAverage != 0.0)){
       lunchPeriod = "first lunch";
       System.out.print("this student has ");
       System.out.println (lunchPeriod);
   }else {
       lunchPeriod = "outsude luch";
       System.out.print("this student has ");
       System.out.println (lunchPeriod);
   
   }
}
    // math practice
       public static void mathPractice() {
        int x;
        int y;
        Scanner myScanner = new Scanner(System.in);
        System.out.println("type an inter and press enter\n");
        x = myScanner.nextInt();
        System.out.println("type an inter and press enter\n");
        y = myScanner.nextInt();
        System.out.println(Math.min(x,y));
        int lowest;
        lowest= Math.min(x,y);
        System.out.println(lowest);
        
        System.out.println(" Next we will use math.pow() to calculate.\n");
        System.out.println(Math.pow(x,y));

        double exponent;
        exponent = Math.pow(x,y);
        System.out.println(exponent);

        System.out.println(" Next we will use Math.random().\n");
        double precentage;
        System.out.print("There is a ");
        System.out.print(precentage);
        System.out.println("% chance of rain");

    
          
      }
    
    

        public static double getGPA () {
            int grade0 ,grade1 , grade2;
  
            grade0 = 87;
  
            grade1 = 64;
  
            grade2 = 13;
  
            double fakeGPA;
            fakeGPA = (grade0 + grade1 + grade2);
  
          
          double realGPA;
          realGPA = 1.0;
          System.out.println(realGPA);
          realGPA = getGPA;

    





    
    }
}


