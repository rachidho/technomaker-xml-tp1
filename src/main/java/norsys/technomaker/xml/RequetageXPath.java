package norsys.technomaker.xml;

import java.io.File;
import java.util.List;

import org.jdom.Document;
import org.jdom.input.SAXBuilder;
import org.jdom.xpath.XPath;

/**
 * Requetage XPath.
 */
public class RequetageXPath {


	/**
	 * Point d'entrée.
	 */
	public static void main(String[] args) throws Exception {

		File xmlFile = new File(Constante.XML_FILENAME);

		SAXBuilder builder = new SAXBuilder();
		Document document = builder.build(xmlFile);
		
		XPath xPathQuery = XPath.newInstance("//chien[@numeroCollier='C456789']");

		XPath xPathQuery1 = XPath.newInstance("//chats");
		
		// TODO Cette variable doit contenir le nom du chien "C456789"
		String nomChien = xPathQuery.valueOf(document.getRootElement());

		// TODO Cette variable doit contenir les noms de tous les chats.
		String nomsChats = xPathQuery1.valueOf(document.getRootElement());

		System.out.println("Nom du chien #C456789 : " + nomChien);
		System.out.println("Noms des chats        : " + nomsChats);
		
	}
	
	 

}
