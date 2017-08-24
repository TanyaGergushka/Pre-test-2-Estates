package estates;

public class AbsParcel extends Abstract≈state {

	private boolean isRegulation;

	public AbsParcel(double cost, int space, boolean isRegulation) {
		super(cost, space);
		setRegulation(isRegulation);
	}

	public boolean isRegulation() {
		return isRegulation;
	}

	public void setRegulation(boolean isRegulation) {
		this.isRegulation = isRegulation;
	}

}
