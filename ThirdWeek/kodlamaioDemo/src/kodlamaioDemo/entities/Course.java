package kodlamaioDemo.entities;

public class Course {
	private int id;
	private String courseName;
	private String courseKeywords;
	private String teacherName;
	private int price;
	private String category;
	private String coursePhoto;
	private String teacherPhoto;
	private int completionAmount;
	
	public Course() {
		super();
	}
	
	public Course(int id, String courseName, String courseKeywords, String teacherName, int price,
			String category, String coursePhoto, String teacherPhoto, int completionAmount) {
		super();
		this.id = id;
		this.courseName = courseName;
		this.courseKeywords = courseKeywords;
		this.teacherName = teacherName;
		this.price = price;
		this.category = category;
		this.coursePhoto = coursePhoto;
		this.teacherPhoto = teacherPhoto;
		this.completionAmount = completionAmount;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getCourseKeywords() {
		return courseKeywords;
	}
	public void setCourseKeywords(String courseKeywords) {
		this.courseKeywords = courseKeywords;
	}
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getCoursePhoto() {
		return coursePhoto;
	}
	public void setCoursePhoto(String coursePhoto) {
		this.coursePhoto = coursePhoto;
	}
	public String getTeacherPhoto() {
		return teacherPhoto;
	}
	public void setTeacherPhoto(String teacherPhoto) {
		this.teacherPhoto = teacherPhoto;
	}
	public int getCompletionAmount() {
		return completionAmount;
	}
	public void setCompletionAmount(int completionAmount) {
		this.completionAmount = completionAmount;
	}
}
