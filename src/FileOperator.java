//package proj2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Method;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import  java.util.Date;

/**
 * @author mug
 *
 */
public class FileOperator {
	/**
	 * booklist is a arraylist which list of book items 
	 */
	public static ArrayList<Book> bookList;
	
	/**
	 * CdDvdlist is a arraylist which list of CdDvd items
	 */
	public static ArrayList<CdDvd> cddvdList;
	
	/**
	 * desktopList is a arraylist which list of desktop items
	 */
	public static ArrayList<Desktop> desktopList;
	/**
	 * laptopList is a arraylist which list of laptop items
	 */
	public static ArrayList<Laptop> laptopList;
	
	/**
	 * tabletList is a arraylist which list of tablet items
	 */
	public static ArrayList<Tablet> tabletList;
	
	/**
	 * tvList is a arraylist which list of tv items
	 */
	public static ArrayList<Tv> tvList;
	/**
	 * smartPhoneList is a arraylist which list of smart phone items
	 */
	public static ArrayList<SmartPhone> smartPhoneList;
	
	/**
	 * haircareList is a arraylist which list of hair care items
	 */
	public static ArrayList<HairCare> haircareList;
	
	/**
	 * skincareList is a arraylist which list of skin care items
	 */
	public static ArrayList<SkinCare> skincareList;
	
	/**
	 * perfumeList is a arraylist which list of perfume items
	 */
	public static ArrayList<Perfume> perfumeList;
	
	/**
	 * campaignList is a arraylist which list of campaign items
	 */
	public static ArrayList<Campaign> campaignList;
	/**
	 *  itemList is a arraylist which list of items
	 */
	public static ArrayList<Item> itemList ;
	
	/**
	 * customerList is a arraylist which list of customer person
	 */
	public static ArrayList<Customer> customerList;
	
	/**
	 * techList is a arraylist which list of technician person
	 */
	public	ArrayList<Tech> techList;
	
	/**
	 * adminList is a arraylist which list of admin person
	 */
	public 	ArrayList<Admin> adminList;
	/**
	 * give an Id for each item
	 */
	public static int Id = 0;

	/**
	 * @param fileName file name
	 * 
	 * Read user information
	 * Create the list of people according to the user's type 
	 * 
	 */
	public void userFileReader(String fileName) {

		BufferedReader br = null;
		FileReader fr = null;

		try {

			fr = new FileReader(fileName);
			br = new BufferedReader(fr);

			String sCurrentLine;
			String[] lineTokens;

			customerList = new ArrayList<Customer>();
			techList = new ArrayList<Tech>();
			adminList = new ArrayList<Admin>();


			br = new BufferedReader(new FileReader(fileName));

			while ((sCurrentLine = br.readLine()) != null) {
				lineTokens = sCurrentLine.split("\\t+");
				if(lineTokens[0].equals("ADMIN")) {

					Admin newAdmin = new Admin(lineTokens[1],lineTokens[2],lineTokens[3],Double.parseDouble(lineTokens[4]),lineTokens[5]);
					adminList.add(newAdmin);

				} else if(lineTokens[0].equals("CUSTOMER")) {
					int customerID = customerList.size() + 1;
					Customer newCustomer = new Customer(customerID, lineTokens[1],lineTokens[2],lineTokens[3],Double.parseDouble(lineTokens[4]),lineTokens[5]);
					customerList.add(newCustomer);

				} else if(lineTokens[0].equals("TECH")) {
					Tech newTech = new Tech(lineTokens[1],lineTokens[2],lineTokens[3],Double.parseDouble(lineTokens[4]),Boolean.parseBoolean(lineTokens[5]));
					techList.add(newTech);


				} else {
					System.out.println("wrong type : " + lineTokens[0] + "!");
				}	


			}
		} catch (IOException e) {

			e.printStackTrace();

		} finally {
			try {

				if (br != null)
					br.close();

				if (fr != null)
					fr.close();
			} catch (IOException ex) {

				ex.printStackTrace();
			}
		}
	}

	/**
	 * @param fileName	file name
	 * 
	 * read item information
	 * create the list of item according to the item's type
	 */
	public void itemFileReader(String fileName) {

		BufferedReader br = null;
		FileReader fr = null;

		try {

			fr = new FileReader(fileName);
			br = new BufferedReader(fr);

			String sCurrentLine;
			String[] lineTokens;

			bookList = new ArrayList<Book>();
			cddvdList = new ArrayList<CdDvd>();
			desktopList = new ArrayList<Desktop>();
			laptopList = new ArrayList<Laptop>();
			tabletList = new ArrayList<Tablet>();
			tvList = new ArrayList<Tv>();
			smartPhoneList = new ArrayList<SmartPhone>();
			haircareList = new ArrayList<HairCare>();
			skincareList = new ArrayList<SkinCare>();
			perfumeList = new ArrayList<Perfume>();
			itemList = new ArrayList<Item>();

			br = new BufferedReader(new FileReader(fileName));

			while ((sCurrentLine = br.readLine()) != null) {
				lineTokens = sCurrentLine.split("\\t+");
				if(lineTokens[0].equals("BOOK")){
					Id +=1;
					Book newBook = new Book(Id, lineTokens[1], lineTokens[2], lineTokens[3], lineTokens[4], lineTokens[5], lineTokens[6]);
					bookList.add(newBook);
					itemList.add(newBook);
				}
				else if(lineTokens[0].equals("CDDVD")) {
					Id +=1;
					CdDvd newCdDvd = new CdDvd(Id, lineTokens[1], lineTokens[2], lineTokens[3], lineTokens[4], lineTokens[5]);
					cddvdList.add(newCdDvd);
					itemList.add(newCdDvd);
				}
				else if(lineTokens[0].equals("DESKTOP")) {
					Id +=1;
					Desktop newDesktop = new Desktop(Id, lineTokens[1], lineTokens[2], lineTokens[3], lineTokens[4], lineTokens[5], lineTokens[6], lineTokens[7], lineTokens[8], lineTokens[9], lineTokens[10]);
					desktopList.add(newDesktop);
					itemList.add(newDesktop);
				}
				else if(lineTokens[0].equals("LAPTOP")) {
					Id +=1;
					Laptop newLaptop = new Laptop(Id, lineTokens[1], lineTokens[2], lineTokens[3], lineTokens[4], lineTokens[5], lineTokens[6], lineTokens[7], lineTokens[8], lineTokens[9], Integer.parseInt(lineTokens[10]));
					laptopList.add(newLaptop);
					itemList.add(newLaptop);
				}
				else if(lineTokens[0].equals("TABLET")) {
					Id +=1;
					Tablet newTablet = new Tablet(Id, lineTokens[1], lineTokens[2], lineTokens[3], lineTokens[4], lineTokens[5], lineTokens[6], lineTokens[7], lineTokens[8], lineTokens[9], lineTokens[10]);
					tabletList.add(newTablet);
					itemList.add(newTablet);
				}
				else if(lineTokens[0].equals("TV")) {
					Id +=1;
					Tv newTv = new Tv(Id, lineTokens[1], lineTokens[2], lineTokens[3], lineTokens[4], lineTokens[5], lineTokens[6]);
					tvList.add(newTv);
					itemList.add(newTv);
				}
				else if(lineTokens[0].equals("SMARTPHONE")) {
					Id +=1;
					SmartPhone newSmartPhone = new SmartPhone(Id, lineTokens[1], lineTokens[2], lineTokens[3], lineTokens[4], lineTokens[5], lineTokens[6]);
					smartPhoneList.add(newSmartPhone);
					itemList.add(newSmartPhone);
				}
				else if(lineTokens[0].equals("HAIRCARE")) {
					Id +=1;
					HairCare newHairCare = new HairCare(Id, lineTokens[1], lineTokens[2], lineTokens[3], Integer.parseInt(lineTokens[4]), lineTokens[5], Double.parseDouble(lineTokens[6]),Integer.parseInt(lineTokens[7]));
					haircareList.add(newHairCare);
					itemList.add(newHairCare);
				}
				else if(lineTokens[0].equals("PERFUME")) {
					Id +=1;
					Perfume newPerfume = new Perfume(Id, lineTokens[1], lineTokens[2], lineTokens[3], Integer.parseInt(lineTokens[4]), lineTokens[5], Double.parseDouble(lineTokens[6]), lineTokens[7]);
					perfumeList.add(newPerfume);
					itemList.add(newPerfume);
				}
				else if(lineTokens[0].equals("SKINCARE")) {
					Id +=1;
					SkinCare newSkinCare = new SkinCare(Id, lineTokens[1], lineTokens[2], lineTokens[3], Integer.parseInt(lineTokens[4]), lineTokens[5], Double.parseDouble(lineTokens[6]), Integer.parseInt(lineTokens[7]));
					skincareList.add(newSkinCare);
					itemList.add(newSkinCare);
				}

			}

		} catch (IOException e) {

			e.printStackTrace();

		} finally {

			try {

				if (br != null)
					br.close();

				if (fr != null)
					fr.close();

			} catch (IOException ex) {

				ex.printStackTrace();
			}
		}
	}

	/**
	 * @param fileName	file name
	 * 
	 * read the command information
	 * Carry out transactions according to the given order
	 */
	public void commandFileReader(String fileName) {

		BufferedReader br = null;
		FileReader fr = null;

		try {
			campaignList =new ArrayList<Campaign>();

			fr = new FileReader(fileName);
			br = new BufferedReader(fr);

			String sCurrentLine;
			String[] lineTokens;

			br = new BufferedReader(new FileReader(fileName));

			while ((sCurrentLine = br.readLine()) != null) {

				System.out.println("\nCOMMAND TEXT: <" + sCurrentLine + ">\n");

				lineTokens = sCurrentLine.split("\\t+");

				if(lineTokens[0].equals("ADDCUSTOMER")) {
					if(adminExists(lineTokens[1])){
						int customerID = customerList.size() + 1;
						Admin admin = getAdminFromName(lineTokens[1]);
						Customer newCustomer = admin.addCustomer(customerID, lineTokens[2],lineTokens[3],lineTokens[4],Double.parseDouble(lineTokens[5]),lineTokens[6]);	
						customerList.add(newCustomer);
					}
					else {
						System.out.println("No admin person named "+ lineTokens[1]+ " exists!" );			
					}

				}
				else if(lineTokens[0].equals("SHOWCUSTOMER")) {
					if(adminExists(lineTokens[1])){
						Customer customerToShow = customerList.get(Integer.parseInt(lineTokens[2])-1);
						Admin admin = getAdminFromName(lineTokens[1]);
						System.out.println(admin.showCustomer(customerToShow));
					}
					else {
						System.out.println("No admin person named "+ lineTokens[1]+ " exists!" );			
					}

				}

				else if(lineTokens[0].equals("SHOWCUSTOMERS")) {	
					if(adminExists(lineTokens[1])){
						Admin admin = getAdminFromName(lineTokens[1]);
						System.out.println(admin.showAllCustomers(customerList));

					}
					else {
						System.out.println("No admin person named "+ lineTokens[1]+ " exists!" );			
					}
				}
				else if(lineTokens[0].equals("ADDTOCART")) {
					if(customerExists(Integer.parseInt(lineTokens[1]))){
						Customer customer = getCustomerFromId(Integer.parseInt(lineTokens[1]));
						if(customer.checkId(lineTokens[2])){
							if(Book.checkBookIdIsFound(lineTokens[2])){
								customer.shoppingCart.add(getBookFromId(Integer.parseInt(lineTokens[2])));
								System.out.println("The item Book has been successfully added to your cart.");
							}
							else if(CdDvd.checkCdDvdIdIsFound(lineTokens[2])){
								customer.shoppingCart.add(getcdDvdFromId(Integer.parseInt(lineTokens[2])));
								System.out.println("The item CDDVD has been successfully added to your cart.");
							}
							else if(Desktop.checkDestopIdIsFound(lineTokens[2])){
								customer.shoppingCart.add(getDesktopFromId(Integer.parseInt(lineTokens[2])));
								System.out.println("The item Desktop has been successfully added to your cart.");
							}
							else if(Laptop.checkLaptopIdIsFound(lineTokens[2])){
								customer.shoppingCart.add(getLaptopFromId(Integer.parseInt(lineTokens[2])));
								System.out.println("The item Laptop has been successfully added to your cart.");
							}
							else if(Tablet.checkTabletIdIsFound(lineTokens[2])){
								customer.shoppingCart.add(getTabletFromId(Integer.parseInt(lineTokens[2])));
								System.out.println("The item Tablet has been successfully added to your cart.");
							}
							else if(SmartPhone.checkSmartPhoneIdIsFound(lineTokens[2])){
								customer.shoppingCart.add(getSmartPhoneFromId(Integer.parseInt(lineTokens[2])));
								System.out.println("The item SmartPhone has been successfully added to your cart.");
							}
							else if(Tv.checkTvIdIsFound(lineTokens[2])){
								customer.shoppingCart.add(getTvFromId(Integer.parseInt(lineTokens[2])));
								System.out.println("The item SmartPhone has been successfully added to your cart.");
							}
							else if(Perfume.checkPerfumeIdIsFound(lineTokens[2])){
								customer.shoppingCart.add(getPerfumeFromId(Integer.parseInt(lineTokens[2])));
								System.out.println("The item Perfume has been successfully added to your cart.");
							}
							else if(HairCare.checkHairCareIdIsFound(lineTokens[2])){
								customer.shoppingCart.add(getHairCareFromId(Integer.parseInt(lineTokens[2])));
								System.out.println("The item HairCare has been successfully added to your cart.");
							}
							else if(SkinCare.checkSkinCareIdIsFound(lineTokens[2])){
								customer.shoppingCart.add(getSkinCareFromId(Integer.parseInt(lineTokens[2])));
								System.out.println("The item SkinCare has been successfully added to your cart.");
							}
							else{
								System.out.println("We are sorry. The item is temporarily unavailable.");
							}
						}else{
							System.out.println("Invalid item ID");
						}

					}else{
						System.out.println("No customer with ID number "+ Integer.parseInt(lineTokens[1]) +" exists!");
					}

				}
				else if(lineTokens[0].equals("ORDER")) {
					if(customerExists(Integer.parseInt(lineTokens[1]))){
						Customer customer = getCustomerFromId(Integer.parseInt(lineTokens[1]));
						if(customer.getPassword().equals(lineTokens[2])){
							customer.answerOfOrder();
						
						}
							else{
							customer.dontMatchPassword();
						}
						
					}else{
						System.out.println("No customer with ID number "+ lineTokens[1] +" exists!");
					}
				}

				else if(lineTokens[0].equals("SHOWADMININFO")) {
					if(adminExists(lineTokens[1])){
						Admin admin = getAdminFromName(lineTokens[1]);
						System.out.println(admin.toString());
					}
					else {
						System.out.println("No admin person named "+ lineTokens[1]+ " exists!" );			
					}
				}
				else if(lineTokens[0].equals("CREATECAMPAIGN")) {	
					if(adminExists(lineTokens[1])){
						Admin admin = getAdminFromName(lineTokens[1]);
						if(checkIfItemTypeHasCampaign(lineTokens[4])) {
							System.out.println("The campaign for the item type" + lineTokens[4] + "exists!");
						} else {
							int x =50;
							if((Integer.parseInt(lineTokens[5]) <= x)) {
								admin.createCampaign(lineTokens[2], lineTokens[3], lineTokens[4], Integer.parseInt(lineTokens[5]));	
							} else {
								System.out.println("Campaign was not created. Discount rate exceeds maximum rate of 50%.");
							}
						}
					}
					else {
						System.out.println("No admin person named "+ lineTokens[1]+ " exists!" );			
					}
				}

				else if(lineTokens[0].equals("SHOWITEMSLOWONSTOCK")) {
					if(adminExists(lineTokens[1])){
						Admin admin = getAdminFromName(lineTokens[1]);
						int length = lineTokens.length;
						int maxValue = Integer.parseInt(lineTokens[2]);
						admin.itemsLowStock(length,maxValue);
					}else if(techExists(lineTokens[1])){
						int length = lineTokens.length;
						int maxValue = Integer.parseInt(lineTokens[2]);
						Tech tech = getTechFromName(lineTokens[1]);
						tech.itemsLowStock(length,maxValue);
					}else{
						System.out.println("No admin or technician person named " + lineTokens[1] + " exists! ");
					}

				}

				else if(lineTokens[0].equals("CHPASS")) {	
					if(customerExists(Integer.parseInt(lineTokens[1]))){
						Customer customer = getCustomerFromId(Integer.parseInt(lineTokens[1]));
						if(customer.changePassword(lineTokens[2], lineTokens[3])){
							System.out.println("The password has been successfully changed.");	
						}else{
							System.out.println("The given password does not match the current password. Please try again.");
						}

					}else{
						System.out.println("No customer with ID number "+ lineTokens[1] + " exists!");
					}

				}
				else if(lineTokens[0].equals("SHOWORDERS")) {	
					if(techExists(lineTokens[1])){
						System.out.println("Order History:");
						System.out.println("Order date: " +"	"+"Customer ID: "+"	"+"Total Cost: "+ "	Number of purchased items: ");
					}else{
						System.out.println("No technician person named " +lineTokens[1] +" exists! ");
					}
				}
				
				else if(lineTokens[0].equals("SHOWVIP")) {	
					if(adminExists(lineTokens[1])){
						Admin admin = getAdminFromName(lineTokens[1]);
						admin.showVip();
						
					}
					else if(techExists(lineTokens[1])){
						Tech tech = getTechFromName(lineTokens[1]);
						tech.showVip();
					}
					else{
						System.out.println("No admin or technician person named "+lineTokens[1] +" exists!");
					}
				}

				else if(lineTokens[0].equals("EMPTYCART")) {
					if(customerExists(Integer.parseInt(lineTokens[1]))){
						Customer customer = getCustomerFromId(Integer.parseInt(lineTokens[1]));
						customer.emptyCart();

					}else{
						System.out.println("No customer with ID number" + lineTokens[1] +" exists!");
					}
				}

				else if(lineTokens[0].equals("ADDITEM")) {	
					if(techExists(lineTokens[1])){
						Tech tech = getTechFromName(lineTokens[1]);
						tech.addItemFromTech(lineTokens[2]);
					}
						else{
							System.out.println("No technician person named " + lineTokens[1] +" exists!");
						}
					}

					else if(lineTokens[0].equals("DEPOSITMONEY")) {	
						if(customerExists(Integer.parseInt(lineTokens[1]))){
							Customer customer = getCustomerFromId(Integer.parseInt(lineTokens[1]));
							customer.loadMoney(lineTokens[2]);

						}else{
							System.out.println("No customer with ID number " + lineTokens[1] + " exists!");
						}
					}

					else if(lineTokens[0].equals("SHOWCAMPAIGNS")) {
						if(customerExists(Integer.parseInt(lineTokens[1]))){
							System.out.println("Active campaigns:");
							if(campaignList.size() != 0){
								for(Campaign campaign : campaignList){
									System.out.println(campaign.toString());
								}
							}else{
								System.out.println("No campaign has been created so far!");
							}
						}
						else{
							System.out.println("No customer with ID number " +lineTokens[1] + " exists! ");
						}

					}
					else if(lineTokens[0].equals("ADDADMIN")) {
						if(adminExists(lineTokens[1])){
							Admin admin = getAdminFromName(lineTokens[1]);
							Admin newAdmin = admin.addAdmin(lineTokens[2],lineTokens[3],lineTokens[4],Double.parseDouble(lineTokens[5]),lineTokens[6]);
							adminList.add(newAdmin);
						}
						else {
							System.out.println("No admin person named "+ lineTokens[1]+ " exists!");			
						}
					}
					else if(lineTokens[0].equals("ADDTECH")) {
						if(adminExists(lineTokens[1])){
							Admin admin = getAdminFromName(lineTokens[1]);
							Tech newTech = admin.addTech(lineTokens[2],lineTokens[3],lineTokens[4],Double.parseDouble(lineTokens[5]),Boolean.parseBoolean(lineTokens[6]));
							techList.add(newTech);
						}
						else {
							System.out.println("No admin person named "+ lineTokens[1]+ " exists!");			
						}
					}
					else if(lineTokens[0].equals("DISPITEMSOF")) {	
						if(techExists(lineTokens[1])){
							Tech tech = getTechFromName(lineTokens[1]);
							tech.displayItems(lineTokens[2]);

						}else{
							System.out.println("No technician person named " + lineTokens[1] + " exists! ");
						}

					}
					else if(lineTokens[0].equals("LISTITEM")) {
						if(adminExists(lineTokens[1])){
							Admin admin = getAdminFromName(lineTokens[1]);
							admin.showAll();

						}
						else if(techExists(lineTokens[1])){
							Tech tech = getTechFromName(lineTokens[1]);
							tech.showAll();
						}

						else{
							System.out.println("No admin or technician person named " + lineTokens[1] + " exists! ");
						}
					}
				}

			} catch (IOException e) {

				e.printStackTrace();

			} finally {

				try {

					if (br != null)
						br.close();

					if (fr != null)
						fr.close();

				} catch (IOException ex) {

					ex.printStackTrace();
				}
			}
		}

		/**
		 * convert string to date type 
		 * @param time  convert String to Date type 
		 * @return date date
		 */
		public static Date timeConvert(String time){
			DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
			try {
				
				Date gameDate = dateFormat.parse(time);
				return gameDate;
			} catch (ParseException e) {

				e.printStackTrace();
			}
			return null;
		}

		/**
		 * admin is exists or not check from name
		 * @param name name of person
		 * @return boolean admin is exists or not ?
		 */
		public boolean adminExists(String name) {
			for(Admin admin : adminList) {
				if(name.equals(admin.getName())) {
					return true;
				}
			}
			return false;
		}

		/**
		 * technician is exists or not check from name
		 * @param name	name of person
		 * @return	boolean technician is exists or not ?
		 */
		public boolean techExists(String name) {
			for(Tech tech : techList) {
				if(name.equals(tech.getName())) {
					return true;
				}
			}
			return false;
		}

		/**
		 * first check the admin name is contain adminList.
		 *  if it is contain, take an admin object.
		 * @param name	Admin name
		 * @return admin if it is in adminList
		 */
		public Admin getAdminFromName(String name) {
			for(Admin admin : adminList) {
				if(admin.getName().equals(name)) {
					return admin;
				}
			}
			return null;
		}

		/**
		 * first check the technician name is contain techList.
		 *  if it is contain, take an technician object.
		 * 
		 * @param name	Technician
		 * @return technician if it is in techList
		 */
		public Tech getTechFromName(String name) {
			for(Tech tech : techList) {
				if(tech.getName().equals(name)) {
					return tech;
				}
			}
			return null;
		}

		
		/**
		 * customer is exists or not check from customerId
		 * 
		 * @param Id PersonId
		 * @return	boolean customer is exists or not ?
		 */
		public boolean customerExists(int Id) {
			for(Customer customer : customerList) {
				if(Id == customer.getCustomerID()) {
					return true;
				}
			}
			return false;
		}

		/**
		 *  first check the customerId is contain customerList.
		 *  if it is contain, take a customer object.
		 * 
		 * @param Id	customerId
		 * @return	customer if it is in customerList
		 */
		public Customer getCustomerFromId(int Id) {
			for(Customer customer : customerList) {
				if(Id == customer.getCustomerID()) {
					return customer;
				}
			}
			return null;
		}

		/**
		 * first check the bookId is contain bookList.
		 *  if it is contain, take a book object.
		 *  
		 * @param Id bookId
		 * @return book if it is in bookList
		 */
		public Book getBookFromId(int Id) {
			for(Book book : bookList) {
				if(Id == book.getId()) {
					return book;
				}
			}
			return null;
		}

		/**
		 * 
		 * @param Id	CdDvdID
		 * @return cdDvd item
		 */
		public CdDvd getcdDvdFromId(int Id){
			for(CdDvd cdDvd : cddvdList) {
				if(Id == cdDvd.getId()) {
					return cdDvd;
				}
			}
			return null;
		}

		/**
		 * @param Id DesktopId
		 * @return desktop item
		 */
		public Desktop getDesktopFromId(int Id){
			for(Desktop desktop : desktopList) {
				if(Id == desktop.getId()) {
					return desktop;
				}
			}
			return null;
		}

		/**
		 * @param Id laptopId
		 * @return laptop item
		 */
		public Laptop getLaptopFromId(int Id){
			for(Laptop laptop : laptopList) {
				if(Id == laptop.getId()) {
					return laptop;
				}
			}
			return null;
		}

		/**
		 * @param Id	tabletId
		 * @return tablet
		 */
		public Tablet getTabletFromId(int Id){
			for(Tablet tablet : tabletList) {
				if(Id == tablet.getId()) {
					return tablet;
				}
			}
			return null;
		}

		/**
		 * @param Id	TelevisionId
		 * @return	Television item
		 */
		public Tv getTvFromId(int Id){
			for(Tv tv : tvList) {
				if(Id == tv.getId()) {
					return tv;
				}
			}
			return null;
		}

		/**
		 * @param Id	smart phone Id
		 * @return smart Phone
		 */
		public SmartPhone getSmartPhoneFromId(int Id){
			for(SmartPhone smartPhone : smartPhoneList) {
				if(Id == smartPhone.getId()) {
					return smartPhone;
				}
			}
			return null;
		}

		/**
		 * @param Id PerfumeId
		 * @return perfume
		 */
		public Perfume getPerfumeFromId(int Id){
			for(Perfume perfume : perfumeList) {
				if(Id == perfume.getId()) {
					return perfume;
				}
			}
			return null;
		}

		/**
		 * @param Id	HairCareID
		 * @return	hair care product
		 */
		public HairCare getHairCareFromId(int Id){
			for(HairCare haircare : haircareList) {
				if(Id == haircare.getId()) {
					return haircare;
				}
			}
			return null;
		}

		/**
		 * @param Id	skinCareId
		 * @return	skinCare
		 */
		public SkinCare getSkinCareFromId(int Id){
			for(SkinCare skincare : skincareList) {
				if(Id == skincare.getId()) {
					return skincare;
				}
			}
			return null;
		}

		/**
		 * @param itemType item type
		 * @return boolean specific item has a campaign or not
		 */
		public static boolean checkIfItemTypeHasCampaign(String itemType) {
			switch(itemType.toLowerCase()) {
			case "book": return bookList.get(0).hasCampaign();
			case "tv": return tvList.get(0).hasCampaign();
			case "cddvd": return cddvdList.get(0).hasCampaign();
			case "laptop": return laptopList.get(0).hasCampaign();
			case "desktop": return desktopList.get(0).hasCampaign();
			case "haircare": return haircareList.get(0).hasCampaign();
			case "perfume": return perfumeList.get(0).hasCampaign();
			case "skincare": return skincareList.get(0).hasCampaign();
			case "smartphone":return smartPhoneList.get(0).hasCampaign();
			case "tablet": return tabletList.get(0).hasCampaign();
			}
			return false;
		}
		
	}
