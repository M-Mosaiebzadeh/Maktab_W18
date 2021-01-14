package ir.maktab.structural.bridge;

import ir.maktab.structural.bridge.device.Device;
import ir.maktab.structural.bridge.device.Radio;
import ir.maktab.structural.bridge.device.Tv;
import ir.maktab.structural.bridge.remote.AdvancedRemote;
import ir.maktab.structural.bridge.remote.BasicRemote;

public class bridgeDemo {
    public static void main(String[] args) {
        Device tv = new Tv();
        Device radio = new Radio();
        System.out.println("=============================================");

        AdvancedRemote advTvRemote  = new AdvancedRemote(tv);
        System.out.println(tv);

        advTvRemote.power();
        advTvRemote.channelDown();
        advTvRemote.mute();

        System.out.println(tv);

        System.out.println("=============================================");

        BasicRemote basicRadioRemote = new BasicRemote(radio);
        System.out.println(radio);

        basicRadioRemote.power();
        for (int i = 0; i < 10; i++) {
            basicRadioRemote.channelUp();
        }
        System.out.println(radio);
    }
}
