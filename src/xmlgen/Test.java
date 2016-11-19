/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xmlgen;

import pkXMLGen.XMLGEN;
import java.util.Scanner;

/**
 *
 * @author Gonzalo, Adrian, Alex
 */

public class Test {
    
    public static void main(String[] args) {
        String[] NodeName = {  "Department", 
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
        String[] NodeText = {  "Computer Science",
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

           
//        XMLGEN test = new XMLGEN();
//        test.generateWithArrays(StringArray1, StringArray2, "CSCI-3333");        

        // Console Command for Testing 
        Scanner scanner = new Scanner(System.in);
        
        // Comment this for-loop and run the program to get the default xml settings
//       for (int i = 0; i < NodeText.length; i++) {
//           System.out.println("Enter the " + NodeName[i]);
//           NodeText[i] = scanner.nextLine(); //This will overide the default NodeText values of the array           
//       }             

        XMLGEN test = new XMLGEN();
        
        String filename = NodeText[1].toLowerCase() + "-" + NodeText[2]; // Save file according to Course Prefix and Course Number
        test.generateXMLWithArrays(NodeName, NodeText, "new course");
    }
}
