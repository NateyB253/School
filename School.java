import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class School {
	private List<Teacher> Teachers;
	private List<Student> Students;
	private List<Course> Courses;
	private static final String COURSES_FILE = "C:\\Users\\nater\\Repos\\School\\src\\courses.csv";
	
	public School()
	{
		Courses = new ArrayList<>();
		
		try {
			importCourses();
			
		}
		catch (IOException e) {
			System.out.print("An error has occured. Details = " + e.getStackTrace());
		}

	}
	
	private void importTeachers()
	{
		
	}
	
	private void importStudents()
	{
		
	}
	
	private void importCourses() throws IOException
	{
		List<String> lines;
		Path path = Paths.get(COURSES_FILE);
		lines = Files.readAllLines(path);
		
		int commaPos = -1;
		for(String line:lines)
		{
			commaPos = line.indexOf(',');
			int courseID = Integer.parseInt(line.substring(0, commaPos));
			Course c = new Course(courseID);
			c.Name = line.substring(commaPos + 1, line.length());
			Courses.add(c);
		}
	}
	
	public void listCourses()
	{
		for(Course c:Courses)
		{
			c.Display();
		}
	}
	
	
}
