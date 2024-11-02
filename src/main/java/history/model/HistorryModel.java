package history.model;

public class HistorryModel {
	int issue_id;
	String Student_name;
	int Student_id;
	String Book_name;
	int Book_id;
	String issue_date;
	String return_date;
	String stud_return_date;
	String status;
	public int getIssue_id() {
		return issue_id;
	}
	public void setIssue_id(int issue_id) {
		this.issue_id = issue_id;
	}
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
	public String getStud_return_date() {
		return stud_return_date;
	}
	public void setStud_return_date(String stud_return_date) {
		this.stud_return_date = stud_return_date;
	}
	@Override
	public String toString() {
		return "HistorryModel [issue_id=" + issue_id + ", Student_name=" + Student_name + ", Student_id=" + Student_id
				+ ", Book_name=" + Book_name + ", Book_id=" + Book_id + ", issue_date=" + issue_date + ", return_date="
				+ return_date + ", stud_return_date=" + stud_return_date + ", status=" + status + "]";
	}
	
	
}
