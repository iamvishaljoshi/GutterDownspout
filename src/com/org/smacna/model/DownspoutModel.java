package com.org.smacna.model;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author <a href="mailto:vjoshiscs@gmail.com">Vishal Joshi</a>
 *
 * 
 */
@XmlRootElement
public class DownspoutModel {

	private Double noOfDownspout;

	private Double drainageFactor;

	private Double minimumAreaOfEachDownSpout;

	private Double minDiameterOfDownspout;

	private Double rainIntensity;

	private Double totalDesignArea;

	public Double getNoOfDownspout() {
		return noOfDownspout;
	}

	public void setNoOfDownspout(Double noOfDownspout) {
		this.noOfDownspout = noOfDownspout;
	}

	public Double getDrainageFactor() {
		return drainageFactor;
	}

	public void setDrainageFactor(Double drainageFactor) {
		this.drainageFactor = drainageFactor;
	}

	public Double getMinimumAreaOfEachDownSpout() {
		return minimumAreaOfEachDownSpout;
	}

	public void setMinimumAreaOfEachDownSpout(Double minimumAreaOfEachDownSpout) {
		this.minimumAreaOfEachDownSpout = minimumAreaOfEachDownSpout;
	}

	public Double getMinDiameterOfDownspout() {
		return minDiameterOfDownspout;
	}

	public void setMinDiameterOfDownspout(Double minDiameterOfDownspout) {
		this.minDiameterOfDownspout = minDiameterOfDownspout;
	}

	public Double getRainIntensity() {
		return rainIntensity;
	}

	public void setRainIntensity(Double rainIntensity) {
		this.rainIntensity = rainIntensity;
	}

	public Double getTotalDesignArea() {
		return totalDesignArea;
	}

	public void setTotalDesignArea(Double totalDesignArea) {
		this.totalDesignArea = totalDesignArea;
	}

}
