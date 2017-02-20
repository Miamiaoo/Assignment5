package buy;

public class Cookie extends DessertItem {
	 	private int numberOfCookies;
	    private int pricePerDozen;
	    

	    public int getNumberOfCookies() {
			return numberOfCookies;
		}

		public void setNumberOfCookies(int numberOfCookies) {
			this.numberOfCookies = numberOfCookies;
		}

		public int getPricePerDozen() {
			return pricePerDozen;
		}

		public void setPricePerDozen(int pricePerDozen) {
			this.pricePerDozen = pricePerDozen;
		}

		public Cookie (String name, int numberOfCookies, int pricePerDozen){
	        super(name);
	        this.pricePerDozen = pricePerDozen;
	        this.numberOfCookies = numberOfCookies;
	    }

	    @Override
	    public int getCost() {

	          int cost = Math.round(numberOfCookies * pricePerDozen/12);
	          return cost;
	    }

	    @Override
	    public String toString(){

	        return numberOfCookies +" @ "+ pricePerDozen +"/dz.";
	    }

}
