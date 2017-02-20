package buy;

public class Sundae extends IceCream {
	public String toppings;
    private float costOfToppings;

    public String getToppings() {
		return toppings;
	}

	public void setToppings(String toppings) {
		this.toppings = toppings;
	}

	public float getCostOfToppings() {
		return costOfToppings;
	}

	public void setCostOfToppings(float costOfToppings) {
		this.costOfToppings = costOfToppings;
	}

	public Sundae(String name, float cost,String toppings, float costOfToppings){
        super(name, cost);
        this.costOfToppings = costOfToppings;
        this.toppings = toppings;

    }

    @Override
    public int getCost() {
        return (super.getCost()+ Math.round(costOfToppings));
    }
    @Override
    public String toString(){
        return toppings + " sundae with ";
    }

}
