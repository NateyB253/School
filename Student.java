import java.util.List;
enum Year
{
	Freshman, Sophomore, Junior, Senior;
}
public class Student extends Person {
	
	public List<Course> courses;
	public Year year;
	public float gpa;
		
	public Student(int ID)
	{
		super(ID);
	}
}
