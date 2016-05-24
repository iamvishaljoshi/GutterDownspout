package com.org.smacna.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ShapeCalculationModel {

	private double cirlcleShape;

	private double rectangularShape;

	private double triangleShape;

	private double trapezoidShape;

	private double sectorShape;

	private double totalRoofArea;

	public double getTotalRoofArea() {
		
		this.totalRoofArea = 
		 this.getCirlcleShape() + this.getRectangularShape()
				+ this.getSectorShape() + this.getTrapezoidShape()
				+ this.getTriangleShape();
		
		return totalRoofArea;
	}

	public void setTotalRoofArea(double totalRoofArea) {
		this.totalRoofArea = totalRoofArea;
	}

	public double getCirlcleShape() {
		return cirlcleShape;
	}

	public void setCirlcleShape(double cirlcleShape) {
		this.cirlcleShape = cirlcleShape;
	}

	public double getRectangularShape() {
		return rectangularShape;
	}

	public void setRectangularShape(double rectangularShape) {
		this.rectangularShape = rectangularShape;
	}

	public double getTriangleShape() {
		return triangleShape;
	}

	public void setTriangleShape(double triangleShape) {
		this.triangleShape = triangleShape;
	}

	public double getTrapezoidShape() {
		return trapezoidShape;
	}

	public void setTrapezoidShape(double trapezoidShape) {
		this.trapezoidShape = trapezoidShape;
	}

	public double getSectorShape() {
		return sectorShape;
	}

	public void setSectorShape(double sectorShape) {
		this.sectorShape = sectorShape;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "RectangularShape :: " + rectangularShape + " TriangleShape :: "
				+ triangleShape + " TrapezoidShape :: " + trapezoidShape
				+ " SectorShape :: " + sectorShape + " CircleShape :: "
				+ cirlcleShape + " Total Roof Area :: " + getTotalRoofArea();
	}

}
