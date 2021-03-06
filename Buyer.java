package estates;

import java.util.List;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;
import java.util.RandomAccess;

import estates.*;

public class Buyer extends AbstractClientEstate {
	Random ran = new Random();
	private List<Views> viewsListBuyer = new ArrayList<Views>();
	private ArrayList<AbstractÅstate> selectedEstates = new ArrayList<>();
	private AbstractÅstate estateForBuy;
	private double money;

	public Buyer(String name) {
		super(name);
		int moneyStart = ran.nextInt(120000) + 30000;
		setMoney(moneyStart);
	}

	int index = 0;

	public void makeRequest(Agency agency) {
		index = ran.nextInt(agency.getAgentList().size());
		agency.getAgentList().get(index).addBuyerToBuyersList(this);
		this.setAgent(agency.getAgentList().get(index));
		for (int i = 0; i < 3; i++) {
			this.selectedEstates.add(agency.returnEstate());
			System.out.println("The buyer " + this.name + " successfully made a request for "
					+ selectedEstates.get(selectedEstates.size() - 1).getType());
		}

	}

	public void makeView() {
		int i = ran.nextInt(3);
		estateForBuy = this.selectedEstates.get(i);
		if (this.getMoney() > estateForBuy.getCost()) {
			Views newView = new Views(estateForBuy, estateForBuy.getAgentEstate(), this);
			estateForBuy.getAgentEstate().addEstateToViewsList(newView);
			this.viewsListBuyer.add(newView);
			estateForBuy.getAgentEstate().addBuyerToBuyersList(this);
			printInfoForView(newView.getDate());
		} else {
			System.out.println(this.name + " does not have enough money");

		}
	}

	private void printInfoForView(LocalDate date) {
		System.out.println("agent " + estateForBuy.getAgentEstate().name + ", buyer " + this.name
				+ ", allViews for this buyer -> " + this.getViewsListBuyer().size() + ", type estate "
				+ estateForBuy.getType() + ", date: " + date);
	}

	public void makeDeal(Agency agency) {
		// System.out.print("before / ");
		// System.out.println("The money of an agent " +
		// Agency.getAgentList().get(index).getName() + " -> " +
		// Agency.getAgentList().get(index).getBudjetAgent());

		double price = estateForBuy.getCost();
		double commissionSeller = price * 0.03;
		double commissionBuyer = price * 0.03;
		agency.addMoneyToAgencyBudjet(price + commissionBuyer / 2 + commissionSeller / 2);
		this.getAgent().addMoneyToBudjetAgent((commissionBuyer / 2) + (commissionSeller / 2));

		// System.out.print("after deal / ");
		// System.out.println("The money of an agent " +
		// Agency.getAgentList().get(index).getName() + " -> " +
		// Agency.getAgentList().get(index).getBudjetAgent());
		// System.out.println(
		// "the money of an agency " + Agency.getBudjet());
	}

	private List getViewsListBuyer() {
		return Collections.unmodifiableList(viewsListBuyer);
	}

	public void setMoney(double money) {
		this.money = money;
	}

	public double getMoney() {
		return money;
	}

	public int takeNumbersOfViews() {
		return viewsListBuyer.size();
	}

	public void setViewsListBuyer(Views view) {
		this.viewsListBuyer.add(view);
	}

}
