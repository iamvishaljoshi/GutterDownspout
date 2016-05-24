package com.org.smacna.model;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author <a href="mailto:vjoshiscs@gmail.com">Vishal Joshi</a>
 *
 * 
 */
@XmlRootElement
public class GutterModel {

	private Double noOfGutters;

	private Double minimumGutterWidth;

	private Double minimumGutterDepth;

	private Double rainIntensityAreaServed;

	private Double minimumGutterWidthHalfRound;

	private Double totalDesignArea;

	private Double minWidhtToDepthRatio;

	private Double maxGutterSection;

	private Double rainIntensity;

	public Double getRainIntensity() {
		return rainIntensity;
	}

	public void setRainIntensity(Double rainIntensity) {
		this.rainIntensity = rainIntensity;
	}

	public Double getNoOfGutters() {
		return noOfGutters;
	}

	public void setNoOfGutters(Double noOfGutters) {
		this.noOfGutters = noOfGutters;
	}

	public Double getMinimumGutterWidth() {
		return minimumGutterWidth;
	}

	public void setMinimumGutterWidth(Double minimumGutterWidth) {
		this.minimumGutterWidth = minimumGutterWidth;
	}

	public Double getMinimumGutterDepth() {
		return minimumGutterDepth;
	}

	public void setMinimumGutterDepth(Double minimumGutterDepth) {
		this.minimumGutterDepth = minimumGutterDepth;
	}

	public Double getRainIntensityAreaServed() {
		return rainIntensityAreaServed;
	}

	public void setRainIntensityAreaServed(Double rainIntensityAreaServed) {
		this.rainIntensityAreaServed = rainIntensityAreaServed;
	}

	public Double getMinimumGutterWidthHalfRound() {
		return minimumGutterWidthHalfRound;
	}

	public void setMinimumGutterWidthHalfRound(
			Double minimumGutterWidthHalfRound) {
		this.minimumGutterWidthHalfRound = minimumGutterWidthHalfRound;
	}

	public Double getTotalDesignArea() {
		return totalDesignArea;
	}

	public void setTotalDesignArea(Double totalDesignArea) {
		this.totalDesignArea = totalDesignArea;
	}

	public Double getMinWidhtToDepthRatio() {
		return minWidhtToDepthRatio;
	}

	public void setMinWidhtToDepthRatio(Double minWidhtToDepthRatio) {
		this.minWidhtToDepthRatio = minWidhtToDepthRatio;
	}

	public Double getMaxGutterSection() {
		return maxGutterSection;
	}

	public void setMaxGutterSection(Double maxGutterSection) {
		this.maxGutterSection = maxGutterSection;
	}

}
