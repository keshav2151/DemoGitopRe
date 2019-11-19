package JavaBasicsPrograms;
class parent
{
	public void show()
	{
		System.out.println("Parent method");
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
