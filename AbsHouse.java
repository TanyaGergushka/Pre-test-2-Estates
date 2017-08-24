package estates;

public abstract class AbsHouse extends Abstract≈state {

	private String typeOfConstruction;
	private int parkingSpace;
	private int yardSpace;

	public AbsHouse(double cost, int space, int parkingSpace) {
		super(cost, space);
		this.setParkingSpace(parkingSpace);
	}

	public int getParkingSpace() {
		return parkingSpace;
	}

	public void setParkingSpace(int parkingSpace) {
		this.parkingSpace = parkingSpace;
	}

}
