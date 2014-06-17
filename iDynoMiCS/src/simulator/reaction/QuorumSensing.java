package simulator.reaction;

import utils.XMLParser;
import utils.UnitConverter;
import utils.LogFile;

import org.jdom.Element;

import Jama.Matrix;

import simulator.Simulator;
import simulator.agent.*;
import simulator.reaction.kinetic.*;


public class QuorumSensing extends Reaction{
	/**
	 * Serial version used for the serialisation of the class
	 */
	private static final long serialVersionUID = 1L;
	
	public void init(Simulator aSim, XMLParser xmlRoot){
		// Call the init of the parent class (populate yield arrays)
		super.init(aSim, xmlRoot);
	}
	
	/* Calculate the cost of Quorum Sensing. This includes the
	 * cost for AI synthesis and LasR production
	 */
	public ArrayList<Double> setYield(ActiveAgent anAgent){
		ArrayList<Double> QScost = new ArrayList<Double>();
		
		if(anAgent instanceof QSbacterium){
			QSbacterium QSbac = (QSbacterium) anAgent;
			/* affect cost proportional to dA and dR */
			QScost.add(0.01); // TEMP VALUE
		}
		return QScost;
	}
}