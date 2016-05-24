package com.org.smacna.resources;

import java.math.BigDecimal;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.org.smacna.model.GutterModel;
import com.org.smacna.url.constants.URLConstants;
/**
 * 
 * @author <a href="mailto:vjoshiscs@gmail.com">Vishal Joshi</a>
 *
 *
 */
@Path(URLConstants.CALCULATION_FOR_GUTTERS)
public class GutterCalculationResource {

	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	@Path(URLConstants.CALCULATION_FOR_GUTTER)
	public GutterModel calculationForGutter(GutterModel gutterModel){
		if(gutterModel!=null){
			// rain Intensity Area Served 

			Double rainIntensityAreaServed = gutterModel.getRainIntensity()
					* (gutterModel.getTotalDesignArea() / gutterModel.getNoOfGutters());
			gutterModel.setRainIntensityAreaServed(rainIntensityAreaServed);
			
			// minimum Gutter Width

			// ROUNDUP(0.1272*(B79^(-4/7))*(B78^(3/28))*(B94^(5/14)),0)

			Double minimumGutterWidth = Math.ceil(0.1272
					* Math.pow(gutterModel.getMinWidhtToDepthRatio(), (-4f / 7f))
					* Math.pow(gutterModel.getMaxGutterSection(), (3f / 28f))
					* Math.pow(rainIntensityAreaServed, (5f / 14f)));

			gutterModel.setMinimumGutterWidth(minimumGutterWidth);
		
			// minimum Gutter Depth
			Double minimumGutterDepth = minimumGutterWidth * gutterModel.getMinWidhtToDepthRatio();
			gutterModel.setMinimumGutterDepth(minimumGutterDepth);
			
			// minimum Gutter Width Half Round


			Double minimumGutterWidthHalfRound = 0.2184 * Math.pow(
					gutterModel.getRainIntensityAreaServed(), (2f / 5f));
			minimumGutterWidthHalfRound = new BigDecimal(minimumGutterWidthHalfRound)
					.setScale(2, BigDecimal.ROUND_UP).doubleValue();

			gutterModel.setMinimumGutterWidthHalfRound(minimumGutterWidthHalfRound);
		
		}
		return gutterModel;
	}
}
