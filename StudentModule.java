/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package javaapplication11;

import java.io.*;
import java.util.*;
public class StudentModule  
{
    private int StudentID;
    private String FullName;
    private int Age;
    private String Department;
    private double GBA;
    private String Gender;
    public StudentModule(int id,String name,int age,String gender,String departmant,double gba)
        {
                this.FullName=name;
                this.Department=departmant;
                this.GBA=gba;
                this.StudentID=id;
                this.Age=age;
                this.Gender=gender;
        }
    //getters
    public int getId() 
    {
        return this.StudentID; 
    }
    public String getName() 
    {
        return this.FullName; 
    }
    public int getAge() 
    { 
        return this.Age; 
    }
    public String getGender() 
    {
        return this.Gender; 
    }
    public String getDepartment() 
    { 
        return this.Department; 
    }
    public double getGpa() 
    {
        return this.GBA; 
    }
    //setters
    public int setName(String name) 
    {
        if(Validation.Name)
        {
                 this.FullName= name;
                 return 1;
        }
        else
            return 0;
    }
    public int setAge(int age) 
    {
        if(Validation.Age)
        {
                 this.Age= age;
                 return 1;
        }
        else
            return 0;
    }
    public int setGender(String gender) 
    {
        if(Validation.Gender)
        {
                 this.Gender = gender;
                 return 1;
        }
        else
            return 0;
    }
    public int setDepartment(String department) 
    {
         if(Validation.Department)
        {
                 this.Department = department;
                 return 1;
        }
        else
            return 0;
    }
    public int setGpa(double gpa) 
    {
        if(Validation.GPA)
        {
                 this.GBA= gpa;
                 return 1;
        }
        else
            return 0;
    }
}
