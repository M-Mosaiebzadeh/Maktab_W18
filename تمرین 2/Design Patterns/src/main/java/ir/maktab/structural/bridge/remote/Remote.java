package ir.maktab.structural.bridge.remote;

import ir.maktab.structural.bridge.device.Device;

public abstract class Remote {
    protected Device device;

    public Remote(Device device) {
        this.device = device;
    }
    public abstract void power();

    public abstract void volumeUp();

    public abstract void volumeDown();

    public abstract void channelUp();

    public abstract void channelDown();
}
