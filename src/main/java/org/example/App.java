package org.example;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class App {
    public static void main(String[] args) {

        System.out.println("Hi All");

        Car carReference = new Car();
        carReference.name = "Ferrari";
        carReference.maxSpeed = 300;
        carReference.fuelLevel = 60;
        carReference.mileage = 12.5;
        carReference.totalTravelDistance = 0;
        carReference.damaged = true;
        carReference.doorCount = 2;
        carReference.color = "red";

        Engine engine1=new Engine();
        engine1.manufacterer="Ferrari";
        engine1.capacity=3000;
        carReference.engine=engine1;
        System.out.println("Engine1 capacity:"+engine1.capacity);
        System.out.println("Car engine capacity:"+carReference.engine.capacity);

        engine1.capacity=4000;

        System.out.println("Car engine capacity"+carReference.engine.capacity);


        carReference.engine=engine1;
        //concatenare
        System.out.println("Proprietatiile unei masini (Properties of car) " + carReference.name);
        System.out.println("Max Speed :" + carReference.maxSpeed);
        System.out.println("Fuel Level : " + carReference.fuelLevel);
        System.out.println("Mileage: " + carReference.mileage);
        System.out.println("Total Travel distance: " + carReference.totalTravelDistance);
        System.out.println("Damaged:" + carReference.damaged);
        System.out.println("Door count : " + carReference.doorCount);
        System.out.println("Color is : " + carReference.color);
        System.out.println(carReference);
        System.out.println();

        Car car2 = new Car();
        car2.name = "ford";
        car2.fuelLevel = 85;
        car2.totalTravelDistance = 165;
        Engine engine2=new Engine();
        engine2.capacity=4500;
        carReference.engine=engine2;
        System.out.println("Motorul masinii doi are puterea de : "+carReference.engine.capacity);
        System.out.println("Proprietatiile unei masini (Properties of car) " + car2.name);
        System.out.println("Max Speed :" + car2.maxSpeed);
        System.out.println("Fuel Level : " + car2.fuelLevel);
        System.out.println("Mileage: " + car2.mileage);
        System.out.println("Total Travel distance: " + car2.totalTravelDistance);
        System.out.println("Damaged:" + car2.damaged);
        System.out.println("Door count : " + car2.doorCount);
        System.out.println("Color is : " + car2.color);
        System.out.println("First car finished");
        System.out.println();

        System.out.println(car2.name);
        System.out.println(carReference.name);

        System.out.println("Initial name of car1:" + carReference.name);
        carReference.name = "Audi";
        System.out.println("Changed name for car1:" + carReference.name);

        carReference = new Car();
        System.out.println("Name of new car:" + carReference.name);
        carReference.name="BMW";

        carReference=car2;
        System.out.println("Name of car reference from 2 variables. Car Reference: "+carReference.name);
        System.out.println("Name of car reference from 2 variables. Car2: "+car2.name);

        car2.name="Dacia";
        System.out.println("UPDATED Name of car reference from 2 variables. Car Reference: "+carReference.name);
        System.out.println(" UPDATED Name of car reference from 2 variables. Car2: "+car2.name);

        car2=null;
        System.out.println(carReference.name);




    }
}
