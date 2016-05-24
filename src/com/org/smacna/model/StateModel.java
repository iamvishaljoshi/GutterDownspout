package com.org.smacna.model;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
/**
 * @author <a href="mailto:vjoshiscs@gmail.com">Vishal Joshi</a>
 *
 * 
 */
@XmlRootElement(name = "states")
public class StateModel {
	
	private List<String> state;
	@XmlElement
	public List<String> getState() {
		return state;
	}
	public void setState(List<String> state) {
		this.state = state;
	}

	public static void main(String[] args) {}
}
