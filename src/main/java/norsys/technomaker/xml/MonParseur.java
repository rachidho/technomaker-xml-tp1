package norsys.technomaker.xml;

import java.io.File;
import java.util.Iterator;
import java.util.List;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;

/**
 * Parseur XML.
 */
public class MonParseur {

	/**
	 * Point d'entrée.
	 */
	public static void main(String[] args) throws Exception {

		File xmlFile = new File(Constante.XML_FILENAME);

		SAXBuilder builder = new SAXBuilder();
		Document document = builder.build(xmlFile);

		// On initialise un nouvel élément racine avec l'élément racine du
		// document.
		Element racine = document.getRootElement();

		// On crée une List contenant tous les noeuds "chien" de l'Element
		// chiens
		List<Element> listChien = racine.getChild("chiens").getChildren();
		// On crée une List contenant tous les noeuds "chat" de l'Element
		// chats
		List<Element> listChat = racine.getChild("chats").getChildren();

		String nomChien = "";
		String nomsChats = "";

		/**
		 * parcourire la liste des chients si le chient "C456789" et trouve en
		 * fai un break
		 */
		for (Element element : listChien) {
			// TODO Cette variable doit contenir le nom du chien "C456789"
			if ("C456789".equals(element.getAttribute("numeroCollier")
					.getValue())) {
				nomChien = element.getValue();
				break;
			}
		}

		/**
		 * parcourir la liste des chats
		 */
		for (Element element : listChat) {
			// TODO Cette variable doit contenir les noms de tous les chats.
			nomsChats += element.getValue() + " ";
		}

		/**
		 * affichage de resultat
		 */
		System.out.println("Nom du chien #C456789 : " + nomChien);
		System.out.println("Noms des chats        : " + nomsChats);
	}
}
