import java.util.Scanner;

public class StudentTraker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No of Grade");
        int numGrade = sc.nextInt();

        int[] grades = new int[numGrade];
        for (int i = 0; i < numGrade; i++) {
            System.out.println("Enetr the grades: " + (i + 1) +": ");
            grades[i] = sc.nextInt();
        }
        
        int total = 0;
        for (int i = 0; i < numGrade; i++) {
            total+=grades[i];
        }

        double higest = (double) total/numGrade;
        double aversge = (double) total/numGrade;
        double lowest = (double) total/numGrade;

        if (higest>=80){
            System.out.println("Total " + total);
        System.out.println("Higest Grades is "+higest);
            System.out.println("Grade is A");
        } else if (aversge >= 50) {
            System.out.println("Total " + total);
            System.out.println("Average Grades is "+aversge);
            System.out.println("Grade is B");
        } else if (lowest >= 30) {
            System.out.println("Total " + total);
            System.out.println("Lowest Grades is "+lowest);
            System.out.println("Grade is C");
        }else {
            System.out.println("Fail");
        }
    }
}
