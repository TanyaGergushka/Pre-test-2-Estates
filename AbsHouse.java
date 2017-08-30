package estates;

public abstract class AbsHouse extends AbstractÅstate {

	private TypeOfConstruction typeOfConstruction;
	private int parkingSpace;
	private int yardSpace;

	public AbsHouse(double cost, String description, String adress, int space,	TypeOfConstruction typeOfConstruction, int parkingSpace, int yardSpace) {
		super(EstateKind.HOUSE, cost, description, adress, space);
		this.typeOfConstruction = typeOfConstruction;
		setParkingSpace(parkingSpace);
		this.yardSpace = yardSpace;
	}

	private void setParkingSpace(int parkingSpace) {
		if (parkingSpace > -1){
				this.parkingSpace = parkingSpace;
		}
	
	}

}
