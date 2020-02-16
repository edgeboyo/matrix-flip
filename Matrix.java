public abstract class Matrix {
	
	Double mat[][];
	Integer size;

	public Matrix(int size){
		mat = new Double[size][size];
		this.size = size;
	}

	public void input(Double[][] newt){
		if(newt != null && newt.length == size && newt[0].length == size){
			mat = newt;
		}
	}

	public void id(){
		mat = new Double[size][size];
		for(int i=0; i<size; i++){

			for(int ii=0; ii<size; ii++){

				if(i == ii)
					mat[i][ii] = (double) 1;
				else 
					mat[i][ii] = (double) 0;
			}
		}
	}

	public abstract double det();
}