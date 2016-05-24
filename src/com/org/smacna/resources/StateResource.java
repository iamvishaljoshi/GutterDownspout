package com.org.smacna.resources;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.org.smacna.model.StateModel;
import com.org.smacna.url.constants.URLConstants;

/**
 * @author <a href="mailto:vjoshiscs@gmail.com">Vishal Joshi</a>
 *
 * 
 */
@Path(URLConstants.GET_STATE)
public class StateResource {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	@Path(URLConstants.GET_STATE_LIST)
	public List<String> getStateList(){
		List<String> stateList = new ArrayList<String>();
		try {
			
		File file = new File("State.xml");  
	      JAXBContext jaxbContext = JAXBContext.newInstance(StateModel.class);
	      Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();  
	      StateModel state= (StateModel) jaxbUnmarshaller.unmarshal(file); 
	      stateList = state.getState();
		} catch (JAXBException e) {  
	        e.printStackTrace();  
	      }  
	
		return stateList;
	}
	

}
