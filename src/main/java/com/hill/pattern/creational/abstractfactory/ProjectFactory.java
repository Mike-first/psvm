package com.hill.pattern.creational.abstractfactory;

public interface ProjectFactory {
    Designer getDesigner();

    Installer getInstaller();

    Commissioner getCommissioner();
}
