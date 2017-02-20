package buy;

public class IceCream extends DessertItem {
	 private float cost;
	 

	    public void setCost(float cost) {
		this.cost = cost;
	}


		public IceCream(String name, float cost){
	        super(name);
	        this.cost = cost;
	    }



	    @Override
	    public int getCost() {
	        return Math.round(cost);
	    }

	    @Override
	    public String toString(){
	    	return name;
	    }

}
