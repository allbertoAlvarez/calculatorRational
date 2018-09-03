package model;

import numericSystem.RationalNumber;

public class calculator {

	private RationalNumber<Number> number1;
	private RationalNumber<Number> number2;

	public calculator() {
		this.number1 = null;
		this.number2 = null;
	}

	public void initialize(Number numerator1, Number denominator1, Number numerator2, Number denominator2) {
		number1 = new RationalNumber(numerator1, denominator1);
		number2 = new RationalNumber(numerator2, denominator2);
	}

	public void initialize(Number numerator, Number denominator) {
		number1 = new RationalNumber<Number>(numerator, denominator);
	}

	public void add(Number numerator1, Number denominator1, Number numerator2, Number denominator2) {
		initialize(numerator1, denominator1, numerator2, denominator2);
		number1.addRational(number2);
	}

	public void substract(Number numerator1, Number denominator1, Number numerator2, Number denominator2) {
		initialize(numerator1, denominator1, numerator2, denominator2);
		number1.substractRational(number2);
	}

	public void multiply(Number numerator1, Number denominator1, Number numerator2, Number denominator2) {
		initialize(numerator1, denominator1, numerator2, denominator2);
		number1.multiplyRational(number2);
	}

	public void divide(Number numerator1, Number denominator1, Number numerator2, Number denominator2) {
		initialize(numerator1, denominator1, numerator2, denominator2);
		number1.divideRational(number2);
	}

	public void simplify(Number numerator1, Number denominator1) {
		initialize(numerator1, denominator1);
		number1.simplifyRational();
	}

	public void Inverse(Number numerator1, Number denominator1) {
		initialize(numerator1, denominator1);
		number1.rationalInverse();
	}

	public void squared(Number numerator1, Number denominator1) {
		initialize(numerator1, denominator1);
		number1.squaredRational();
	}

	public void equal(Number numerator1, Number denominator1, Number numerator2, Number denominator2, int operation) {

		switch (operation) {
		case 0:// add
			add(numerator1, denominator1, numerator2, denominator2);
			break;

		case 1: // sub
			substract(numerator1, denominator1, numerator2, denominator2);
			break;

		case 2: // mul
			multiply(numerator1, denominator1, numerator2, denominator2);
			break;

		case 3: // div
			divide(numerator1, denominator1, numerator2, denominator2);
			break;

		case 4: // simply
			simplify(numerator1, denominator1);
			break;
		case 5: // Inverse
			Inverse(numerator1, denominator1);
			break;
		case 6: // squared
			squared(numerator1, denominator1);
			break;

		default:
			break;
		}

	}

	public void clear() {
		number1 = null;
		number2 = null;
	}

	/**
	 * @return the number1
	 */
	public RationalNumber<Number> getNumber1() {
		return number1;
	}

	/**
	 * @param number1
	 *            the number1 to set
	 */
	public void setNumber1(RationalNumber<Number> number1) {
		this.number1 = number1;
	}

	/**
	 * @return the number2
	 */
	public RationalNumber<Number> getNumber2() {
		return number2;
	}

	/**
	 * @param number2
	 *            the number2 to set
	 */
	public void setNumber2(RationalNumber<Number> number2) {
		this.number2 = number2;
	}

}
