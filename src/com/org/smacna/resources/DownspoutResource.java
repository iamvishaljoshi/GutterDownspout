package com.org.smacna.resources;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.org.smacna.model.DownspoutModel;
import com.org.smacna.url.constants.URLConstants;

/**
 * @author <a href="mailto:vjoshiscs@gmail.com">Vishal Joshi</a>
 *
 * 
 */
@Path(URLConstants.GET_DOWNSPOUT)
public class DownspoutResource {
	
	public static final String FILE_NAME = "Downspouts.xml";
	public static final String STATE_TAG = "downspout";
	public static final String CATEGORY = "category";
	public static final String CITY = "city";

	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	@Path(URLConstants.GET_DOWNSPOUT_LIST)
	public List<String> getDownspoutList(DownspoutModel downspoutModel) {

if(downspoutModel.getMinimumAreaOfEachDownSpout()!=null){
		List<String> downspoutList = new ArrayList<String>();
		try {
			File file = new File(FILE_NAME);
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dbf.newDocumentBuilder();
			Document doc = db.parse(file);
			doc.getDocumentElement().normalize();
			NodeList nodeLst = doc.getElementsByTagName(STATE_TAG);
			for (int s = 0; s < nodeLst.getLength(); s++) {
				Node fstNode = nodeLst.item(s);
				if (fstNode.getNodeType() == Node.ELEMENT_NODE) {
					Element fstElmnt = (Element) fstNode;
					if (Double.valueOf(fstElmnt.getAttribute(CATEGORY))>=(
							downspoutModel.getMinimumAreaOfEachDownSpout())) {
						NodeList fstNmElmntLst = fstNode.getChildNodes();
						fstElmnt.getChildNodes();
						int sz = fstNmElmntLst.getLength();

						for (int nodes = 0; nodes < sz; nodes++) {
							Node tempNode = fstNmElmntLst.item(nodes);
							downspoutList.add(tempNode.getTextContent());
						}
					}
				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return downspoutList;
}

return null;
	
	}
	
}
