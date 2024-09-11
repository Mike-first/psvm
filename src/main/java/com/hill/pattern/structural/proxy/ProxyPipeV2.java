//counts the number of calls
//can limit the number/frequency
//can log the parameters (arguments) of calls

package com.hill.pattern.structural.proxy;

public class ProxyPipeV2 implements Pipe {
    private static int callCounter;
    private Pipe pipe = new IronPipe();

    @Override
    public void waterSupply() {
        callCounter++;
        pipe.waterSupply();
    }

    public static int getCallCounter() {
        return callCounter;
    }
}
