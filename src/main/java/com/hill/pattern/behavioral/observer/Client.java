//Observer, publisher-subscriber
//structure - subscriber interface, subscribers, publisher, sometimes its interface (implementing which you can make any object a publisher)
//in our example, the security system and climate control listen to the smart home and weather station
//the house says the tenant came and went and it's time to sleep and wake up
//the weather station says the temperature and the rate of its change (the latter justifies polling the weather station in principle, but we will not implement it)
//the security goes on guard when the tenant leaves
//climate control reacts to the presence-absence of the tenant and the time of sleep-wakefulness and the temperature outside and its change

package com.hill.pattern.behavioral.observer;

public class Client {
    public static void main(String[] args) {
        SmartHouseSystem smartHouseSystem = new SmartHouseSystem();
        WeatherStation weatherStation = new WeatherStation();

        Observer climateControlSystem = new ClimateControlSystem();
        Observer securitySystem = new SecuritySystem();

        smartHouseSystem.registerObserver(climateControlSystem);
        smartHouseSystem.registerObserver(securitySystem);
        weatherStation.registerObserver(climateControlSystem);

        smartHouseSystem.updateData("first person came");
        smartHouseSystem.notifyObservers();

        weatherStation.updateData("the weather is getting more comfortable");
        weatherStation.notifyObservers();

    }
}

/*
data for smartHouseSystem.updateData()
first person came
the last person left
time to wake up
time to sleep

data for weatherStation.updateData()
the weather is becoming less comfortable
the weather is getting more comfortable

 */
