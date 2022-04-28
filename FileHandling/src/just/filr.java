package just;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class filr {

	public static void main(String[] args) throws IOException, ClassNotFoundException
	{
		File file = new File("new.txt");
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
		String str ="Sakthi";
		oos.writeObject(str);
		String string = (String) ois.readObject();
		System.out.println(string);
	}
}
