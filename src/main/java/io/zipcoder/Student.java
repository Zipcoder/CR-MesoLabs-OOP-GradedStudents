package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {
    private String firstName;
    private String lastName;
    ArrayList<Double> examScores;
    Double [] testScores;

    public Student(String firstName, String lastName, Double ... testScores) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.examScores = new ArrayList<Double>(Arrays.asList(testScores));
    }

    // ================== GETTERS ================== //
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getNumberOfExamsTaken() {
        return this.testScores.length;
    }

    public String getExamScores() {
        StringBuilder stringOfTestScores = new StringBuilder();

        for (int i = 0; i < testScores.length; i++) {
            stringOfTestScores.append(testScores[i]).append(" | ");
            stringOfTestScores.append(i);
        }
        return Arrays.toString(testScores);
    }

    public void addExamScore(double testScore) {
        this.examScores.add(testScore);
    }

    public Double getAverageExamScore() {
        double totalSum = 0.0;
        for (int i = 0; i < testScores.length; i++) {
            totalSum = totalSum + testScores[i];
        }
        return totalSum / testScores.length;
    }

    // ===================== SETTERS =================== //
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setExamScore(int examNumber, double newScore){
        this.examScores.set(examNumber, newScore);
    }

    @Override
    public String toString() {

        return String.format("Student Name: %s %s\n" + "Average Score: %s\n" + "Exam Scores: %s",
                firstName, lastName, getAverageExamScore(), getExamScores());
//        return "Student Name: " + firstName + " " + lastName + '\n' +
//                "Average Score: " + getAverageExamScore() + '\n' +
//                "Exam Scores: " + getExamScores();
    }




}
