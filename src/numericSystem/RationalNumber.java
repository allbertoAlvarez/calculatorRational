package numericSystem;

public class RationalNumber<T extends Number> implements IRationalNumber<RationalNumber<T>> {

	private T numerator;
	private T denominator;

	public RationalNumber(T numerator, T denominator) {

		this.numerator = numerator;
		invariante(denominator);
	}

	public T add(T number1, T number2, boolean suma) {

		T number = null;

		if (suma) {
			if (number1 instanceof Long || number2 instanceof Long) {
				number = (T) Long.valueOf(number1.longValue() + number2.longValue());
			} else if (number1 instanceof Integer || number2 instanceof Integer) {
				number = (T) Integer.valueOf(number1.intValue() + number2.intValue());
			} else if (number1 instanceof Short || number2 instanceof Short) {
				// number = (T) Short.valueOf(number1.shortValue() + number2.shortValue());
			}
		} else {
			if (number1 instanceof Long || number2 instanceof Long) {
				number = (T) Long.valueOf(number1.longValue() - number2.longValue());
			} else if (number1 instanceof Integer || number2 instanceof Integer) {
				number = (T) Integer.valueOf(number1.intValue() - number2.intValue());
			} else if (number1 instanceof Short || number2 instanceof Short) {
				// number = (T) Short.valueOf(number1.shortValue() - number2.shortValue());
			}
		}

		return number;
	}

	public T multiplicy(T number1, T number2) {
		T number = null;

		if (number1 instanceof Long || number2 instanceof Long) {
			number = (T) Long.valueOf(number1.longValue() * number2.longValue());
		} else if (number1 instanceof Integer || number2 instanceof Integer) {
			number = (T) Integer.valueOf(number1.intValue() * number2.intValue());
		} else {
			// number = (T) Short.valueOf(number1.shortValue() * number2.shortValue());
		}

		return number;
	}

	public T divide(T number1, T number2) {
		T number = null;

		if (number1 instanceof Long || number2 instanceof Long) {
			if (number2.longValue() != 0)
				number = (T) Long.valueOf(number1.longValue() / number2.longValue());

		} else if (number1 instanceof Integer || number2 instanceof Integer) {

			if (number2.intValue() != 0)
				number = (T) Integer.valueOf(number1.intValue() / number2.intValue());
		} else {
			// number = (T) Short.valueOf(number1.shortValue() / number2.shortValue());
		}

		return number;
	}

	// maximo comun divisor
	public T mcd(T n, T d) {

		Long numerator = new Long(Math.abs(n.longValue()));
		Long denominator = new Long(Math.abs(d.longValue()));
		T num = null;

		if (numerator % denominator == 0)
			num = (T) denominator;
		if (numerator < denominator) {
			Long temp = numerator;
			numerator = denominator;
			denominator = temp;
		}

		while (denominator > 0) {

			numerator = numerator % denominator;

			Long temp = numerator;
			numerator = denominator;
			denominator = temp;
		}

		num = (T) numerator;

		return num;
	}

	public void invariante(T denominator) {

		if (denominator.longValue() != 0) {
			this.denominator = denominator;
		} else {

			System.out.println("error");
			// throw new NumberFormatException();
		}

	}

	/**
	 * @param numerator
	 *            the numerator to set
	 */
	public void setNumerator(T numerator) {
		this.numerator = numerator;
	}

	/**
	 * @param denominator
	 *            the denominator to set
	 */
	public void setDenominator(T denominator) {
		invariante(denominator);
	}

	@Override
	public void addRational(RationalNumber<T> rationalToBeAdded) {
		numerator = add(multiplicy(numerator, rationalToBeAdded.getDenominator()),
				multiplicy(denominator, rationalToBeAdded.getNumerator()), true);
		invariante(multiplicy(denominator, rationalToBeAdded.getDenominator()));
		simplifyRational();
	}

	@Override
	public void substractRational(RationalNumber<T> rationalToBeSubstracted) {
		numerator = add(multiplicy(numerator, rationalToBeSubstracted.getDenominator()),
				multiplicy(denominator, rationalToBeSubstracted.getNumerator()), false);
		invariante(multiplicy(denominator, rationalToBeSubstracted.getDenominator()));
		simplifyRational();
	}

	@Override
	public void multiplyRational(RationalNumber<T> rationalFactor) {
		numerator = multiplicy(numerator, rationalFactor.getNumerator());
		invariante(multiplicy(denominator, rationalFactor.getDenominator()));
		simplifyRational();
	}

	@Override
	public void divideRational(RationalNumber<T> rationalQuocient) {

		numerator = multiplicy(numerator, rationalQuocient.denominator);
		invariante(multiplicy(denominator, rationalQuocient.numerator));

		simplifyRational();
	}

	@Override
	public void simplifyRational() {

		T mcd = mcd(numerator, denominator);

		numerator = divide(numerator, mcd);
		invariante(divide(denominator, mcd));

	}

	@Override
	public void rationalInverse() {

		if (numerator.longValue() != 0) {
			Long temp = numerator.longValue();
			numerator = denominator;
			invariante((T) temp);
		}
		simplifyRational();
	}

	@Override
	public void squaredRational() {
		numerator = multiplicy(numerator, numerator);
		invariante(multiplicy(denominator, denominator));
		simplifyRational();
	}

	@Override
	public T getNumerator() {
		return numerator;
	}

	@Override
	public T getDenominator() {
		return denominator;
	}

	// public static void main(String[] args) {
	//
	// RationalNumber<Number> a = new RationalNumber<Number>(1, 2);
	// RationalNumber<Number> b = new RationalNumber<Number>(6, 4);
	// RationalNumber<Number> c = new RationalNumber<Number>(-13, 23);
	// RationalNumber<Number> d = new RationalNumber<Number>(-100, 28);
	// RationalNumber<Number> e = new RationalNumber<Number>(0, 1);
	//
	// // b.divideRational(new RationalNumber<Number>(0, 1));
	//
	// a.rationalInverse();
	// b.rationalInverse();
	// c.rationalInverse();
	// d.rationalInverse();
	// e.rationalInverse();
	//
	// System.out.println(a.getNumerator() + "/" + a.getDenominator());
	// System.out.println(b.getNumerator() + "/" + b.getDenominator());
	//
	// System.out.println(c.getNumerator() + "/" + c.getDenominator());
	// System.out.println(d.getNumerator() + "/" + d.getDenominator());
	// System.out.println(e.getNumerator() + "/" + e.getDenominator());
	//
	// }
}
