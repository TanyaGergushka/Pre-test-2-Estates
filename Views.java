package estates;

import java.time.LocalDate;

public class Views {

	Abstract흒tate imot;
	Agent agent;
	Buyer buyer;
	LocalDate date = LocalDate.now().plusDays(2);

	public Views(Abstract흒tate estate, Agent agentEstate, Buyer buyer) {
		this.setEstate(estate);
		this.setDate(date);
		this.setAgent(agent);
		this.setBuyer(buyer);
	}

	public Abstract흒tate getEstate() {
		return imot;
	}

	public void setEstate(Abstract흒tate imot) {
		this.imot = imot;
	}

	public Agent getAgent() {
		return agent;
	}

	public void setAgent(Agent agent) {
		this.agent = agent;
	}

	public Buyer getBuyer() {
		return buyer;
	}

	public void setBuyer(Buyer buyer) {
		this.buyer = buyer;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = LocalDate.now().plusDays(2);
	}
}
