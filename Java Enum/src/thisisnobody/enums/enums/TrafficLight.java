package thisisnobody.enums.enums;

enum Signal {
	GREEN, RED, YELLOW
}

public class TrafficLight {
	Signal color = Signal.GREEN;

	public void change() {
		switch (color) {
		case GREEN:
			color = Signal.RED;
			break;
		case RED:
			color = Signal.YELLOW;
			break;
		case YELLOW:
			color = Signal.GREEN;
			break;
		}
	}

	public static void main(String[] args) {

		TrafficLight t = new TrafficLight();

		for (int i = 0; i < 7; i++) {
			t.change();
			System.out.println(t.color);
		}

	}

}
