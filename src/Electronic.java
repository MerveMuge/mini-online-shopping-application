//package proj2;

/**
 * @author mug
 *
 */
public class Electronic extends Item{
	private String manufacturer;
	private String brand;
	private String maxAllowedInputVoltage;
	private String maxPowerConsumption; 
	
	/**
	 * @param Id	the Id of electronic which is one of the items
	 * @param price	the price of electronic which is one of the items
	 * @param manufacturer	the manufacturer of electronic
	 * @param brand	the brand of electronic
	 * @param maxAllowedInputVoltage	the max allowed input voltage of electronic
	 * @param maxPowerConsumption	the max power consuption of electronic
	 * @see	#Electronic(int, String, String, String, String, String) electronicConstructor
	 */
	public Electronic(int Id , String price, String manufacturer,String brand,String maxAllowedInputVoltage,String maxPowerConsumption){
		super(Id,price);
		this.manufacturer= manufacturer;
		this.brand = brand;
		this.maxAllowedInputVoltage = maxAllowedInputVoltage;
		this.maxPowerConsumption = maxPowerConsumption;
	}
	
	/**
	 * @return the max allowed input voltage of Electronic
	 */
	public String getMaxAllowedInputVoltage() {
		return maxAllowedInputVoltage;
	}
	/**
	 * @param maxAllowedInputVoltage 	the max allowed input voltage of Electronic
	 */
	public void setMaxAllowedInputVoltage(String maxAllowedInputVoltage) {
		this.maxAllowedInputVoltage = maxAllowedInputVoltage;
	}
	/**
	 * @return the max power consumption of Electronic
	 */
	public String getMaxPowerConsumption() {
		return maxPowerConsumption;
	}
	/**
	 * @param	maxPowerConsumption	the max power consumption of Electronic
	 */
	public void setMaxPowerConsumption(String maxPowerConsumption) {
		this.maxPowerConsumption = maxPowerConsumption;
	}
	
	/**
	 * @return	the manufacturer of Electronic
	 */
	public String getManufacturer() {
		return manufacturer;
	}
	
	/**
	 * @param manufacturer	the manufacturer of Electronic
	 */
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	/**
	 * @return the brand of Electronic
	 */
	public String getBrand() {
		return brand;
	}
	
	/**
	 * @param brand	the brand of Electronic
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}

	/* (non-Javadoc)
	 * @see proj2.Item#toString()
	 */
	@Override
	public String toString() {
		return "Electronic [manufacturer=" + manufacturer + ", brand=" + brand + ", maxAllowedInputVoltage="
				+ maxAllowedInputVoltage + ", maxPowerConsumption=" + maxPowerConsumption + ", toString()="
				+ super.toString() + "]";
	}
	
	
}
