//package proj2;

import java.util.Date;

/**
 * @author mug
 *
 */
public class Tech extends Employee{
	private boolean isSenior = true;

	/**
	 * mutator for IsSenior
	 * @param isSenior	boolean is senior or not?
	 */
	public void setIsSenior(boolean isSenior) {
		this.isSenior = isSenior;
	}

	/**
	 * accessor for Issenior
	 * @return	boolean is senior or not?
	 */
	public boolean getIsSenior() {
		return isSenior;
	}

	/**
	 * tech constructor
	 * @param name	the name of technician which is one of the employee
	 * @param eMail	the email of technician which is one of the employee
	 * @param dateOfBirth	the birth day of technician which is one of the employee
	 * @param salary	the salary of technician which is one of the employee
	 * @param isSenior	the technician is senior or not ?
	 * @see #Tech(String, String, String, double, boolean) techConstructor
	 */
	public Tech(String name, String eMail, String dateOfBirth, double salary,boolean isSenior) {
		super(name,eMail, dateOfBirth,salary);
		this.isSenior = isSenior;
	}

	/**
	 * @param lineToken2 itemInformation
	 * 
	 * The item was added to the specific list by the technician
	 */
	public void addItemFromTech(String lineToken2){
		String[] divider;
		divider = lineToken2.split(":");
		if(divider[0].equals("LAPTOP")){
			int leng=11;
			if(divider.length == leng){
				FileOperator.Id +=1;
				Laptop newLaptop = new Laptop(FileOperator.Id, divider[1], divider[2], divider[3], divider[4], divider[5], divider[6], divider[7], divider[8], divider[9], Integer.parseInt(divider[10]));
				FileOperator.laptopList.add(newLaptop);
				FileOperator.itemList.add(newLaptop);
			}
			else{
				System.out.println("No item type Laptop found");
			}
		}

		else if(divider[0].equals("DESKTOP")){
			int leng = 11;
			if(divider.length == leng){
				FileOperator.Id +=1;
				Desktop newDesktop = new Desktop(FileOperator.Id, divider[1], divider[2], divider[3], divider[4], divider[5], divider[6], divider[7], divider[8], divider[9], divider[10]);
				FileOperator.desktopList.add(newDesktop);
				FileOperator.itemList.add(newDesktop);
			}else{
				System.out.println("No item type Desktop found");
			}
		}

		else if(divider[0].equals("TABLET")){
			int leng = 11;
			if(divider.length == leng){
				FileOperator.Id +=1;
				Tablet newTablet = new Tablet(FileOperator.Id, divider[1], divider[2], divider[3], divider[4], divider[5], divider[6], divider[7], divider[8], divider[9], divider[10]);
				FileOperator.tabletList.add(newTablet);
				FileOperator.itemList.add(newTablet);
			}else{
				System.out.println("No item type Tablet found");
			}
		}

		else if(divider[0].equals("TV")){
			int leng = 7;
			if(divider.length == leng){
				FileOperator.Id +=1;
				Tv newTv = new Tv(FileOperator.Id, divider[1], divider[2], divider[3], divider[4], divider[5], divider[6]);
				FileOperator.tvList.add(newTv);
				FileOperator.itemList.add(newTv);
			}else{
				System.out.println("No item type Tv found");
			}
		}
		else if(divider[0].equals("SMARTPHONE")){
			int leng = 7;
			if(divider.length == leng){
				FileOperator.Id +=1;
				SmartPhone newSmartPhone = new SmartPhone(FileOperator.Id, divider[1], divider[2], divider[3], divider[4], divider[5], divider[6]);
				FileOperator.smartPhoneList.add(newSmartPhone);
				FileOperator.itemList.add(newSmartPhone);
			}else{
				System.out.println("No item type SmartPhone found");
			}
		}
		else if(divider[0].equals("BOOK")){
			int leng = 7;
			if(divider.length == leng){
				FileOperator.Id +=1;
				Book newBook = new Book(FileOperator.Id, divider[1], divider[2], divider[3], divider[4], divider[5], divider[6]);
				FileOperator.bookList.add(newBook);
				FileOperator.itemList.add(newBook);
			}else{
				System.out.println("No item type Book found");
			}
		}
		
		else if(divider[0].equals("CDDVD")){
			int leng = 6;
			if(divider.length == leng){
				FileOperator.Id +=1;
				CdDvd newCdDvd = new CdDvd(FileOperator.Id, divider[1], divider[2], divider[3], divider[4], divider[5]);
				FileOperator.cddvdList.add(newCdDvd);
				FileOperator.itemList.add(newCdDvd);
			}else{
				System.out.println("No item type CdDvd found");
			}
		}
		
		
		else if(divider[0].equals("HAIRCARE")){
			int leng = 8;
			if(divider.length == leng){
				FileOperator.Id +=1;
				HairCare newHairCare = new HairCare(FileOperator.Id, divider[1], divider[2], divider[3], Integer.parseInt(divider[4]), divider[5], Double.parseDouble(divider[6]),Integer.parseInt(divider[7]));
				FileOperator.haircareList.add(newHairCare);
				FileOperator.itemList.add(newHairCare);
			}else{
				System.out.println("No item type HairCare found");
			}
		}
		
		
		else if(divider[0].equals("SKINCARE")){
			int leng = 8;
			if(divider.length == leng){
				FileOperator.Id +=1;
				SkinCare newSkinCare = new SkinCare(FileOperator.Id, divider[1], divider[2], divider[3], Integer.parseInt(divider[4]), divider[5], Double.parseDouble(divider[6]), Integer.parseInt(divider[7]));
				FileOperator.skincareList.add(newSkinCare);
				FileOperator.itemList.add(newSkinCare);
			}else{
				System.out.println("No item type SkinCare found");
			}
		}
		
		else if(divider[0].equals("PERFUME")){
			int leng = 8;
			if(divider.length == leng){
				FileOperator.Id +=1;
				Perfume newPerfume = new Perfume(FileOperator.Id, divider[1], divider[2], divider[3], Integer.parseInt(divider[4]), divider[5], Double.parseDouble(divider[6]), divider[7]);
				FileOperator.perfumeList.add(newPerfume);
				FileOperator.itemList.add(newPerfume);
			}else{
				System.out.println("No item type Perfume found");
			}
		}
		
	}
	
	
	/* (non-Javadoc)
	 * @see proj2.Person#toString()
	 */
	@Override
	public String toString() {
		return "Tech [isSenior=" + isSenior + ", getIsSenior()=" + getIsSenior() + ", getSalary()=" + getSalary()
				+ ", getName()=" + getName() + ", geteMail()=" + geteMail() + ", getDateOfBirth()=" + getDateOfBirth()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
	
	
}
