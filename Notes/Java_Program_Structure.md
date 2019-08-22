# Java Program Structure

[Java's Program Structure | Wikipedia](https://en.wikipedia.org/wiki/Java_syntax#Program_structure)

This is the prescribed Program Structure for a  Java Class.
```java
import java.util.Objects;
/**
 * @author divyanshbhardwaj
 * @version 1.0
 * This class is the definition class for a 'Student'.
 * */
public class Student {
	private String studentName;
	private long contactNumber;
	private double currentCPI;
	private String officialEmailAddress;

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public long getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}

	public double getCurrentCPI() {
		return currentCPI;
	}

	public void setCurrentCPI(double currentCPI) {
		this.currentCPI = currentCPI;
	}

	public String getOfficialEmailAddress() {
		return officialEmailAddress;
	}

	public void setOfficialEmailAddress(String officialEmailAddress) {
		this.officialEmailAddress = officialEmailAddress;
	}

	public Student(String studentName, long contactNumber, double currentCPI, String officialEmailAddress) {
		this.studentName = studentName;
		this.contactNumber = contactNumber;
		this.currentCPI = currentCPI;
		this.officialEmailAddress = officialEmailAddress;
	}

	@Override
	public String toString() {
		return "Student{" +
				"studentName='" + studentName + '\'' +
				", contactNumber=" + contactNumber +
				", currentCPI=" + currentCPI +
				", officialEmailAddress='" + officialEmailAddress + '\'' +
				'}';
	}

	@Override
	public boolean equals(Object newObject) {
		if (this == newObject) {
			return true;
		}
		if (newObject == null || getClass() != newObject.getClass()) {
			return false;
		}
		Student student = (Student) newObject;		
		return getContactNumber() == student.getContactNumber() &&
				Double.compare(student.getCurrentCPI(), getCurrentCPI()) == 0 &&
				getStudentName().equals(student.getStudentName()) &&
				getOfficialEmailAddress().equals(student.getOfficialEmailAddress());
	}

	@Override
	public int hashCode() {
		return Objects.hash(getStudentName(), getContactNumber(), getCurrentCPI(), getOfficialEmailAddress());
	}
}

```