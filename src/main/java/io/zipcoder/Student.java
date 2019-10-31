package io.zipcoder;

//import com.sun.javafx.binding.StringFormatter;



import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;

public class Student {

    //***Instance Fields***
    String firstName;
    String lastName;
    ArrayList<Double> examScores;

//constructor method

    public Student(String firstName, String lastName, ArrayList<Double> examScores) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.examScores = examScores;

//ArrayList<Double> examScores = new ArrayList<>();
//    Collections.addAll(examScores, testScores);
    }

//Getters and setters

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public Integer getNumOfExamsTaken() {
        return examScores.size();
    }

    //public ArrayList<Double> getEx

//get exam scores method

    public String getExamScores(ArrayList<Double> examScores) {

        StringBuilder sb = new StringBuilder();
        sb.append("Exam Scores:\n");
        for (int i = 0; i < examScores.size(); i++){
            sb.append(String.format("\tExam %d -> %.1f\n" , i+1, examScores.get(i)));
        }

        return sb.toString();
    }

    public String addExamScore(Double examScore, ArrayList<Double> examScores)
    {
        examScores.add(examScore);
        //StringBuilder sb = new StringBuilder();
        return getExamScores(examScores);
    }

    public String setExamScore(Integer examNumber, Double newScore, ArrayList<Double> examScores){
        examScores.set(examNumber-1, newScore);
        return getExamScores(examScores);
    }

    public Double getAverageExamScore (ArrayList <Double> examScores){
        Double sum = 0.0;
        Double result = 0.0;
        Double numOfScores = getNumOfExamsTaken()*1.0;

//        double sum = 0;
//        double numOfScores = examScores.size();
//        double result = 0;

        for (int i = 0; i < examScores.size(); i++) {
            sum += examScores.get(i);
        }
        result = (sum / numOfScores);
        System.out.println(result);
        return result;

    }
     public String printToString(){
         StringBuilder sb= new StringBuilder();
         //sb.append("Student Name: %s %s\n", firstName, lastName);
return "";
     }
   // }



}