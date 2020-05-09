package com.company;

import java.io.DataOutput;


public class SimpleCalculator {
    private double firstNumber;
    private double secondNumber;

    public void setFirstNumber(double firstNumber){
        this.firstNumber = firstNumber;
    }
    public void setSecondNumber(double secondNumber){
        this.secondNumber = secondNumber;
    }

    public double getFirstNumber() {
        return this.firstNumber;
    }

    public double getSecondNumber() {
        return this.secondNumber;
    }

    public double getAdditionResult(){
        return this.firstNumber + this.secondNumber;
    }
    public double getSubtractionResult(){
        return this.firstNumber - this.secondNumber;
    }
    public double getMultiplicationResult(){
        return this.firstNumber * this.secondNumber;
    }
    public double getDivisionResult(){
        if(this.firstNumber == 0 || this.secondNumber == 0){
            return 0;
        }else{
            return this.firstNumber / this.secondNumber;
        }
    }
}
