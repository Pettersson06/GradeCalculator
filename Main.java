import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("How many Grades do you want to put in?");
    int numGrades = scanner.nextInt();
    double[] grades = getGrades(numGrades, scanner);
    double average = calculateAverage(grades);
    printResult(average);
    scanner.close();
  }

  static double calculateAverage(double[] grades) {
    double total = 0.0;
    for (int i = 0; i < grades.length; i++) {
      total = total + grades[i];
    }
    double average = total / grades.length;
    return average;
  }

  static void printResult(double average) {
    System.out.println(average + " is your grade average!");
    if (average < 4.5) {
      System.out.println("You passed the class!");
    } else if (average > 4.5) {
      System.out.println("You failed the class!");
    } else {
      System.out.println("The teachers need to discuss if you pass the class or not!");
    }
  }

  static double[] getGrades(int numGrades, Scanner scanner) {
    double[] grades = new double[numGrades];
    for (int i = 0; i < numGrades; i++) {
      System.out.println("Give me a grade!");
      grades[i] = scanner.nextDouble();
    }
    return grades;
  }
}
