package exceptionhandling;
import java.util.*;

import javax.swing.plaf.basic.BasicTreeUI.CellEditorHandler;

public class UserDefinedExceptionex  {
	
	static void checkmarks(int marks)
	{
		if(marks<33)
		{
			throw new ArithmeticException("You are Failed");
		}
		else
		{
			System.out.println("You are Passed");
		}
	}

	public static void main(String[] args){
		
		UserDefinedExceptionex.checkmarks(33);

	}

}
