//package proj2;

import java.util.ArrayList;
import java.util.Date;

import javax.net.ssl.SSLEngineResult.Status;

public class Customer extends Person{
	private int customerID;
	private String password;
	private double balance;
	private String status = "CLASSIC";
	public ArrayList<Item> shoppingCart =  new ArrayList<Item>();
	public ArrayList<Customer> goldenCustomerList = new ArrayList<Customer>();


	/**
	 * customer constructor
	 * @param customerID	the Id of customer
	 * @param name	the name of customer which is one of the person
	 * @param eMail	the e-mail of customer which is one of the person
	 * @param dateOfBirth	the date of birth of customer which is one of the person
	 * @param balance	the balance of customer
	 * @param password	the password of customer
	 * @see #Customer(int, String, String, String, double, String)	customerConstructor
	 */
	public Customer(int customerID, String name, String eMail, String dateOfBirth, double balance, String password)  {
		super(name,eMail, dateOfBirth);
		this.customerID = customerID;
		this.balance = balance;
		this.password = password;
	}

	/**
	 * accessor for password
	 * @return password the password of Customer
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * mutator for password
	 * @param password	password the password of Customer
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * accessor for balance
	 * @return the balance of customer
	 */
	public double getBalance() {
		return balance;
	}

	/**
	 * mutator for balance
	 * @param balance	the balance of customer
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}

	/**
	 * accessor for status
	 * @return the status of customer
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * mutator for status
	 * @param status	the status of customer
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * calculate total price
	 * @return total price for items in shopping card
	 */
	public int calculateTotalPrice(){
		int totalPrice = 0;
		for(int i = 0; i < shoppingCart.size(); i++) {
//			if(FileOperator.checkIfItemTypeHasCampaign(shoppingCart.get(i).))
			int price = Integer.parseInt(shoppingCart.get(i).getPrice());
			totalPrice += price;
		}return totalPrice;
	}
	
	/**
	 * 
	 * Answer given when the order is performed
	 */
	public void answerOfOrder(){
		int zero =0;
		if(shoppingCart.size() > zero){
			if(findStatu().equals("GOLDEN")){
				if(getBalance() >= goldenStatusDiscountRate(calculateTotalPrice())){
					System.out.println("Done! Your order will be delivered as soon as possible. Thank you!");
					
					statuStuation();
				}else{
					System.out.println("Order could not be placed. Insufficient funds.");
				}
			}else if(findStatu().equals("SILVER")){
				if(getBalance() >= silverStatusDiscountRate(calculateTotalPrice())){
					System.out.println("Done! Your order will be delivered as soon as possible. Thank you!");
					statuStuation();
				}else{
					System.out.println("Order could not be placed. Insufficient funds.");
				}
			}else{
				if(getBalance() >= classicStatusDiscountRate(calculateTotalPrice())){
					System.out.println("Done! Your order will be delivered as soon as possible. Thank you!");
					statuStuation();
				}else{
					System.out.println("Order could not be placed. Insufficient funds.");
				}
			}
		}
		else{
			System.out.println("You should add some items to your cart before order request!");
		}
	}
	/**
	 * status situation of customer
	 */
	public void statuStuation(){
		int silver = 1000;
		int golden =5000;
		int find =0;
		if(findStatu().equals("CLASSIC")){
			if(silver -calculateTotalPrice() == find){
				System.out.println("Congratulations! You have been upgraded to a SILVER MEMBER! You have earned a discount of 10% on all purchases.");
			}else{
				System.out.println("You need to spend " +(silver - calculateTotalPrice())+" more TL to become a SILVER MEMBER.");
			}
		}else if(findStatu().equals("SILVER")){
			if(golden - calculateTotalPrice() == find){
				System.out.println("Congratulations! You have been upgraded to a GOLDEN MEMBER! You have earned a discount of 15% on all purchases.");
			}else{
				System.out.println("You need to spend " +(golden - calculateTotalPrice())+" more TL to become a GOLDEN MEMBER.");
			}
		}
	}
	
	/**
	 * if password don't match costumer
	 */
	public void dontMatchPassword(){
		System.out.println("Order could not be placed. Invalid password.");
	}

	/**
	 * accessor for customer Id
	 * @return	the Id of customer 
	 */
	public int getCustomerID() {
		return customerID;
	}

	/**
	 * mutator for customer Id
	 * @param customerID	the Id of customer
	 */
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	/**
	 * 
	 * customer card is evacuated
	 */
	public void emptyCart(){
		int x = 0; 
		x = shoppingCart.size();
		System.out.println("The cart has been emptied.");

	}

	/**
	 * @param price customer price after discount
	 * @return price customer price
	 */
	public double silverStatusDiscountRate(int price) {
		return (price / 100) * 10;
	}

	/**
	 * @param price customer price after discount
	 * @return price customer price
	 */
	public double goldenStatusDiscountRate(int price) {
		return (price / 100) * 15;
	}
	/**
	 * @param price customer price after discount
	 * @return price customer price
	 */
	public double classicStatusDiscountRate(int price) {
		return price;
	}
	/**
	 * @param oldPassword the old password of customer
	 * @param NewPassword the new password of customer
	 * @return boolean password could be change or not
	 */
	public boolean changePassword(String oldPassword, String NewPassword){
		if(password.equals(oldPassword)){
			password = NewPassword;
			return true;
		}else{
			return false;
		}
	}

	/**
	 * @param loadAmount	customers can deposit money into their accounts .
	 * @return balance	the new balance of customer
	 */
	public double loadMoney(String loadAmount){
		balance += Double.parseDouble(loadAmount);
		return balance;
	}

	/**
	 * @param Id customerId
	 * @return boolean itemId is accessible or not? 
	 */
	public boolean checkId(String Id){
		for(Item item :FileOperator.itemList){
			if(item.getId() == Integer.parseInt(Id)){		
				return true;
			}
		}
		return false;
	}
	
	/**
	 * @return String status situation
	 */
	public String findStatu(){
		String statu = "CLASSIC";
		int silver =1000;
		int golden = 5000;
		if(calculateTotalPrice() >= golden){
			statu = "GOLDEN";
			
		}
		else if(calculateTotalPrice() >= silver){
			statu = "SILVER";
		}
		return statu;
	}
	
	/* (non-Javadoc)
	 * @see proj2.Person#toString()
	 */
	public String toString(){
		
		return "Customer name: " + getName() + "	" +
				"ID: " + customerID + "	" + 
				"e-mail: " + geteMail() + "	 " +
				"Date of Birth: " + FileOperator.timeConvert(getDateOfBirth()) + "	" +
				"Status: " + findStatu();

	}

	

}
