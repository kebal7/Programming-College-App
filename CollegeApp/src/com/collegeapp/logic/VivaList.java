package com.collegeapp.logic;

import com.collegeapp.controller.datastructure.CustomQueue;
import com.collegeapp.model.StudentModel;
import java.util.ArrayList;

/**
 *
 * @author Kebal Badal, LMU ID: 23048668
 */


public class VivaList {
    private ArrayList<StudentModel> studentList;
    
    private CustomQueue vivaListQueue = new CustomQueue(100);
    
    public void setStudentList(ArrayList<StudentModel> studentList)
    {
        this.studentList = studentList;
    }
            
    public void getAllStudentInProgram(String program)
    {
        for (StudentModel student : studentList) {
            if(student.getProgram().equals(program))
            {
                vivaListQueue.enQueue(student);
            }
        }
    }
}
