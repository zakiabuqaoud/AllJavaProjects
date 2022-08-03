package ConceptProgramLangHomework2;
//Zaki Khalid Abu Qaoud 20172106
//Òßí ÎÇáÏ Òßí ÇÈæ ÞÇÚæÏ 
//20172106
public class Node<T extends Object> {
	T data;
	Node<T> next;
	public Node(T data){
		setData(data);
	}
	public Node(T data, Node<T> next){
		setData(data);
		setNext(next);
	}
	//set methods
	public void setData(T data){
		this.data = data;
	}
	public void setNext(Node<T> next){
		this.next = next;
	}
	//get Methods
	public T getData(){
		return data;
	}
	public Node<T> getNext(){
		return next;
	}
}
