//Proxy
//replaces an object. allows:
//log, bind to an object from another address space,
//lazy initialize, cache, synchronize across threads, smart reference, escape
//cons: increases response time

package com.hill.pattern.structural.proxy;

public class Client {
    public static void main(String[] args) {

//        Pipe pipe = new IronPipe(); //even if you don't use your pipe, initialization will perform when constructor called
//        pipe.waterSupply();

        Pipe p1 = new ProxyPipeV1(); //initialization will perform when you call waterSupply()
        p1.waterSupply();


        Pipe p2 = new ProxyPipeV2(); //count callings, can limit it
        p2.waterSupply();
        p2.waterSupply();
        p2.waterSupply();
        p2.waterSupply();
        System.out.println("waterSupply was called " + ProxyPipeV2.getCallCounter());
    }
}
