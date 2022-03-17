package question13;

import java.util.Scanner;

class Node
{
	int data;
	Node next;

	Node(int data, Node next)
	{
		this.data = data;
		this.next = next;
	}
}

public class Main {
	
		public static Node findKthNode(Node head, int k)
		{
			int n = 0;
			Node curr = head;
			while (curr != null)
			{
				curr = curr.next;
				n++;
			}
			if (n >= k)
			{
				curr = head;
				for (int i = 0; i < n - k; i++) {
					curr = curr.next;
				}
			}

			return curr;
		}

		public static void main(String[] args)
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("enter the number of nods to linked list: ");
			int a = sc.nextInt();
			
			System.out.println("enter the values to list");
			int[] keys = new int[a];
			
			for(int j=0;j<=keys.length-1 ;j++) {
				keys[j]=sc.nextInt();
			}
			

			Node head = null;
			for (int i = keys.length - 1; i >= 0; i--) {
				head = new Node(keys[i], head);
			}

			int k = 3;
			Node node = findKthNode(head, k);

			if (node != null) {
				System.out.println("n'th node from the end is " + node.data);
			}
		}
	}


