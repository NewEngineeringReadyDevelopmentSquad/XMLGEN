/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xmlgen;

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
    XMLGEN()
    {
    }
    XMLGEN(ArrayList<String> NodeName, ArrayList<String> NodeText, String filename)
    {
    }
    XMLGEN(String[] NodeName, String[] NodeText, String filename)
    {
    }
  
    
    
    public void generateWithArraylists(ArrayList<String> NodeName, ArrayList<String> NodeText, String filename){
        try {
              
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
            Document doc = docBuilder.newDocument();
            Element rootElement = doc.createElement("Course");
            doc.appendChild(rootElement);

                for (int i = 0; i <NodeName.size(); i++) {
                    Element e = doc.createElement(NodeName.get(i));
                    e.appendChild(doc.createTextNode(NodeText.get(i)));
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
    
    
    public void generateWithArrays(String[] NodeName, String[] NodeText, String filename){
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
    
}
