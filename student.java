package arrayListFinal;

public class student 
{
	String name ;
	int marks;
	int rollNum;
	public student(String name, int marks, int rollNum) {
		super();
		this.name = name;
		this.marks = marks;
		this.rollNum = rollNum;
	}
	@Override
	public String toString() {
		return "student [name=" + name + ", marks=" + marks + ", rollNum=" + rollNum + "]";
	}
	
}
