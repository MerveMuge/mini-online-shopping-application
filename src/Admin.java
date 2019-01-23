//package proj2;

import java.util.ArrayList;

/**
 * @author mug
 *
 */
public class Admin extends Employee{
	private String password;
	

	/**
	 * admin constructor
	 * 
	 * @param name 	the Employee's name
	 * @param eMail 	the Employee's eMail
	 * @param dateOfBirth 	the Employee's date of birth
	 * @param salary 	the Employee's salary
	 * @param password 	the Admin's password
	 * @see #Admin(String, String, String, double, String) adminConstructor
	 */
	public Admin(String name, String eMail, String dateOfBirth, double salary,String password){
		super(name,eMail, dateOfBirth,salary);
		this.password = password;
	}

	/**
	 * accessor for password
	 * 
	 * @return	the Admin's password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * mutator for password
	 * 
	 * @param password	the Admin's password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * add customer
	 * 
	 * @param customerID	the customer's Id
	 * @param customerName	the customer's name
	 * @param customerMail	the customer's mail
	 * @param date	the customer's date
	 * @param balance	the customer's balance
	 * @param password	the customer's password
	 * @return customer the customer added to the customerList
	 */
	public Customer addCustomer(int customerID, String customerName,String customerMail,String date,double balance,String password){
		Customer newCustomer = new Customer(customerID, customerName,customerMail,date,balance,password);			
		return newCustomer;
	}

	/**
	 * show customer information
	 * 
	 * @param customer the customer which showing general information
	 * @return general information about customer
	 */
	public String showCustomer(Customer customer){
		return customer.toString();	
	}

	/**
	 * show all customer information
	 * 
	 * @param customerList	list of customers
	 * @return general information about customer
	 */
	public String showAllCustomers(ArrayList<Customer> customerList){
		String result = "";

		for(Customer customer : customerList){
			if(customerList.size()==customer.getCustomerID()){
				result += customer.toString();
			}
			else{
				result += customer.toString() + "\n";
			}

		}
		return result;
	}
	/**
	 * add an admin
	 * 
	 * @param name	the admin's name
	 * @param eMail	the admin's e-mail
	 * @param dateOfBirth	the admin's date of birth
	 * @param salary	the admin's salary
	 * @param password	the admin's password
	 * @return 	admin	the Admin added to the adminList 
	 */
	public Admin addAdmin(String name,String eMail, String dateOfBirth, Double salary,String password){
		Admin newAdmin = new Admin(name,eMail, dateOfBirth, salary,password);
		return newAdmin;
		
	}
	/**
	 * add technician
	 * 
	 * @param name the technician's name
	 * @param eMail	the technician's e-mail
	 * @param dateOfBirth	the technician's date of birth
	 * @param salary	the technician's salary
	 * @param isSenior	the technician is senior or not?
	 * @return technician	the technician added to the techList
	 */
	public Tech addTech(String name,String eMail, String dateOfBirth, Double salary, boolean isSenior){
		Tech newTech = new Tech(name,eMail, dateOfBirth, salary,isSenior);
		return newTech;
		
	}
	
	/**
	 * create a campaign
	 * 
	 * @param startTime the time of start campaign
	 * @param endTime	the time of end campaign
	 * @param itemType	the type of has campaign
	 * @param rate	the rate of campaign 
	 */
	public void createCampaign(String startTime, String endTime, String itemType, int rate) {
		Campaign newCampaign = new Campaign(startTime, endTime, itemType, rate);
		FileOperator.campaignList.add(newCampaign);
		
	}
	/* 
	 * @see proj2.Person#toString()
	 */
	public String toString(){
		//return name+ " " + eMail +" "+ dateOfBirth;
		return "----------- Admin info -----------\n" + "Admin name: " + getName() + "\n" + "Admin e-mail: " +geteMail() + "\n" + "Admin date of birth: " + getDateOfBirth();

	}
	
	



}	