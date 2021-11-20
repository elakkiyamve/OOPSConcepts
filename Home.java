package com.elakkiya.OOPSConcepts.Inheritance;


public class Home{

     String roomName;
     int noOfLights;
     int totalLights;
     int a[] = new int[5];

     public Home(int noOfLights, String roomName) {
         this.noOfLights = noOfLights;
         this.roomName = roomName;
     }

     public int totalNoOfLights(){

            return noOfLights;
     }

     public static void main(String[] args) {

         Home Kitchen = new Kitchen(2,"Kitchen");
         System.out.println("Kitchen has " + Kitchen.totalNoOfLights() +"  lights");
         Home MasterRoom = new MasterRoom(3,"MasterRoom");
         System.out.println("MasterRoom has " + MasterRoom.totalNoOfLights() + "  lights");
         Home Hall = new Hall(4,"Hall");
         System.out.println("Hall has " + Hall.totalNoOfLights() + "  lights");


     }


 }