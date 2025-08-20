package com.xworkz.ac.ac;

public class Ac {
    {

        static boolean powerOn;
        static int currentTemp;
        static int maxTemp=25;
        static int minTemp;

        public static void isOnOff(){
            if(powerOn==false)
                System.out.println(" Power of ,Please Turn on");
            else
                System.out.println("Power on");

        }

        public static void increaseTemp(){
            System.out.println("+,Increase");
            if(powerOn=true){
                if(currentTemp<maxTemp){
                    currentTemp=currentTemp+1;
                    System.out.println("The current temprature is"+currentTemp);
                }
            }else
                System.out.println("Power of ,Please Turn on");

        }

        public static void decreaseTemp(){
            System.out.println("- ,Decrease");
            if(powerOn=true){
                if(currentTemp>minTemp)
                    currentTemp=currentTemp-1;
                System.out.println("The current temprature is"+currentTemp);
            }
            else
                System.out.println("Power of ,Please Turn on");



        }



    }


}
