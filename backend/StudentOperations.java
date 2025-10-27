/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;
import java.util.*;

public class StudentOperations 
{
    private List<StudentModule> students = new ArrayList<>();
    private static final String FILE_NAME = "StudentsData.txt";
    private FileDeal filedeal;
    public StudentOperations() 
    {
        filedeal = new FileDeal();
        students = filedeal.readfile(FILE_NAME);
        if (students == null)
               students = new ArrayList<>();
    }
    
    public boolean AddStudent(StudentModule s)
    {
        int ID = s.getId();
        for(int i = 0; i < students.size(); i++){
            if(students.get(i).getId() == ID){
                return false;
            }
        }
        students.add(s);
        filedeal.addtofile(students, FILE_NAME);
        return true;
    }
    
    public List<StudentModule> ViewStudents()
    {
        return students;
    }
    
    public boolean UpdateStudent(int originalID, StudentModule s)
    {
        boolean flag = false;
        int target = -1;
        for(int i=0 ; i<students.size();i++)
        {
            if(students.get(i).getId() == originalID)
            {
                flag = true;
                target = i;
            }
            if(students.get(i).getId() == s.getId()){
                return false; //new ID already exists? return false
            }
        }
        if (flag){
            students.set(target, s);
            filedeal.addtofile(students, FILE_NAME);
            return true;
        }
        return false;
    }
    
    public boolean DeleteStudent(int ID)
    {
        for(int i=0 ; i<students.size();i++)
        {
            if(students.get(i).getId()== ID)
            {
                students.remove(i);
                filedeal.addtofile(students, FILE_NAME);
                return true;
            }
        }
        return false;
    }
    
    public StudentModule SearchStudentByID(int id)
    {
        for(int i=0 ; i<students.size();i++)
        {
            if(students.get(i).getId()==id)
            {
                return students.get(i);
            }
        }
        return null;
    }
    
    public StudentModule SearchStudentByName(String name)
    {
        for(int i=0 ; i<students.size();i++)
        {
            if (students.get(i).getName().equals(name))
            {
                return students.get(i);
            }
        }
        return null;
    }    
}
