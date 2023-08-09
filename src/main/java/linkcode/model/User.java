package linkcode.model;

public class User {

	private int id;
	private String fname;
	private String uname;
	private String pass;
	private double mno;
	private double ramt;

	public User(int id, String fname, String uname, String pass, double mno, double ramt) {
		super();
		this.id = id;
		this.fname = fname;
		this.uname = uname;
		this.pass = pass;
		this.mno = mno;
		this.ramt = ramt;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public double getMno() {
		return mno;
	}
	public void setMno(double mno) {
		this.mno = mno;
	}
	public double getRamt() {
		return ramt;
	}
	public void setRamt(double ramt) {
		this.ramt = ramt;
	}
	
}
