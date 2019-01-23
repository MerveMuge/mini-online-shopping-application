//package proj2;

/**
 * @author mug
 *
 */
public class HairCare extends Cosmetic{
	private int isMedicated ;
	private boolean hasCampaign = false;
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
	 * @return integer value of is medicated or not
	 */
	public int getIsMedicated() {
		return isMedicated;
	}


	/**
	 * @param isMedicated	integer value of is medicated or not
	 */
	public void setIsMedicated(int isMedicated) {
		this.isMedicated = isMedicated;
	}


	/**
	 * @param Id	the Id of hair care product which is one of the cosmetic product
	 * @param price	the price of hair care product which is one of the cosmetic product
	 * @param manufacturer	the manufacturer of hair care product which is one of the cosmetic product
	 * @param brand	the manufacturer of hair care product which is one of the cosmetic product
	 * @param isOrganic boolean is organic or not?
	 * @param expirationDate	the expiration date of hair care product which is one of the cosmetic product
	 * @param weight	the weight of hair care product which is one of the cosmetic product
	 * @param isMedicated	Hair care product is medicated or not?
	 * @see #HairCare(int, String, String, String, int, String, double, int) 	hairCareConstructor
	 */
	public HairCare(int Id , String price, String manufacturer, String brand, int isOrganic, String expirationDate, double weight,int isMedicated){
		super(Id , price, manufacturer,brand,expirationDate,weight,isOrganic);
		this.isMedicated = isMedicated;
	}
	
	/**
	 * @param Id item Id
	 * @return boolean hairCare Id is found or not?
	 */
	public static boolean checkHairCareIdIsFound(String Id){
		for(HairCare hairCare :FileOperator.haircareList){
			if(hairCare.getId() == Integer.parseInt(Id)){		
				return true;
			}
		}
		return false;
	}

	/**
	 * printed on console general information about the hair care
	 */
	public void showHairCare(){
		Double d = new Double(getWeight());
		int i = d.intValue();
		System.out.println("-----------------------");
		System.out.println("Type: HairCare");
		System.out.println("Item ID: " +getId());
		System.out.println("Price: " + getPrice() +".0 $");
		System.out.println("Manufacturer: " + getManufacturer());
		System.out.println("Brand: " + getBrand());
		System.out.print("Organic: ");
		System.out.println((getIsOrganic() ==1) ? "Yes" : "No");
		System.out.println("Expiration Date: " + getExpirationDate());
		System.out.println("Weight: " + i + " g.");
		System.out.print("Medicated: ");
		System.out.println((isMedicated == 1 ) ? "Yes" : "No");


	}


	/* (non-Javadoc)
	 * @see proj2.Cosmetic#toString()
	 */
	@Override
	public String toString() {
		return "HairCare [isMedicated=" + isMedicated + ", toString()=" + super.toString() + "]";
	}


}
