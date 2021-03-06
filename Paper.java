public class Paper{
	
	private String paperTitle;
	private int    paperIdNumber;
	private String courseCode;
	private String courseIncharge;
	private String semester;
	private String program;
	private Date   dateOfPaper;
	private Time   timeOfPaper;
	private String typeOfExam;   
	private String invigilatorName;
	private String locationOfPaper;
	private int    numberOfStudents;
	private boolean isCollected;
	

	Paper(String paperTitle,int paperIdNumber,String courseCode,String courseIncharge,String semester,String program,Date dateOfPaper,Time timeOfPaper,String typeOfExam,String invigilatorName,String locationOfPaper,int numberOfStudents,boolean isCollected)
	{
		this.paperTitle = paperTitle;
		this.paperIdNumber = paperIdNumber;
		this.courseCode = courseCode;
		this.courseIncharge = courseIncharge;
		this.semester = semester;
		this.program =program;
		this.dateOfPaper = dateOfPaper;
		this.timeOfPaper = timeOfPaper;
		this.typeOfExam = typeOfExam;
		this.invigilatorName = invigilatorName;
		this.locationOfPaper = locationOfPaper;
		this.numberOfStudents = numberOfStudents;
		this.isCollected = isCollected;
	}

	Paper(int paperIdNumber, String courseCode, int numberOfStudents)
	{
		this.paperIdNumber = paperIdNumber;
		this.courseCode = courseCode;
		this.numberOfStudents = numberOfStudents;
	}
	
	

	public String getPaperTitle()
	{
		return paperTitle;
	}
	
	public int getPaperIdNumber()
	{
		return paperIdNumber;
	}

	public String getCourseCode()
	{
		return courseCode;
	}

	public String getcourseIncharge()
	{
		return courseIncharge;
	}

	public String getsemester()
	{
		return semester;	
	}

	public String getprogram()
	{
		return program;	
	}

	public String gettypeOfExam()
	{
		return typeOfExam;
	}

	public String getinvigilatorName()
	{
		return invigilatorName;	
	}

	public String getlocationOfPaper()
	{
		return locationOfPaper;	
	}

	public int getnumberOfStudents()
	{
		return numberOfStudents;
	}

    public void SetisCollected(boolean isCollected )
	{
		this.isCollected= isCollected;
	} 
	public boolean getisCollected()
	{
		return isCollected;
	} 

	public String toString()
	{
	    return "Paper Title is:  " +paperTitle +"\nPaper Id Number:  " +paperIdNumber +"\nCourse Code:  " +courseCode+"\nCourse Incharge:  " +courseIncharge +"\nSemester:  " +semester +"\nProgram :  " +program +"\nDate Of Paper:  "+dateOfPaper +"\nTime Of Paper:  " +timeOfPaper +"\nType Of Exam:  " +typeOfExam +"\nInvigilator Name:  " +invigilatorName +"\nLocation Of Paper:  " +locationOfPaper +"\nNumber Of Students:  " +numberOfStudents +"\nThe Paper is" +"collected."+ isCollected;
	}
}









