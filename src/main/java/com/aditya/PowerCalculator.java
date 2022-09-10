/*
 * Author Name: Aditya Chaurasia
 * Date: 10-09-2022
 * Created With: IntelliJ IDEA Community Edition
 */
package com.aditya;

public class PowerCalculator {

    /**
     * This method calculates the power of a base number to an exponent.
     *
     * @param base     the base of the power.
     * @param exponent the exponent of the power.
     * @return the result of the power or Double.MIN_VALUE if the exponent is negative.
     */
    public double calculatePowerRecursively(double base, double exponent) {
        if (exponent < 0) {
            return Double.MIN_VALUE;
        }
        if (exponent == 0) {
            return 1;
        }
        return base * calculatePowerRecursively(base, exponent - 1);
    }
}
