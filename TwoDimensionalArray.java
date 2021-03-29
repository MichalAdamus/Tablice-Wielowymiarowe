class TwoDimensionalArray {
	
	public static void main(String args[]){
	

	// Zadanie Pierwsze - Tabliczka Mnożenia do 9
	
	int [][] multiTable = new int [3][3];
	System.out.println();
	System.out.println("------------------- Tabliczka Mnożenia do 9 -------------------"); 
	System.out.println();
	multiTable [0][0] = 1; multiTable [0][1] = 2; multiTable [0][2] = 9;
	multiTable [1][0] = 6; multiTable [1][1] = multiTable[0][1]* multiTable[1][0]; multiTable [1][2] = multiTable[0][2]*multiTable[1][0];
	multiTable [2][0] = 3; multiTable [2][1] = multiTable[0][1]*multiTable[2][0]; multiTable [2][2] = multiTable[0][2]*multiTable[2][0];
	
	System.out.println();
	System.out.println(multiTable[0][0]+"\t"+multiTable[0][1]+"\t"+multiTable[0][2]);
	System.out.println(multiTable[1][0]+"\t"+multiTable[1][1]+"\t"+multiTable[1][2]);
	System.out.println(multiTable[2][0]+"\t"+multiTable[2][1]+"\t"+multiTable[2][2]);
	System.out.println();
	System.out.println();
	}
}