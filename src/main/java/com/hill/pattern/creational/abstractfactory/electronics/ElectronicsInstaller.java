package com.hill.pattern.creational.abstractfactory.electronics;

import com.hill.pattern.creational.abstractfactory.Installer;

public class ElectronicsInstaller implements Installer {
    @Override
    public void performInstallation() {
        System.out.println("Installer perform installation of Electronics");
    }
}
