class TwoDimensionalArrayLighthouse {

	public static void main(String args[]){
	
	char [][] lighthouse = new char [10][10];
	lighthouse[0][0] = '1';
	lighthouse[0][1] = ' ';
	lighthouse[0][2] = ' ';
	lighthouse[0][3] = ' ';
	lighthouse[0][4] = ' ';
	lighthouse[0][5] = ' ';
	lighthouse[0][6] = ' ';
	lighthouse[0][7] = '@';
	lighthouse[0][8] = ' ';
	lighthouse[0][9] = '2';
	System.out.println();
	lighthouse[1][0] = ' ';
	lighthouse[1][1] = ' ';
	lighthouse[1][2] = ' ';
	lighthouse[1][3] = ' ';
	lighthouse[1][4] = ' ';
	lighthouse[1][5] = '@';
	lighthouse[1][6] = ' ';
	lighthouse[1][7] = ' ';
	lighthouse[1][8] = ' ';
	lighthouse[1][9] = ' ';
	System.out.println();
	lighthouse[2][0] = ' ';
	lighthouse[2][1] = '@';
	lighthouse[2][2] = ' ';
	lighthouse[2][3] = ' ';
	lighthouse[2][4] = ' ';
	lighthouse[2][5] = ' ';
	lighthouse[2][6] = ' ';
	lighthouse[2][7] = '4';
	lighthouse[2][8] = ' ';
	lighthouse[2][9] = '@';
	System.out.println();
	lighthouse[3][0] = ' ';
	lighthouse[3][1] = ' ';
	lighthouse[3][2] = ' ';
	lighthouse[3][3] = ' ';
	lighthouse[3][4] = ' ';
	lighthouse[3][5] = '2';
	lighthouse[3][6] = ' ';
	lighthouse[3][7] = ' ';
	lighthouse[3][8] = ' ';
	lighthouse[3][9] = ' ';
	System.out.println();
	lighthouse[4][0] = ' ';
	lighthouse[4][1] = ' ';
	lighthouse[4][2] = ' ';
	lighthouse[4][3] = '0';
	lighthouse[4][4] = ' ';
	lighthouse[4][5] = ' ';
	lighthouse[4][6] = ' ';
	lighthouse[4][7] = ' ';
	lighthouse[4][8] = ' ';
	lighthouse[4][9] = ' ';
	System.out.println();
	lighthouse[5][0] = ' ';
	lighthouse[5][1] = '@';
	lighthouse[5][2] = ' ';
	lighthouse[5][3] = ' ';
	lighthouse[5][4] = ' ';
	lighthouse[5][5] = ' ';
	lighthouse[5][6] = '2';
	lighthouse[5][7] = ' ';
	lighthouse[5][8] = '@';
	lighthouse[5][9] = ' ';
	System.out.println();
	lighthouse[6][0] = ' ';
	lighthouse[6][1] = ' ';
	lighthouse[6][2] = ' ';
	lighthouse[6][3] = ' ';
	lighthouse[6][4] = '0';
	lighthouse[6][5] = ' ';
	lighthouse[6][6] = ' ';
	lighthouse[6][7] = ' ';
	lighthouse[6][8] = ' ';
	lighthouse[6][9] = ' ';
	System.out.println();
	lighthouse[7][0] = ' ';
	lighthouse[7][1] = ' ';
	lighthouse[7][2] = '0';
	lighthouse[7][3] = ' ';
	lighthouse[7][4] = ' ';
	lighthouse[7][5] = ' ';
	lighthouse[7][6] = ' ';
	lighthouse[7][7] = ' ';
	lighthouse[7][8] = ' ';
	lighthouse[7][9] = ' ';
	System.out.println();
	lighthouse[8][0] = ' ';
	lighthouse[8][1] = ' ';
	lighthouse[8][2] = ' ';
	lighthouse[8][3] = ' ';
	lighthouse[8][4] = ' ';
	lighthouse[8][5] = ' ';
	lighthouse[8][6] = ' ';
	lighthouse[8][7] = ' ';
	lighthouse[8][8] = ' ';
	lighthouse[8][9] = ' ';
	System.out.println();
	lighthouse[9][0] = '2';
	lighthouse[9][1] = ' ';
	lighthouse[9][2] = ' ';
	lighthouse[9][3] = ' ';
	lighthouse[9][4] = ' ';
	lighthouse[9][5] = '@';
	lighthouse[9][6] = ' ';
	lighthouse[9][7] = '@';
	lighthouse[9][8] = ' ';
	lighthouse[9][9] = '3';
		
	System.out.println("------------------- Lamiglowka Lighthouse -------------------"); 

	System.out.println(lighthouse[0][0]+"\t"+lighthouse[0][1]+"\t"+lighthouse[0][2]+"\t"+lighthouse[0][3]+"\t"+lighthouse[0][4]+"\t"+lighthouse[0][5]+"\t"+lighthouse[0][6]+"\t"+lighthouse[0][7]+"\t"+lighthouse[0][8]+"\t"+lighthouse[0][9]);
	System.out.println(lighthouse[1][0]+"\t"+lighthouse[1][1]+"\t"+lighthouse[1][2]+"\t"+lighthouse[1][3]+"\t"+lighthouse[1][4]+"\t"+lighthouse[1][5]+"\t"+lighthouse[1][6]+"\t"+lighthouse[1][7]+"\t"+lighthouse[1][8]+"\t"+lighthouse[1][9]);
	System.out.println(lighthouse[2][0]+"\t"+lighthouse[2][1]+"\t"+lighthouse[2][2]+"\t"+lighthouse[2][3]+"\t"+lighthouse[2][4]+"\t"+lighthouse[2][5]+"\t"+lighthouse[2][6]+"\t"+lighthouse[2][7]+"\t"+lighthouse[2][8]+"\t"+lighthouse[2][9]);
	System.out.println(lighthouse[3][0]+"\t"+lighthouse[3][1]+"\t"+lighthouse[3][2]+"\t"+lighthouse[3][3]+"\t"+lighthouse[3][4]+"\t"+lighthouse[3][5]+"\t"+lighthouse[3][6]+"\t"+lighthouse[3][7]+"\t"+lighthouse[3][8]+"\t"+lighthouse[3][9]);
	System.out.println(lighthouse[4][0]+"\t"+lighthouse[4][1]+"\t"+lighthouse[4][2]+"\t"+lighthouse[4][3]+"\t"+lighthouse[4][4]+"\t"+lighthouse[4][5]+"\t"+lighthouse[4][6]+"\t"+lighthouse[4][7]+"\t"+lighthouse[4][8]+"\t"+lighthouse[4][9]);
	System.out.println(lighthouse[5][0]+"\t"+lighthouse[5][1]+"\t"+lighthouse[5][2]+"\t"+lighthouse[5][3]+"\t"+lighthouse[5][4]+"\t"+lighthouse[5][5]+"\t"+lighthouse[5][6]+"\t"+lighthouse[5][7]+"\t"+lighthouse[5][8]+"\t"+lighthouse[5][9]);
	System.out.println(lighthouse[6][0]+"\t"+lighthouse[6][1]+"\t"+lighthouse[6][2]+"\t"+lighthouse[6][3]+"\t"+lighthouse[6][4]+"\t"+lighthouse[6][5]+"\t"+lighthouse[6][6]+"\t"+lighthouse[6][7]+"\t"+lighthouse[6][8]+"\t"+lighthouse[6][9]);
	System.out.println(lighthouse[7][0]+"\t"+lighthouse[7][1]+"\t"+lighthouse[7][2]+"\t"+lighthouse[7][3]+"\t"+lighthouse[7][4]+"\t"+lighthouse[7][5]+"\t"+lighthouse[7][6]+"\t"+lighthouse[7][7]+"\t"+lighthouse[7][8]+"\t"+lighthouse[7][9]);
	System.out.println(lighthouse[8][0]+"\t"+lighthouse[8][1]+"\t"+lighthouse[8][2]+"\t"+lighthouse[8][3]+"\t"+lighthouse[8][4]+"\t"+lighthouse[8][5]+"\t"+lighthouse[8][6]+"\t"+lighthouse[8][7]+"\t"+lighthouse[8][8]+"\t"+lighthouse[8][9]);
	System.out.println(lighthouse[9][0]+"\t"+lighthouse[9][1]+"\t"+lighthouse[9][2]+"\t"+lighthouse[9][3]+"\t"+lighthouse[9][4]+"\t"+lighthouse[9][5]+"\t"+lighthouse[9][6]+"\t"+lighthouse[9][7]+"\t"+lighthouse[9][8]+"\t"+lighthouse[9][9]);
	
	}
}