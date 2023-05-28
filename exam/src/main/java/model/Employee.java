package model;
/**
 *
 * @author sitranvan
 */
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Employee {

	private int id;
	private String name;
	private int year;
	private String email;

	public Employee() {
		super();
	}
	
	public Employee(String name, int year, String email) {
		super();
		this.name = name;
		this.year = year;
		this.email = email;
	}

	public Employee(int id, String name, int year, String email) {
		super();
		this.id = id;
		this.name = name;
		this.year = year;
		this.email = email;
	}

	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}

