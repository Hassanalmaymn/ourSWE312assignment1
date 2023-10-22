package as1 ;
public class ReqKeys {
	public String nameOfReqKeys;
	protected ReqKeys[] dependecies;
	public int size;

	public ReqKeys(String nameofreqKeys) {
		nameOfReqKeys = nameofreqKeys;
		this.dependecies = new ReqKeys[100];

	}

	public void sort() {
		for (int i = 0; i < this.size; i++) {
			for (int j = 0; j < this.size - 1; j++) {
				if (dependecies[j].nameOfReqKeys
						.compareTo(dependecies[j + 1].nameOfReqKeys) > dependecies[j + 1].nameOfReqKeys
								.compareTo(dependecies[j].nameOfReqKeys)) {
					ReqKeys tmp =dependecies[j+1];
					dependecies[j+1]=dependecies[j];
					dependecies[j+1]=tmp;

				}
			}
		}
	}
		public void insert(String[] key) {
			for (int i = 0; i < key.length-1; i++) {
				this.dependecies[i]=new ReqKeys(key[i+1]);
				
			}
			this.sort();
			for (int i = 0; i < key.length-1; i++) {
				System.out.print(this.dependecies[i].nameOfReqKeys+" ");
			}
		}
//		public void print() {
//			for (int i = 0; i < dependecies.length; i++) {
//				System.out.println(this.dependecies[i]);
//			}
//		}

}
