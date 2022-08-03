package project;

public class DoubleNode<T extends Object> {
	
	DoubleNode<T> pre;
	DoubleNode<T> next;
	T object;
	
	public DoubleNode() {
		pre = null;
		next = null;
		object = null;
	}
	
	public DoubleNode(DoubleNode<T> pre, T o, DoubleNode<T> next) {
		this.pre = pre;
		this.next = next;
		this.object = o;
	}

}


