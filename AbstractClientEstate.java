package estates;

public abstract class AbstractClientEstate extends AbstractData {

	private Agent agent;

	public AbstractClientEstate(String name) {
		super(name);
	}

	public Agent getAgent() {
		return agent;
	}

	public void setAgent(Agent agent) {
		this.agent = agent;
	}

}
