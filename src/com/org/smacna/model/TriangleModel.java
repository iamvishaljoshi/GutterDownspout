package com.org.smacna.model;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author <a href="mailto:vjoshiscs@gmail.com">Vishal Joshi</a>
 *
 * 
 */
@XmlRootElement
public class TriangleModel {

	private Double heightInFt;

	private Double baseInft;

	private Double pitch;

	private Double calculation;

	public Double getHeightInFt() {
		return heightInFt;
	}

	public void setHeightInFt(Double heightInFt) {
		this.heightInFt = heightInFt;
	}

	public Double getBaseInft() {
		return baseInft;
	}

	public void setBaseInft(Double baseInft) {
		this.baseInft = baseInft;
	}

	public Double getPitch() {
		return pitch;
	}

	public void setPitch(Double pitch) {
		this.pitch = pitch;
	}

	public Double getCalculation() {
		return calculation;
	}

	public void setCalculation(Double calculation) {
		this.calculation = calculation;
	}

}
