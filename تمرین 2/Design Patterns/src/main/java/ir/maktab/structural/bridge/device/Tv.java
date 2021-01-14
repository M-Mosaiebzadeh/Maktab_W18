package ir.maktab.structural.bridge.device;

public class Tv implements Device {
    private boolean on = false;
    private int volume = 50;
    private int channel = 1;
    @Override
    public boolean isOn() {
        return on;
    }

    @Override
    public void on() {
        this.on = true;
    }

    @Override
    public void off() {
        this.on = false;
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setVolume(int volume) {
        if (volume >100)
            this.volume = 100;
        else if (volume < 0)
            this.volume = 0;
        else
            this.volume = volume;
    }

    @Override
    public int getChannel() {
        return channel;
    }

    @Override
    public void setChannel(int channel) {
        if (channel > 20 || channel == 0)
            this.channel = 1;
        else
            this.channel = channel;
    }

    @Override
    public String toString() {
        return "Tv{" +
                "on=" + on +
                ", volume=" + volume +
                ", channel=" + channel +
                '}';
    }
}
