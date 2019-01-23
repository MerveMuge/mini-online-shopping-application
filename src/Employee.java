//package proj2;

/**
 * @author mug
 *
 */
public class Employee extends Person{

	private double salary;
	
	
	/**
	 * @return	the person's salary
	 */
	public double getSalary() {
		return salary;
	}
	
	/**
	 * @param salary the person's salary
	 */
	public void setSalary(double salary) {
		this.salary = salary;
	}

	/**
	 * @param name	the person's name
	 * @param eMail	the person's eMail
	 * @param dateOfBirth	the person's date Of birth
	 * @param salary	the person's salary
	 * @see #Employee(String, String, String, double) EmployeeConstuructor
	 */
	public Employee(String name,String eMail, String dateOfBirth, double salary){
		super(name, eMail, dateOfBirth);
		this.salary = salary;
	}

	/**
	 *  general information about the VIP customers which is one of the customer
	 */
	public void showVip(){
		for(Customer customer : FileOperator.customerList){
			if(customer.findStatu().equals("GOLDEN")){
				System.out.print("Customer name: " + customer.getName() + "ID: " +customer.getCustomerID());
				System.out.println(" e-mail: " + customer.geteMail() + "Date of Birth: "+ customer.getDateOfBirth() +"Status: GOLDEN");
			}
		}
	}
	
	
	/**
	 * @param linetokens2 information about item
	 * 
	 * select item and display general information about the selected 
	 */
	public void displayItems(String linetokens2){
		String[] breaker;
		breaker = linetokens2.split(":");
		for(int i = 0; i < breaker.length; i++) {
			if(breaker[i].equals("BOOK")){
				Tech.showAllBooks();
			}else if(breaker[i].equals("CDDVD")){
				Tech.showAllCDDVD();
			}else if(breaker[i].equals("DESKTOP")){
				Tech.showAllDesktop();
			}else if(breaker[i].equals("LAPTOP")){
				Tech.showAllLaptop();
			}else if(breaker[i].equals("TABLET")){
				Tech.showAllTablet();
			}else if(breaker[i].equals("TV")){
				Tech.showAllTv();
			}else if(breaker[i].equals("SMARTPHONE")){
				Tech.showAllSmartPhone();
			}else if(breaker[i].equals("HAIRCARE")){
				Tech.showAllHairCare();
			}else if(breaker[i].equals("PERFUME")){
				Tech.showAllPerfume();
			}else if(breaker[i].equals("SKINCARE")){
				Tech.showAllSkinCare();
			}
		}

	}

	/**
	 * @param length line length
	 * @param maxValue limit of the item amount 
	 */
	public void itemsLowStock(int length, int maxValue){
		if(length == 3){
			if(FileOperator.bookList.size() < maxValue){
				System.out.println("Book : " + FileOperator.bookList.size());
			}if(FileOperator.cddvdList.size() < maxValue){
				System.out.println("CDDVD : " +FileOperator.cddvdList.size());
			}if(FileOperator.desktopList.size() < maxValue){
				System.out.println("Desktop : " + FileOperator.desktopList.size());
			}if(FileOperator.laptopList.size() < maxValue){
				System.out.println("Laptop : " + FileOperator.laptopList.size());
			}if(FileOperator.tabletList.size() < maxValue){
				System.out.println("Tablet : " + FileOperator.tabletList.size());
			}if(FileOperator.tvList.size() < maxValue){
				System.out.println("TV : " + FileOperator.tvList.size());
			}if(FileOperator.smartPhoneList.size() < maxValue){
				System.out.println("SmartPhone : " + FileOperator.smartPhoneList.size());
			}if(FileOperator.haircareList.size() < maxValue){
				System.out.println("HairCare : " + FileOperator.haircareList.size());
			}if(FileOperator.perfumeList.size() < maxValue){
				System.out.println("Perfume : " + FileOperator.perfumeList.size());
			}if(FileOperator.skincareList.size() < maxValue){
				System.out.println("SkinCare : " + FileOperator.skincareList.size());
			}
		}else if(length ==2){
			
			if(FileOperator.bookList.size() > 0 ){
				System.out.println("Book : " + FileOperator.bookList.size());
			}if(FileOperator.cddvdList.size() > 0 ){
				System.out.println("CDDVD : " +FileOperator.cddvdList.size());
			}if(FileOperator.desktopList.size() > 0 ){
				System.out.println("Desktop : " + FileOperator.desktopList.size());
			}if(FileOperator.laptopList.size() > 0 ){
				System.out.println("Laptop : " + FileOperator.laptopList.size());
			}if(FileOperator.tabletList.size() > 0 ){
				System.out.println("Tablet : " + FileOperator.tabletList.size());
			}if(FileOperator.tvList.size() > 0 ){
				System.out.println("TV : " + FileOperator.tvList.size());
			}if(FileOperator.smartPhoneList.size() > 0 ){
				System.out.println("SmartPhone : " + FileOperator.smartPhoneList.size());
			}if(FileOperator.haircareList.size() > 0 ){
				System.out.println("HairCare : " + FileOperator.haircareList.size());
			}if(FileOperator.perfumeList.size() > 0 ){
				System.out.println("Perfume : " + FileOperator.perfumeList.size());
			}if(FileOperator.skincareList.size() > 0 ){
				System.out.println("SkinCare : " + FileOperator.skincareList.size());
			}
			
		}
	}

	/**
	 *  printed on console general information about the all items
	 */
	public void showAll(){
		showAllBooks();   //admin.showAllBooks();
		showAllCDDVD();
		showAllDesktop();
		showAllLaptop();
		showAllTablet();
		showAllTv();
		showAllSmartPhone();
		showAllHairCare();
		showAllPerfume();
		showAllSkinCare();
	}

	/**
	 * printed on console general information for each smart phone  
	 */
	public static void showAllSmartPhone(){

		for(SmartPhone smartphone : FileOperator.smartPhoneList){
			smartphone.showSmartPhone();
		}

	}

	/**
	 *  printed on console general information for each skin care product 
	 */
	public static void showAllSkinCare(){
		for(SkinCare skinCare : FileOperator.skincareList){
			skinCare.showSkinCare();
		}
	}

	/**
	 *   printed on console general information for each book 
	 */
	public static void showAllBooks(){
		for(Book book : FileOperator.bookList){
			book.showBook();
		}
	}

	/**
	 * printed on console general information for each CdDvd
	 */
	public static void showAllCDDVD(){
		for(CdDvd cdDvd : FileOperator.cddvdList){
			cdDvd.showCdDvd();
		}
	}

	/**
	 * printed on console general information for each desktop
	 */
	public static void showAllDesktop(){
		for(Desktop desktop : FileOperator.desktopList){
			desktop.showDesktop();
		}
	}

	/**
	 *  printed on console general information for each laptop
	 */
	public static void showAllLaptop(){
		for( Laptop laptop : FileOperator.laptopList){
			laptop.showLaptop();
		}
	}

	/**
	 * printed on console general information for each hair care product
	 */
	public static void showAllHairCare(){
		for(HairCare hairCare : FileOperator.haircareList){
			hairCare.showHairCare();
		}
	}

	/**
	 * printed on console general information for each tablet
	 */
	public static void showAllTablet(){
		for(Tablet tablet : FileOperator.tabletList){
			tablet.showTablet();
		}
	}

	/**
	 * printed on console general information for each perfume
	 */
	public static void showAllPerfume(){
		for(Perfume perfume : FileOperator.perfumeList){
			perfume.showPerfume();
		}
	}

	/**
	 * printed on console general information for each tv
	 */
	public static void showAllTv(){
		for(Tv tv : FileOperator.tvList){
			tv.showTv();
		}
	}





}
