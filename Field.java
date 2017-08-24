package estates;

public class Field extends AbsParcel {

	public Field(double cost, int space, boolean isRegulation) {
		super(cost, space, isRegulation);
		this.setType(" Field");
	}

}
