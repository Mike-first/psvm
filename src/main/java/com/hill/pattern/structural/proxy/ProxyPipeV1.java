//this proxy provides lazy implementation of heavy object

package com.hill.pattern.structural.proxy;

public class ProxyPipeV1 implements Pipe {
    private Pipe pipe;

    private void init() {
        if (pipe == null) {
            pipe = new IronPipe();
        }
    }

    @Override
    public void waterSupply() {
        init();
        pipe.waterSupply();
    }
}
