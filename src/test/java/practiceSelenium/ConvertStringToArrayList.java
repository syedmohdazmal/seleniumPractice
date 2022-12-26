package practiceSelenium;

import java.util.Arrays;
import java.util.List;

import org.testng.annotations.Test;

public class ConvertStringToArrayList {
	
	@Test
	public void convert() {
		String[] strArray= {"apple","banana","grapes","orange"};
		for(String item:strArray)
		{
		System.out.println("Before Converting:" + item);
		}
		
		//convert string into ArrayList
		List strList=Arrays.asList(strArray);
		System.out.println("Size of List:" + strList.size());
		System.out.println("After Converting:" + strList);

	}

}
