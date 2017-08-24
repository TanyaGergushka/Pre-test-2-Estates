package estates;

import java.util.Comparator;

public abstract class Abstract≈state {

	private String description;
	private String adress;
	private double cost;
	private String type;
	private int space;
	private Agent agentEstate;
	

	public Abstract≈state( double cost, int space) {
		
		setCost(cost);
		setSpace(space);
	
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getSpace() {
		return space;
	}

	public void setSpace(int space) {
		this.space = space;
	}

	public Agent getAgentEstate() {
		return agentEstate;
	}

	public void setAgentEstate(Agent agentEstate) {
		this.agentEstate = agentEstate;
	}
}
