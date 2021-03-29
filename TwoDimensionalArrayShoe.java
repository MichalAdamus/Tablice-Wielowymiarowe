class TwoDimensionalArrayShoe {

	public static void main (String args[]){
	
	    char[][] tab = new char [3][4];
               tab [0] = new char[4];
               tab [1] = new char[2];
               tab [2] = new char[5];

               tab [0][0] = 'B';
               tab [0][1] = 'u';
               tab [0][2] = 't';
               tab [0][3] = 'y';

               tab [1][0] = '4';
               tab [1][1] = '2';

               tab [2][0] = '2';
               tab [2][1] = '3';
               tab [2][2] = '.';
               tab [2][3] = '4';
               tab [2][4] = '2';


            System.out.println("------------------");
            System.out.println("" + tab [0][0] + tab [0][1] + tab [0][2] + tab [0][3]);
            System.out.println("" + tab [1][0] + tab [1][1]);
            System.out.println("" + tab [2][0] + tab [2][1] + tab [2][2] + tab [2][3] + tab [2][4]);
            System.out.println("------------------");
	}
}
