import java.util.Scanner;

public class docker3 {
	public static void main(String[]  args) {
		Scanner dika = new Scanner(System.in);
		char KODEDika [] = {'A','B','D','E','F','G','H','L','N','T'};
		char KOTADika [][] = {
						 {'B','A','N','T','E','N',' ',' ',' ',' ',' ',' '},
						 {'J','A','K','A','R','T','A',' ',' ',' ',' ',' '},
						 {'B','A','N','D','U','N','G',' ',' ',' ',' ',' '},
						 {'C','I','R','E','B','O','N',' ',' ',' ',' ',' '},
						 {'B','O','G','O','R',' ',' ',' ',' ',' ',' ',' '},
						 {'P','E','K','A','L','O','N','G','A','N',' ',' '},
						 {'S','E','M','A','R','A','N','G',' ',' ',' ',' '},
						 {'S','U','R','A','B','A','Y','A',' ',' ',' ',' '},
						 {'M','A','L','A','N','G',' ',' ',' ',' ',' ',' '},
						 {'T','E','G','A','L',' ',' ',' ',' ',' ',' ',' '}
						 };
		 for(int i=0;i<10;i++){
			System.out.print(KODEDika[i]+"   ");
			for(int j=0;j<10;j++){
				for(int k=0;k<12;k++){
					if(i==j){
					System.out.print(KOTADika[j][k]+" ");
					}
				}
			}
			System.out.println();
		}
	}
}