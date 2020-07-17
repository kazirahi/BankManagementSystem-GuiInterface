package backend;


public class Customer {
	private String firstname;
	private String lastname;
	private String email;
	private String contractno;
	private String accno;
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContractno() {
		return contractno;
	}
	public void setContractno(String contractno) {
		this.contractno = contractno;
	}
	public String getAccno() {
		return accno;
	}
	public void setAccno(String accno) {
		this.accno = accno;
	}
	public Customer(String firstname, String lastname, String email, String contractno, String accno) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.contractno = contractno;
		this.accno = accno;
	}
	public Customer() {
		super();
	}
	@Override
	public String toString() {
		return "Customer [firstname=" + firstname + ", lastname=" + lastname + ", email=" + email + ", contractno="
				+ contractno + ", accno=" + accno + "]";
	}
	
	
}
