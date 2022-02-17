package exceptionhandling;

class NewException extends Exception{
	 
	int marks;

	public NewException(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "You are Failed. Study Hard and Appear again in Exam next Time";
	}
	
}




public class MarksCheckException  {
	
	static void checkmarks(int marks) throws NewException
	{
		if(marks<33)
		{
			throw new NewException(marks);
		}
		else
		{
			System.out.println("Congrats! You are Passed.");
		}
	}

	public static void main(String[] args) throws NewException {
		
		MarksCheckException.checkmarks(45);

	}

}

