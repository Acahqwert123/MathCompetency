public class Main { 
	public static void main(String[] args) {
	    // Create two schools
	    Address address1 = new Address("Jalan Seri Anwar", "Kuala Terengganu", "Johor", "12345");
	    PrincipalName principalName1 = new PrincipalName("Ashraf", "Aziz");
	    Marks marks1 = new Marks(10);
	    try {
			marks1.setMark(10, 0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    School school1 = new School("Sk Ainul", address1, principalName1, marks1);

	    Address address2 = new Address("Jalan Seri Ibrahim", "Kuala Johor", "Terengganu", "54321");
	    PrincipalName principalName2 = new PrincipalName("Zulkurnain", "Al-Amin");
	    Marks marks2 = new Marks(10);
	    try {
			marks2.setMark(20, 0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    School school2 = new School("Sk Raudah", address2, principalName2, marks2);

	    // Add schools to the school list
	    SchoolList schoolList = new SchoolList();
	    schoolList.addSchool(school1);
	    schoolList.addSchool(school2);

	    // Display information of all schools
	    schoolList.displaySchoolInfo();
	}
}
