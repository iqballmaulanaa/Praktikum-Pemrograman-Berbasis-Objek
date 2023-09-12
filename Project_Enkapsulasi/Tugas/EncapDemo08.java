/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

/**
 *
 * @author USER
 */
public class EncapDemo08
{
    private String name08;
    private int age;
    
    public String getName()
    {
        return name08;
    }
        public void setName08 (String newName)
        {
            name08 = newName;
        }
        
        public int getAge ()
        {
            return age;
        }
        
        public void setAge (int newAge)
        {
            if (newAge > 30)
        {
            age = 30;
        }
        else
        {
            age = newAge;
        }

    }
}