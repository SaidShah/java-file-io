package objectIO;

import java.io.Serializable;

public class Person  implements Serializable {
	private String gender;

	public Person(String gender) {
		super();
		this.gender = gender;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Person Gender=" + gender;
	}

}
