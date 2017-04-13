
public class CoffeeModel {

	public static final double coffeeCost = 0.35;
    private double coffeePrice;
	private double price;
	private double numberOfCoins;
	
	/** Constructor
	 * @param coffeePrice initial coffee price
	 */
	
	public CoffeeModel (double coffeePrice){
		setCoffeePrice (coffeePrice);
		 numberOfCoins = 0;
	}
	
	/**mutator for  price 
	 * @param price base coffee price
	 * @return a reference to this object
	 */
	
	public CoffeeModel setPrice(double price){
		if(price >= 0){
			this.coffeePrice = price;
			return this;
		}else{
			throw new IllegalArgumentException("Price must be positive!!");
			
		}
	}
	
	/**accessor for price
	 * @return current value of price
	 */
	public double getPrice(){
		return price;
	}
	
	/**
	 * mutator for coffeePrice
	 * @param coffeePrice new value for coffeePrice must match one of the existing price
	 * @return a reference to this object
	 */
	public CoffeeModel setCoffeePrice(double coffeePrice){
		if (coffeePrice == coffeeCost){
			this.coffeePrice = coffeePrice;
			return this;
		}else{
			throw new IllegalArgumentException("Coffee Price is not found");
			
		}
	}
	
	/**accessor for coffeePrice 
	 * @return current value for coffeePrice
	 */
	public double getCoffeePrice(){
		return coffeePrice;
	}
	/** keeps track of how many coins are being inserted  
	 */
	public void countCoins1(){
		this.numberOfCoins++;
	}
	/**keeps track the return value of the coins
	 */
	public void countCoins2(){
		this. numberOfCoins--;
	}
	/** resetting the count coins after the coffee being served
	 */
	public void resetCountCoins(){
		this.numberOfCoins = 0;
	}
}
