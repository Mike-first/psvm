package com.hill.pattern.creational.abstractfactory.smarthousesystem;

import com.hill.pattern.creational.abstractfactory.Commissioner;
import com.hill.pattern.creational.abstractfactory.Designer;
import com.hill.pattern.creational.abstractfactory.Installer;
import com.hill.pattern.creational.abstractfactory.ProjectFactory;

public class SmartHouseSystemFactory implements ProjectFactory {
    @Override
    public Designer getDesigner() {
        return new SmartHouseSystemDesigner();
    }

    @Override
    public Installer getInstaller() {
        return new SmartHouseSystemInstaller();
    }

    @Override
    public Commissioner getCommissioner() {
        return new SmartHouseSystemCommissioner();
    }
}
