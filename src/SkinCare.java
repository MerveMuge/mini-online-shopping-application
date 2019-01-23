//package proj2;

/**
 * @author mug
 *
 */
public class SkinCare extends Cosmetic{
	private int isBabySensitive;
	private boolean hasCampaign = false;
	

	/**
	 * @param Id	the Id of Skin Care product which is one of the cosmetic product
	 * @param price	the price of Skin Care product which is one of the cosmetic product
	 * @param manufacturer	the manufacturer of Skin Care product which is one of the cosmetic product
	 * @param brand	the manufacturer of Skin Care product which is one of the cosmetic product
	 * @param isOrganic boolean is organic or not?
	 * @param expirationDate	the expiration date of Skin Care product which is one of the cosmetic product
	 * @param weight	the weight of Skin Care product which is one of the cosmetic product
	 * @param isBabySensitive	boolean is baby sensitive or not?
	 * @see #SkinCare(int, String, String, String, int, String, double, int) skincareConstructor
	 */
	public SkinCare(int Id , String price, String manufacturer,String brand, int isOrganic, String expirationDate, double weight, int isBabySensitive){
		super(Id , price,manufacturer, brand, expirationDate,weight,isOrganic);
		this.isBabySensitive = isBabySensitive;
	}

	/**
	 * @param campaign	boolean has a campaign or not
	 */
	public void setHasCampaign(boolean campaign) {
		hasCampaign = campaign;
	}

	/**
	 * @return	boolean has a campaign or not
	 */
	public boolean hasCampaign() {
		return hasCampaign;
	}
	
	/**
	 * @return int value of product is baby sensitive or not
	 */
	public int getIsBabySensitive() {
		return isBabySensitive;
	}

	/**
	 * @param isBabySensitive	int value of product is baby sensitive or not
	 */
	public void setIsBabySensitive(int isBabySensitive) {
		this.isBabySensitive = isBabySensitive;
	}

	/**
	 * @param Id Item Id
	 * @return	boolean skin care product is found or not?
	 */
	public static boolean checkSkinCareIdIsFound(String Id){
		for(SkinCare skinCare :FileOperator.skincareList){
			if(skinCare.getId() == Integer.parseInt(Id)){		
				return true;
			}
		}
		return false;
	}

	/**
	 * printed on console general information about the skin care product which is one of the cosmetic product
	 */
	public void showSkinCare(){
		Double d = new Double(getWeight());
		int i = d.intValue();
		System.out.println("-----------------------");
		System.out.println("Type: SkinCare");
		System.out.println("Item ID: " +getId());
		System.out.println("Price: " + getPrice() +".0 $");
		System.out.println("Manufacturer: " + getManufacturer());
		System.out.println("Brand: " + getBrand());
		System.out.print("Organic: ");
		System.out.println((getIsOrganic() ==1) ? "Yes" : "No");
		System.out.println("Expiration Date: " + getExpirationDate());
		System.out.println("Weight: " + i +" g.");
		System.out.print("Baby Sensitive: ");
		System.out.println((getIsBabySensitive() == 1) ? "Yes" : "No");

	}

	/* (non-Javadoc)
	 * @see proj2.Cosmetic#toString()
	 */
	@Override
	public String toString() {
		return "SkinCare [isBabySensitive=" + isBabySensitive + ", toString()=" + super.toString() + "]";
	}

	
}
