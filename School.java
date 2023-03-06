
public class School {

	private String name;
	private Address address;
	private PrincipalName principalName;
	private Marks marks;
	
	//default constructor
	public School(){		
	}
	//class constructor
	public School(String name, Address address, PrincipalName principalName, Marks marks){
		this.name = name;
		this.address = address;
		this.principalName = principalName;
		this.marks = marks;
	}
	
	//getter and setter method
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public PrincipalName getPrincipalName() {
		return principalName;
	}
	public void setPrincipalName(PrincipalName principalName) {
		this.principalName = principalName;
	}
	public Marks getMarks() {
		return marks;
	}
	public void setMarks(Marks marks) {
		this.marks = marks;
	}
	
	//Collecting Marks
	  public void setNumParticipants(int num) {
	        marks = new Marks();
	        this.marks.createData(num);
	    }
	
	public String toString() {
		if (marks == null) {
			return "School Name       : " + name + "\nAddress           : " + address + "\nPrincipal's Name  : " + principalName + "\nNo data available";
		} else {
			return "School Name       : " + name + "\nAddress           : " + address + "\nPrincipal's Name  : " + principalName + "\nAverage Score     : " + marks.average() + "\nStandard Deviation: " + marks.stanDev(marks.average());
		}
}
}
