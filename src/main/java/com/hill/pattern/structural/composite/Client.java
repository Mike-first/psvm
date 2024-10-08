//Composite
//allows clients to access individual objects and groups of objects in the same way
//makes sense when the task can be represented as a tree, where each node has the same interface

package com.hill.pattern.structural.composite;

public class Client {
    public static void main(String[] args) {
        Worker bricklayer = new Bricklayer();
        Worker carpenter = new Carpenter();
        Worker wallpaperMaster = new WallpaperMaster();
        Worker painter = new Painter();

        Foreman foreman1 = new Foreman("builders");
        Foreman foreman2 = new Foreman("decorators");

        foreman1.addWorker(bricklayer);
        foreman1.addWorker(carpenter);

        foreman2.addWorker(wallpaperMaster);
        foreman2.addWorker(painter);

        ConstructionDirector constructionDirector = new ConstructionDirector("future city");

        constructionDirector.addWorker(foreman1);
        constructionDirector.addWorker(foreman2);

        //this place you can ask any worker to perform their job, but result will be different according to worker's responsibilities
        //so you can call any node of your tree with the same interface
        System.out.println();
        bricklayer.doWork();
        System.out.println();
        foreman2.doWork();
        System.out.println();
        constructionDirector.doWork();


    }

}
