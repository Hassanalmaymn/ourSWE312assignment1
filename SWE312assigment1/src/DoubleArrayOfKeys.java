import java.util.Collection;

public class DoubleArrayOfKeys {
	public ReqKeys[][] ReqKeysarr;
	public int size = 0;
	public int maxsize = 0;

	public DoubleArrayOfKeys() {
		this.ReqKeysarr= new ReqKeys[100][100];
		this.maxsize = ReqKeysarr.length;

	}
	

	public boolean insertKeys(ReqKeys key) {
		ReqKeysarr[0][0] = new ReqKeys("k");
		if (this.size < this.ReqKeysarr.length){
			this.ReqKeysarr[0][size + 1 ] = key;
			this.ReqKeysarr[size + 1][0] = key;
			size++;
//		this.sort();
			return true;
		}
		return false;

	}

	public boolean insertXs(String key) {

		if (this.row(key) != -1 && this.colomn(key) != -1) {
			ReqKeysarr[row(key)][colomn(key)].nameOfReqKeys = "X";
			return true;
		}
		return false;

	}

	public int row(String key) {
		int row = -1;
		for (int i = 0; i < this.size; i++) {
			ReqKeys x = ReqKeysarr[i][0];
			if (x.nameOfReqKeys.equals(key)) {
				row = i;
			}
		}
		return row;
	}

	public int colomn(String key) {
		int colomn = -1;
		for (int i = 0; i < this.size; i++) {
			ReqKeys x = ReqKeysarr[0][i];
			if (x.nameOfReqKeys.equals(key)) {
				colomn = i;
			}
		}
		return colomn;
	}

	public void printMatrix() {

		for (int i = 0; i < this.size+1; i++) {
			for (int j = 0; j < this.size+1; j++) {
				System.out.print(this.ReqKeysarr[i][j].nameOfReqKeys + " ");
			}
			System.out.println();
		}
	}


//public void sort() {
//	for (int i = 0; i < this.size; i++) {
//		for (int j = 0; j < this.size-1; j++) {
//			if (ReqKeys[0][j].nameOfReqKeys.charAt(1)>ReqKeys[0][j+1].nameOfReqKeys.charAt(1)) {
//				ReqKeys tmp=ReqKeys[0][j];
//				ReqKeys tmp2=ReqKeys[j][0];
//				ReqKeys[0][j]=ReqKeys[0][j+1];
//				ReqKeys[0][j]=ReqKeys[j+1][0];
//				ReqKeys[0][j+1]=tmp;
//				ReqKeys[j+1][0]=tmp2;
//			}
//		}
//	}
//}

}
