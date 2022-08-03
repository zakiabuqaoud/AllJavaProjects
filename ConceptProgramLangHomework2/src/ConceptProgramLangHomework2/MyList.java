package ConceptProgramLangHomework2;

import java.util.ArrayList;

//Zaki Khalid Abu Qaoud 20172106
//Òßí ÎÇáÏ Òßí ÇÈæ ÞÇÚæÏ 
//20172106
public class MyList<T extends Object> {
	Node<T> head;
	int length = 0;
	
	//Constractor
	public MyList() {
		head = null;
	}
	
	//addAtBegin method
	public void addAtBegin(T data){
		head = new Node(data, head);
		length++;
	}
	
	//addAtEnd method
	public void addAtEnd ( T data ) {
		Node<T> current = head;
		Node<T> point = null;
		if(current == null){
			head = new Node(data, head);
			length++;
		}else{
			for(int i=0;i<length-1;i++){
				current = current.next;
			}
			point = new Node(data,null);
			current.next = point;
			length++;
		}
	}
	//deleteUsingLoop method
	public void deleteUsingLoop (T data) { 
		Node<T> current = head.next;
		Node<T> prev = head;
		// in case delete first item and length more from one
		if(prev.data.toString().equalsIgnoreCase(data.toString())){
			head = current;
			prev.next=null;
			length--;
			return;
		}
		
		//loop
		while(current != null){
			if(current.data.toString().equalsIgnoreCase(data.toString())){
				prev.next = current.next;
				current.next = null;
				length--;
				return;
			}
			current = current.next;
			prev = prev.next;
		}
	
	}
	//deleteUsingRecursion method
	public void deleteUsingRecursionOrg (T data,Boolean on,Node<T> c,Node<T> p) {
		Node<T> current = head.next;
		Node<T> prev = head;
		if(on){	
			current = c;
			prev = p;
		}
		// in case delete first item and length more from one
		if(prev.data.toString().equalsIgnoreCase(data.toString())){
			head = current;
			prev.next=null;
			length--;
			return;
		}
		
		if(current != null){
			if (current.data.toString().equalsIgnoreCase(data.toString())){
				prev.next = current.next;
				current.next = null;
				length--;
				return;
			}else{
				current = current.next;
				prev = prev.next;
				deleteUsingRecursionOrg(data,true,current,prev);
			}
		}
		
	}
	//delete method
	public void delete (int position ) {
		//position start from 0  in linked list 
		Node<T> current = head.next;
		Node<T> prev = head;
		if(position ==0){
			//first item
			head = current;
			prev.next=null;
			length--;
			return;
		}
		while(current != null){
			for(int i=1;i<this.length;i++){
				if(position == i){
					prev.next = current.next;
					current.next = null;
					length--;
					return;
				}
				current = current.next;
				prev = prev.next;
			}
		}
	
	}
	//toString method
	public String toString(){
		Node<T> current = head;
		String s = "" ;
		while(current != null){
			s= s +  current.data.toString() +"\t";
			current = current.next;
		}
		return s;
	}
	//intersection method
	public ArrayList<String> intersection(MyList<T> list){
		Node<T> current = head;
		Node<T> currentList = list.head;
		ArrayList<String> intersectionItem = new ArrayList<String>();
		
		while(current != null){
			while(currentList != null){
				if(current.data.toString().equalsIgnoreCase(currentList.data.toString())){
					intersectionItem.add(currentList.data.toString());	
				}
				currentList= currentList.next;
			}	
			currentList = list.head;
			current = current.next;
		}
		return intersectionItem;	
	}
	public void deleteUsingRecursion(T data){
		deleteUsingRecursionOrg(data,false, null, null);
	}
	
}
