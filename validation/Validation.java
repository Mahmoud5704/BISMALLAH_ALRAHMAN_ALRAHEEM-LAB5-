/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package validation;

import java.awt.Color;
import javax.swing.InputVerifier;
import javax.swing.JComponent;
import javax.swing.JTextField;

/**
 *
 * @author zeyad
 */
    
public class Validation {
    public static boolean verifyID(String ID){
        if (ID == null)
            return false;
        return ID.matches("[0-9]{5}"); 
    }
    public static boolean verifyName(String name){
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
    public static boolean verifyGPA(String GPA){ //TO BE TESTED
        return GPA.matches("^[0-3]{1}\\.[0-9]{2}$") || GPA.matches("^4$"); //from 0 to 4
    }
    //declare verifying classes
    public static abstract class customVerifier extends InputVerifier{
        protected boolean isValid;
        protected javax.swing.JTextField Field;
        protected Color defaultColor;
        protected void updateColor(){
            if(this.isValid == false){
                Field.setBackground(Color.red);
            }
            else{
                Field.setBackground(defaultColor);
            }
        }
        public boolean getIsValid(){
            return this.isValid;
        }
    }
    public static class IDVerifier extends customVerifier {
        IDVerifier(javax.swing.JTextField Field){
            this.Field = Field;
            defaultColor = this.Field.getBackground();
        }
        @Override
        public boolean verify(JComponent input) {
            String target = ((JTextField) input).getText();
            this.isValid = verifyID(target);
            updateColor();
            return this.isValid;
        }
    }
    public static class nameVerifier extends customVerifier {
        nameVerifier(javax.swing.JTextField Field){
            this.Field = Field;
            defaultColor = this.Field.getBackground();
        }
        @Override
        public boolean verify(JComponent input) {
            String target = ((JTextField) input).getText();
            this.isValid = verifyName(target);
            updateColor();
            return this.isValid;
        }
    }
    public static class GPAVerifier extends customVerifier {
        GPAVerifier(javax.swing.JTextField Field){
            this.Field = Field;
            defaultColor = this.Field.getBackground();
        }
        @Override
        public boolean verify(JComponent input) {
            String target = ((JTextField) input).getText();
            this.isValid = verifyGPA(target);
            updateColor();
            return this.isValid;
        }
    }
    public static class departmentVerifier extends customVerifier {
        departmentVerifier(javax.swing.JTextField Field){
            this.Field = Field;
            defaultColor = this.Field.getBackground();
        }
        @Override
        public boolean verify(JComponent input) {
            String target = ((JTextField) input).getText();
            this.isValid = verifyDepartment(target);
            updateColor();
            return this.isValid;
        }
    }
    public static IDVerifier getIDVerifier(javax.swing.JTextField Field){
        return new IDVerifier(Field);
    }
    public static nameVerifier getNameVerifier(javax.swing.JTextField Field){
        return new nameVerifier(Field);
    }
    public static GPAVerifier getGPAVerifier(javax.swing.JTextField Field){
        return new GPAVerifier(Field);
    }
    public static departmentVerifier getDepartmentVerifier(javax.swing.JTextField Field){
        return new departmentVerifier(Field);
    }
}