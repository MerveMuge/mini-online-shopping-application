//package proj2;

/**
 * @author mug
 *
 */
public class Tv extends Electronic{
	private String screenSize;
	private boolean hasCampaign = false;
	

	/**
	 * tv constructor
	 * @param Id	the Id of television which is one of the electronic
	 * @param price	price the price of television which is one of the electronic
	 * @param manufacturer	the manufacturer of television which is one of the electronic
	 * @param brand	the brand of television which is one of the electronic
	 * @param maxAllowedInputVoltage	the max allowed input voltage of television which is one of the electronic
	 * @param maxPowerConsumption	the max power consumption of television which is one of the electronic
	 * @param screenSize	the screen size of television
	 * @see #Tv(int, String, String, String, String, String, String)
	 */
	public Tv(int Id , String price, String manufacturer, String brand, String maxAllowedInputVoltage, String maxPowerConsumption, String screenSize){
		super(Id , price,manufacturer,brand,maxAllowedInputVoltage,maxPowerConsumption);
		this.screenSize = screenSize;

	}
	
	/**
	 * mutator for hasCampaign
	 * @param campaign	has a campaign or not?
	 */
	public void setHasCampaign(boolean campaign) {
		hasCampaign = campaign;
	}

	/**
	 * accessor for hasCampaign
	 * @return television has a campaign or not?
	 */
	public boolean hasCampaign() {
		return hasCampaign;
	}

	/**
	 * accessor for ScreenSize
	 * @return the screen size of television
	 */
	public String getScreenSize() {
		return screenSize;
	}

	/**
	 * mutator for screensize
	 * @param screenSize	the screen size of television
	 */
	public void setScreenSize(String screenSize) {
		this.screenSize = screenSize;
	}
	
	/**
	 * printed on console general information about the television
	 */
	public void showTv(){
		System.out.println("-----------------------");
		System.out.println("Type: TV");
		System.out.println("Item ID: " +getId());
		System.out.println("Price: " + getPrice() +".0 $");
		System.out.println("Manufacturer: " + getManufacturer());
		System.out.println("Brand: " + getBrand());
		System.out.println("Max Volt: " + getMaxAllowedInputVoltage() +" V.");
		System.out.println("Max Watt: " + getMaxPowerConsumption() + " W.");
		System.out.println("Screen size: " + getScreenSize() + "\"");
		
	}
	
	/**
	 * @param Id	Id
	 * @return	boolean tvId is found or not ? 
	 */
	public static boolean checkTvIdIsFound(String Id){
		for(Tv tv :FileOperator.tvList){
			if(tv.getId() == Integer.parseInt(Id)){		
				return true;
			}
		}
		return false;
	}

	/* (non-Javadoc)
	 * @see proj2.Electronic#toString()
	 */
	@Override
	public String toString() {
		return "Tv [screenSize=" + screenSize + ", toString()=" + super.toString() + "]";
	}

	
	
	

}
