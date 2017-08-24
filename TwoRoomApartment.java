package estates;

public class TwoRoomApartment extends AbsApartament {

	public TwoRoomApartment(double cost, int space,String typeOfConstruction) {
		super(cost, space,typeOfConstruction);
		this.setType("TwoRoom Apartment");
	}

}
