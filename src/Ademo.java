
public class Ademo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Rect r1=new Rect();
System.out.println(r1.toString());
	}

}

class Rect
{
	int l=10,b=6;

	@Override
	public String toString() {
		return "Rect [l=" + l + ", b=" + b + "]";
	}
	
}