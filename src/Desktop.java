//package proj2;

/**
 * @author mug
 *
 */
public class Desktop extends Computer{
	private String  boxColor;
	private boolean hasCampaign = false;
	

	/**
	 * desktop constructor
	 * @param Id	the Id of desktop which is one of the computer
	 * @param price	the price of desktop which is one of the computer
	 * @param manufacturer	the manufacturer of desktop which is one of the computer
	 * @param brand	the brand of desktop which is one of the computer
	 * @param maxAllowedInputVoltage	the max allowed input voltage of desktop which is one of the computer
	 * @param maxPowerConsumption	the max power consumption of desktop which is one of the computer
	 * @param operatingSystem	the operating system of desktop which is one of the computer
	 * @param cpuType	the CPU type of desktop which is one of the computer
	 * @param ramCapacity	the RAM capacity of desktop which is one of the computer
	 * @param hddCapacity	the HDD capacity of desktop which is one of the computer
	 * @param boxColor the box colour of desktop
	 * @see #Desktop(int, String, String, String, String, String, String, String, String, String, String)
	 */
	public Desktop(int Id , String price, String manufacturer, String brand, String maxAllowedInputVoltage, String maxPowerConsumption, String  operatingSystem, String cpuType, String  ramCapacity, String  hddCapacity, String  boxColor){
		super(Id,price, manufacturer,brand,maxAllowedInputVoltage,maxPowerConsumption,operatingSystem,cpuType,ramCapacity,hddCapacity);
		this.boxColor = boxColor;
	}
	
	/**
	 * mutator for has campaign
	 * @param campaign desktop campaign situation
	 */
	public void setHasCampaign(boolean campaign) {
		hasCampaign = campaign;
	}

	/**
	 * accessor for has campaign
	 * @return it has a campaign or not ?
	 */
	public boolean hasCampaign() {
		return hasCampaign;
	}

	/**
	 * accessor for box colour
	 * @return the box colour of desktop 
	 */
	public String getBoxColor() {
		return boxColor;
	}

	/**
	 * @param boxColor the box colour of desktop 
	 */
	public void setBoxColor(String boxColor) {
		this.boxColor = boxColor;
	}
	
	/**
	 * @param Id ItemId
	 * @return boolean DesktopId or not ?
	 */
	public static boolean checkDestopIdIsFound(String Id){
		for(Desktop desktop :FileOperator.desktopList){
			if(desktop.getId() == Integer.parseInt(Id)){		
				return true;
			}
		}
		return false;
	}
	
	/**
	 * printed on console general information about the desktop which is one of the computer
	 */
	public void showDesktop(){
		System.out.println("-----------------------");
		System.out.println("Type: Desktop");
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
		System.out.println("Box Color: " +getBoxColor());
	}

	/* (non-Javadoc)
	 * @see proj2.Computer#toString()
	 */
	@Override
	public String toString() {
		return "Desktop [boxColor=" + boxColor + ", toString()=" + super.toString() + "]";
	}

	
}
