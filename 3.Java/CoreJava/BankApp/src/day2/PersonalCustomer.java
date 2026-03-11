package day2;

public class PersonalCustomer extends Customer {

	private long homePhone;
	private long workPhone;

	public PersonalCustomer() {
		super();
	}

	public PersonalCustomer(String firstName, String lastName, double balance, long homePhone, long workPhone) {

		super(firstName, lastName, balance);

		this.homePhone = homePhone;
		this.workPhone = workPhone;
	}

	public long getHomePhone() {
		return homePhone;
	}

	public void setHomePhone(long homePhone) {
		this.homePhone = homePhone;
	}

	public long getWorkPhone() {
		return workPhone;
	}

	public void setWorkPhone(long workPhone) {
		this.workPhone = workPhone;
	}

	@Override
	public double calculateIntrest() {
		return (this.balance * 2.5) / 100;
	}

	@Override
	public String toString() {
		return "PersonalCustomer [" + "CustId=" + custId + ", " + "Name=" + firstName + " " + lastName + ", "
				+ "Balance=" + balance + ", " + "HomePhone=" + homePhone + ", " + "WorkPhone=" + workPhone + ", "
				+ "IntrestAmount=" + calculateIntrest() + "]";
	}
}
