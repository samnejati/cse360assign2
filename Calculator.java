/**
* This program contains a framework for a calulator. In version 2.0 all the methods are avilable and fucntioning except getHistory.
*
* @author Hesssam Nejati
* @version 2.0
* @since 2019-02-23
*/
public class Calculator {

	private int total;

	public Calculator () {
		total = 0;
	}

	// The getTotal method should return the current total
	public int getTotal () {
		return total;
	}

	// The add method adds the parameter to the total variable
	public void add (int value) {
		total = total + value;
	}

	// The subtract method subtracts the parameter from the total variable
	public void subtract (int value) {
		total = total - value;
	}

	// The multiply method multiplies the total by the parameter
	public void multiply (int value) {
		total = total * value;
	}

	// The divide method divides the total by the parameter. Uses integer division.
	// If the parameter is zero, sets the total to zero. Does not print an error message or rasise an exception
	public void divide (int value) {
		if (value == 0){
			total = 0;
		} else{
			total = total / value;
		}
	}

	public String getHistory () {
		return "";
	}
}
