/**
 * This class creates an instance of the class Company and tests the object.
 * @author Chris Moore
 * @since September 26, 2012
 * @status The program is working as intended
 */
public class TestCompany {
	/**
	 * @param args
	 * @return null, this method does not return a value
	 * This method creates multiple instances of Company and uses setters/getters to test Company class
	 */
	public static void main (String[] args) {
		Company company1 = new Company("Apple", 1980, 5000, 'I');
		Company company2 = new Company("Microsoft", 1975, 10000, 'O');
		Company company3 = new Company("Google", 'D', company2, 1990, 7500, 123456);
	
		System.out.println("Company #1: " + company1.toString());
		System.out.println("Company #2: " + company2.toString());
		System.out.println("Company #3: " + company3.toString());
	
		System.out.println("Company #3's parent: " + company3.getParent());
		
		System.out.println("Is company 2 bigger than 1?:");
		System.out.println(company2.isBigger(company1));  //isBigger(c)
		System.out.println("Is Company 1 bigger than 2?:");
		System.out.println(company1.isBigger(company2));  //isBigger(c)
		System.out.println("Is company 3 bigger than 1?:");
		System.out.println(Company.isBigger(company3, company1));  //isBigger(c1,c2)
		System.out.println("Is company 1 bigger than 3?:");
		System.out.println(Company.isBigger(company1, company3));  //isBigger(c1,c2)
		
		company1.setId(-445566);
		company2.setId(998877);
		company1.setName("AppleAfter");
		company1.setType('D');
		company1.setEmployees(6666);
		company1.setYearOfFounding(2050);
		company1.setParent(company2);
		
		System.out.println("getName: " + company1.getName());
		System.out.println("getType: " + company1.getType());
		System.out.println("getYearOfFounding: " + company1.getYearOfFounding());
		System.out.println("getEmployees: " + company1.getEmployees());
		System.out.println("getParent: " + company1.getParent());
		System.out.println("getId: " + company1.getId());
		System.out.println("getCompanies: " + company1.getCompanies());
		System.out.println("Company #1: " + company1.toString());
	}
}