package ir.maktab.structural.bridge.remote;

import ir.maktab.structural.bridge.device.Device;

public class AdvancedRemote extends BasicRemote{


    public AdvancedRemote(Device device) {
        super(device);
    }

    public void mute() {
        device.setVolume(0);
        System.out.println("sound is muted");
    }
}
