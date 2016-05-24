package com.org.smacna.resources;

import java.math.BigDecimal;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.org.smacna.model.DownspoutModel;
import com.org.smacna.url.constants.URLConstants;

/**
 * 
 * @author <a href="mailto:vjoshiscs@gmail.com">Vishal Joshi</a>
 *
 *
 */
@Path(URLConstants.CALCULATION_FOR_DOWNSPOUTS)
public class DownspoutCalculationResource {

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path(URLConstants.CALCULATION_FOR_DOWNSPOUT)
	public DownspoutModel calculationForDownspout(DownspoutModel downspoutModel) {
		if (downspoutModel != null) {
			Double drainageFactor = (12.5 * 96.23)
					/ downspoutModel.getRainIntensity();
			downspoutModel.setDrainageFactor(drainageFactor);

			// Minimum area of each downspout

			Double minimumAreaOfEachDownSpout = ((downspoutModel
					.getTotalDesignArea() / downspoutModel.getNoOfDownspout()) / downspoutModel
					.getDrainageFactor());
			minimumAreaOfEachDownSpout = new BigDecimal(
					minimumAreaOfEachDownSpout)
					.setScale(9, BigDecimal.ROUND_UP).doubleValue();

			downspoutModel
					.setMinimumAreaOfEachDownSpout(minimumAreaOfEachDownSpout);

			// Minimum Diameter of Downspout

			Double minDiameterOfDownspout = Math.ceil(Math
					.sqrt(minimumAreaOfEachDownSpout * 4 / 3.14));

			downspoutModel.setMinDiameterOfDownspout(minDiameterOfDownspout);

		}

		return downspoutModel;

	}

}
