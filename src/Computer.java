//package proj2;

/**
 * @author mug
 *
 */
public class Computer extends Electronic{
	private String  operatingSystem;
	private String cpuType;
	private String  ramCapacity;
	private String  hddCapacity;

	/**
	 * computer constructor
	 * @param Id	the Id of computer which is one of the electronic
	 * @param price	the price of computer which is one of the electronic
	 * @param manufacturer	the manufacturer of computer which is one of the electronic
	 * @param brand the brand of computer which is one of the electronic
	 * @param maxAllowedInputVoltage	the max allowed input voltage of computer which is one of the electronic
	 * @param maxPowerConsumption	the max power consumption of computer which is one of the electronic
	 * @param operatingSystem the operating system of computer
	 * @param cpuType the CPU type of computer of computer
	 * @param ramCapacity	the RAM capacity of computer
	 * @param hddCapacity	the HDD capacity of computer
	 * @see #Computer(int, String, String, String, String, String, String, String, String, String) computerConstructor
	 */
	public Computer(int Id , String price, String manufacturer,String brand,String maxAllowedInputVoltage,String maxPowerConsumption,String  operatingSystem,String cpuType,String  ramCapacity,String  hddCapacity){
		super(Id,price,manufacturer,brand,maxAllowedInputVoltage,maxPowerConsumption);
		this.operatingSystem=operatingSystem;
		this.cpuType = cpuType;
		this.ramCapacity= ramCapacity;
		this.hddCapacity = hddCapacity;

	}

	/**
	 * accessor  for operating system
	 * @return operating system of computer
	 */
	public String getOperatingSystem() {
		return operatingSystem;
	}
	/**
	 * mutator for operating system
	 * @param operatingSystem	operating system of computer
	 */
	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}
	/**
	 * accessor for CPU type
	 * @return CPU type of computer
	 */
	public String getCpuType() {
		return cpuType;
	}
	/**
	 * mutator for CPU type
	 * @param cpuType	CPU type of computer
	 */
	public void setCpuType(String cpuType) {
		this.cpuType = cpuType;
	}
	/**
	 * accessor for RAM capacity
	 * @return	RAM capacity of computer
	 */
	public String getRamCapacity() {
		return ramCapacity;
	}
	/**
	 * mutator for RAM capacity
	 * @param ramCapacity	RAM capacity of computer
	 */
	public void setRamCapacity(String ramCapacity) {
		this.ramCapacity = ramCapacity;
	}
	/**
	 * accessor for HDD capacity
	 * 
	 * @return	HDD capacity of computer
	 */
	public String getHddCapacity() {
		return hddCapacity;
	}
	
	/**
	 * mutator for HDD capacity
	 * @param hddCapacity	HDD capacity of computer
	 */
	public void setHddCapacity(String hddCapacity) {
		this.hddCapacity = hddCapacity;
	}

	/* (non-Javadoc)
	 * @see proj2.Electronic#toString()
	 */
	@Override
	public String toString() {
		return "Computer [operatingSystem=" + operatingSystem + ", cpuType=" + cpuType + ", ramCapacity=" + ramCapacity
				+ ", hddCapacity=" + hddCapacity + ", toString()=" + super.toString() + "]";
	}

	

}
