package com.org.smacna.resources;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.org.smacna.url.constants.URLConstants;

/**
 * @author <a href="mailto:vjoshiscs@gmail.com">Vishal Joshi</a>
 *
 * 
 */
@Path(URLConstants.GET_RAIN_INTENSITY)
public class RainIntensityResource {

	public static final String FILE_NAME = "Intensity.xml";
	public static final String CITY_TAG = "city";
	public static final String CATEGORY = "category";
	public static final String INTENSITY = "intensity";

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	@Path(URLConstants.GET_RAIN_INTENSITY_VALUE)
	public List<String> getRainIntensityValue(
			@QueryParam(value = "cityName") String cityName,
			@QueryParam(value = "stormYear") String stormYear) {

		List<String> rainIntensityValue = new ArrayList<String>();
		
		try {
			File file = new File(FILE_NAME);
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dbf.newDocumentBuilder();
			Document doc = db.parse(file);
			doc.getDocumentElement().normalize();
			NodeList nodeLst = doc.getElementsByTagName(CITY_TAG);
			for (int s = 0; s < nodeLst.getLength(); s++) {
				Node fstNode = nodeLst.item(s);
				if (fstNode.getNodeType() == Node.ELEMENT_NODE) {
					Element fstElmnt = (Element) fstNode;
					if (fstElmnt.getAttribute(CATEGORY).equalsIgnoreCase(
							cityName)) {
						NodeList fstNmElmntLst = fstNode.getChildNodes();
						fstElmnt.getChildNodes();
						int sz = fstNmElmntLst.getLength();

						for (int nodes = 0; nodes < sz; nodes++) {
							Node tempNode = fstNmElmntLst.item(nodes);
							if (tempNode.getNodeType() == Node.ELEMENT_NODE) {
								Element tmpElmnt = (Element) tempNode;
								String rainIntensity = tmpElmnt.getTextContent();
								if (tmpElmnt.getNodeName().equals(INTENSITY)
										&& tmpElmnt.getAttribute(CATEGORY)
												.equals(stormYear)) {
									rainIntensityValue.add(rainIntensity);
									return rainIntensityValue;
								}
							}
						}
					}
				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rainIntensityValue;

	}
}
