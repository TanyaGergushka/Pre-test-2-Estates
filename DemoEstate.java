package estates;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class DemoEstate {

	public static void main(String[] args) {
		Random ran = new Random();

		// created agency
		Agency talantsEstate = new Agency("Talants Estate");

		// created sellers / clients
		ArrayList<Seller> sellerCreateList = new ArrayList<>();
		for (int i = 0; i < 30; i++) {
			sellerCreateList.add(new Seller("seller" + (int) (i + 1)));
		}
		// System.out.println(sellerCreateList.size());

		int space = 150;

		// create estates for each seller
		for (int i = 0; i < sellerCreateList.size(); i++) {

			int percentEstate = ran.nextInt(99) + 1;

			if (percentEstate <= 33) {
				int number = ran.nextInt(5) + 1;
				int cost = ran.nextInt(80000) + 70000;
				switch (number) {
				case 1:
					sellerCreateList.get(i).setEstate(new Maisonette(cost, space, "epc"));
					space += 30;
					break;
				case 2:
					sellerCreateList.get(i).setEstate(new Studio(cost, space, "epc"));
					space += 30;
					break;
				case 3:
					sellerCreateList.get(i).setEstate(new TwoRoomApartment(cost, space, "epc"));
					space += 30;
					break;
				case 4:
					sellerCreateList.get(i).setEstate(new ThreeRoomApartment(cost, space, "epc"));
					space += 30;
					break;
				case 5:
					sellerCreateList.get(i).setEstate(new OneRoomApartment(cost, space, "epc"));
					space += 30;
					break;
				default:
					break;
				}

			} else if (percentEstate <= 66) {
				int number2 = ran.nextInt(2) + 1;
				int cost2 = ran.nextInt(55000) + 30000;
				switch (number2) {
				case 1:
					sellerCreateList.get(i).setEstate(new Field(cost2, space, true));
					space += 10;
					break;
				case 2:
					sellerCreateList.get(i).setEstate(new Forest(cost2, space, false));
					space -= 10;
					break;
				case 3:
					sellerCreateList.get(i).setEstate(new GreenSward(cost2, space, true));
					space += 10;
					break;
				default:
					break;
				}
			} else if (percentEstate <= 100) {
				int number3 = ran.nextInt(1) + 1;
				int cost3 = ran.nextInt(30000) + 50000;
				switch (number3) {
				case 1:
					sellerCreateList.get(i).setEstate(new AWholeHouse(cost3, space, 3));
					space -= 20;
					break;
				case 2:
					sellerCreateList.get(i).setEstate(new FloorOfAHouse(cost3, space, 1));
					space -= 20;
					break;
				default:
					break;
				}
			}
		}
		// the seller registers his property
		for (int j = 0; j < sellerCreateList.size(); j++) {
			sellerCreateList.get(j).register(sellerCreateList.get(j).getEstate());
		}

		// print info for seller, estate and agent
		for (int j = 0; j < sellerCreateList.size(); j++) {
			Seller seller = sellerCreateList.get(j);
			System.out.println(seller.getName() + ", type estate " + seller.getEstate().getType() + ", cost: "
					+ seller.getEstate().getCost() + ", agent " + seller.getAgent().getName());
		}
		System.out.println("------------------");
		System.out.println("estates in catalog: " + Agency.getCatalog().size());
		System.out.println("------------------");
		
		// number of agents in the agent list
		for (int j = 0; j < Agency.getAgentList().size(); j++) {
			Agent agent = Agency.getAgentList().get(j);
			System.out.println(agent.name + " has sellers: " + agent.getSellersOfAgent().size());
		}
		System.out.println("------------------");
		// created Buyers
		ArrayList<Buyer> buyerCreateList = new ArrayList<>();
		for (int j = 0; j < 10; j++) {
			buyerCreateList.add(new Buyer("Buyer " + (int) (j + 1)));
		}
		System.out.println("------------------");
		// buyer make request
		for (int j = 0; j < buyerCreateList.size(); j++) {
			buyerCreateList.get(j).makeRequest();

		}
		System.out.println("------------------");
		// buyer make views
		for (int j = 0; j < buyerCreateList.size(); j++) {
			buyerCreateList.get(j).makeView();
		}

		System.out.println("---------------------");

		
		// buyer make deal
		 for (int j = 0; j < buyerCreateList.size(); j++) {
			 Buyer buyer = buyerCreateList.get(j);
		 buyer.makeDeal();
		 }
		 
		System.out.println("---------------------");
		
		System.out.println("The budget of the agency is " + Agency.getBudjet());
		
		System.out.println("------ Not sorted agents by budget --------");
		for (int j = 0; j < Agency.getAgentList().size(); j++) {
			System.out.println( "The budget of " + 
					Agency.getAgentList().get(j).getName() + "  is " + Agency.getAgentList().get(j).getBudjetAgent());
		}
		
		System.out.println( " ----- Sorted agents by budget -------- ");
		TreeSet<Agent> sortedAgent = new TreeSet<>(new Comparator<Agent>() {

			

			@Override
			public int compare(Agent o1, Agent o2) {
				if (o1.getBudjetAgent() > o2.getBudjetAgent()){
					return -1;
				}
				return 1;
			}
		});
		
		for (int i = 0; i < Agency.getAgentList().size(); i++) {
			Agent agent = Agency.getAgentList().get(i);
			sortedAgent.add(agent);
		}
		
		System.out.println(sortedAgent);
		 
	}

}
