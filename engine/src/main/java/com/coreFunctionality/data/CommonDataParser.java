package com.coreFunctionality.data;

import java.io.IOException;
import java.io.StringReader;
import java.util.HashMap;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import xmlhandler.XmlFileReader;

/**
 * Created by Dmitry on 08.07.2016.
 */
public class CommonDataParser<K, V>
{
	private XmlFileReader xmlReader = new XmlFileReader();

	/**
	 * Used to build document via Builder moved externally - could be used when different Data should be converted Moved
	 * to core as there is possibility to extend functionality - to support different typs of charsheets and etc.
	 *
	 * @param data - uses provided document to build
	 * @return
	 * @throws ParserConfigurationException
	 * @throws IOException
	 * @throws SAXException
	 */
	private Document buildDocument(String data) throws ParserConfigurationException, IOException, SAXException
	{
		DocumentBuilder builder =
				DocumentBuilderFactory.newInstance().newDocumentBuilder();
		Document doc = builder.parse(new InputSource(new StringReader(data)));
		doc.getDocumentElement().normalize();
		return doc;
	}

	/**
	 * Currently converts data to HashMap - to be used if different types of data should be extracted
	 *
	 * @param path - converts data to hashmap
	 * @return
	 * @throws NoSuchMethodException
	 * @throws IOException
	 * @throws SAXException
	 * @throws ParserConfigurationException
	 */
	public HashMap<String, String> convertDataFromXml(String path, String nodeTag, String locatorTag, String infoTag)
			throws NoSuchMethodException, IOException, SAXException, ParserConfigurationException
	{
		HashMap<String, String> dataMap = new HashMap<String, String>();
		String data = xmlReader.getXmlFileContents(path);
		NodeList nodeList = buildDocument(data).getFirstChild().getChildNodes();
		for (int temp = 0; temp < nodeList.getLength(); temp++)
		{
			Node node = nodeList.item(temp);
			if (node.getNodeName().equals(nodeTag) && node.getNodeType() == Node.ELEMENT_NODE)
			{
				Element eElement = (Element) node;
				dataMap.put(eElement.getElementsByTagName(locatorTag).item(0).getTextContent(),
						eElement.getElementsByTagName(infoTag).item(0).getTextContent());
			}
		}
		return dataMap;
	}

	public String convertDataToXml(HashMap<K, V> map, String nodeTag, String locatorTag, String infoTag)
	{
		//TODO: conversion of hashmaps to string goes here
		return "";
	}
}
