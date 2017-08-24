package estates;

public abstract class AbsApartament extends Abstract≈state {

	private String typeOfConstruction;

	public AbsApartament(double cost, int space, String typeOfConstruction) {
		super(cost, space);
		this.setTypeOfConstruction(typeOfConstruction);
	}

	public String getTypeOfConstruction() {
		return typeOfConstruction;
	}

	public void setTypeOfConstruction(String typeOfConstruction) {
		if (typeOfConstruction.equalsIgnoreCase("epc") || typeOfConstruction.equalsIgnoreCase("brick")
				|| typeOfConstruction.equalsIgnoreCase("panel") || typeOfConstruction.equalsIgnoreCase("kirpich")) {
			this.typeOfConstruction = typeOfConstruction;
		} else {
			System.out.println("wrong construction");
		}
	}

}
