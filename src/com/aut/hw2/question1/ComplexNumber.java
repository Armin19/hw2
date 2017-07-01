package com.aut.hw2.question1;


public class ComplexNumber {
    double real3;
    double img3;

    private double addition(double real1, double img1, double real2, double img2) {
        real3 = real1 + real2;
        img3 = img1 + img2;
        double total = real3 + img3;
        return total;
    }

    private double substraction(double real1, double img1, double real2, double img2) {
        real3 = real1 - real2;
        img3 = img1 - img2;
        double total = real3 + img3;
        return total;
    }

    private double cross(double real1, double img1, double real2, double img2) {
        real3 = (real1 * real2 - img1 * img2);
        img3 = (real1 * img2 + img1 * real2);
        double total = real3 + img3;
        return total;
    }

    private double division(double real1, double img1, double real2, double img2) {
        double denominator = Math.pow(real2, 2) + Math.pow(img2, 2);
        double real3 = (real1 * real2 - img1 * img2);
        double img3 = (real1 * img2 + img1 * real2);
        double total = real3 / denominator + img3 / denominator;
        return total;

    }

    ComplexNumber complexNumber = new ComplexNumber();
    ComplexNumber complexNumber2 = new ComplexNumber();
    public void setComplexNumber(double real, double img) {
        this.complexNumber = complexNumber;
        this.complexNumber = complexNumber2;
    }
    private boolean complexIdentifier(){
        if ()
    }
    @Override
    public String toString() {
        return super.toString();
    }

    public static void main(String[] args) {
        // write your code here
        System.out.println();
    }

}
