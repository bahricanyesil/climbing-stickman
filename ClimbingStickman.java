public class ClimbingStickman {
	
	public static void main(String[] args) {
		int stickmanHeight = Integer.parseInt(args[0]);
		int stairHeight = Integer.parseInt(args[1]);
		stickman(stickmanHeight, stairHeight);
	}
	
	public static void stickman(int h, int s) { /* This method prints out the general picture. */ // h is height of the stickman and s is height of the stair
		for(int frame=1; frame<s+2; frame++) { // This loop is created for printing out each frame. Frame is the number of frame and there is always (s+1) frames 
			for(int mainspace=0; mainspace<s-frame+1; mainspace++) { // This loop for printing out new lines to make the height of each frame equal // mainspace is initial number and from it to (s-frame)
				System.out.println();
			}
			
			repetitivespaces(frame, 0, 1, 0); /* This method prints out the blanks between the beginning of the line and head part (" O ") of the stickman with specific parameters(frame, 0, 1, 0) */ 
			System.out.println(" O ");
			repetitivespaces(frame, 0, 1, 0); /* This method prints out the blanks between the beginning of the line and the arms of the stickman with specific parameters(frame, 0, 1, 0) */ 
			System.out.println("/|\\");
			
			for(int empty=0; empty<h+frame-s-4; empty++) { // This loop is created for printing out new 'torso lines' that don't have anything else after this loop in the same line. Empty is an initial number and from it to (h+frame-s-3) 
				repetitivespaces(frame, 0, 1, 0); /* This method prints out the blanks between the beginning of the line and the torsos of the stickman with specific parameters(frame, 0, 1, 0) */
				System.out.println(" | ");
			}
			
			for(int cizgi=0; cizgi<s-frame+1; cizgi++) { // This loop is created for printing out the torsos with stair steps of the stickman in the same line. Cizgi is an initial number and from it to (s-frame)
				repetitivespaces(frame, 0, 1, 0); /* This method prints out the blanks between the beginning of the line and the torsos of the stickman with specific parameters(frame, 0, 1, 0) */ 
				System.out.print(" | ");
				repetitivespaces(s, frame, cizgi, 1); /* This method prints out the blanks between the end of the torsos of the stickman and the beginning of the stair floor with specific parameters(s, frame, cizgi, 1) */
				System.out.print("___|");
				stars(cizgi, 0, 0, 0); /* This method prints out the stars between the floor of the stair and the end of the stair with specific parameters(cizgi, 0, 0, 0) */ 
				System.out.println("|");
			}
			
			repetitivespaces(frame, 0, 1, 0); /* This method prints out the blanks between the beginning of the line and the feet part of the stickman with specific parameters(frame, 0, 1, 0) */
			System.out.print("/ \\");
			
			for(int var=0; var<frame; var++) { // This loop is created for printing out the stairs which are not in the same line with any part of the stickman except the stickman's feet. Var is an initial number and from it to (frame-1)
				System.out.print("___|");
				stars(s, frame, var, 1); /* This method prints out the stars between the floor of the stair and the end of the stair with specific parameters(s, frame, var, 1) */ 
				System.out.println("|");
				repetitivespaces(frame, var, 1, 0); /* This method prints out the blanks between the beginning of the new line and the floor of the stair with specific parameters(frame, var, 1, 0) */
			}
			System.out.println("\n\n");
		}
	}
	
	public static void repetitivespaces(int frame, int var, int cizgi, int ekstra) { /* This method prints out the exact number of spaces that is multiple of 3 between anything. Since the for loop in this method is used more than once in the program, I created this method. It takes 4 parameters whose names are frame, var, cizgi and ekstra */
		for(int firstspace=0; firstspace<3*(frame-var-cizgi+ekstra); firstspace++) { // firstspace is an initial number for this loop, it prints out the exact number of spaces that is multiple of 3 between anything with specific parameters(frame, var, cizgi, ekstra)
			System.out.print(" ");
		}
	}
	
	public static void stars(int s, int frame, int var, int ekstra) { /* This method prints out the exact number of stars that is multiple of 3 between the steps of the stairs. Since the for loop in this method is used more than once in the program, I created this method. It takes 4 parameters whose names are s, frame, var and ekstra */
		for(int yildiz3=0; yildiz3<3*(s+var-frame+ekstra); yildiz3++) { // yildiz3 is an initial number for this loop, it prints out the exact number of stars that is multiple of 3 between anything with specific parameters(s, var, frame, ekstra)
			System.out.print("*");
		}
	}
}