//package proj2;

import java.util.ArrayList;

/**
 * @author mug
 *
 */
public class Order {
	private String orderDate;
	private Double totalCost;
	private int customerId;
	public static ArrayList<Item> purchasedList = new ArrayList<Item>();
	 /**
	 * @param orderDate the date of order
	 * @param totalCost the total cost of order
	 * @param purchasedlist the purchased list of order
	 * @param customerId the Id of customer which give an order
	 * @see #Order(String, Double, ArrayList, int) OrderConstructor
	 */
	public Order(String orderDate,Double totalCost,ArrayList<Item> purchasedlist,int customerId){
		 this.totalCost=totalCost;
		 this.orderDate =orderDate;
		 this.purchasedList = purchasedlist;
		 this.customerId = customerId;
	 }
	/**
	 * @return Date of order
	 */
	public String getOrderDate() {
		return orderDate;
	}
	/**
	 * @param orderDate	 Date of order
	 */
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	/**
	 * @return total cost of order
	 */
	public Double getTotalCost() {
		return totalCost;
	}
	/**
	 * @param totalCost	total cost of order
	 */
	public void setTotalCost(Double totalCost) {
		this.totalCost = totalCost;
	}
	/**
	 * @return customerId of customer which is give an order
	 */
	public int getCustomerId() {
		return customerId;
	}
	/**
	 * @param customerId	customerId of customer which is give an order
	 */
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	/**
	 * @return	purchased list of order
	 */
	public static ArrayList<Item> getPurchasedList() {
		return purchasedList;
	}
	/**
	 * @param purchasedList	purchased list of order
	 */
	public static void setPurchasedList(ArrayList<Item> purchasedList) {
		Order.purchasedList = purchasedList;
	}
	

}
