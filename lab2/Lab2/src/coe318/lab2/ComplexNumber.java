package coe318.lab2;
/**
 * ComplexNumber models a complex number expressed
 * in rectangular form (real and imaginary parts).
 * It is an <em>immutable</em> object.
 *
 * @author Your Name
 */
public class ComplexNumber {
    
    private double realPart;
    private double imaginaryPart; 
    
  //Instance variable declarations
  /**
   * Construct a ComplexNumber given its
   * real and imaginary parts.
   * @param re The real component
   * @param im The imaginary component
   */
  public ComplexNumber(double re, double im) {
      
      this.realPart = re; 
      this.imaginaryPart = im; 
  }
  /**
   * Returns the real component.
   * @return the real
   */
  public double getReal() {
      return this.realPart;  
  }
  /**
   * Returns the imaginary component.
   * @return the imaginary
   */
  public double getImaginary() {
      return this.imaginaryPart;  
  }
  /**
   * Returns a new ComplexNumber number that is
   * the negative of <em>this</em>.  Note: the
   * original ComplexNumber is <b>NOT</b>
   * modified.
   * @return -this
   */
  public ComplexNumber negate() {
      
      ComplexNumber b; 
      b = new ComplexNumber(this.realPart * (-1) , this.imaginaryPart * (-1) ); 
      return b; 
      
  }
  /**
   * Returns a new ComplexNumber that is the
   * sum of <em>this</em>  and <em>z</em>.
   * Note: the  original ComplexNumber is
   * <b>NOT</b> modified.
   * @param z
   * @return this + z
   */
  public ComplexNumber add(ComplexNumber z) {
      
      ComplexNumber d; 
      d = new ComplexNumber(this.realPart + z.getReal(), this.imaginaryPart + z.getImaginary()); 
      return d; 
  }
  /**
   * Returns a new ComplexNumber that is the
   * difference of <em>this</em>  and <em>z</em>.
   * Note: the  original ComplexNumber is
   * <b>NOT</b> modified.
   * @param z
   * @return this + z
   */
  public ComplexNumber subtract(ComplexNumber z) {
      
      ComplexNumber e; 
      e = new ComplexNumber(this.realPart - z.getReal(), this.imaginaryPart - z.getImaginary()); 
      return e; 
  }
  /**
   * Returns a new ComplexNumber that is the
   * product of <em>this</em> and <em>z</em>.
   * Note: the original ComplexNumber is
   * <b>NOT</b> modified.
   * @param z
   * @return this * z
   */
  public ComplexNumber multiply(ComplexNumber z) {
      
      ComplexNumber h; 
      double a, b; 
      a = (this.realPart * z.getReal()) - (this.imaginaryPart * z.getImaginary());
      b = (this.realPart * z.getImaginary()) + (this.imaginaryPart * z.getReal());
      h = new ComplexNumber(a,b); 
      return h; 
  }
  /**
   * Returns a new ComplexNumber that is
   * the reciprocal of <em>this</em>.
   * Note: the original ComplexNumber is
   * <b>NOT</b> modified.
   * @return 1.0 / this
   */
  public ComplexNumber reciprocal() {
      
      ComplexNumber f, a, b; 
      a = new ComplexNumber (this.realPart, this.imaginaryPart); 
      b = new ComplexNumber (1,0); 
      f = b.divide(a);
      return f; 
      
      
  }
  /**
   * Returns a new ComplexNumber that is
   * <em>this</em> divided by <em>z</em>.
   * Note: the original ComplexNumber is
   * <b>NOT</b> modified.
   * @param z
   * @return this / z
   */
  public ComplexNumber divide(ComplexNumber z) {
      
      ComplexNumber g,a,b,c,d,e;
      a = new ComplexNumber (z.getReal(), z.getImaginary() * (-1));
      e = new ComplexNumber (this.realPart, this.imaginaryPart);
      b = e.multiply(a); 
      c = z.multiply(a); 
      g = new ComplexNumber(b.getReal() / c.getReal(), b.getImaginary() / c.getReal()); 
      return g; 
      
      
  }
  /**
   * Returns a String representation of
   * <em>this</em> in the format:
   * <pre>
   * real +-(optional) i imaginary
   * </pre>
   * If the imaginary part is zero, only the
   * real part is converted to a String.
   * A "+" or "-" is placed between the real
   * and imaginary parts depending on the
   * the sign of the imagrinary part.
   * <p>
   * Examples:
   * <pre>
   *  ..println(new ComplexNumber(0,0); -> "0.0"
   *  ..println(new ComplexNumber(1,1); -> "1.0 + i1.0"
   *  ..println(new ComplexNumber(1,-1); -> "1.0 - i1.0"
   * </pre>
   * @return the String representation.
   */
  
  @Override
  public String toString() {
      //DO NOT MODIFY THIS CODE!
      String str = "" + this.getReal();
      if (this.getImaginary() == 0.0) {
          return str;
      }
      if (this.getImaginary() > 0) {
          return str + " + i" + this.getImaginary();
      } else {
          return str + " - i" + -this.getImaginary();
      }
  }
}