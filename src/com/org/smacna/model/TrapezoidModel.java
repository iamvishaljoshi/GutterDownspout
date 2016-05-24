package com.org.smacna.model;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author <a href="mailto:vjoshiscs@gmail.com">Vishal Joshi</a>
 *
 * 
 */
@XmlRootElement
public class TrapezoidModel {

	private Double topEdgeInFt;

	private Double bottomEdgeInFt;

	private Double heightInFt;

	private Double pitch;

	private Double calculation;

	public Double getTopEdgeInFt() {
		return topEdgeInFt;
	}

	public void setTopEdgeInFt(Double topEdgeInFt) {
		this.topEdgeInFt = topEdgeInFt;
	}

	public Double getBottomEdgeInFt() {
		return bottomEdgeInFt;
	}

	public void setBottomEdgeInFt(Double bottomEdgeInFt) {
		this.bottomEdgeInFt = bottomEdgeInFt;
	}

	public Double getHeightInFt() {
		return heightInFt;
	}

	public void setHeightInFt(Double heightInFt) {
		this.heightInFt = heightInFt;
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
