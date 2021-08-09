package Util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

import Beans.EmployeeBean;

public class InputANDOutputStream {

	@SuppressWarnings("unchecked")
	public List<EmployeeBean> inputStearm() {
		List<EmployeeBean> list=null;
		try {
			FileInputStream fileInput = new FileInputStream("EmployeeDate.txt");

			@SuppressWarnings("resource")
			ObjectInputStream input = new ObjectInputStream(fileInput);
			 list= (List<EmployeeBean>) input.readObject();
			 //System.err.println(list);
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;

	}
	
	public void outputStearm(List<EmployeeBean> list)  {

		try {
			FileOutputStream fileInput = new FileOutputStream("EmployeeDate.txt");

			ObjectOutputStream input = new ObjectOutputStream(fileInput);
			input.writeObject(list);

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	

}
