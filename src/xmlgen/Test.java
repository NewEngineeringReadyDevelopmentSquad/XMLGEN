/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xmlgen;

/**
 *
 * @author Adrian
 */

public class Test {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        String[] StringArray1 = {  "Department", 
                                "Prefix",
                                "Number",
                                "Name",
                                "Description",
                                "Credit-hours",
                                "Lecture-hours",
                                "Lab-hours",
                                "Level",
                                "Schedule-type",
                                "Prerequisite",
                                "Co-requisite",
                                "Course-attributes",
                                "Legacy-number",
                                "Cross-listed",
                                "Restrictions",
                                
        };
        String[] StringArray2 = {  "Computer Science",
                                "CSCI", 
                                "2388",
                                "Computer Science II HON",
                                "A second programming course includes problem solving by structured design. Provides an introduction to elementary data structures, including linked lists, stacks, queues, trees and graphs, and advanced programming techniques, including recursion, sorting and searching.",
                                "3.000", 
                                "3.000",
                                "0.000", 
                                "Undergraduate",
                                "Lecture", 
                                "Undergraduate level CSCI 1378 Minimum Grade of D or Undergraduate level CSCI 1370 Minimum Grade of D or Undergraduate level CMPE 1370 Minimum Grade of D ",
                                "None",
                                "Degree Elective, CS Instruction Fee -LU",
                                "None",
                                "CMPE 2388",
                                "May not be enrolled in one of the following Programs: dnu MED in Educational Admin MPA in Public Administration Bus. Admin Accelerated online May not be enrolled in one of the following Levels: English Language Institute"
        };
    
        XMLGEN test = new XMLGEN();
        test.generateWithArrays(StringArray1, StringArray2, "CSCI-3333");
        
        
       
    
    }
}
