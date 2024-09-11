package com.hill.pattern.creational.abstractfactory.industrialautomation;

import com.hill.pattern.creational.abstractfactory.Commissioner;
import com.hill.pattern.creational.abstractfactory.Designer;
import com.hill.pattern.creational.abstractfactory.Installer;
import com.hill.pattern.creational.abstractfactory.ProjectFactory;

public class IndustrialAutomationFactory implements ProjectFactory {
    @Override
    public Designer getDesigner() {
        return new IndustrialAutomationDesigner();
    }

    @Override
    public Installer getInstaller() {
        return new IndustrialAutomationInstaller();
    }

    @Override
    public Commissioner getCommissioner() {
        return new IndustrialAutomationCommissioner();
    }
}
