package estates;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;

import javax.swing.plaf.synth.SynthSpinnerUI;

import estates.Abstract≈state.TypeOfConstruction;

public class DemoEstate {

	public static void main(String[] args) {
		Random ran = new Random();

		// Task 1 - created agency
		System.out.println("------------ Task 1---------");
		Agency talantsEstate = new Agency("Talants Estate");

		// Task 2 - created sellers / clients
		System.out.println("------------ Task 2---------");
		ArrayList<Seller> sellerCreateList = new ArrayList<>();
		for (int i = 0; i < 30; i++) {
			sellerCreateList.add(new Seller("seller " + (i + 1)));
		}

		// Task 2 - create estates for each seller
		int space = 150;
		for (int i = 0; i < sellerCreateList.size(); i++) {

			int percentEstate = ran.nextInt(99) + 1;

			if (percentEstate <= 33) {
				int number = ran.nextInt(5) + 1;
				int cost = ran.nextInt(80000) + 70000;
				switch (number) {
				case 1:
					sellerCreateList.get(i)
							.setEstate(new Maisonette(cost, "Sofiq 1000", space, TypeOfConstruction. ËÔË˜));
					space += 30;
					break;
				case 2:
					sellerCreateList.get(i).setEstate(new Studio(cost, "Sofiq 1500", space, TypeOfConstruction.œ‡ÌÂÎ));
					space += 30;
					break;
				case 3:
					sellerCreateList.get(i)
							.setEstate(new TwoRoomApartment(cost, "Sofiq 1200", space, TypeOfConstruction.≈œ ));
					space += 30;
					break;
				case 4:
					sellerCreateList.get(i)
							.setEstate(new ThreeRoomApartment(cost, "Sofiq 1900", space, TypeOfConstruction.“ÛıÎ‡));
					space += 30;
					break;
				case 5:
					sellerCreateList.get(i)
							.setEstate(new OneRoomApartment(cost, "Sofiq 1600", space, TypeOfConstruction.“ÛıÎ‡));
					space += 30;
					break;
				default:
					break;
				}

			} else if (percentEstate <= 66) {
				int number2 = ran.nextInt(3) + 1;
				int cost2 = ran.nextInt(55000) + 30000;
				switch (number2) {
				case 1:
					sellerCreateList.get(i).setEstate(new Field(cost2, "Plovdiv 3200", space, true));
					space += 10;
					break;
				case 2:
					sellerCreateList.get(i).setEstate(new Forest(cost2, "Plovdiv 0000", space, false));
					space -= 10;
					break;
				case 3:
					sellerCreateList.get(i).setEstate(new GreenSward(cost2, "Plovdiv 3200", space, true));
					space += 10;
					break;
				default:
					break;
				}
			} else if (percentEstate <= 99) {
				int number3 = ran.nextInt(2) + 1;
				int cost3 = ran.nextInt(30000) + 50000;
				switch (number3) {
				case 1:
					sellerCreateList.get(i)
							.setEstate(new AWholeHouse(cost3, "Burgas 5600", space, TypeOfConstruction.≈œ , 1, 3));
					space -= 20;
					break;
				case 2:
					sellerCreateList.get(i)
							.setEstate(new FloorOfAHouse(cost3, "Burgas 5900", space, TypeOfConstruction.“ÛıÎ‡, 3, 3));
					space -= 20;
					break;
				default:
					break;
				}
			}
		}

		// Task 3 - the seller registers his property
		System.out.println("------------ Task 3---------");
		for (int j = 0; j < sellerCreateList.size(); j++) {
			sellerCreateList.get(j).register(talantsEstate, sellerCreateList.get(j).getEstate());
		}

		// print info for seller, estate and agent
		for (int j = 0; j < sellerCreateList.size(); j++) {
			Seller seller = sellerCreateList.get(j);
			System.out.println(seller);
		}

		System.out.println("------------------");
		System.out.println("estates in catalog: " + talantsEstate.getCatalog().size());

		talantsEstate.printCatalog();
		System.out.println("------------------");

		// number of agents in the agent list
		for (int j = 0; j < talantsEstate.getAgentList().size(); j++) {
			Agent agent = talantsEstate.getAgentList().get(j);
			System.out.println(agent.name + " has sellers: " + agent.getSellersOfAgent().size());
		}
		System.out.println("-------Task 4--------");

		// Task 4 - created Buyers
		ArrayList<Buyer> buyerCreateList = new ArrayList<>();
		for (int j = 0; j < 10; j++) {
			buyerCreateList.add(new Buyer("Buyer " + (int) (j + 1)));
		}
		System.out.println("-------Task 5--------");

		// Task 5 buyer make request
		for (int j = 0; j < buyerCreateList.size(); j++) {
			buyerCreateList.get(j).makeRequest(talantsEstate);

		}
		System.out.println("-----Task 6---------");
		// Task 6 buyer make views
		for (int j = 0; j < buyerCreateList.size(); j++) {
			buyerCreateList.get(j).makeView();
		}

		System.out.println("-------Task 7----------");

		// Task 7 buyer make deal
		for (int j = 0; j < buyerCreateList.size(); j++) {
			Buyer buyer = buyerCreateList.get(j);
			buyer.makeDeal(talantsEstate);
		}

		// Task 8 
		System.out.print("----- Task 8 ----------");
		System.out.println("The budget of the agency is " + talantsEstate.getBudjet());

		
	

		System.out.println(" -----Task 9    Sorted agents by budget -------- ");
		TreeSet<Agent> sortedAgent = new TreeSet<>(new Comparator<Agent>() {

			@Override
			public int compare(Agent o1, Agent o2) {
				if (o1.getBudjetAgent() > o2.getBudjetAgent()) {
					return -1;
				}
				return 1;
			}
		});

		for (int i = 0; i < talantsEstate.getAgentList().size(); i++) {
			Agent agent = talantsEstate.getAgentList().get(i);
			sortedAgent.add(agent);
		}

		System.out.println(sortedAgent);
		// Task 9
		System.out.println("\n ------Task 9    Not sorted agents by budget --------");
		for (int j = 0; j < talantsEstate.getAgentList().size(); j++) {
			System.out.println("The budget of " + talantsEstate.getAgentList().get(j).getName() + "  is "
					+ talantsEstate.getAgentList().get(j).getBudjetAgent());
		}
	}

}
