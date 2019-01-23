//package proj2;

/**
 * @author mug
 *
 */
public class Cosmetic extends Item{
	private String manufacturer;
	private String brand;
	private String expirationDate;
	private double weight;
	private int isOrganic;
	
	/**
	 * cosmetic constructor
	 * 
	 * @param Id	the Id of the cosmetic product which is one of the item
	 * @param price	the Id of the cosmetic product which is one of the item
	 * @param manufacturer the manufacturer of the cosmetic product
	 * @param brand the brand of the cosmetic product
	 * @param expirationDate	the expiration date of the cosmetic product
	 * @param weight	the weight of the cosmetic product
	 * @param isOrganic int value of cosmetic product is organic or not
	 * @see #Cosmetic(int, String, String, String, String, double, int)	cosmeticConstructor
	 */
	public Cosmetic(int Id , String price, String manufacturer,String brand,String expirationDate,double weight,int isOrganic){
		super(Id , price);
		this.manufacturer = manufacturer;
		this.brand = brand;
		this.expirationDate = expirationDate;
		this.weight  = weight;
		this.isOrganic = isOrganic;
		
	}

	/**
	 * accessor for expiration date
	 * @return the expiration date of cosmetic product
	 */
	public String getExpirationDate() {
		return expirationDate;
	}
	
	/**
	 * mutator for expiration date
	 * @param expirationDate	the expiration date of cosmetic product
	 */
	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}
	/**
	 * accessor for weight
	 * @return weight of cosmetic product
	 */
	public double getWeight() {
		return weight;
	}
	/**
	 * mutator for weight
	 * @param weight	weight of cosmetic product
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	/**
	 * accessor for is organic
	 * @return integer value of is organic or not
	 */
	public int getIsOrganic() {
		return isOrganic;
	}

	/**
	 * mutator for is organic
	 * @param isOrganic	integer value of is organic or not
	 */
	public void setIsOrganic(int isOrganic) {
		this.isOrganic = isOrganic;
	}

	/**
	 * accessor for manufacturer
	 * @return the manufacturer of cosmetic
	 */
	public String getManufacturer() {
		return manufacturer;
	}
	
	/**
	 * mutator for manufacturer
	 * @param manufacturer	the manufacturer of cosmetic
	 */
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	/**
	 * accessor for brand
	 * @return the brand of cosmetic products
	 */
	public String getBrand() {
		return brand;
	}
	/**
	 * mutator for brand
	 * @param brand	the brand of cosmetic products
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}

	/* (non-Javadoc)
	 * @see proj2.Item#toString()
	 */
	@Override
	public String toString() {
		return "Cosmetic [manufacturer=" + manufacturer + ", brand=" + brand + ", expirationDate=" + expirationDate
				+ ", weight=" + weight + ", isOrganic=" + isOrganic + ", toString()=" + super.toString() + "]";
	}
	
	

}
