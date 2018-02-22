public class Multidimension {
	public static void main(String [] args) {
		String [][] roster = new String [6][5];
		roster[4][4] = "nika";
		
	
		String [][][] threeD = new String[2][2][2];
		
		String [][][] yellowPages = {{{"shaheer","571-365-4566"},
					     {"shahid","703-224-5564"},
					     {"patrick","571-256-4456"}},
					  
					   {{"shah","571-365-4566"},
					     {"hid","703-224-5564"},
					     {"pat","571-256-4456"}}
					   };
		System.out.println("YellowPages lenght: "+array.lenght(yellowPages));

		for(int row=0; row<yellowPages.length; row++) {
			for(int col=0; col<yellowPages[row].length; col++) {
				for(int array= 0; array<=1; array++){
					System.out.println(yellowPages[row][col][array]);
				}
			}
		}
	}
}
