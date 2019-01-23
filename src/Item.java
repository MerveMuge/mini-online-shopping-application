//package proj2;

/**
 * @author mug
 *
 */
public class Item {
	private int Id ;
	private String price;
	
	/**
	 * @param Id the Id of the Item
	 * @param price the price of the Item
	 * @see #Item(int, String) ItemConstructor
	 */
	public Item(int Id , String price){
		this.Id = Id;
		this.price = price;
	}
	
	/**
	 * @return the Id of Item
	 */
	public int getId() {
		return Id;
	}
	
	/**
	 * @param id Id
	 */
	public void setId(int id) {
		Id = id;
	}
	
	/**
	 * @return the price of item
	 */
	public String getPrice() {
		return price;
	}
	
	/**
	 * @param price	the price of item
	 */
	public void setPrice(String price) {
		this.price = price;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Item [Id=" + Id + ", price=" + price + "]";
	}
	
	

}
