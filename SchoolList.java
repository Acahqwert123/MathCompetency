import java.util.ArrayList;

public class SchoolList{
	
	ArrayList<School> schools = new ArrayList<>();
	
	
	public void addSchool(School sc) {
		schools.add(sc);
	}
	public void removeSchool(School sc) {
		schools.remove(sc);
	}
	public void viewSchoolList() {
		for(int i=0; i<schools.size(); i++) {
			System.out.println((i+1)+ ". " + schools.get(i).getName());
		}
	}
	public void displaySchoolInfo() {
		for(int j=0; j<schools.size(); j++) {
			System.out.println("School Name       : " + schools.get(j).getName());
			System.out.println("Address           : " + schools.get(j).getAddress());
			System.out.println("Principal's Name  : " + schools.get(j).getPrincipalName());
			System.out.println("Average Score     : " + schools.get(j).getMarks().average());
			System.out.println("Standard Deviation: " + schools.get(j).getMarks().stanDev(schools.get(j).getMarks().average()));
			System.out.println();
		}
	}
	public void editSchool(School sc, String name, Address address, PrincipalName principalName, Marks marks) {
		int index = schools.indexOf(sc);
		schools.get(index).setName(name);
		schools.get(index).setAddress(address);
		schools.get(index).setPrincipalName(principalName);
		schools.get(index).setMarks(marks);
	}
}
