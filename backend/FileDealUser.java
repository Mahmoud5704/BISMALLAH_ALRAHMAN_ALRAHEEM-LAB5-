
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

import java.io.*;
import java.util.*;
public class FileDealUser implements FileHandler <Login>
{
      public FileDealUser()
      {  
      }
    @Override
      public List<Login> readfile (String filename)
      {
           List<Login> users = new ArrayList<>();
           try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                
                String[] parts = line.split(",");
                  
                    String username = parts[0].trim();
                    String password = parts[1].trim();

                    Login l = new Login(password,username);
                    users.add(l);  
            }
            return users;
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
            return null;
        }
                  
      }
    @Override
     public void addtofile (List<Login> users,String filename)
     {
         return;
          // This LAB does not support adding users from the GUI.
     }
}
