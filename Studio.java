package estates;

public class Studio extends AbsApartament {

	public Studio(double cost, int space, String typeOfConstruction) {
		super(cost, space, typeOfConstruction);
		this.setType("Studio");
	}

}
