package DoublyLinkedListImplement;

public class DoublyLinkedList {
	class Node {
		Object data;
		Node next;
		Node prev;

		Node(Object data) {
			this.data = data;
		}

	}

	Node head;
	int size;

	public DoublyLinkedList() {
		head = null;
		size = 0;
	}

	public void add(Object obj) {
		Node n = new Node(obj);
		if (head == null) {
			head = n;
			return;
		}
		size++;
		Node t = head;
		while (t.next != null) {
			t = t.next;
		}
		t.next = n;
		n.prev = t;

	}

	public void addFirst(Object obj) {
		Node n = new Node(obj);
		if (head == null) {
			head = n;
			return;
		}
		size++;
		head.prev = n;
		n.next = head;
		head = n;
	}

	public String toString() {
		String st = "[";
		Node t = head;
		while (t != null) {
			st = st + t.data;
			if (t.next != null)
				st = st + "<=>";
			t = t.next;

		}

		return st + "]";
	}

	public Object deleteFirst() {

		if(head==null)
		{
			System.out.println("list is empty");
			return null;
		}
		Object obj=head.data;
		
		
		head=head.next;
		head.prev=null;
		
		size--;
		return obj;
	}

	public Object deleteLast() {
		if(head==null)
		{
			System.out.println("list is empty");
			return null;
		}
		Node t=head;
		while(t.next!=null)
		{
			t=t.next;
		}
		if(t.prev==null) {
			head=null;
		}
		t.prev.next=null;
		size--;
		return t.data;
	}

	public Object delete(int in) {

		if(in<0||in>size)
		{
			System.out.println("not in range");
			return null;
		}
		if(head==null)
		{
			System.out.println("list is empty");
			return null;
		}
		Node t=head;
		while(t!=null)
		{
			if(in==0)
				break;
			in--;
			t=t.next;
		}
		if(t.prev!=null)
		{
			t.prev.next=t.next;
		}
		else
		{
			head=head.next;
			head.prev=null;
		}
			if(t.next!=null)
			{
				t.next.prev=t.prev;
			}
			size--;
			return t.data;
		}
		
	
	

}
