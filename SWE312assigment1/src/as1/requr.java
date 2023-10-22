package as1;

public class requr {
public String name;
public linkedListDep  reqdeponthisreq;

public requr(String name) {	
	this.name = name;
	reqdeponthisreq =new linkedListDep ();
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public linkedListDep  getReqdeponthisreq() {
	return reqdeponthisreq;
}
public void setReqdeponthisreq(linkedListDep  reqdeponthisreq) {
	this.reqdeponthisreq = reqdeponthisreq;
}


}
