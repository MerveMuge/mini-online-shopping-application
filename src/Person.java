//package proj2;

/**
 * @author mug
 *
 */
public class Person {
	private String name;
	private String eMail;
	private String dateOfBirth;
	
	/**
	 * @param name the name of person
	 * @param eMail	the email of person
	 * @param dateOfBirth	the birth date of person
	 * @see #Person(String, String, String)	personConstructor
	 */
	public Person(String name, String eMail, String dateOfBirth) {
		this.name = name;
		this.eMail = eMail;
		this.dateOfBirth = dateOfBirth;
	}
	
	/**
	 * @return the name of person
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name	the name of person
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the email of person
	 */
	public String geteMail() {
		return eMail ;
	}
	/**
	 * @param eMail	the email of person
	 */
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	/**
	 * @return the date of birth of person
	 */
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	/**
	 * @param dateOfBirth	the date of birth of person
	 */
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString(){
		return name+ " " + eMail +" "+ dateOfBirth;
	}

}
