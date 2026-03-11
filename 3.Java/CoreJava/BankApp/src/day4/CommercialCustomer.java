package day4;

public class CommercialCustomer extends Customer {

	private String contactPersonName;
	private long contactPersonNumber;

	public CommercialCustomer() {
		super();
	}

	public CommercialCustomer(String firstName, String lastName, double balance, String contactPersonName,
			long contactPersonNumber) {

		super(firstName, lastName, balance);

		this.contactPersonName = contactPersonName;
		this.contactPersonNumber = contactPersonNumber;
	}

	public String getContactPersonName() {
		return contactPersonName;
	}

	public void setContactPersonName(String contactPersonName) {
		this.contactPersonName = contactPersonName;
	}

	public long getContactPersonNumber() {
		return contactPersonNumber;
	}

	public void setContactPersonNumber(long contactPersonNumber) {
		this.contactPersonNumber = contactPersonNumber;
	}

	@Override
	public double calculateIntrest() {
		return (this.balance * 4) / 100;
	}

	@Override
	public String toString() {
		return "CommercialCustomer [" + "CustId=" + custId + ", " + "Name=" + firstName + " " + lastName + ", "
				+ "Balance=" + balance + ", " + "ContactPersonName=" + contactPersonName + ", " + "ContactPersonNumber="
				+ contactPersonNumber + ", " + "IntrestAmount=" + calculateIntrest() + "]";
	}
}
