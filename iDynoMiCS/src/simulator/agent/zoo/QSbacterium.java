package simulator.agent.zoo;

import simulator.agent.zoo.*;
import idyno.SimTimer;
import simulator.agent.LocatedAgent;

import utils.ExtraMath;

public class QSbacterium extends Bacterium{
	
	/**
	 * \brief Constructor used to generate progenitor and initialise an object to store relevant parameters
	 * 
	 * Constructor used to generate progenitor and initialise an object to store relevant parameters
	 */
	public QSbacterium() {
		super();
		_speciesParam = new QSbacteriumParam();
	}
	
	/**
	 * \brief Called at each time step of the simulation to compute mass growth and update radius, mass, and volume. In this case also manages EPS hydrolysis
	 * 
	 * Called at each time step of the simulation (under the control of the method Step of the class Agent) to compute mass growth 
	 * and update radius, mass, and volume. Also determines whether the agent has reached the size at which it must divide, and 
	 * monitors agent death. In this case also manages EPS hydrolysis
	 */
	protected void internalStep() {
		// Compute mass growth over all compartments
		grow();
		updateSize();

		// test if the EPS capsule has to be excreted
	//	manageEPS();

		// Divide if you have to
		if (willDivide()) divide();

		// Die if you have to
		if (willDie()) die(true);
	}
	
	/**
	 * \brief Return the set of parameters that is associated with the object of this species
	 * 
	 * Return the set of parameters that is associated with the object of this species
	 * 
	 * @return Object of BactEPSParam that stores the parameters associated with this species
	 */
	public QSbacteriumParam getSpeciesParam() {
		return (QSbacteriumParam) _speciesParam;
	}
	
}