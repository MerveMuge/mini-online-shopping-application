//package proj2;

/**
 * @author mug
 *
 */
public class Campaign {
	private String startTime;
	private String endTime;
	private int rate;
	private String itemType;
	
	/**
	 * campaign constructor
	 * 
	 * @param startTime the start time of campaign
	 * @param endTime the end time of campaign
	 * @param itemType	the type of which item has a campaign
	 * @param rate	the rate of campaign
	 * @see #Campaign(String, String, String, int) campaignConstructor
	 */
	public Campaign(String startTime, String endTime, String itemType, int rate) {
		this.startTime = startTime;
		this.endTime = endTime;
		this.rate = rate;
		this.itemType = itemType;
	}
	
	/**
	 * accessor for start time
	 * 
	 * @return the start time of campaign
	 */
	public String getStartTime() {
		return startTime;
	}
	/**
	 * mutator for start time
	 * 
	 * @param startTime	the start time of campaign
	 */
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	/**
	 * accessor for end time
	 * 
	 * @return the end time of campaign
	 */
	public String getEndTime() {
		return endTime;
	}
	/**
	 * mutatort for end time
	 * 
	 * @param endTime	the end time of campaign
	 */
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	/**
	 * accessor for rate
	 * 
	 * @return rate	rate of campaign 
	 */
	public int getRate() {
		return rate;
	}
	/**
	 * mutator for rate
	 * 
	 * @param rate rate of Campaign discount
	 */
	public void setRate(int rate) {
		this.rate = rate;
	}
	
	/**
	 * accessor for item type
	 * 
	 * @return item type of campaign
	 */
	public String getItemType() {
		return itemType;
	}
	/**
	 * mutator for item type
	 * @param itemType	item type of campaign
	 */
	public void setItemType(String itemType) {
		this.itemType = itemType;
	}
	/**
	 * convert date writing
	 * 
	 * @param date convert date writing
	 * @return date new date writing
	 */
	public String convertDate(String date){
		date = date.replace(".", "/") ;
		return date;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString(){
		return getRate() +"%" +" sale of "+ getItemType() + " until "+convertDate(getEndTime());
	}
	
	
}
