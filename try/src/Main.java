
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getDetails get = new getDetails();
		get.getAdminDetails();
		Check c = new Check();
		c.check(get.userName);
	}

}
