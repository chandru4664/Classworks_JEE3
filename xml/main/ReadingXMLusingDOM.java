package com.htc.xml.main;

import java.io.IOException;


import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class ReadingXMLusingDOM {
	public static void main(String[] args) {
		DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = null;
 try {
	builder=factory.newDocumentBuilder();
} catch (ParserConfigurationException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
 Document doc = null;
 try {
	 doc=builder.parse("src\\student.xml");
} catch (SAXException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
 System.out.println("PArsed");
 NodeList studentList=doc.getElementsByTagName("student");
 System.out.println("no.of records"+studentList.getLength());
 
 
 
 for (int i = 0; i < studentList.getLength(); i++) {
	
	 Node parentNode=studentList.item(i);
	 if(parentNode.getNodeType()==Node.ELEMENT_NODE)
	 {
		 Element student=(Element)parentNode;
		 String studentId=student.getAttribute("id");
		 NodeList childList=student.getChildNodes();
		 for (int j = 0; j < childList.getLength(); j++) {
			Node child=childList.item(j);
			if(child.getNodeType()==Node.ELEMENT_NODE)
			{
				Element childStudent=(Element)child;
				//System.out.println( "student id"+studentId);
				System.out.println("Child record"+childStudent.getTagName()+"="+childStudent.getTextContent());
				
			}
			}
		}
	 }
}
 
 
	}


