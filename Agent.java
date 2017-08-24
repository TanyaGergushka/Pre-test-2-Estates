package estates;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Agent extends AbstractData {

	private HashSet<Seller> sellersOfAgent = new HashSet<>();
	private ArrayList<Buyer> buyersList = new ArrayList<>();
	private ArrayList<Views> viewsList = new ArrayList<>();
	private double budjetAgent;

	public Agent(String name) {
		super(name);
	}

	public ArrayList<Buyer> getBuyersList() {
		return buyersList;
	}

	public void addBuyerToBuyersList(Buyer buyer) {
		this.buyersList.add(buyer);
	}

	public ArrayList<Views> getViewsList() {
		return viewsList;
	}

	public void addEstateToViewsList(Views view) {
		this.viewsList.add(view);
	}

	public double getBudjetAgent() {
		return budjetAgent;
	}

	public void addMoneyToBudjetAgent(double budjetAgent) {
		this.budjetAgent += budjetAgent;
	}

	@Override
	public String toString() {

		return name + " -> " + this.budjetAgent + "\n";
	}

	public Set<Seller> getSellersOfAgent() {
		return Collections.unmodifiableSet(sellersOfAgent);
	}

	public void addSellersOfAgent(Seller seller) {
		sellersOfAgent.add(seller);
	}
}
