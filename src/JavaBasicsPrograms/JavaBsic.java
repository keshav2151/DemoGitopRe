package JavaBasicsPrograms;
class parent
{
	public void show()
	{
		System.out.println("Parent method");
	}
	public void show()1
	{
		System.out.println("New Method");
	}
}

public class JavaBsic extends parent{
	
public void show()
{
	System.out.println("child show1");
}
	public static void main(String[] args) {
		parent p=new JavaBsic();
		p.show();

	}

}
