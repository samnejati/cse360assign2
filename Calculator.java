/**
* This program contains a framework for a calulator and completes the main functions of a calculator. In version 3.0 all the methods are avilable and fucntioning.
* Compared to previous versions the getHistory also functions which returns a history of all calculations in a string format.
*
* @author Hesssam Nejati
* @version 3.0
* @since 2019-02-23
*/
public class Calculator {

	private int total;
	private  String totalString;

	// constructor
	public Calculator () {
		total = 0;
		totalString = "0";
	}

	// The getTotal method should return the current total
	public int getTotal () {
		return total;
	}

	// The add method adds the parameter to the total variable
	public void add (int value) {
		total = total + value;
		totalString = totalString + " + " + value;
	}

	// The subtract method subtracts the parameter from the total variable
	public void subtract (int value) {
		total = total - value;
		totalString = totalString + " - " + value;
	}

	// The multiply method multiplies the total by the parameter
	public void multiply (int value) {
		total = total * value;
		totalString = totalString + " * " + value;
	}

	// The divide method divides the total by the parameter. Uses integer division.
	// If the parameter is zero, sets the total to zero. Does not print an error message or rasise an exception
	public void divide (int value) {
		if (value == 0){
			total = 0;
		} else{
			total = total / value;
		}
		totalString = totalString + " / " + value;
	}

	// returns a history of all calculations in a string format
	public String getHistory () {
		return totalString;
	}
}
