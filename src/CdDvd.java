//package proj2;

import java.util.*;

/**
 * @author mug
 *
 */
public class CdDvd extends OfficeSupplies{
	private String  composer;
	private String song;
	private boolean hasCampaign = false;
	
	
	/**
	 * cd dvd constructor
	 * 
	 * @param Id the Id of CdDvd which is one of the office supplies
	 * @param price the price of CdDvd which is one of the office supplies
	 * @param releaseDate the release date of CdDvd which is one of  the office supplies 
	 * @param coverTitle	the cover title of CdDvd which is one of the office supplies
	 * @param composer	the composer of CdDvd
	 * @param song	the song of CdDvd
	 * @see #CdDvd(int, String, String, String, String, String) CdDVd constuructor
	 */
	public CdDvd(int Id , String price,String  releaseDate, String  coverTitle, String composer, String song){
		super(Id ,price,releaseDate,coverTitle);
		this.composer = composer;
		this.song = song;
	}
	
	/**
	 * mutator has campaign
	 * @param campaign boolean of campaign is exist for CDDVD
	 */
	public void setHasCampaign(boolean campaign) {
		hasCampaign = campaign;
	}

	/**
	 * accessor for has campaign
	 * @return boolean has a campaign or not?
	 */
	public boolean hasCampaign() {
		return hasCampaign;
	}
	
	/**
	 * accessor for composer
	 * @return composer cdDvd's composer
	 */
	public String getComposer() {
		return composer;
	}
	/**
	 * mutator for composer
	 * @param composer cdDvd's composer
	 */
	public void setComposer(String composer) {
		this.composer = composer;
	}

	/**
	 * accessor for song
	 * @return song	CdDvd song
	 */
	public String getSong() {
		return song;
	}

	/**
	 * mutator for song
	 * @param song	CdDvd song
	 */
	public void setSong(String song) {
		this.song = song;
	}
	
	/**
	 * check cd dvd Id is found
	 * 
	 * @param Id CdDvd Id
	 * @return boolean check CdDvd Id is found or not
	 */
	public static boolean checkCdDvdIdIsFound(String Id){
		for(CdDvd cdDvd :FileOperator.cddvdList){
			if(cdDvd.getId() == Integer.parseInt(Id)){		
				return true;
			}
		}
		return false;
	}
	
	/**
	 * 
	 * printed on console general information about the CdDvd which is one of the office supplies
	 */
	public void showCdDvd(){
		System.out.println("-----------------------");
		System.out.println("Type: CDDVD");
		System.out.println("Item ID: " +getId());
		System.out.println("Price: " + getPrice() +".0 $");
		System.out.println("Release Date: " + getReleaseDate());
		System.out.println("Title: " + getCoverTitle());
//		yourstring = yourstring.replaceAll("( ,)|(,,)", "");
		System.out.println("Songs: " + getSong().replaceAll("(,)",", ") +" ");
		System.out.println("Composer: " + getComposer());
		

	}

	/* (non-Javadoc)
	 * @see proj2.OfficeSupplies#toString()
	 */
	@Override
	public String toString() {
		return "CdDvd [composer=" + composer + ", song=" + song + ", toString()=" + super.toString() + "]";
	}
	
	

}
