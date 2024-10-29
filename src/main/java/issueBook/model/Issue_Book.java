package issueBook.model;

public class Issue_Book {
	String Student_name;
	int Student_id;
	String Book_name;
	int Book_id;
	String issue_date;
	String return_date;
	String status;
	public String getStudent_name() {
		return Student_name;
	}
	public void setStudent_name(String student_name) {
		Student_name = student_name;
	}
	public int getStudent_id() {
		return Student_id;
	}
	public void setStudent_id(int student_id) {
		Student_id = student_id;
	}
	public String getBook_name() {
		return Book_name;
	}
	public void setBook_name(String book_name) {
		Book_name = book_name;
	}
	public int getBook_id() {
		return Book_id;
	}
	public void setBook_id(int book_id) {
		Book_id = book_id;
	}
	public String getIssue_date() {
		return issue_date;
	}
	public void setIssue_date(String issue_date) {
		this.issue_date = issue_date;
	}
	public String getReturn_date() {
		return return_date;
	}
	public void setReturn_date(String return_date) {
		this.return_date = return_date;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Issue_Book [Student_name=" + Student_name + ", Student_id=" + Student_id + ", Book_name=" + Book_name
				+ ", Book_id=" + Book_id + ", issue_date=" + issue_date + ", return_date=" + return_date + ", status="
				+ status + "]";
	}
	
	
	

}
