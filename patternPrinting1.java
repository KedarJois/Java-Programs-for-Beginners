*    Print the below pattern 
 *    *****
 *    *****
 *    *****
 *    *****
 */
public class patternPrinting1 {
		public static void main(String[] args) {
			for(int i = 1 ; i <= 4; i++) {
				for(int j = 1 ; j <= 5 ; j++) {
					System.out.print("*"); // by using just print - stars will be printing next to each other like this -> *****
				}
				System.out.println("*");//by using println , starts will be printed in next line
			}
		}
}
