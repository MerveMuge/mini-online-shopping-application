//package proj2;

/**
 * @author mug
 *
 */
public class Perfume extends Cosmetic{
	private String lastingDuration;
	private boolean hasCampaign = false;
	
	/**
	 * @param Id the Id of perfume which is one of the cosmetic 
	 * @param price the price of perfume which is one of the cosmetic
	 * @param manufacturer the manufacturer of perfume which is one of the cosmetic
	 * @param brand	the brand of perfume which is one of the cosmetic
	 * @param isOrganic	the perfume which is organic or not 
	 * @param expirationDate	the expiration date of perfume which is one of the cosmetic
	 * @param weight	the weight of perfume which is one of the cosmetic
	 * @param lastingDuration the lasting duration of perfume
	 * @see #Perfume(int, String, String, String, int, String, double, String)
	 */
	public Perfume(int Id , String price, String manufacturer, String brand, int isOrganic, String expirationDate, double weight, String lastingDuration){
		super(Id , price, manufacturer,brand,expirationDate,weight,isOrganic);
		this.lastingDuration = lastingDuration;
	}

	/**
	 * @param campaign	has a campaign or not?
	 */
	public void setHasCampaign(boolean campaign) {
		hasCampaign = campaign;
	}

	/**
	 * @return has a campaign or not?
	 */
	public boolean hasCampaign() {
		return hasCampaign;
	}
	
	/**
	 * @return the lasting duration of perfume
	 */
	public String getLastingDuration() {
		return lastingDuration;
	}

	/**
	 * @param lastingDuration	the lasting duration of perfume
	 */
	public void setLastingDuration(String lastingDuration) {
		this.lastingDuration = lastingDuration;
	}
	
	/**
	 * @param Id ItemID
	 * @return boolean perfumeId is found or not
	 */
	public static boolean checkPerfumeIdIsFound(String Id){
		for(Perfume perfume :FileOperator.perfumeList){
			if(perfume.getId() == Integer.parseInt(Id)){		
				return true;
			}
		}
		return false;
	}
	
	/**
	 * printed on console general information about the perfume
	 */
	public void showPerfume(){
		Double d = new Double(getWeight());
		int i = d.intValue();
		System.out.println("-----------------------");
		System.out.println("Type: Perfume");
		System.out.println("Item ID: " +getId());
		System.out.println("Price: " + getPrice() +".0 $");
		System.out.println("Manufacturer: " + getManufacturer());
		System.out.println("Brand: " + getBrand());
		System.out.print("Organic: ");
		System.out.println((getIsOrganic() ==1) ? "Yes" : "No");
		System.out.println("Expiration Date: " + getExpirationDate());
		System.out.println("Weight: " + i +" g.");
		System.out.println("Lasting Duration: " + getLastingDuration() +" min.");

	}

	/* (non-Javadoc)
	 * @see proj2.Cosmetic#toString()
	 */
	@Override
	public String toString() {
		return "Perfume [lastingDuration=" + lastingDuration + ", toString()=" + super.toString() + "]";
	}

	
}
