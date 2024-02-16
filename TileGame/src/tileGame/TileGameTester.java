package tileGame;

class BlockTester {

	String color;

	BlockTester(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "FIXME:BlockTester";
	}
}

class BoardTester {
	int width;
	int size;

	BoardTester(int width, int size) {

		BlockTester[][] BlockTesterArray = new BlockTester[width][size];
	}

	@Override
	public String toString() {
		return "FIXME:BoardTester";
	}

}

public class TileGameTester {
	public static void main() {

		System.out.println("Running");
		BoardTester someObject = new BoardTester(4, 5);

		System.out.println(someObject);
		System.out.println("Ending");
	}
}
