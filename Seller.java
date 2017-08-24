package estates;

import java.util.Random;

import estates.*;

public class Seller extends AbstractClientEstate {

	private Abstract�state estate;
	private double money;

	public Seller(String name) {
		super(name);
		 
	}

	public void register(Abstract�state estate) {
		Random ran = new Random();
		int indexAgent = ran.nextInt(5);
		estate.setAgentEstate(Agency.getAgentList().get(indexAgent));
		Agency.addEstateToCatalog(estate);
		this.setAgent(Agency.getAgentList().get(indexAgent));
		Agency.getAgentList().get(indexAgent).addSellersOfAgent(this);

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
