/**
 * This class serves as a template for a company.
 * @author Chris Moore
 * @since September 26, 2012
 * @status The program is working as intended
 */
public class Company {
	/**
	 * @param args
	 * @return null, this method does not return a value
	 */
	private String companyName = "";  //String type, name of company
	private char companyType = 'D';  //char type, type of company ('D' domestic, 'O' overseas, 'I' international) 
	private int companyYear = 0;  //int type, company's founding year
	private int numberOfEmployees = 0;  //int type, number of employees at company
	private int numberOfCompaniesOwned = 0;  //int type, number of other companies this company owns
	private int idNumber = -1;  //int type, id number of company (-1 if no id number assigned)
	private Company parentCompany;  //Company type, refers to object of parent company
	
	/**
	 * @return null, this method does not return a value
	 * @param name, company's name
	 * @param year, company's founding year
	 * @param employees, number of company employees
	 * @param type, type of company ('D', 'O', 'I')
	 */
	public Company(String name, int year, int employees, char type) {
		companyName = name;
		companyYear = year;
		numberOfEmployees = employees;
		companyType = type;
	}
	/**
	 * @return null, this method does not return a value
	 * @param name, company's name
	 * @param type, type of company ('D', 'O', 'I')
	 * @param parent, parent of the company
	 * @param year, company's founding year
	 * @param employees, number of company employees
	 * @param id, company's id number
	 */
	public Company(String name, char type, Company parent, int year, int employees, int id) {
		companyName = name;
		companyType = type;
		parentCompany = parent;
		companyYear = year;
		numberOfEmployees = employees;
		idNumber = id;
	}
	/**
	 * The getName method is a getter for companyName in Company class.
	 * @return companyName
	 */
	public String getName() {
		assert (companyName != null);
		return companyName;
	}
	/**
	 * The getType method is a getter for companyType in Company class.
	 * @return companyType
	 */
	public char getType() {
		assert (companyType == 'D' || companyType == 'O' || companyType == 'I'); 
		return companyType;
	}
	/**
	 * The getYear method is a getter for companyYear in Company class.
	 * @return companyYear
	 */
	public int getYearOfFounding() {
		assert (companyYear > 0);
		return companyYear;
	}
	/**
	 * The getEmployees method is a getter for numberOfEmployees in Company class.
	 * @return numberOfEmployees
	 */
	public int getEmployees() {
		assert (numberOfEmployees > 0);
		return numberOfEmployees;
	}
	/**
	 * The getParent method is a getter for parentCompany in Company class.
	 * @return parentCompany
	 */
	public Company getParent() {
		assert (1 == 1);
		return parentCompany;
	}
	/**
	 * The getId method is a getter for idNumber in Company class.
	 * @return idNumber
	 */
	public int getId() {
		assert (1 == 1);
		return idNumber;
	}
	/**
	 * The getCompanies method is a getter for numberOfCompaniesOwned in Company class.
	 * @return numberOfCompaniesOwned
	 */
	public int getCompanies() {
		assert (1 == 1);
		return numberOfCompaniesOwned;
	}
	/**
	 * The toString method is a getter that returns companyType, companyName, idNumber (unless no id number assigned), companyYear, numberOfEmployees, and numberOfCompaniesOwned in Company class.
	 * @return String
	 */
	public String toString() {
		assert (1 == 1);
		if (idNumber < 0) {
			if (numberOfCompaniesOwned == 1) {
				return (companyType + " company " + companyName + ". Founded " + companyYear + ". Has " + numberOfEmployees + " employees. Owns " + numberOfCompaniesOwned + " company.");
			}
			else {
				return (companyType + " company " + companyName + ". Founded " + companyYear + ". Has " + numberOfEmployees + " employees. Owns " + numberOfCompaniesOwned + " companies.");
			}
		}
		else if (idNumber >= 0) {
			if (numberOfCompaniesOwned == 1) {
				return (companyType + " company " + companyName + ". Id " + idNumber + ". Founded " + companyYear + ". Has " + numberOfEmployees + " employees. Owns " + numberOfCompaniesOwned + " company.");
			}
			else {
			return (companyType + " company " + companyName + ". Id " + idNumber + ". Founded " + companyYear + ". Has " + numberOfEmployees + " employees. Owns " + numberOfCompaniesOwned + " companies.");
			}
		}
		else return ("Error.");
	}
	/**
	 * The setName method is a setter for companyName in Company class.
	 * @param s, this is a String variable that stores the new company name
	 * @return null, this method does not return a value
	 */
	public void setName(String s) {
		assert (s instanceof String);
		companyName = s;
	}
	/**
	 * The setType method is a setter for companyType in Company class.
	 * @param t, this is a char variable that stores the new company type
	 * @return null, this method does not return a value
	 */
	public void setType(char t) {
		assert (t == 'D' || t == 'O' || t == 'I');
		companyType = t;
	}
	/**
	 * The setYearOfFounding method is a setter for companyYear in Company class.
	 * @param y, this is an int variable that stores the new company year of founding
	 * @return null, this method does not return a value
	 */
	public void setYearOfFounding(int y) {
		assert (y > 0);
		companyYear = y;
	}
	/**
	 * The setEmployees method is a setter for numberOfEmployees in Company class.
	 * @param e, this is an int variable that stores the new number of employees
	 * @return null, this method does not return a value
	 */
	public void setEmployees(int e) {
		assert (e > 0);
		numberOfEmployees = e;
	}
	/**
	 * The setParent method is a setter for parentCompany in Company class and increments numberOfCompaniesOwned by 1.
	 * @param p, this is a reference to another instance of Company who is the parent company
	 * @return null, this method does not return a value
	 */
	public void setParent(Company p) {
		assert (p instanceof Company);
		parentCompany = p;
		p.numberOfCompaniesOwned++;
	}
	/**
	 * The setId method is a setter for idNumber in Company class.
	 * @param i, this is an int variable that stores the new company id number
	 * @return null, this method does not return a value
	 */
	public void setId(int i) {
		assert (1 == 1);
		idNumber = i;
	}
	/**
	 * The isBigger method compares the number of employees between two companies in Company class (precondition: c is not null).
	 * @param Company c, this refers to an object of class Company
	 * @return result, this method returns a boolean value
	 */
	public boolean isBigger(Company c) {
		assert (c instanceof Company);
		boolean result = false;
		if (c != null) {
			if (numberOfEmployees > c.numberOfEmployees) {
				result = true;
			}
		return result;
		}
		else {
			System.exit(0);
			return false;
		}
	}
	/**
	 * The isBigger method compares the number of employees between two companies in Company class (precondition: c1 and c2 are not null).
	 * @param Company c1, this refers to an object of class Company
	 * @param Company c2, this refers to an object of class Company
	 * @return result, this method returns a boolean value
	 */
	public static boolean isBigger(Company c1, Company c2) {
		assert (c1 instanceof Company && c2 instanceof Company);
		boolean result = false;
		if (c1 != null && c2 != null) {
			if (c1.numberOfEmployees > c2.numberOfEmployees) {
				result = true;
		}
		return result;
		}
		else {
			System.exit(0);
			return false;
		}
	}
}