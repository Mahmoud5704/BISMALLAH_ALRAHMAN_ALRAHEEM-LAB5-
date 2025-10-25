/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5;

/**
 *
 * @author zeyad
 */
public class Validation {
    public static boolean verifyID(String ID){ //TO BE TESTED
        if (ID == null)
            return false;
        return ID.matches("[0-9]{5}"); 
    }
    public static boolean verifyName(String name){ //TO BE TESTED
        if (name == null)
            return false;
        String[] split = name.split(" ");
        if(split.length < 3 || split.length > 4)
            return false;
        for(int i = 0; i < split.length; i++){
            if(!split[i].matches("[a-zA-Z]{2,50}")) //length of each word must be between 2 and 50 characters from a-z only
                return false;
        }
        return true;
    }
    public static boolean verifyAge(int age){ //TO BE TESTED
        if(age < 16 || age > 35) //assuming 16 and 30 are the limits
            return false;
        return true;
    }
    public static boolean verifyDepartment(String department){ //TO BE TESTED
        return department.matches("[a-zA-Z]{2,100}"); //assuming the department name must be between 2 to 100 characters
    }
    public static boolean verifyGPA(float GPA){ //TO BE TESTED
        if(GPA < 0 || GPA > 4)
            return false;
        return true;
    }
}
