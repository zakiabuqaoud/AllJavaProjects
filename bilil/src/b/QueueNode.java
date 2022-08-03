package b;



public class QueueNode <T>{
int item;
QueueNode<T> link;

	public QueueNode() {
		item=0;
		link=null;
		}
	public QueueNode(int o,QueueNode<T> link) {
			this.item=o;
			this.link=link;
	}
}
