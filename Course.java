public class Course {
	
	private int id;
	public String Name;
	private Teacher teacher;
	
	public Course(int courseID)
	{
		id = courseID;
	}
	
	public void Display()
	{
		System.out.println(id + " - " + Name);
	}
}
