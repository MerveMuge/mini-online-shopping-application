//package proj2;
//import proj2.*;

/**
 * @author mug
 *
 */
public class Main {

	public static void main(String[] args) {
		FileOperator reader = new FileOperator();	    
		reader.userFileReader(args[0]);
		reader.itemFileReader(args[1]);
		reader.commandFileReader(args[2]);
		
		
	}

}
