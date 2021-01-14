package ir.maktab.structural.bridge.device;

public interface Device {
    boolean isOn();
    void on();
    void off();
    int getVolume();
    void setVolume(int volume);
    int getChannel();
    void setChannel(int channel);
}

