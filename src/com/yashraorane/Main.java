package com.yashraorane;

import java.util.ArrayList;

class IntValue{
    private int myValyue;

    public IntValue(int myValyue) {
        this.myValyue = myValyue;
    }

    public int getMyValyue() {
        return myValyue;
    }

    public void setMyValyue(int myValyue) {
        this.myValyue = myValyue;
    }
}

public class Main {

    public static void main(String[] args) {


        ArrayList<Integer> integerArrayList= new ArrayList<Integer>();
        for(int i=0;i<=10;i++){
             integerArrayList.add(Integer.valueOf(i)); //Autoboxing
        }

        for (int i=0;i<=10;i++){
            System.out.println(i+"-->"+ integerArrayList.get(i).intValue()); //Unboxing
        }

        Integer myIntValue= 56; //At compile time the rhs becomes-> Integer.valueoOf(56);
        int myInt= myIntValue.intValue(); // At compile time the rhs becomes -> myIntValue.intValue();
        System.out.println(myInt);


        ArrayList<Double> doubleArrayList= new ArrayList<Double>();
       for(double dbl=0.0;dbl<=10.0;dbl+=0.5){
           //doubleArrayList.add(Double.valueOf(dbl));
           doubleArrayList.add(dbl);
       }

       for(int i=0;i<doubleArrayList.size();i++){
           //System.out.println(doubleArrayList.get(i).doubleValue());
            double value= doubleArrayList.get(i);
           System.out.println(i+ "-->"+ value);

       }







        //Longer way
        ArrayList<IntValue> myIntArrayList= new ArrayList<IntValue>();
        myIntArrayList.add(new IntValue(54));


    }
}
