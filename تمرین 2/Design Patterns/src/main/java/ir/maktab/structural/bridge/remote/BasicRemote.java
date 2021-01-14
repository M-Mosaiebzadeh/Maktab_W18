package ir.maktab.structural.bridge.remote;

import ir.maktab.structural.bridge.device.Device;

public class BasicRemote extends Remote{

    public BasicRemote(Device device) {
        super(device);
    }

    public void power() {
        if (device.isOn()){
            device.off();
            System.out.println("turn off");
        }else {
            device.on();
            System.out.println("turn on");
        }
    }

    public void volumeUp() {
        int oldVolume = device.getVolume();
        device.setVolume(oldVolume + 1);
        System.out.println(oldVolume + " => " + device.getVolume());
    }

    public void volumeDown() {
        int oldVolume = device.getVolume();
        device.setVolume(oldVolume - 1);
        System.out.println(oldVolume + " => " + device.getVolume());
    }

    public void channelUp() {
        int oldChannel = device.getChannel();
        device.setChannel(oldChannel + 1);
        System.out.println(oldChannel + " => " + device.getChannel());
    }

    public void channelDown() {
        int oldChannel = device.getChannel();
        device.setChannel(oldChannel - 1);
        System.out.println(oldChannel + " => " + device.getChannel());
    }

}
