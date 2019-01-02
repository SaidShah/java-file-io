package objectIO;

import java.io.Serializable;

public class Student extends Person  implements Serializable {
	private String name;
	private String id;

	public Student(String name, String id, String gender) {
		super(gender);
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", Gender=" + getGender();
	}


}
