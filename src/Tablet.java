//package proj2;

/**
 * @author mug
 *
 */
public class Tablet extends Computer{
	private String dimensions;
	private boolean hasCampaign = false;
	

	/**
	 * @param Id	the Id of tablet which is one of the computer
	 * @param price	the price of tablet which is one of the computer
	 * @param manufacturer	the manufacturer of tablet which is one of the computer
	 * @param brand	the brand of tablet which is one of the computer
	 * @param maxAllowedInputVoltage	the max allowed input voltage of tablet which is one of the computer
	 * @param maxPowerConsumption	the max power consumption of tablet which is one of the computer
	 * @param operatingSystem	the operating System of tablet which is one of the computer
	 * @param cpuType	the cpuType of tablet which is one of the computer
	 * @param ramCapacity	the ramCapacity of tablet which is one of the computer
	 * @param hddCapacity	the hddCapacity of tablet which is one of the computer
	 * @param dimensions the dimension of tablet 
	 * @see #Tablet(int, String, String, String, String, String, String, String, String, String, String)	tabletConstructor
	 */
	public Tablet(int Id , String price, String manufacturer, String brand, String maxAllowedInputVoltage,String maxPowerConsumption, String  operatingSystem, String cpuType, String  ramCapacity, String  hddCapacity, String dimensions){
		super(Id,price,manufacturer,brand,maxAllowedInputVoltage,maxPowerConsumption,operatingSystem,cpuType,ramCapacity,hddCapacity);
		this.dimensions = dimensions;

	}
	
	/**
	 * @param campaign	boolean tablet has a campaign or not?
	 */
	public void setHasCampaign(boolean campaign) {
		hasCampaign = campaign;
	}

	/**
	 * @return boolean tablet has a campaign or not?
	 */
	public boolean hasCampaign() {
		return hasCampaign;
	}

	/**
	 * @return	dimension of tablet
	 */
	public String getDimensions() {
		return dimensions;
	}

	/**
	 * @param dimensions	dimension of tablet
	 */
	public void setDimensions(String dimensions) {
		this.dimensions = dimensions;
	}
	
	/**
	 * @param Id	Item Id
	 * @return	boolean tabletId is found or not ?
	 */
	public static boolean checkTabletIdIsFound(String Id){
		for(Tablet tablet :FileOperator.tabletList){
			if(tablet.getId() == Integer.parseInt(Id)){		
				return true;
			}
		}
		return false;
	}
	
	/**
	 * printed on console general information about the tablet which is one of the computer
	 */
	public void showTablet(){
		System.out.println("-----------------------");
		System.out.println("Type: Tablet");
		System.out.println("Item ID: " +getId());
		System.out.println("Price: " + getPrice() +".0 $");
		System.out.println("Manufacturer: " + getManufacturer());
		System.out.println("Brand: " + getBrand());
		System.out.println("Max Volt: " + getMaxAllowedInputVoltage() +" V.");
		System.out.println("Max Watt: " + getMaxPowerConsumption() + " W.");
		System.out.println("Operating System: " + getOperatingSystem());
		System.out.println("CPU Type: " +getCpuType());
		System.out.println("RAM Capacity: " +getRamCapacity() + " GB.");
		System.out.println("HDD Capacity: " +getHddCapacity() + " GB.");
		System.out.println("Dimension: "  + getDimensions() + " in.");
	}

	/* (non-Javadoc)
	 * @see proj2.Computer#toString()
	 */
	@Override
	public String toString() {
		return "Tablet [dimensions=" + dimensions + ", toString()=" + super.toString() + "]";
	}

	
	
	

}
