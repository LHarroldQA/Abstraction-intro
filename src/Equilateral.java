
public class Equilateral extends Triangle{
	private String name;

	@Override
	public String traingleType(String name) {
		this.name = name;
		return this.name;
	}

	@Override
	public double getArea(int side) {
		return (Math.sqrt(3)/4) * (side*side);
	}

	@Override
	public double getPerimeter(int side) {
		return side * 3;
	}

}
