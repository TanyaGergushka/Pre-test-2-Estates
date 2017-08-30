package estates;

import java.util.Random;

import estates.*;
import estates.Abstract흒tate.TypeOfConstruction;

public class Seller extends AbstractClientEstate {

	private Abstract흒tate estate;
	private double money;

	public Seller(String name) {
		super(name);
		 
	}

	public void register(Agency agency, Abstract흒tate estate) {
		Agent agent = agency.registerEstateInCatalog(estate);
		agent.addSellersOfAgent(this);
	}

	
	@Override
	public String toString() {
		return  this.name + "[estate=" + estate.getDescription() +", " + estate.getCost() + ", money=" + money + "]";
	}

	public Abstract흒tate getEstate() {
		return estate;
	}

	public void setEstate(Abstract흒tate estate) {
		this.estate = estate;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}
	

	}


