/**
 * Holds data associated with a person. 
 */
public class Person {
	
	//Persons id
	private int id;
	
	//Persons full name
	private String name;

	/**
	 * Constructor for person
	 * 
	 * @param id
	 * @param name
	 */
	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}

	/**
	 * @return id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/*
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return "id = " + id + " Name = " + name;
	}
}
