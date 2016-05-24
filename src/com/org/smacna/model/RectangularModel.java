package com.org.smacna.model;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author <a href="mailto:vjoshiscs@gmail.com">Vishal Joshi</a>
 *
 * 
 */
@XmlRootElement
public class RectangularModel {

	RectangularModel() {

	}

	private Double width;

	private Double height;

	private Double pitch;

	private Double calculation;

	public Double getWidth() {
		return width;
	}

	public void setWidth(Double width) {
		this.width = width;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
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
