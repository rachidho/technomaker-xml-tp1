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
	 * Point d'entr�e.
	 */
	public static void main(String[] args) throws Exception {

		File xmlFile = new File(Constante.XML_FILENAME);

		SAXBuilder builder = new SAXBuilder();
		Document document = builder.build(xmlFile);

		XPath xPathQuery = XPath
				.newInstance("//chien[@numeroCollier='C456789']");

		XPath xPathQuery1 = XPath.newInstance("//chats");

		// TODO Cette variable doit contenir le nom du chien "C456789"
		String nomChien = xPathQuery.valueOf(document.getRootElement());

		// TODO Cette variable doit contenir les noms de tous les chats.
		String nomsChats = xPathQuery1.valueOf(document.getRootElement());

		System.out.println("Nom du chien #C456789 : " + nomChien);
		System.out.println("Noms des chats        : " + nomsChats);

	}

	/**
	 * Avez-vous identifier tous les composants ? Balises ? Attributs ? = oui
	 */
	/**
	 * Quels sont leurs r�les ? 
	 * - Balises : stocker l'information 
	 * - Attributs : stocker l'information mais la balise peux contenir des attribut 
	 * - composants : 
	 */
	/**
	 * En quoi la validation du sch�ma peut �tre utile ? pour notre
	 * fichier xml soi en bon format
	 */
	
	/**
	 * Que pensez vous de cette m�thode de r�cup�ration ? 
	 * simple et efficace l'horcequ'on a un fichier avec un petite taille contrirement si on a un
	 * fichier avec une grande taille, en generale n'est pas adapte a recuperation d'un seul donnee
	 */
	/**
	 * Que se passe-t-il si le sch�ma XML change ?
	 * 
	 */
	
	/**
	 * Que pensez vous de cette m�thode de r�cup�ration ?
	 * utile et facile 
	 */

}
