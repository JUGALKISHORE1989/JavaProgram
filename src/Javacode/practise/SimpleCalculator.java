package Javacode.practise;

public class SimpleCalculator {

	
	private double FirstNumber;
	private double SecondNumber;
	public void setFirstNumber(double FirstNumber){
	this.FirstNumber = FirstNumber;
	}
	public double getFirstNumber() {
		return this.FirstNumber;
	}
	public void setSecondNumber(double SecondNumber){
		this.SecondNumber = SecondNumber;
		}
	public double getSecondNumber() {
			return this.SecondNumber;
		}

	public double getAdditionResult() {
		return getFirstNumber() + getSecondNumber();
	}
	public double getSubtractionResult() {
		return getFirstNumber() - getSecondNumber();
	}
	public double getMultiplicationResult() {
		return getFirstNumber() * getSecondNumber();
	}
	public double getDivisionResult() {
		if( getSecondNumber() == 0) {
			return 0;
		}
		return getFirstNumber() / getSecondNumber();
	}

}
