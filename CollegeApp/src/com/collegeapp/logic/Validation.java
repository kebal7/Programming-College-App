package com.collegeapp.logic;


/**
 *
 * @author Kebal Badal, LMU ID: 23048668
 */
public class Validation {
    public boolean isValidAge(short age)
    {
        boolean isValidAge = (age >= 16 && age<=60);
        return isValidAge;
    }
    
    public boolean isValidInteger(String str)
    {
        boolean isInteger = true;
        for (int i = 0; i < str.length(); i++) 
        {
            if(Character.isDigit(str.charAt(i)) == false)
            {
                isInteger = false;
                break;
            }
        }
        return isInteger;
    }
    
    public boolean isEmptyFieldPresent(javax.swing.JTextField[] fields) 
    {
        boolean isFieldEmpthy = false;

        for (javax.swing.JTextField field: fields)
        {
            if(field.getText().length() == 0)
            {
                isFieldEmpthy = true;
                break;
            }
        }
        return isFieldEmpthy; 
    }
}
