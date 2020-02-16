public class TwoByTwo extends Matrix {
	public TwoByTwo(){
		super(2);
	}

	public double det(){
		return mat[0][0]*mat[1][1] - mat[0][1]*mat[1][0];
	}

	public static void main(String args[]){
		TwoByTwo matrix = new TwoByTwo();

		matrix.id();

		System.out.println(matrix.det());

		Double[][] mm = new Double[2][2];

		mm[0][0] = 2.5;
		mm[0][1] = 10.0;
		mm[1][0] = 4.0;
		mm[1][1] = 4.0;
		
		matrix.input(mm);
		System.out.println(matrix.det());
	}
}