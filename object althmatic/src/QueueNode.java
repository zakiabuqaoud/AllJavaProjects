
public class QueueNode <T extends Object>{
T item;
QueueNode<T> link;

	public QueueNode() {
		item=null;
		link=null;
		}
	public QueueNode(T o,QueueNode<T> link) {
			this.item=o;
			this.link=link;
	}
}
