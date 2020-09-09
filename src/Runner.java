
public class Runner {

	public static void main(String[] args) {
		Square sq = new Square();
		System.out.println(sq.getArea(3));
		System.out.println(sq.getPerimeter(3));
		System.out.println(sq.getColour());
		System.out.println();
		
		
		Equilateral eq = new Equilateral();
		System.out.println(eq.traingleType("Equilateral"));
		System.out.println(eq.getPerimeter(3));
		System.out.println(eq.getArea(3));
		System.out.println();
		
		
		RightAngle ra = new RightAngle();
		System.out.println(ra.traingleType("Right Angle"));
		System.out.println(ra.getPerimeter(3,6,7));
		System.out.println(ra.getArea(3,6,7));

	}

}
