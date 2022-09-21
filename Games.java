package pro4;


public class Games {

	public  int g1[][] ;
	public int g2[] [];
	public int g3[] [];
	public int g4[] [];
	public int g5[][];

	public Games(int[][] g1, int[][] g2, int[][] g3, int[][] g4, int[][] g5) {
		super();
		this.g1 = g1;
		this.g2 = g2;
		this.g3 = g3;
		this.g4 = g4;
		this.g5 = g5;
	}

	public Games() {

	}

	public int[][] getG1() {
	int	g1[][] = {{ 3, 1, 6, 5, 7, 8, 4, 9, 2 },
	             { 5, 2, 9, 1, 3, 4, 7, 6, 8 },
	             { 4, 8, 7, 6, 2, 9, 5, 3, 1 },
	             { 2, 6, 3, 0, 1, 5, 9, 8, 7 },
	             { 9, 7, 4, 8, 6, 0, 1, 2, 5 },
	             { 8, 5, 1, 7, 9, 2, 6, 4, 3 },
	             { 1, 3, 8, 0, 4, 7, 2, 0, 6 },
	             { 6, 9, 2, 3, 5, 1, 8, 7, 4 },
	             { 7, 4, 5, 0, 8, 6, 3, 1, 0 }};

		return g1 ;
	}

	public void setG1(int[][] g1) {
		this.g1 = g1;
	}

	public int[][] getG2() {
		int g2 [][]={{0,0,0,1,0,0,8,0,6},
		             {0,0,7,0,8,2,0,3,0} ,
	             	 {0,3,0,7,0,0,9,0,0},
	             	 {0,0,9,0,0,0,0,0,5},
	             	 {0,7,5,8,0,9,4,2,0},
	             	 {2,0,0,0,0,0,7,0,0},
	             	 {0,0,3,0,0,8,0,6,0},
	             	 {0,8,0,2,9,0,3,0,0},
	             	 {9,0,6,0,0,1,0,0,0}};


		return g2;
	}


	public void setG2(int[][] g2) {
		this.g2 = g2;
	}

	public int[][] getG3() {
		int g3 [][] = {{0,2,0,0,4,0,0,0,0},
				      {5,7,0,0,0,0,2,0,8},
				      {0,0,4,2,0,1,5,0,0},
				      {0,8,0,4,0,0,0,0,9},
				      {0,0,6,1,0,5,7,0,0},
				      {3,0,0,0,0,9,0,6,0},
				      {0,0,3,8,0,7,9,0,0},
				      {7,0,8,0,0,0,0,3,5},
				      {0,0,0,0,3,0,0,1,0}};

		return g3;

}


	public void setG3(int[][] g3) {
		this.g3 = g3;
	}

	public int[][] getG4() {
		return g4;
	}

	public void setG4(int[][] g4) {
		this.g4 = g4;
	}

	public int[][] getG5() {
		return g5;
	}

	public void setG5(int[][] g5) {
		this.g5 = g5;
	}




}

