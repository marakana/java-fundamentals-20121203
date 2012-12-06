import java.util.Random;

public enum Color {
	BLACK, RED, BLUE, BROWN, PINK;
	
	public static Color getRandomColor() {
		Color[] colors = values();
		int randomIndex = new Random().nextInt(colors.length);
		return colors[randomIndex];
	}
}
