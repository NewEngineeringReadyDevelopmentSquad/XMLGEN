/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkXMLGen;

import java.io.File;
import java.util.ArrayList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/**
 *
 * @author Gonzalo
 */

public class XMLGEN {
    private String [] NodeName = null;
    private String [] NodeText = null;
    private ArrayList<String> NodeNameList = null;
    private ArrayList<String> NodeTextList = null;
    private String newfilename;
    

    
 /**
 * 
 *Empty constructor which lets the user instantiate objects to use public methods.
 */
    public XMLGEN()
    {    
    }
     
     
 /**
 * 
 * This Constructor lets the user input two ArrayLists and specify the file name of the XML. 
 * 
 * @param  NewNodeNameList  An ArrayList of the Element names
 * @param  NewNodeTextList  An ArrayList of the Text inside the Elements
 * @param  NewFileName Takes a string and sets it as the file name of the XML
 */
    public XMLGEN(ArrayList<String> NewNodeNameList, ArrayList<String> NewNodeTextList, String NewFileName)
    {
        generateWithArraylists(NodeNameList,NodeTextList,newfilename);
    }
/**
 * This Constructor lets the user input two Arrays and specify the file name of the XML. 
 * @param  NewNodeName  An Array of the Element names
 * @param  NewNodeText  An Array of the Text inside the Elements
 * @param  NewFileName Takes a string and sets it as the file name of the XML
 */
    public XMLGEN(String[] NewNodeName, String[] NewNodeText, String NewFileName)
    {
        generateWithArrays(NodeName,NodeText,newfilename);
    }
  
    
/**
 * This method lets the user input two ArrayLists and specify the file name of the XML. 
 * @param  NodeNameList  An ArrayList of the Element names
 * @param  NodeTextList  An Array of the Text inside the Elements
 * @param  filename Takes a ArrayList and sets it as the file name of the XML
 */
    private void generateWithArraylists(ArrayList<String> NodeNameList,ArrayList<String> NodeTextList, String filename){
        try {
              
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
            Document doc = docBuilder.newDocument();
            Element rootElement = doc.createElement("Course");
            doc.appendChild(rootElement);

                for (int i = 0; i <NodeNameList.size(); i++) {
                    Element e = doc.createElement(NodeNameList.get(i));
                    e.appendChild(doc.createTextNode(NodeTextList.get(i)));
                    rootElement.appendChild(e);
                }

            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File(filename + ".xml"));


            transformer.transform(source, result);

            System.out.println("File saved!");

            } 
        catch (ParserConfigurationException pce) {
                    pce.printStackTrace();
            } 
        catch (TransformerException tfe) {
                    tfe.printStackTrace();
            }
    }
    
/**
 * This method lets the user input two Arrays and specify the file name of the XML. 
 * @param  NodeName  An Array of the Element names
 * @param  NodeText  An Array of the Text inside the Elements
 * @param  filename Takes a string and sets it as the file name of the XML
 */
    private void generateWithArrays(String [] NodeName,String [] NodeText, String filename){
        try {
              
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
            Document doc = docBuilder.newDocument();
            Element rootElement = doc.createElement("Course");
            doc.appendChild(rootElement);

                for (int i = 0; i <NodeName.length; i++) {
                    Element e = doc.createElement(NodeName[i]);
                    e.appendChild(doc.createTextNode(NodeText[i]));
                    rootElement.appendChild(e);
                }

            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File(filename + ".xml"));


            transformer.transform(source, result);

            System.out.println("File saved!");

            } 
        catch (ParserConfigurationException pce) {
                    pce.printStackTrace();
            } 
        catch (TransformerException tfe) {
                    tfe.printStackTrace();
            }
    }
    
    
/**
 * This method lets the user input two ArrayLists and specify the file name of the XML using the private generateWithArraylists method. 
 * @param  NewNodeNamesList  An ArrayList of the Element names
 * @param  NewNodeTextstList  An ArrayList of the Text inside the Elements
 * @param  FileName Takes a string and sets it as the file name of the XML
 */
    
    
     public void generateXMLWithArrayLists(ArrayList<String> NewNodeNamesList, ArrayList<String> NewNodeTextstList, String FileName)
    {
        generateWithArraylists(NewNodeNamesList,NewNodeTextstList, FileName);
    }
     
     
     
     
/**
 * This method lets the user input two Arrays and specify the file name of the XML using the private generateWithArrays method. 
 * @param  NodeNames  An Array of the Element names
 * @param  NodeTexts  An Array of the Text inside the Elements
 * @param  FileName Takes a string and sets it as the file name of the XML
 */
     
    public void generateXMLWithArrays(String [] NodeNames,String [] NodeTexts, String FileName)
    {
        generateWithArrays(NodeNames,NodeTexts, FileName);
    }
    
    
    public String[] getNodeName() {
        return NodeName;
    }

    public void setNodeName(String[] NodeName) {
        this.NodeName = NodeName;
    }

    public String[] getNodeText() {
        return NodeText;
    }

    public void setNodeText(String[] NodeText) {
        this.NodeText = NodeText;
    }

    public ArrayList<String> getNodeNameList() {
        return NodeNameList;
    }

    public void setNodeNameList(ArrayList<String> NodeNameList) {
        this.NodeNameList = NodeNameList;
    }

    public ArrayList<String> getNodeTextList() {
        return NodeTextList;
    }

    public void setNodeTextList(ArrayList<String> NodeTextList) {
        this.NodeTextList = NodeTextList;
    }
    
}
