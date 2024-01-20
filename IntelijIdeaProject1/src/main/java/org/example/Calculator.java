package org.example;

/**
 *
 * Perform double precision operations: addition, subtraction, multiplication and
 * division
 */
@ClassPreamble(
        author = "Mauricio Bedoya",
        date = "01/01/2024",
        currentRevision = 3,
        lastModified = "17/01/2024",
        lastModifiedBy = "Mauricio Bedoya"
)
public class Calculator {

    private final double _val1;
    private final double _val2;

    /**
     * Construct a Calculator with initial values (val1, val2) to perform
     * arithmetic binary operations
     * @param val1 double first value operand
     * @param val2 double second value operand
     */
    public Calculator(double val1, double val2){
        this._val1 = val1;
        this._val2 = val2;
    }

    /**
     * Perform double precision addition binary operation
     * @return double precision result of addition operations
     */
    public double addition(){
        return this._val1 + this._val2;
    }
    /**
     * Perform double precision subtraction binary operation
     * @return double precision result of subtraction operations
     */
    public double subtraction(){
        return this._val1 - this._val2;
    }
    /**
     * Perform double precision multiplication binary operation
     * @return double precision result of multiplication operations
     */
    public double multiplication(){
        return this._val1 * this._val2;
    }

    /**
     * Perform double precision division binary operation
     * @return double precision result of division operations
     * @throws ArithmeticException - if division by zero
     */
    public double division(){
        if(this._val2 == 0){
            String msg = get_val1() + " / " + get_val2() + " = Error: Division by zero";
            throw new ArithmeticException(msg);
        }else{
            return this._val1 / this._val2;
        }
    }

    /**
     * Return the first calculator operand
     * @return - the first calculator operand
     */
    public double get_val1() {
        return _val1;
    }

    /**
     * Return the second calculator operand
     * @return - the second calculator operand
     */
    public double get_val2() {
        return _val2;
    }

    /**
     * Display summary of calculator operations.
     */
    public void OperationSummary(){
        System.out.printf("%s + %s = %s\n",get_val1(),get_val2(),(this.addition()));
        System.out.printf("%s - %s = %s\n",get_val1(),get_val2(),(this.subtraction()));
        System.out.printf("%s * %s = %s\n",get_val1(),get_val2(),(this.multiplication()));
        System.out.printf("%s / %s = %s\n",get_val1(),get_val2(),(this.division()));
    }
}
