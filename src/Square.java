
public class Square extends Shape{
	
	@Override
	public double getPerimeter(int side) {
		return side*4;
	}
	
	@Override
	public double getArea(int side) {
		return side*side;
	}
	
	public String getColour() {
		return "blue";
	}

}
