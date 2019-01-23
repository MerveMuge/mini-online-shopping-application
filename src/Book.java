//package proj2;

/**
 * @author mug
 *
 */
public class Book extends OfficeSupplies{
	private String publisher;
	private String author;
	private String pages;
	private boolean hasCampaign = false;

	/**
	 * book constructor
	 * 
	 * @param Id	the Id of book which is one of the office supplies
	 * @param price	the price of book which is one of the office supplies
	 * @param releaseDate	the releaseDate of book which is one of the office supplies
	 * @param coverTitle	the coverTitle of book which is one of the office supplies
	 * @param publisher	the publisher of book
	 * @param author	the author or authors of book
	 * @param pages	the pages of book
	 * @see #Book(int, String, String, String, String, String, String) bookConstructor
	 */
	public Book(int Id , String price, String  releaseDate, String  coverTitle, String publisher,
			String author, String pages)
	{
		super(Id ,price,releaseDate,coverTitle);
		this.publisher = publisher;
		this.author= author;
		this.pages = pages;
	}

	/**
	 * mutator for setHasCampaign
	 * 
	 * @param campaign set a campaign
	 */
	public void setHasCampaign(boolean campaign) {
		hasCampaign = campaign;
	}

	/**
	 * accessor for hasCampaign
	 * 
	 * @return boolean has campaign or not? 
	 */
	public boolean hasCampaign() {
		return hasCampaign;
	}

	/**
	 * accessor for author
	 * 
	 * @return author	the book's author
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * mutator for author
	 * 
	 * @param author	the book's author
	 */
	public void setAuthor(String author) {
		this.author = author;
	}

	/**
	 * accessor for publisher
	 * 
	 * @return publisher	book's publisher
	 */
	public String getPublisher() {
		return publisher;
	}
	
	
	/**
	 * mutator for publisher
	 * 
	 * @param publisher	book's publisher
	 */
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	/**
	 * accessor for pages
	 * 
	 * @return pages book's pages
	 */
	public String getPages() {
		return pages;
	}
	
	/**
	 * mutator for pages
	 * 
	 * @param pages book's pages
	 */
	public void setPages(String pages) {
		this.pages = pages;
	}

	
	/**
	 * check book Id is found
	 * 
	 * @param Id	bookId
	 * @return boolean bookId is found or not?
	 */
	public static boolean checkBookIdIsFound(String Id){
		for(Book book :FileOperator.bookList){
			if(book.getId() == Integer.parseInt(Id)){		
				return true;
			}
		}
		return false;
	}
	
	
	/**
	 * printed on console general information about the book which is one of the office supplies
	 */
	public void showBook(){
		System.out.println("-----------------------");
		System.out.println("Type: Book");
		System.out.println("Item ID: " +getId());
		System.out.println("Price: " + getPrice() +".0 $");
		System.out.println("Release Date: " + getReleaseDate());
		System.out.println("Title: " + getCoverTitle());
		System.out.println("Publisher: " + getPublisher());
		System.out.println("Author: " + getAuthor().replaceAll("(,)", ", ") +" ");
		System.out.println("Page: " + getPages() + " pages");

	}
	
	/* (non-Javadoc)
	 * @see proj2.OfficeSupplies#toString()
	 */
	@Override
	public String toString() {
		return "Book [publisher=" + publisher + ", author=" + author + ", pages=" + pages + ", toString()="
				+ super.toString() + "]";
	}



}
