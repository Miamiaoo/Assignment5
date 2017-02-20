package buy;

public class DessertShoppe {
	public static final String name_of_store = "M & M Dessert Shoppe";
    public static final float  taxRate = 9.6f;
    public static final int  maxSizeOfItemName = 35;

    public static String cents2DollarsAndCents(int cents){
            float Dollars_cents = (float) cents/100;
        return String.valueOf(Dollars_cents);
    }

}
