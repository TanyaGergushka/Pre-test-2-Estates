package estates;

public class OneRoomApartment extends AbsApartament {

	public OneRoomApartment(double cost, int space, String typeOfConstruction) {
		super(cost, space, typeOfConstruction);
		this.setType("OneRoom Apartment");
	}

}
