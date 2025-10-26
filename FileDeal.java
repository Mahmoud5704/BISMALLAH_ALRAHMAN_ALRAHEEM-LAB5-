/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication11;

import java.io.*;
import java.util.*;

public class FileDeal implements FileHandler <StudentModule> 
{
      
      public FileDeal()
      {
          
      }
      @Override
      public List<StudentModule> readfile (String filename)
      {
           List<StudentModule> Students = new ArrayList<>();
           try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                
                String[] parts = line.split(",");
                  
                    int id = Integer.parseInt(parts[0].trim());
                    String name = parts[1].trim();
                    int age = Integer.parseInt(parts[2].trim());
                    String gender = parts[3].trim();
                    String department = parts[4].trim();
                    double gpa = Double.parseDouble(parts[5].trim());

                    StudentModule s = new StudentModule(id,name,age,gender,department,gpa);
                    Students.add(s);
                   
               
            }
            return Students;
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
            return null;
        }
                  
      }
    @Override  
    public void addtofile (List<StudentModule> students,String filename)
     {
          
    try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename))) 
    {
        for (StudentModule s : students) 
        {
            bw.write(s.getId() + "," + s.getName() + "," + s.getAge() + "," + 
                     s.getGender() + "," + s.getDepartment() + "," + s.getGpa());
            bw.newLine();
        }
    } 
    catch (IOException e) 
    {
        e.printStackTrace();
    }

    }
}
       
