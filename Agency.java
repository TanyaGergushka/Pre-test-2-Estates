package estates;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import estates.Abstract�state.EstateKind;
import pastryShopKindCakes.AbstractCake;

public class Agency extends AbstractData {

	private String adress;
	private double budjet;
	private HashMap<EstateKind, TreeSet<Abstract�state>> catalog;
	private static ArrayList<Agent> agentList = new ArrayList<>();

	public Agency(String name) {
		super(name);

		for (int i = 0; i < 5; i++) {
			agentList.add(new Agent("Agent " + (i + 1)));
		}

		catalog = new HashMap<>();

		Comparator<Abstract�state> comparatorByPrice = new Comparator<Abstract�state>() {

			@Override
			public int compare(Abstract�state o1, Abstract�state o2) {
				if (o1.getCost() > o2.getCost()) {
					return -1;
				}
				return 1;
			}
		};

		catalog.put(EstateKind.APARTAMENT, new TreeSet<>(comparatorByPrice));
		catalog.put(EstateKind.HOUSE, new TreeSet<>(comparatorByPrice));
		catalog.put(EstateKind.PARCEL, new TreeSet<>(comparatorByPrice));
	}

	public ArrayList<Agent> getAgentList() {
		return agentList;
	}

	public double getBudjet() {
		return budjet;
	}

	public void addMoneyToAgencyBudjet(double budjet) {
		this.budjet += budjet;
	}

	public Map<EstateKind, TreeSet<Abstract�state>> getCatalog() {
		return Collections.unmodifiableMap(catalog);
	}

	public void printCatalog() {

		for (EstateKind kind : this.catalog.keySet()) {
			System.out.println("=========" + kind + "=========");
			System.out.println(this.catalog.get(kind));
		}

	}

	public void addEstateToCatalog(Abstract�state estate) {

		for (EstateKind kind : this.catalog.keySet()) {
			if (kind.equals(estate.getType())) {
				TreeSet<Abstract�state> estateSet = this.catalog.get(kind);
				estateSet.add(estate);
			}
		}
	}

	public Agent registerEstateInCatalog(Abstract�state estate) {
		Agent agent = returnAgent();
		estate.setAgentEstate(agent);
		this.addEstateToCatalog(estate);
		return agent;
	}

	public Agent returnAgent() {
		Random ran = new Random();
		int indexAgent = ran.nextInt(5);
		return this.getAgentList().get(indexAgent);
	}

	public Abstract�state returnEstate() {
		Random rand = new Random();
		EstateKind xKind = null;
		int iKind = rand.nextInt(3);
		switch (iKind) {
		case 0:
			xKind = EstateKind.APARTAMENT;
			break;
		case 1:
			xKind = EstateKind.HOUSE;
			break;
		case 2:
			xKind = EstateKind.PARCEL;
			break;
		default:
			break;
		}

		int index = rand.nextInt(this.getCatalog().size());
		for (EstateKind kind : this.catalog.keySet()) {
			if (kind.equals(xKind)) {
				Iterator<Abstract�state> iter = this.catalog.get(xKind).iterator();
				for (Iterator<Abstract�state> it = this.catalog.get(xKind).iterator(); it.hasNext();) {
					for (int i = 0; i < index; i++) {
						iter.next();
					}
					return iter.next();
				}

			}

		}
		return null;
	}
}
