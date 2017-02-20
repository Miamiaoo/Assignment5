package buy;

public class Candy extends DessertItem {

	    private double weight;
	    private int pricePerPound;
	    

	    public double getWeight() {
			return weight;
		}


		public void setWeight(double weight) {
			this.weight = weight;
		}


		public int getPricePerPound() {
			return pricePerPound;
		}


		public void setPricePerPound(int pricePerPound) {
			this.pricePerPound = pricePerPound;
		}


		public Candy(String name, double weight, int pricePerPound){
	        super(name);
	        this.pricePerPound = pricePerPound;
	        this.weight = (double)weight;
	    }

		DessertShoppe ds = new DessertShoppe();

	    @Override
	    public int getCost() {

	    	return (int) Math.round(weight * pricePerPound);

	    }

	    @Override
	    public String toString(){

	        return weight +" lbs. @ "+ pricePerPound +" /lb.";
	    }

}
