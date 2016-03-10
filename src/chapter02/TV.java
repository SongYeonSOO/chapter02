package chapter02;

public class TV {
	private int channel;
	private int volume;
	private boolean power;

	private boolean cup;
	private boolean vup;

	public TV(int channel, int volume, boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}

	public int getChannel() {
		return channel;
	}

	public int getVolume() {
		return volume;
	}

	public boolean isPower() {
		return power;
	}

	public void channel(int channel) {
		this.channel = channel;
	}

	public void channel(boolean up) {
		this.cup = up;
	}

	public void volume(int volume) {
		this.volume = volume;
	}

	public void volume(boolean up) {
		this.vup = up;
	}

	public void power(boolean on) {
		this.power = on;
	}

	public void status() {
		System.out.println("Channel:"+this.getChannel());
		System.out.println("Volume:"+this.getVolume());
		System.out.println("Power:"+this.isPower());
	}
}
