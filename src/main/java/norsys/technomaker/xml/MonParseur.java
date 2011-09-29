package norsys.technomaker.xml;

import java.io.File;
import java.util.Iterator;
import java.util.List;

import org.jdom.Document;
import org.jdom.input.SAXBuilder;

/**
 * Parseur XML.
 */
public class MonParseur {

	/**
	 * Point d'entr�e.
	 */
	public static void main(String[] args) throws Exception {

		File xmlFile = new File(Constante.XML_FILENAME);

		SAXBuilder builder = new SAXBuilder();
		Document document = builder.build(xmlFile);

		// On initialise un nouvel �l�ment racine avec l'�l�ment racine du
		// document.
		org.jdom.Element racine = document.getRootElement();

		// On cr�e une List contenant tous les noeuds "chien" de l'Element
		// racine
		List listChien = racine.getChild("chiens").getChildren();
		// On cr�e une List contenant tous les noeuds "chat" de l'Element
		// racine
		List listChat = racine.getChild("chats").getChildren();

		Iterator itChien = listChien.iterator();
		Iterator itChat = listChat.iterator();
		
		String nomChien = "";
		String nomsChats = "";
		/**
		 * parcourire la liste des chients 
		 * si le chient "C456789" et trouve en fai un break
		 */
		while (itChien.hasNext()) {
			org.jdom.Element element = (org.jdom.Element) itChien.next();
			// TODO Cette variable doit contenir le nom du chien "C456789"
			if ("C456789".equals(element.getAttribute("numeroCollier").getValue())){
				nomChien = element.getValue();
				break;
			}
		}
		/**
		 * parcourir la liste des chats
		 */
		while(itChat.hasNext()){
			org.jdom.Element element = (org.jdom.Element) itChat.next();
			// TODO Cette variable doit contenir les noms de tous les chats.
			nomsChats += element.getValue()+" ";
		}
		
		/**
		 * affichage de resultat
		 */
		System.out.println("Nom du chien #C456789 : " + nomChien);
		System.out.println("Noms des chats        : " + nomsChats);
	}
}
