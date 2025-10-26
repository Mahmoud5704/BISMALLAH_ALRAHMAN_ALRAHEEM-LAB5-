/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

import java.io.*;
import java.util.*;
public class LoginCheck 
{
    //
    private List<Login> users = new ArrayList<>();
    private static final String FILE_NAME = "UsersData.txt"; 
    private FileDealUser filedealuser = new FileDealUser();
    //
    public LoginCheck()
    {
        users = filedealuser.readfile(FILE_NAME);
    }
    //
    public boolean LoginCheckUser (String password,String username)
    {
        Login input = new Login(password,username);
        for (int i =0;i<users.size();i++)
        {
            if(users.get(i).GetPassword().equals(password) && users.get(i).GetUsername().equals(username))
                return true;
                
        }
        return false;
    }
    
}
