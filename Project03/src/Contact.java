/**
 * Contact: Holds information of an entry into a contact list.
 * 
 * @author Matt Andre
 */
public class Contact {
	
	//Contact's last name
	private String lastName;
	
	//Contact's first name
	private String firstName;
	
	//Contact's middle name
	private String middleName;
	
	//Contact's month of birth
	private int monthOfBirth;
	
	//Contact's day of birth
	private int dayOfBirth;
	
	//Contact's cell phone number
	private String cellPhone;
	
	//Contact's home phone number
	private String homePhone;
	
	//Contact's email
	private String email;
	
	//Contact's address
	private String address;
	
	//Contact's city
	private String city;
	
	//Contact's state
	private String state;
	
	//Contact's zip code
	private String zipcode;
	
	// --------------------------------------------------------------

	/**
	 * Constructs a contact from info as strings and integers.
	 * 
	 * @param lastName
	 * @param firstName
	 * @param middleName
	 * @param monthOfBirth
	 * @param dayOfBirth
	 * @param cellPhone
	 * @param homePhone
	 * @param email
	 * @param address
	 * @param city
	 * @param state
	 * @param zipcode
	 */
	public Contact(String lastName, String firstName, String middleName,
			int monthOfBirth, int dayOfBirth, String cellPhone,
			String homePhone, String email, String address, String city,
			String state, String zipcode) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.middleName = middleName;
		this.monthOfBirth = monthOfBirth;
		this.dayOfBirth = dayOfBirth;
		this.cellPhone = cellPhone;
		this.homePhone = homePhone;
		this.email = email;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
	}
	
	// --------------------------------------------------------------

	/**
	 * Constructs a contact from info as strings
	 * 
	 * @param lastName
	 * @param firstName
	 * @param middleName
	 * @param monthOfBirth
	 * @param dayOfBirth
	 * @param cellPhone
	 * @param homePhone
	 * @param email
	 * @param address
	 * @param city
	 * @param state
	 * @param zipcode
	 */
	public Contact(String lastName, String firstName, String middleName,
			String monthOfBirthStr, String dayOfBirthStr, String cellPhone,
			String homePhone, String email, String address, String city,
			String state, String zipcode) {

		this.lastName = lastName;
		this.firstName = firstName;
		this.middleName = middleName;
		this.cellPhone = cellPhone;
		this.homePhone = homePhone;
		this.email = email;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;

		if (monthOfBirthStr.length() == 0) {
			this.monthOfBirth = -1;
		} else {
			this.monthOfBirth = Integer.parseInt(monthOfBirthStr);
		}

		if (dayOfBirthStr.length() == 0) {
			this.dayOfBirth = -1;
		} else {
			this.dayOfBirth = Integer.parseInt(dayOfBirthStr);
		}
	}
	
	// --------------------------------------------------------------

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	
	// --------------------------------------------------------------

	/**
	 * @param the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	// --------------------------------------------------------------

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	
	// --------------------------------------------------------------

	/**
	 * @param the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	// --------------------------------------------------------------

	/**
	 * @return the middleName
	 */
	public String getMiddleName() {
		return middleName;
	}
	
	// --------------------------------------------------------------

	/**
	 * @param the  middleName to set
	 */
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	
	// --------------------------------------------------------------

	/**
	 * @return the monthOfBirth
	 */
	public int getMonthOfBirth() {
		return monthOfBirth;
	}
	
	// --------------------------------------------------------------

	/**
	 * @param the monthOfBirth to set
	 */
	public void setMonthOfBirth(int monthOfBirth) {
		this.monthOfBirth = monthOfBirth;
	}
	
	// --------------------------------------------------------------

	/**
	 * @return the dayOfBirth
	 */
	public int getDayOfBirth() {
		return dayOfBirth;
	}
	
	// --------------------------------------------------------------

	/**
	 * @param the dayOfBirth to set
	 */
	public void setDayOfBirth(int dayOfBirth) {
		this.dayOfBirth = dayOfBirth;
	}
	
	// --------------------------------------------------------------

	/**
	 * @return the cellPhone
	 */
	public String getCellPhone() {
		return cellPhone;
	}
	
	// --------------------------------------------------------------

	/**
	 * @param the cellPhone to set
	 */
	public void setCellPhone(String cellPhone) {
		this.cellPhone = cellPhone;
	}
	
	// --------------------------------------------------------------

	/**
	 * @return the homePhone
	 */
	public String getHomePhone() {
		return homePhone;
	}
	
	// --------------------------------------------------------------

	/**
	 * @param the homePhone to set
	 */
	public void setHomePhone(String homePhone) {
		this.homePhone = homePhone;
	}
	
	// --------------------------------------------------------------

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	
	// --------------------------------------------------------------

	/**
	 * @param the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	// --------------------------------------------------------------

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	
	// --------------------------------------------------------------

	/**
	 * @param the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	
	// --------------------------------------------------------------

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	
	// --------------------------------------------------------------

	/**
	 * @param the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	
	// --------------------------------------------------------------

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}
	
	// --------------------------------------------------------------

	/**
	 * @param the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}
	
	// --------------------------------------------------------------

	/**
	 * @return the zipcode
	 */
	public String getZipcode() {
		return zipcode;
	}
	
	// --------------------------------------------------------------

	/**
	 * @param the zipcode to set
	 */
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	
	// --------------------------------------------------------------

	/**
	 * Compares this contact with another to see if this contact is 
	 * less than, equal to, or greater than.
	 * 
	 * @param other contact
	 * @return -1 if less than other contact, 0 if equals other contact,
	 * and 1 if greater than other contact.
	 */
	public int compareTo(Contact other) {
		int compare = (this.lastName + this.firstName).compareTo(other.lastName
				+ other.firstName);
		if (compare == 0)
			return 0;
		else if (compare < 0)
			return -1;
		else
			return 1;
	}
	
	// --------------------------------------------------------------

	/**
	 * Checks if the info in other contact is a subset of this contacts info
	 * 
	 * @param other contact
	 * @return true if other contact's info is a subset of this contacts,
	 * otherwise false.
	 */
	public boolean matches(Contact other) {
		if (this.lastName.indexOf(other.lastName) != -1
				&& this.firstName.indexOf(other.firstName) != -1
				&& this.middleName.indexOf(other.middleName) != -1
				&& (other.monthOfBirth == -1 || this.monthOfBirth == other.monthOfBirth)
				&& (other.dayOfBirth == -1 || this.dayOfBirth == other.dayOfBirth)
				&& this.cellPhone.indexOf(other.cellPhone) != -1
				&& this.homePhone.indexOf(other.homePhone) != -1
				&& this.email.indexOf(other.email) != -1
				&& this.address.indexOf(other.address) != -1
				&& this.city.indexOf(other.city) != -1
				&& this.state.indexOf(other.state) != -1
				&& this.zipcode.indexOf(other.zipcode) != -1) {
			return true;
		}
		return false;
	}
	
	// --------------------------------------------------------------

	/* 
	 * Returns this contact's info as a string.
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Contact [lastName=");
		builder.append(lastName);
		builder.append(", firstName=");
		builder.append(firstName);
		builder.append(", middleName=");
		builder.append(middleName);
		builder.append(", monthOfBirth=");
		builder.append(monthOfBirth);
		builder.append(", dayOfBirth=");
		builder.append(dayOfBirth);
		builder.append(", cellPhone=");
		builder.append(cellPhone);
		builder.append(", homePhone=");
		builder.append(homePhone);
		builder.append(", email=");
		builder.append(email);
		builder.append(", address=");
		builder.append(address);
		builder.append(", city=");
		builder.append(city);
		builder.append(", state=");
		builder.append(state);
		builder.append(", zipcode=");
		builder.append(zipcode);
		builder.append("]");
		return builder.toString();
	}
}
