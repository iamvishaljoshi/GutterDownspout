package com.org.smacna.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.org.smacna.model.WallModel;
import com.org.smacna.url.constants.URLConstants;

/**
 * @author <a href="mailto:vjoshiscs@gmail.com">Vishal Joshi</a>
 *
 * 
 */
@Path(URLConstants.CALCULATION_FOR_WALLS)
public class WallCalculationResource {

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path(URLConstants.CALCULATION_FOR_WALL)
	public WallModel calculationForWall(WallModel wallModel) {
		if (wallModel != null) {
			Double calculationOfWall = wallModel.getLength()
					* wallModel.getHeight();
			wallModel.setCalculation(calculationOfWall);

			Double totalWallArea = wallModel.getCalculation() * 0.5;
			wallModel.setTotalWallArea(totalWallArea);

		}

		return wallModel;
	}

}
