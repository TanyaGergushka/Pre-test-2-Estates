package estates;

public class AbsParcel extends Abstract≈state {

	private boolean isRegulation;

	public AbsParcel(double cost, String description, String adress, int space, boolean isRegulation) {
		super(EstateKind.PARCEL, cost, description, adress, space);
		this.isRegulation = isRegulation;
	}

	public boolean isRegulation() {
		return isRegulation;
	}

	

}
