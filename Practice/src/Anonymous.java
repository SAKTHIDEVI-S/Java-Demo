class Phone
{
	public void show()
	{
		System.out.println("Call");
	}
}
public class Anonymous {
	public static void main(String[] args)
	{
		Phone p = new Phone()
				{
					public void show()
					{
						System.out.println("Show");
					}
				};
		p.show();
	}
}
