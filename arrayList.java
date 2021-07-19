package arrayListFinal;

public class arrayList
{
	int size=5;
	int index=0;
	student a[]=new student[size];
	
	
	public void add(student student)
	{
		if (index<size)
		{
			a[index++]=student;
		}
		else
		{
			grow();
			a[index++]=student;
		}
	}


	 void grow() 
	{
		student b[]=new student[(int)(size*1.75)];
		for (int i = 0; i < a.length; i++)
		{
			b[i]=a[i];
		}
		a=b;
	}
	 
	 public void delete(int index)
	{
		 for (int i = index; i < a.length; i++) 
		 {
			a[i]=a[i+1];
		 }
		 this.index--;
	}
	 public void insertAt(int index, student student)
	{
		 if (index>=a.length)
		 {
			grow();
		}
		 for (int i = this.index; i >index; i--)
		{
			a[i]=a[i-1];
		}
		 a[index++]=student;
		 this.index++;
	}
	 
	 public String toString()
	 {
		String s="";
		for (int i = 0; i < index; i++) 
		{
			s=s+a[i];
		}
		return s;
	}
}
