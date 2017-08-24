package estates;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Agency extends AbstractData {

	private String adress;
	private static double budjet;
	private static Set<Abstract�state> catalog;
	private static ArrayList<Agent> agentList = new ArrayList<>();
	
	
	
	public Agency(String name) {
		super(name);
		
		Comparator<Abstract�state> comparator = new Comparator<Abstract�state>() {

			@Override
			public int compare(Abstract�state o1, Abstract�state o2) {
			if (o1.getType().equals(o2.getType())){
				if (o1.getCost() > o2.getCost()){
					return 1;
				} return -1;
			}
				return o1.getType().compareTo(o2.getType());
			}

			};
			catalog = (new TreeSet<>(comparator));

		for (int i = 0; i < 5; i++) {
			agentList.add(new Agent("Agent " +  (i + 1)));
		}
	}

	

	
	public static ArrayList<Agent> getAgentList() {
		return agentList;
	}

	

	public static double getBudjet() {
		return budjet;
	}

	public static void addMoneyToAgencyBudjet(double budjet) {
		Agency.budjet += budjet;
	}


	public static Set<Abstract�state> getCatalog() {
		return Collections.unmodifiableSet(catalog);
	}

	public static void addEstateToCatalog(Abstract�state estete) {
		
		Agency.catalog.add(estete);
	}

}
