package Question01;

public class QueueX {
	private int maxSize; // size of the queue
	private int [] queArray; 
	private int front; // front value of the queue
	private int rear; // Last value of the queue
	private int nItems; // number of items in the queue
	
	public QueueX(int s) {
		maxSize = s;
		queArray = new int [maxSize];
		front = 0;
		rear = -1;
		nItems = 0;
	}
	
	// insert the values to the queue
	public void insert(int j) {
		if (rear == maxSize -1) {
			System.out.println("Queue is full");
		}
		else {
			queArray [++rear] = j;
			nItems++;
		}
	}
	
	//remove the value of the queue
	public int remove() {
		if (nItems == 0) {
			System.out.println("Queue is empty!");
			return -99;
		}
		else {
			nItems--;
			return queArray[front++];
		}
	}
	
	//isEmpty 
	public boolean isEmpty() {
		if (nItems == 0) 
			return true;
		else 
			return false;
	}

	//isFull
	public boolean isFull() {
		if (nItems == maxSize)
			return true;
		else
			return false;
	}
	
}
