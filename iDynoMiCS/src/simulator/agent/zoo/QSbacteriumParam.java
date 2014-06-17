package simulator.agent.zoo;

import simulator.agent.zoo.*;
import simulator.Simulator;
import utils.XMLParser;

public class QSbacteriumParam extends BacteriumParam{
	
	public boolean activatedQS = true;
	
	/* ---- define default internal parameters ---- */
	/* saturation coefficients and constants*/
	public double[] K = new double[12];						// General sat. coeffs
	public double Kr = 0;									// LasR sat. coeff
	public double Ka = 0;									// AI sat. coeff
	public double Kqsi3 = 0;								// QSI3 sat. coeff
	public double Kh = 0;									// Hydrolysis reaction rate
	public double g = 0;									// Michaelis-Menten kinetics coeff
	
	/* basal production rates */
	public double Cr = 0;		// LasR
	public double Ca = 0;		// AI
	
	/* intracellular concentrations */
	public double A = 0;		// AI conc.
	public double R = 0;		// LasR conc.
	public double RA = 0;		// LasR-AI complex 
	public double C = 0;		// Dimerized LasR-AI complex (stable)
	public double QSI1 = 0;		// Quorum Sensing Inhibitor 1
	public double QSI2 = 0;		// Quorum Sensing Inhibitor 2
	public double QSI3 = 0;		// Quorum Sensing Inhibitor 3
	
	/* rate of changes useful for metabolism */
	public double dA = 0;
	public double dR = 0;
	
	
	/* constructor */
	public QSbacteriumParam(){
		super();
	}
	
	public void init(Simulator aSim, XMLParser aSpeciesRoot, XMLParser speciesDefaults){
		super.init(aSim,aSpeciesRoot,speciesDefaults);
		
		double temp;
		/* Get user defined internal parameters for Quorum Sensing Bacterium */
		/* Get saturation coeffs */
		for(int i = 0; i < 12; i++){
			temp = aSpeciesRoot.getParamDbl("K" + Integer.toString(i));
			if(!Double.isNaN(temp)) K[i] = temp;
		}
		
		temp = aSpeciesRoot.getParamDbl("Kr");
		if(!Double.isNaN(temp)) Kr = temp;
		
		temp = aSpeciesRoot.getParamDbl("Ka");
		if(!Double.isNaN(temp)) Ka = temp;
		
		temp = aSpeciesRoot.getParamDbl("Kqsi3");
		if(!Double.isNaN(temp)) Kqsi3 = temp;
		
		temp = aSpeciesRoot.getParamDbl("Kh");
		if(!Double.isNaN(temp)) Kh = temp;
		
		temp = aSpeciesRoot.getParamDbl("g");
		if(!Double.isNaN(temp)) g = temp;
		
		/* Get basal production rates */
		temp = aSpeciesRoot.getParamDbl("Cr");
		if(!Double.isNaN(temp)) Cr = temp;
		
		temp = aSpeciesRoot.getParamDbl("Ca");
		if(!Double.isNaN(temp)) Ca = temp;
		
		/* Get intracellular concentrations */
		temp = aSpeciesRoot.getParamDbl("A");
		if(!Double.isNaN(temp)) A = temp;
		
		temp = aSpeciesRoot.getParamDbl("R");
		if(!Double.isNaN(temp)) R = temp;
		
		temp = aSpeciesRoot.getParamDbl("RA");
		if(!Double.isNaN(temp)) RA = temp;
		
		temp = aSpeciesRoot.getParamDbl("C");
		if(!Double.isNaN(temp)) C = temp;
		
		temp = aSpeciesRoot.getParamDbl("QSI1");
		if(!Double.isNaN(temp)) QSI1 = temp;
		
		temp = aSpeciesRoot.getParamDbl("QSI2");
		if(!Double.isNaN(temp)) QSI2 = temp;
		
		temp = aSpeciesRoot.getParamDbl("QSI3");
		if(!Double.isNaN(temp)) QSI3 = temp;
		
	}
	
}