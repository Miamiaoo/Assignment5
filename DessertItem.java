package buy;

public abstract class DessertItem {
	public String name;

	public String getName() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}

	public DessertItem() {

	}

	public DessertItem(String name) {
		this.setname(name);
	}

	public abstract int getCost();

}
