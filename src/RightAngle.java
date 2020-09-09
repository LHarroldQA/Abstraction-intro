
public class RightAngle extends Triangle {
	private String name;
	
	@Override
	public String traingleType(String name) {
		this.name = name;
		return this.name;
	}

	public double getArea(int sideA,int sideB,int sideC) {
		return (sideA*sideB)/2;
	}


	public double getPerimeter(int sideA,int sideB,int sideC) {
		return sideA + sideB + sideC;
	}

	@Override
	public double getArea(int side) {
		return 0;
	}

	@Override
	public double getPerimeter(int side) {
		return 0;
	}

}
