//package proj2;


/**
 * @author mug
 *
 */
public class OfficeSupplies extends Item{
	private String  releaseDate;
	private String  coverTitle;

	/**
	 * @param Id	the Id of OfficeSupplies which is one of the item
	 * @param price	the price of OfficeSupplies which is one of the item
	 * @param releaseDate	the release date of office supplies
	 * @param coverTitle	the cover title of office supplies
	 * @see #OfficeSupplies(int, String, String, String) OfficeSuppliesConstructor
	 */
	public OfficeSupplies(int Id , String price,String releaseDate,String  coverTitle){
		super(Id,price);
		this.releaseDate= releaseDate;
		this.coverTitle = coverTitle;
		
	}

	/**
	 * @return the release date of office supplies
	 */
	public String getReleaseDate() {
		return releaseDate;
	}

	/**
	 * @param releaseDate	the release date of office supplies
	 */
	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}

	/**
	 * @return the cover title of office supplies
	 */
	public String getCoverTitle() {
		return coverTitle;
	}
	/**
	 * @param coverTitle the cover title of office supplies
	 */
	public void setCoverTitle(String coverTitle) {
		this.coverTitle = coverTitle;
	}

	/* (non-Javadoc)
	 * @see proj2.Item#toString()
	 */
	@Override
	public String toString() {
		return "OfficeSupplies [releaseDate=" + releaseDate + ", coverTitle=" + coverTitle + ", toString()="
				+ super.toString() + "]";
	}
	
	

}
