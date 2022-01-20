
public class Student 
{
	private int roll_no;
	private String name;
	private boolean isExperienced;
	
	public Student()
	{
		roll_no=0;
		name=" ";
		isExperienced=true;
	}
	
	public Student(String name,int roll_no,boolean isExperienced)
	{
		this.roll_no=roll_no;
		this.name=name;
		this.isExperienced=isExperienced;
	}


	public boolean getisExperienced() 
	{
		return isExperienced;
	}


	public void setExperienced(boolean isExperienced)
	{
		this.isExperienced = isExperienced;
	}
	
	public int getRoll_no() {
		return roll_no;
	}

	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}

	
	
	
	public String toString()
	{
		String str="Student Roll_no:= "+roll_no+", Student Name: "+name+",IsExperienced: "+isExperienced;
		return str;
	}
	
}
