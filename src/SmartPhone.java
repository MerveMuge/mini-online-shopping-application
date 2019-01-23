//package proj2;

/**
 * @author mug
 *
 */
public class SmartPhone extends Electronic{
	private String screenType;
	private boolean hasCampaign = false;
	
	/**
	 * @param Id	the Id of smartPhone which is one of the Electronic
	 * @param price	the price of smartPhone which is one of the Electronic
	 * @param manufacturer	the Id of smartPhone which is one of the Electronic
	 * @param brand	the brand of smartPhone which is one of the Electronic
	 * @param maxAllowedInputVoltage	the max allowed input voltage of smartPhone which is one of the Electronic
	 * @param maxPowerConsumption	the max power consumption of smartPhone which is one of the Electronic
	 * @param screenType	the screen type of smartPhone
	 * @see #SmartPhone(int, String, String, String, String, String, String) smartPhoneConstructor
	 */
	public SmartPhone(int Id , String price, String manufacturer,String brand,String maxAllowedInputVoltage,String maxPowerConsumption,String screenType){
		super(Id ,price,manufacturer,brand,maxAllowedInputVoltage,maxPowerConsumption);
		this.screenType = screenType;

	}
	
	/**
	 * @param campaign	boolean has a campaign or not?
	 */
	public void setHasCampaign(boolean campaign) {
		hasCampaign = campaign;
	}

	/**
	 * @return boolean has a campaign or not?
	 */
	public boolean hasCampaign() {
		return hasCampaign;
	}

	/**
	 * @return screen type of smartPhone
	 */
	public String getScreenType() {
		return screenType;
	}

	/**
	 * @param screenType	screen type of smartPhone
	 */
	public void setScreenType(String screenType) {
		this.screenType = screenType;
	}
	
	/**
	 * @param Id	item Id
	 * @return	boolean smartphoneId is found or not?
	 */
	public static boolean checkSmartPhoneIdIsFound(String Id){
		for(SmartPhone smartPhone :FileOperator.smartPhoneList){
			if(smartPhone.getId() == Integer.parseInt(Id)){		
				return true;
			}
		}
		return false;
	}

	
	/**
	 * printed on console general information about the smartPhone which is one of the Electronic 
	 */
	public void showSmartPhone(){
		System.out.println("-----------------------");
		System.out.println("Type: SmartPhone");
		System.out.println("Item ID: " +getId());
		System.out.println("Price: " + getPrice() +".0 $");
		System.out.println("Manufacturer: " + getManufacturer());
		System.out.println("Brand: " + getBrand());
		System.out.println("Max Volt: " + getMaxAllowedInputVoltage()+ " V.");
		System.out.println("Max Watt: " + getMaxPowerConsumption()+ " W.");
		System.out.println("Screen Type: " + getScreenType());

	}
	
	/* (non-Javadoc)
	 * @see proj2.Electronic#toString()
	 */
	@Override
	public String toString() {
		return "SmartPhone [screenType=" + screenType + ", toString()=" + super.toString() + "]";
	}


}
