public class Contact {

	private String lastName;
	private String firstName;
	private String middleName;
	private int monthOfBirth;
	private int dayOfBirth;
	private String cellPhone;
	private String homePhone;
	private String email;
	private String address;
	private String city;
	private String state;
	private String zipcode;

	/**
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
		super();
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

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param the
	 *            lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param the
	 *            firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the middleName
	 */
	public String getMiddleName() {
		return middleName;
	}

	/**
	 * @param the
	 *            middleName to set
	 */
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	/**
	 * @return the monthOfBirth
	 */
	public int getMonthOfBirth() {
		return monthOfBirth;
	}

	/**
	 * @param the
	 *            monthOfBirth to set
	 */
	public void setMonthOfBirth(int monthOfBirth) {
		this.monthOfBirth = monthOfBirth;
	}

	/**
	 * @return the dayOfBirth
	 */
	public int getDayOfBirth() {
		return dayOfBirth;
	}

	/**
	 * @param the
	 *            dayOfBirth to set
	 */
	public void setDayOfBirth(int dayOfBirth) {
		this.dayOfBirth = dayOfBirth;
	}

	/**
	 * @return the cellPhone
	 */
	public String getCellPhone() {
		return cellPhone;
	}

	/**
	 * @param the
	 *            cellPhone to set
	 */
	public void setCellPhone(String cellPhone) {
		this.cellPhone = cellPhone;
	}

	/**
	 * @return the homePhone
	 */
	public String getHomePhone() {
		return homePhone;
	}

	/**
	 * @param the
	 *            homePhone to set
	 */
	public void setHomePhone(String homePhone) {
		this.homePhone = homePhone;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param the
	 *            email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param the
	 *            address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param the
	 *            city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param the
	 *            state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * @return the zipcode
	 */
	public String getZipcode() {
		return zipcode;
	}

	/**
	 * @param the
	 *            zipcode to set
	 */
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	/**
	 * @param other
	 * @return
	 */
	public int compareTo(Contact other) {
		int compare = (this.lastName + this.firstName).compareTo(other.lastName
				+ other.firstName);
		if(compare == 0)
			return 0;
		else if (compare < 0)
			return -1;
		else
			return 1;
	}

	/**
	 * @param other
	 * @return
	 */
	public boolean matches(Contact other) {
		
		return true;
	}
}
