package estates;



public abstract class AbsApartament extends Abstract≈state {

	private TypeOfConstruction typeOfConstruction;

	public AbsApartament( double cost, String description, String adress, int space,
			TypeOfConstruction typeOfConstruction) {
		super(EstateKind.APARTAMENT, cost, description, adress, space);
		this.typeOfConstruction = typeOfConstruction;
	}

	
	

}
