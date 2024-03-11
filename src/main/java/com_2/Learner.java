package com_2;

public class Learner {

	private int id;
	private String lname;
	private Course ob;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public Course getOb() {
		return ob;
	}
	public void setOb(Course ob) {
		this.ob = ob;
	}
	public Learner(int id, String lname, Course ob) {
		super();
		this.id = id;
		this.lname = lname;
		this.ob = ob;
	}
	public Learner() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Learner [id=" + id + ", lname=" + lname + ", ob=" + ob + "]";
	}
	
	
}
