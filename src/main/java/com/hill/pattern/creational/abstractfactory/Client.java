
//abstract factory allows to achieve polymorphism with minimal changes (1 line) of client code


package com.hill.pattern.creational.abstractfactory;

import com.hill.pattern.creational.abstractfactory.electronics.ElectronicsFactory;

public class Client {
    public static void main(String[] args) {

//        ProjectFactory projectFactory = new IndustrialAutomationFactory();
//        ProjectFactory projectFactory = new SmartHouseSystemFactory();
        ProjectFactory projectFactory = new ElectronicsFactory();

        Designer designer = projectFactory.getDesigner();
        Installer installer = projectFactory.getInstaller();
        Commissioner commissioner = projectFactory.getCommissioner();

        System.out.println();
        System.out.println("project in progress..");
        designer.createProject();
        installer.performInstallation();
        commissioner.performCommissioning();
    }
}
