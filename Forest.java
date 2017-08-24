package estates;

public class Forest extends AbsParcel {

	public Forest(double cost, int space, boolean isRegulation) {
		super(cost, space, isRegulation);
		this.setType("Forest");
	}

}
