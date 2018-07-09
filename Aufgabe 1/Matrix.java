import java.util.Iterator;

public class Matrix<T> implements Iterable<T>{

	private T[][] mat;
	private char iteratorMode;

	// Konstruktor
	public Matrix(T[][] m){
		this.mat = m;
		this.iteratorMode = 'f';
	}
	//Interface Iterable impementiert
	public Iterator<T> iterator(){
		if(iteratorMode == 'f')
			return new MatrixForwardIterator(mat);
		else
			return new MatrixBackwardIterator(mat);
	}
	//Methode
	public void setIteratorMode(char val){
		if(val == 'f' || val == 'b')
		this.iteratorMode = val;
	}

	//Klass,die Interface Iterator<T> impementiert
	private class MatrixForwardIterator implements Iterator<T>{
		private T[][] matrix;
		private int pos;
		//Konstruktor
		public MatrixForwardIterator(T[][] matrix){
			if(mat != null){
			this.matrix = matrix;
			pos = 0;
			}
		}

		public boolean hasNext(){
				return pos < (matrix.length * matrix[0].length);
		}

		public T next(){
		//Zeile und Spalte ermitteln
			int spalte;
			int zeile = (this.pos)/(matrix[0].length);
			if(zeile == 0)
				spalte = pos;
			else
				spalte =(this.pos) - (zeile*matrix[0].length);
			T temp = matrix[zeile][spalte];
			this.pos++;
			return temp;
		}

		public void remove(){}


	}


	private class MatrixBackwardIterator implements Iterator<T>{
		private T[][] matrix;
		private int pos;
		//Konstruktor
		public MatrixBackwardIterator(T[][] matrix){
			if(mat != null){
			this.matrix = matrix;
			pos = matrix.length * matrix[0].length - 1;
			}
		}

		public boolean hasNext(){
				return pos >= 0;
		}

		public T next(){
		//Zeile und Spalte ermitteln
			int spalte;
			int zeile = (this.pos)/(matrix[0].length);
			if(zeile == 0)
				spalte = pos;
			else
				spalte =(this.pos) - (zeile*matrix[0].length);
			T temp = matrix[zeile][spalte];
			this.pos--;
			return temp;
		}

		public void remove(){}

	}


}
