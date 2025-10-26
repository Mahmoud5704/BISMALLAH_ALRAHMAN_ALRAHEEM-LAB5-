/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication11;




public class Login 
{
    private String password;
    private String username;
    //
    public Login (String password, String username)
    {
        this.password=password;
        this.username=username;
    }
    //
    public String GetPassword()
    {
        return this.password;
    }
    public String GetUsername()
    {
        return this.username;
    }
    //
    public void SetPassword(String password)
    {
        this.password=password;
    }
    public void SetUsername(String username)
    {
        this.username=username;
    }    
    
}
