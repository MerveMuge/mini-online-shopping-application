//package proj2;

/**
 * @author mug
 *
 */
public class Laptop extends Computer{
	private int doesSupportHDMI ;
	private boolean hasCampaign = false;
	
	
	/**
	 * @param Id	 The Id of a laptop that is a kind of computers
	 * @param price		The price of a laptop that is a kind of computers
	 * @param manufacturer	The manufacturer of a laptop that is a kind of computers
	 * @param brand	The brand of a laptop that is a kind of computers
	 * @param maxAllowedInputVoltage	The max allowed input voltage of a laptop that is a kind of computers
	 * @param maxPowerConsumption	The max power consumption of a laptop that is a kind of computers
	 * @param operatingSystem	The operating system of a laptop that is a kind of computers
	 * @param cpuType	The CPU type of a laptop that is a kind of computers
	 * @param ramCapacity	The RAM capacity of a laptop that is a kind of computers
	 * @param hddCapacity	The HDD capacity of a laptop that is a kind of computers
	 * @param doesSupportHDMI the laptop does support HDMI or not ?
	 * @see #Laptop(int, String, String, String, String, String, String, String, String, String, int)
	 */
	public Laptop(int Id , String price, String manufacturer, String brand, String maxAllowedInputVoltage, String maxPowerConsumption, String  operatingSystem, String cpuType, String  ramCapacity, String  hddCapacity, int doesSupportHDMI){
		super(Id,price,manufacturer,brand,maxAllowedInputVoltage,maxPowerConsumption,operatingSystem,cpuType,ramCapacity,hddCapacity);
		this.doesSupportHDMI = doesSupportHDMI;
	}
	
	/**
	 * @param campaign has campaign or not
	 */
	public void setHasCampaign(boolean campaign) {
		hasCampaign = campaign;
	}

	/**
	 * @return has campaign or not
	 */
	public boolean hasCampaign() {
		return hasCampaign;
	}
	
	/**
	 * @return is does HDMI support or not?
	 */
	public int getDoesSupportHDMI() {
		return doesSupportHDMI;
	}


	/**
	 * @param doesSupportHDMI	 is does HDMI support or not?
	 */
	public void setDoesSupportHDMI(int doesSupportHDMI) {
		this.doesSupportHDMI = doesSupportHDMI;
	}

	/**
	 * @param Id	Item Id
	 * @return boolean laptop Id is found or not?
	 */
	public static boolean checkLaptopIdIsFound(String Id){
		for(Laptop laptop :FileOperator.laptopList){
			if(laptop.getId() == Integer.parseInt(Id)){		
				return true;
			}
		}
		return false;
	}
	

	/**
	 * printed on console general information about the laptop
	 */
	public void showLaptop(){
		System.out.println("-----------------------");
		System.out.println("Type: Laptop");
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
		System.out.print("HDMI support: "  );
		System.out.println((getDoesSupportHDMI() == 1 ) ? "Yes" : "No");
		
	}

	/* (non-Javadoc)
	 * @see proj2.Computer#toString()
	 */
	@Override
	public String toString() {
		return "Laptop [doesSupportHDMI=" + doesSupportHDMI + ", toString()=" + super.toString() + "]";
	}
	
	
}
