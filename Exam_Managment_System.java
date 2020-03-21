public class Exam_Managment_System{
	public static void main(String[] args){
	

		Paper paper1 = new Paper("OPP",1,"CS-213-1","Sir Ali Zaib","2nd","BSCS",new Date(18,3,2020),new Time(9,0,0),"Final Term","Sir Sanaullah","Conference Room",50,false);

		Paper paper2 = new Paper("DLD",2,"CS-131-1","Sir Illyas","2nd","BSCS",new Date(19,3,2020),new Time(1,30,0),"Final Term","Sir Sanaullah","Conference Room",70,false);

		Paper paper3 = new Paper("Principal of Management",3,"BS-121-1","Mam Raida Bathool","2nd","BSCS",new Date(20,3,2020),new Time(4,0,0),"Final Term","Sir Sanaullah","Conference Room",80,false);

		System.out.println(paper1.toString()+new Course("Computer Science","CS-213-1","Spring 2020"));
		System.out.println(paper2.toString()+new Course("Computer Science","CS-131-1","Spring 2020"));
		System.out.println(paper3.toString()+new Course("Computer Science","BS-121-1","Spring 2020"));

		

		
		


		


		


		
		
			

	}
}