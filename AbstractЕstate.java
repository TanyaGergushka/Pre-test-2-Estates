package estates;

import java.util.Comparator;

public abstract class AbstractÅstate {

	public enum EstateKind {

		APARTAMENT, HOUSE, PARCEL;
	}

	public enum TypeOfConstruction {

		ÅÏÊ, Òóõëà, Ïàíåë, Êèðïè÷;
	}

	@Override
	public String toString() {
		return "estate " + description + ", cost=" + cost + ", space=" + space + "\n";
	}

	private String description;
	private String adress;
	private double cost;
	private EstateKind type;
	private int space;
	private Agent agentEstate;

	public AbstractÅstate(EstateKind type, double cost, String description, String adress, int space) {
		this.setDescription(description);
		this.adress = adress;
		setCost(cost);
		setSpace(space);
		setType(type);
	}

	private void setDescription(String description) {
		if (description != null) {
			this.description = description;
		}

	}

	private void setType(EstateKind type) {
		this.type = type;
	}

	public double getCost() {
		return cost;
	}

	private void setCost(double cost) {
		if (cost > 0) {
			this.cost = cost;
		}

	}

	public EstateKind getType() {
		return type;
	}

	public int getSpace() {
		return space;
	}

	private void setSpace(int space) {
		if (space > 0) {
			this.space = space;
		}

	}

	public Agent getAgentEstate() {
		return agentEstate;
	}

	public void setAgentEstate(Agent agentEstate) {
		this.agentEstate = agentEstate;
	}

	public String getDescription() {
		return description;
	}

}
