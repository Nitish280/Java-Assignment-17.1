import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
//here we are creating a serialization class
public class SerializationClass {
//here we are creating a main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//here we are making the object of the employee class
		Employee emp=new Employee();
		//here we are calling the first name
		emp.firstName="Nitish";
		//here we are calling the last name
		emp.lastName="Singh";
		//here we are applying the try and catch for handling  the any  exception
		try{
			//here we are using the fileoutput stream for writing the file
			//and we are  passing the path of the file
			FileOutputStream fileout=new FileOutputStream("E:/File/emp/employee.txt");
			//here we are using the objectoutput stream for reading the file
			ObjectOutputStream out=new ObjectOutputStream(fileout);
			//here we are passing the properties of the employee in file
			out.writeObject(emp);
			//here we are closing the file
			out.close();
			fileout.close();
			System.out.println("Data is saved in employee file");
		}catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
