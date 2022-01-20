public class Node
{

	private Student s;
	private Node next,prev;
	
	public Node()
	{
		s=null;
		next=null;
		prev=null;
	}
	
	public Node(Student s)
	{
	
		this.s=s;
		next=null;
		prev=null;
	}

	public Node getNext()
	{
		return next;
	}

	public void setNext(Node next)
	{
		this.next = next;
	}

	public Node getPrev() 
	{
		return prev;
	}

	public void setPrev(Node prev)
	{
		this.prev = prev;
	}
	
	public String toString()
	{
		String str="";
		
		str=str+s+"";
		return str;
		
	}
	
}
