package estates;

import java.util.Random;

import estates.*;
import estates.AbstractÅstate.TypeOfConstruction;

public class Seller extends AbstractClientEstate {

	private AbstractÅstate estate;
	private double money;

	public Seller(String name) {
		super(name);
		 
	}

	public void register(Agency agency, AbstractÅstate estate) {
		Agent agent = agency.registerEstateInCatalog(estate);
		agent.addSellersOfAgent(this);
	}

	
	@Override
	public String toString() {
		return  this.name + "[estate=" + estate.getDescription() +", " + estate.getCost() + ", money=" + money + "]";
	}

	public AbstractÅstate getEstate() {
		return estate;
	}

	public void setEstate(AbstractÅstate estate) {
		this.estate = estate;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}
	

	}


