package com.org.smacna.resources;

import java.math.BigDecimal;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.org.smacna.model.CircleModel;
import com.org.smacna.model.RectangularModel;
import com.org.smacna.model.SectorModel;
import com.org.smacna.model.TrapezoidModel;
import com.org.smacna.model.TriangleModel;
import com.org.smacna.url.constants.URLConstants;

/**
 * @author <a href="mailto:vjoshiscs@gmail.com">Vishal Joshi</a>
 *
 * 
 */
@Path(URLConstants.CALCULATION_FOR_SHAPES)
public class CalculationResource {

	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	@Path(URLConstants.CALCULATION_FOR_RECTANGULAR_SHAPE)
	/**
	 * 
	 * @param rectangularModel
	 * @return
	 */
	public RectangularModel calculationforRectangularShape(
			RectangularModel rectangularModel) {
		if (rectangularModel != null) {
			Double rectangularShape = rectangularModel.getWidth()
					* rectangularModel.getHeight()
					* (Math.sqrt(Math.pow(rectangularModel.getPitch() / 12, 2) + 1));

			rectangularModel.setCalculation(rectangularShape);
		}
		return rectangularModel;
	}

	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	@Path(URLConstants.CALCULATION_FOR_TRIANGLE_SHAPE)
	/**
	 * 
	 * @param triangleModel
	 * @return
	 */
	public TriangleModel calculationForTriangleShape(TriangleModel triangleModel) {
		if (triangleModel != null) {
			Double output = triangleModel.getHeightInFt()
					* triangleModel.getBaseInft() * 0.5;
			Double o = (Math
					.sqrt(Math.pow(triangleModel.getPitch() / 12, 2) + 1));
			// System.out.println(o);
			BigDecimal bd = new BigDecimal(o);
			bd = bd.setScale(1, BigDecimal.ROUND_DOWN);
			o = bd.doubleValue();
			// System.out.println(o);
			Double calculationOfTriangle = output * o;
			triangleModel.setCalculation(calculationOfTriangle);
		}
		return triangleModel;
	}

	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	@Path(URLConstants.CALCULATION_FOR_TRAPEZOID_SHAPE)
	/**
	 * 
	 * @param trapezoidModel
	 * @return
	 */
	public TrapezoidModel calculationForTrapezoidShape(
			TrapezoidModel trapezoidModel) {

		if (trapezoidModel != null) {

			// =(B40+B41)*B42*0.5*ROUND(SQRT((B43/12)^(2)+1),1)
			Double outPut = (trapezoidModel.getTopEdgeInFt() + trapezoidModel
					.getBottomEdgeInFt())
					* trapezoidModel.getHeightInFt()
					* 0.5;
			Double o = (Math
					.sqrt(Math.pow(trapezoidModel.getPitch() / 12, 2) + 1));
			BigDecimal bd = new BigDecimal(o);
			bd = bd.setScale(1, BigDecimal.ROUND_DOWN);
			o = bd.doubleValue();

			Double calculationOfTrapezoid = o * outPut;
			trapezoidModel.setCalculation(calculationOfTrapezoid);

		}

		return trapezoidModel;
	}

	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	/**
	 * 
	 * @param sectorModel
	 * @return
	 */
	@Path(URLConstants.CALCULATION_FOR_SECTOR_SHAPE)
	public SectorModel calculationForSectorShape(SectorModel sectorModel) {
		if (sectorModel != null) {

			// =0.5*((B47*PI()*0.00555555)*B48^2)*ROUND(SQRT((B49/12)^(2)+1),1)

			Double output = 0.5 * ((sectorModel.getAngle()
					* new BigDecimal(Math.PI).setScale(9, BigDecimal.ROUND_UP)
							.doubleValue() * 0.00555555) * Math.pow(
					sectorModel.getRadius(), 2));
			Double o = (Math.sqrt(Math.pow(sectorModel.getPitch() / 12, 2) + 1));
			BigDecimal bd = new BigDecimal(o);
			bd = bd.setScale(1, BigDecimal.ROUND_HALF_DOWN);
			o = bd.doubleValue();
			Double calculationOfSector = output * o;
			sectorModel.setCalculation(calculationOfSector);
		}
		return sectorModel;
	}

	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	@Path(URLConstants.CALCULATION_FOR_CIRCLE_SHAPE)
	/**
	 * 
	 * @param circleModel
	 * @return
	 */
	public CircleModel calculationForSectorShape(CircleModel circleModel) {
		if (circleModel != null) {
			// =PI()*B53^2*ROUND(SQRT((B54/12)^(2)+1),1)
			Double pi = new BigDecimal(Math.PI)
					.setScale(9, BigDecimal.ROUND_UP).doubleValue();
			Double output = pi * Math.pow(circleModel.getRadious(), 2);
			Double o = (Math.sqrt(Math.pow(circleModel.getPitch() / 12, 2) + 1));
			BigDecimal bd = new BigDecimal(o);
			bd = bd.setScale(1, BigDecimal.ROUND_HALF_DOWN);
			o = bd.doubleValue();
			Double calculationOfCircle = output * o;
			circleModel.setCalculation(calculationOfCircle);

		}
		return circleModel;
	}
}
