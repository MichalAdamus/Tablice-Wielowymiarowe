class TwoDimensionalArrayCrossword {

public static void main(String args[]){

	char[][] animals = new char[3][];
	animals[0] = new char[4];
	animals[1] = new char[3];
	animals[2] = new char[6];
	
	System.out.println();
	System.out.println("------------------");
    System.out.println("" + animals [0][0] +""+ animals [0][1] +""+ animals [0][2] +""+ animals [0][3]);
    System.out.println("" + animals [1][0] +""+ animals [1][1] +""+ animals [1][2]);
    System.out.println("" + animals [2][0] +""+ animals [2][1] +""+ animals [2][2] +""+ animals [2][3] +""+ animals [2][4] +""+ animals [2][5]);
    System.out.println("------------------");
	
	animals [0][0] = 'w';
	animals [0][1] = 'i'; 
	animals [0][2] = 'l'; 
	animals [0][3] = 'k';
	
	animals [1][0] = 'k';
	animals [1][1] = 'o'; 
	animals [1][2] = 't'; 
	
	animals [2][0] = 'z';
	animals [2][1] = 'y'; 
	animals [2][2] = 'r'; 
	animals [2][3] = 'a';
	animals [2][4] = 'f'; 
	animals [2][5] = 'a'; 
	
	/* Ad 1 - wyświetl trzecią literę drugiego hasła - "o"*/;
	System.out.println();
	System.out.println(""+ animals [1][1]);
	
	/* Ad 2 - wyświetl pierwszą literę pierwszego hasła - "w"*/;
	System.out.println();
	System.out.println(""+ animals [0][0]);
	
	/* Ad 3 - zamień ostatnią literę trzeciego hasła na - "y"*/;
	char tmp = animals[2][5];
	animals[2][5] = animals[2][1];
	animals[2][1]= tmp;
	System.out.println();
	
	/* Ad 4 - wyświetl długość drugiego hasła krzyżówki*/;
	System.out.println();
	System.out.println("Długość drugiego hasła krzyzówki ma"+ "" + animals[1].length+""+"litery");
		
	/* Ad 5 - wyświetl całą krzyżówkę */
	System.out.println();
	System.out.println("------------------");
    System.out.println("" + animals [0][0] +""+ animals [0][1] +""+ animals [0][2] +""+ animals [0][3]);
    System.out.println("" + animals [1][0] +""+ animals [1][1] +""+ animals [1][2]);
    System.out.println("" + animals [2][0] +""+ animals [2][1] +""+ animals [2][2] +""+ animals [2][3] +""+ animals [2][4] +""+ animals [2][5]);
    System.out.println("------------------");
	
	}
}