
public class MyQue {
Object q[];
int capacity;
int front;
int rear;
public MyQue(int capacity)
{
	this.capacity=capacity;
	this.rear=this.front=-1;
	q=new Object[this.capacity];
}
public void enQue(Object obj)
{
	if(rear==capacity-1)
	{
		System.out.println("Queue is full");
		return;
	}
	if(front==-1)
	{
		front=0;
		
	}
	q[++rear]=obj;
}
public String toString()
{
	String st="[";
	for(int i=0;i<=rear;i++)
	{
		st=st+q[i];
		if(i<rear)
			st=st+",";
	}
	return st+"]";

}

public Object deQue()
{
	if(front==-1)
	{
		System.out.println("Queue is empty");
		return null;
	}
	
	Object obj=q[front++];
	System.out.println(front);
	if(front>rear)
		front=rear-1;
	return obj;
}
public int size()
{
	return rear-front+1;
}
}
