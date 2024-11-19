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
}
