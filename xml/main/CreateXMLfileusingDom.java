package com.htc.xml.main;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

public class CreateXMLfileusingDom {
public static void main(String[] args) {
	DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance();
	DocumentBuilder builder = null;
try {
builder=factory.newDocumentBuilder();
} catch (ParserConfigurationException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
	
	Document document=builder.newDocument();
	Element rootelement=document.createElement("products");
	Element parentelement=document.createElement("product");
	Element productId=document.createElement("productId");
	Element description=document.createElement("productDesc");
	Element price=document.createElement("price");
	
	Text t1=document.createTextNode("P1345");
	Text t2=document.createTextNode("pen");
	Text t3=document.createTextNode("20.50");
	
	
	productId.appendChild(t1);
	description.appendChild(t2);
	price.appendChild(t3);
	
	parentelement.appendChild(productId);
	parentelement.appendChild(description);
	parentelement.appendChild(price);
	
	rootelement.appendChild(parentelement);
	document.appendChild(rootelement);
	Transformer t = null;
	try {
		 t=TransformerFactory.newInstance().newTransformer();
	} catch (TransformerConfigurationException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (TransformerFactoryConfigurationError e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try {
		t.transform(new DOMSource(document), new StreamResult(new FileOutputStream("D:\\product.xml")));
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (TransformerException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("XML file has been created");
	
	
	
}
}
