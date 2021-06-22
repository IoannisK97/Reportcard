package com.example.jandroid.reportcard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.Arrays;

public class Report extends AppCompatActivity {
    public String[] subjectsArray= new String[10];
    public int[] gradesArray= new int[10];
    public String nameOfStudent;

    public Report(String[] subjectsArray, int[] gradesArray,String nameOfStudent){
        this.subjectsArray=subjectsArray;
        this.gradesArray=gradesArray;
        this.nameOfStudent=nameOfStudent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report);
    }

    public int getGradeOfSubject(int position){
        return gradesArray[position];
    }
    public String getSubjectName(int position){
        return subjectsArray[position];
    }

    public String getNameOfStudent(){
        return nameOfStudent;
    }

    @Override
    public String toString() {
        String returnStr = "";
        returnStr="The grades for "+ getNameOfStudent()+ " are \n";
        for (int i=0;i<subjectsArray.length;i++ ){
            returnStr+=getSubjectName(i)+": "+ getGradeOfSubject(i)+"\n";
        }
        return returnStr;
    }
}