public class Course{
	
	private static String courseName;
	private String courseCode;
	//private String programName;
	private String programSession;
	//private Paper paperofExam;

	Course(String courseName,String courseCode,String programSession)
	{
		this.courseName = courseName;
		this.courseCode = courseCode;
		this.programSession = programSession;
		
	}
	
	public void setcourseCode(String courseCode)
	{
		this.courseCode = courseCode;
	}

	public String getCourseName()
	{
		return courseName;
	}

	public String getCourseCode()
	{
		return courseCode;
	}
	public String getprogramSession()
	{
		return programSession;
	}

	public String toString()
	{
		return "\n\n\nCourse:" +courseName +"Course Code:  " +courseCode +"\nSession:  " +programSession ;
	} 
}