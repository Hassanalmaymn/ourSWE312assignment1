import java.util.Scanner;

import as1.ReqKeys;


public class ReqDep {

	public static void main(String[] args) {
		DoubleArrayOfKeys DAK = new DoubleArrayOfKeys();
		Scanner input = new Scanner(System.in);

		boolean x = true;
		while (x) {
		String keys=input.nextLine();
		if(keys.equals("0")) {
			x=false;
			DAK.printMatrix();
			System.exit(0);
		}
		
		String[]keysAndDependencies=keys.split(" ");
		ReqKeys key=new ReqKeys(keysAndDependencies[0]);
		DAK.insertKeys(key);
		key.insert(keysAndDependencies);}
		

	}

}
