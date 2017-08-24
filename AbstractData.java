package estates;

public abstract class AbstractData {

	
	String name;
	String telephone;

	public AbstractData(String name) {
		this.setName(name);
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((telephone == null) ? 0 : telephone.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AbstractData other = (AbstractData) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (telephone == null) {
			if (other.telephone != null)
				return false;
		} else if (!telephone.equals(other.telephone))
			return false;
		return true;
	}

	

	public void setName(String name) {
		if (name != null && !name.isEmpty()) {
			this.name = name;
		}

	}

	public String getName() {
		return name;
	}

	public void setTelephone(String telephone) {
		for (int i = 0; i < telephone.length(); i++) {
			if (Character.isDigit(telephone.charAt(i))) {
				this.telephone = telephone;
			} else {
				System.out.println("invalid telephone");
			}

		}

	}
}
