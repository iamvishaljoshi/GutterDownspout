package com.org.smacna.model;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author <a href="mailto:vjoshiscs@gmail.com">Vishal Joshi</a>
 *
 * 
 */
@XmlRootElement
public class WallModel {

	private Double length;

	private Double height;

	private Double calculation;

	private Double totalWallArea;

	private Double totalRoofArea;

	public Double getLength() {
		return length;
	}

	public void setLength(Double length) {
		this.length = length;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	public Double getTotalWallArea() {
		return totalWallArea;
	}

	public void setTotalWallArea(Double totalWallArea) {
		this.totalWallArea = totalWallArea;
	}

	public Double getTotalRoofArea() {
		return totalRoofArea;
	}

	public void setTotalRoofArea(Double totalRoofArea) {
		this.totalRoofArea = totalRoofArea;
	}

	public Double getCalculation() {
		return calculation;
	}

	public void setCalculation(Double calculation) {
		this.calculation = calculation;
	}

}
