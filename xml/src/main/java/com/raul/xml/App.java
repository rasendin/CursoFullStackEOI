package com.raul.xml;

import java.io.File;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.raul.xml.entidades.Asignatura;
import com.raul.xml.entidades.NoticiaMarca;
import com.raul.xml.entidades.NoticiaSensacine;
import com.raul.xml.utilidades.InternetUtils;


public class App 
{
	
	public static void leerXmlFichero(String nombreFichero) {
		try {
			File inputFile = new File(nombreFichero);
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(inputFile);  // Comprueba que es un XML valido
			doc.getDocumentElement().normalize();
			System.out.println("Elemento base : " + doc.getDocumentElement().getNodeName());
			NodeList nList = doc.getElementsByTagName("asignatura");
			System.out.println();
			System.out.println("Recorriendo asignaturas...");
			for (int temp = 0; temp < nList.getLength(); temp++) {
				Node nNode = nList.item(temp);
				if (nNode.getNodeType() == Node.ELEMENT_NODE) {
					Element eElement = (Element) nNode;
					System.out.println("Codigo: " + eElement.getAttribute("id"));
					System.out.println("Nombre: " + eElement.getElementsByTagName("nombre").item(0).getTextContent());
					System.out.println(
							"Ciclo: " + eElement.getElementsByTagName("cicloFormativo").item(0).getTextContent());
					System.out.println("Curso: " + eElement.getElementsByTagName("curso").item(0).getTextContent());
					System.out
							.println("Profesor: " + eElement.getElementsByTagName("profesor").item(0).getTextContent());
					System.out.println();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	

	
	public static List<Asignatura> devolverAsignaturas(String nombreFichero) {
		List<Asignatura> resultado = new ArrayList<>();
		try {
			File inputFile = new File(nombreFichero);
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(inputFile);  // Comprueba que es un XML valido
			doc.getDocumentElement().normalize();
			
			NodeList nList = doc.getElementsByTagName("asignatura");
			
			for (int temp = 0; temp < nList.getLength(); temp++) {  // recorre las asignaturas
				Node nNode = nList.item(temp);
				if (nNode.getNodeType() == Node.ELEMENT_NODE) {
					Element eElement = (Element) nNode;
					// añado cada asignatura a la lista
					resultado.add(new Asignatura(
							eElement.getAttribute("id"),
							eElement.getElementsByTagName("nombre").item(0).getTextContent(),
							eElement.getElementsByTagName("cicloFormativo").item(0).getTextContent(),
							eElement.getElementsByTagName("curso").item(0).getTextContent(),
							eElement.getElementsByTagName("profesor").item(0).getTextContent()					
							));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return resultado;
		
	}
	
	public static List<NoticiaMarca> devolverNoticiasMarca(String web) {
		List<NoticiaMarca> resultado = new ArrayList<>();
		try {
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(web);  // Comprueba que es un XML valido
			doc.getDocumentElement().normalize();
			
			NodeList nList = doc.getElementsByTagName("item");
			
			for (int temp = 0; temp < nList.getLength(); temp++) {  // recorre las asignaturas
				Node nNode = nList.item(temp);
				if (nNode.getNodeType() == Node.ELEMENT_NODE) {
					Element eElement = (Element) nNode;
					// añado cada asignatura a la lista
					resultado.add(new NoticiaMarca(
							eElement.getElementsByTagName("title").item(0).getTextContent(),
							eElement.getElementsByTagName("description").item(0).getTextContent(),
							(eElement.getElementsByTagName("dc:creator").getLength()>0)?eElement.getElementsByTagName("dc:creator").item(0).getTextContent():"",
							eElement.getElementsByTagName("guid").item(0).getTextContent(),
							eElement.getElementsByTagName("pubDate").item(0).getTextContent()					
							));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return resultado;
		
	}
	
	public static List<NoticiaSensacine> devolverNoticiasSensacine(String web) {
		List<NoticiaSensacine> resultado = new ArrayList<>();
		try {
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(web);  // Comprueba que es un XML valido
			doc.getDocumentElement().normalize();
			
			NodeList nList = doc.getElementsByTagName("item");
			
			for (int temp = 0; temp < nList.getLength(); temp++) {  // recorre las asignaturas
				Node nNode = nList.item(temp);
				if (nNode.getNodeType() == Node.ELEMENT_NODE) {
					Element eElement = (Element) nNode;
					// añado cada asignatura a la lista
					resultado.add(new NoticiaSensacine(
							eElement.getElementsByTagName("category").item(0).getTextContent(),
							eElement.getElementsByTagName("title").item(0).getTextContent(),
							eElement.getElementsByTagName("description").item(0).getTextContent(),
							eElement.getElementsByTagName("author").item(0).getAttributes().getNamedItem("name").getTextContent(),
							eElement.getElementsByTagName("guid").item(0).getTextContent(),
							LocalDate.parse(eElement.getElementsByTagName("pubDate").item(0).getTextContent(),DateTimeFormatter.RFC_1123_DATE_TIME)					
							));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return resultado;
		
	}

	
	
    public static void main( String[] args )
    {
    	Scanner sc = new Scanner(System.in);
        //leerXmlFichero("asignaturas.xml");
    	/*List<Asignatura> asignaturas = devolverAsignaturas("asignaturas.xml");
    	asignaturas.stream()
    		.filter(e->e.getCurso().equals("Segundo"))
    		.forEach(e->System.out.println(e));*/
    	
    	/*
    	List<NoticiaMarca> noticias = devolverNoticiasMarca("https://e00-marca.uecdn.es/rss/futbol/futbol-femenino.xml");
    	//noticias.forEach(e->System.out.println(e));
    	noticias.addAll(devolverNoticiasMarca("https://e00-marca.uecdn.es/rss/futbol/primera-division.xml"));
    	noticias.addAll(devolverNoticiasMarca("https://e00-elmundo.uecdn.es/elmundo/rss/portada.xml"));
    	noticias.addAll(devolverNoticiasMarca("https://www.informacion.es/rss/section/7034"));
    	System.out.println("Introduzca el filtro para las noticias:");
    	String filtro = sc.nextLine();
    	noticias.stream()
    		.filter(e->e.getTitle().contains(filtro))
    		.forEach(e->System.out.println(e.getTitle()));
    	*/
    	
    	/*
    	List<NoticiaSensacine> noticias = devolverNoticiasSensacine("https://www.sensacine.com/rss/noticias.xml");
    	noticias.stream()
    	//.filter(e->e.getPubDate().equals(LocalDate.now().minusDays(1)))   // Coge las noticias de ayer 	
    	.filter(e->e.getPubDate().equals(LocalDate.now()))   // Coge las noticias de hoy 	
    	.forEach(e->System.out.println(e));
    	*/
    	
    	List<String> lineasHtml = InternetUtils.readUrlList("https://www.chollometro.com/");
    	lineasHtml.stream()
    		.forEach(e->System.out.println(e));
    	
    	
    	sc.close();
    		    	
    }
}