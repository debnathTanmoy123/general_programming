package DoublyLinkedListImplement;

public class MainRunnerDL {
public static void main(String[] args) {
	DoublyLinkedList dl=new DoublyLinkedList();
	//dl.add("A");
	dl.add("B");
	/*dl.add("C");
	dl.add("D");*/
	System.out.println(dl);
	//dl.addFirst("JAVA");
	//System.out.println(dl);
	dl.deleteFirst();
	System.out.println(dl);
	dl.deleteLast();
	System.out.println(dl);
	dl.delete(2);
	System.out.println(dl);
}
}
