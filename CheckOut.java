package buy;

import java.util.Vector;

public class CheckOut {

	   private Vector<DessertItem> v;

	    public CheckOut(){
	       v =  new Vector();
	    }

	    public int numberOfItems(){
	        return v.size();
	    }

	    public void enterItem(DessertItem item){
	        v.add(item);
	    }

	    public void clear(){
	        v.clear();
	    }

	    public int totalCost(){
	            int totalItemsWithoutTax = 0;
	        for(DessertItem d : v){
	            totalItemsWithoutTax += d.getCost();
	        }
	        return totalItemsWithoutTax;
	    }

	    public int totalTax(){

	        float Tax = totalCost()*DessertShoppe.taxRate/100;

	        return Math.round(Tax);

	    }

//	    @Override
//	    public String toString(){
//
//	        System.out.printf("%30s %-10s %n",DessertShoppe.name_of_store," ");
//	        System.out.printf("%30s","--------------------");
//
//
//	        for(DessertItem d : v){
//	            String cost = DessertShoppe.cents2DollarsAndCents(d.getCost());
//	            if(d.getClass()!=IceCream.class) {
//	                System.out.printf("\n%-25s", d.toString());
//	            }
//	            System.out.printf("\n%-25s %15s", d.getName(),cost);
//	        }
//
//	        System.out.printf("\n%-25s %15s","Tax",DessertShoppe.cents2DollarsAndCents(totalTax()));
//	        System.out.printf("\n%-25s %15s","Total Cost",DessertShoppe.cents2DollarsAndCents(totalTax()+totalCost()));
//
//	        return "";
//	    }

	}
