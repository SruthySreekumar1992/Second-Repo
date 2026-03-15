package assignment;

public class BankClass {

	private int pin;
	
public void setPin(int p)
{
	this.pin = p;
}

public void validatePin()

{
	if (pin ==1234)
		System.out.println("Correct Pin number");
	else
		System.out.println("Incorrect Pin number, Try again");
}
}
