package student.model;

public class StudentModel {
	private int id;
	private String name;
	private String branch;
	private String email;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "StudentModel [id=" + id + ", name=" + name + ", branch=" + branch + ", email=" + email + "]";
	}
	public StudentModel(int id, String name, String branch, String email) {
		super();
		this.id = id;
		this.name = name;
		this.branch = branch;
		this.email = email;
	}
	public StudentModel() {
		super();
	}
	
	
}
