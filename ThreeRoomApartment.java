package estates;

public class ThreeRoomApartment extends AbsApartament {

	public ThreeRoomApartment(double cost, int space,String typeOfConstruction) {
		super(cost, space,typeOfConstruction);
		this.setType("ThreeRoom Apartment");
	}

}
