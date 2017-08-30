package estates;

import java.util.Random;

import estates.*;
import estates.Abstract�state.TypeOfConstruction;

public class Seller extends AbstractClientEstate {

	private Abstract�state estate;
	private double money;

	public Seller(String name) {
		super(name);
		 
	}

	public void register(Agency agency, Abstract�state estate) {
		Agent agent = agency.registerEstateInCatalog(estate);
		agent.addSellersOfAgent(this);
	}

	
	@Override
	public String toString() {
		return  this.name + "[estate=" + estate.getDescription() +", " + estate.getCost() + ", money=" + money + "]";
	}

	public Abstract�state getEstate() {
		return estate;
	}

	public void setEstate(Abstract�state estate) {
		this.estate = estate;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}
	

	}


