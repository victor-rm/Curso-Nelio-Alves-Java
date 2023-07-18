package entities;

import static java.lang.String.format;

public class Student {
    public String studentName;
    public double firstGrade, secondGrade, thirdGrade;

    private double calculateFinalGrade() {
        return firstGrade + secondGrade + thirdGrade;
    }

    private String passOrFail(double grade) {
        if (grade >=60) {
            return "PASS";
        } else {
            double missingPoints = calculateFinalGrade() - 60.0;
            return format("FAILED\n" +
                    "MISSING %.2f POINTS", missingPoints);
        }

    }

    @Override
    public String toString() {
        return format("FINAL GRADE = %.2f \n", calculateFinalGrade()) + passOrFail(calculateFinalGrade());
    }

}
