

public class linkedListDep {
	public node head;
	public node current;
	public linkedListDep() {
		head=null;
	}
	public boolean empty() {
		return head==null;
	}
	public boolean full() {
		return false;
	}
	public void FindFirst() {
	current=head;
	}
	public void FindNext() {
		current=current.next;
		}
	public requr retrieve() {
		return current.data;
		}
	public void update(requr updateDataOfNode) {
		current.data=updateDataOfNode;
	}
	public void insert(requr newDataToinsert) {
		node newNodeToInsert=new node(newDataToinsert);
		
		newNodeToInsert.next=current.next;
		current.next=newNodeToInsert;
		current=newNodeToInsert;
	}
	public void insertAtend(requr newDataToinsert) {
		node newNodeToInsert=new node(newDataToinsert);
		while (current.next!=null) {
			current=current.next;
		}
		current.next=newNodeToInsert;
		current=newNodeToInsert;
	}

	public void remove() {
		if(!empty()) {
		node tmp =head;
		if(head.next==null)
			head=head.next;
		else {
		while(tmp.next!=current) {
			tmp=tmp.next;
		}
		tmp.next=current.next;
		if(current.next!=null)
		current=current.next;
		else  current=head;
				}}
		}
	public boolean last() {
		return current.next==null;
	}
public boolean search (String nameofR) {
current=head;
while(current!=null) {
	if(current.data.name.equalsIgnoreCase(nameofR))
	{ 
		return true;
	}
	current=current.next;
}
current =head;

return false;
}
public int searchtocount(String nametocheck , requr Requrtocheck) {
	if(Requrtocheck.reqdeponthisreq.search(nametocheck))
		return 1;
	return 1+searchtocount( nametocheck,Requrtocheck.reqdeponthisreq.retrieve());

	
}

public void searchwhithindex(String nametocheck , requr Requrtocheck,String  index) {
	if(Requrtocheck.reqdeponthisreq.search(nametocheck))
		Requrtocheck.reqdeponthisreq.retrieve().reqdeponthisreq.search(index);
	
searchtocount( nametocheck,Requrtocheck.reqdeponthisreq.retrieve());

	
}













public void searchtoremove(String nametocheck , requr Requrtocheck) {
	if(Requrtocheck.reqdeponthisreq.search(nametocheck))
		Requrtocheck.reqdeponthisreq.remove();
	else {
 searchtoremove( nametocheck,Requrtocheck.reqdeponthisreq.retrieve());
	}
	
}

}
