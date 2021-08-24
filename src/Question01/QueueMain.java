package Question01;
import java.util.*;

public class QueueMain {
	public static void main(String []arg) {
		Scanner myScanner = new Scanner(System.in);
		QueueX mainQueue = new QueueX(5); //objcet
		
		for (int a = 1;  a <= 5; a++) {
			System.out.print("Enter the transaction ID : ");
			int value = myScanner.nextInt();
			mainQueue.insert(value);
		}

		QueueX evenQueue = new QueueX(5);
		QueueX oddQueue = new QueueX(5);
		
		while (!mainQueue.isEmpty()) {
			int value = mainQueue.remove();
			if (value % 2 == 0) {
				evenQueue.insert(value);
			}
			else {
				oddQueue.insert(value);
			}
		}
		System.out.println("PC 1");
		while (!evenQueue.isEmpty()) {
			System.out.println("Transaction ID : " + evenQueue.remove());
		}
		System.out.println("PC 2");
		while (!oddQueue.isEmpty()) {
			System.out.println("Transaction ID : " + oddQueue.remove());
		}
		
	}
}
