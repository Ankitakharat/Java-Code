//Implement Stack of Student using DLL (Menu-Driven)

public class StudentLL 
{

   private Node head,tail;
	
	public StudentLL()
	{
		head=null;
		tail=null;
	}
	
	
	 public void push(Student s)
		{
			 Node new_node=new Node(s);
			 
			 if(head==null)
			 {
				 head=tail=new_node;
			 }
			 else
			 {
				 
				 new_node.setNext(head);
				 head.setPrev(new_node);
				 head=new_node;
			 }
			 
		}
	 
	 public void pop()
	 {
       Node temp;
		 
		 if(head==null)
		 {
			 System.out.println("LL is empty");
			 
		 }
		 else if(head==tail)
		 {
			 head=tail=null;
		 }
		 else
		 {
			 temp=tail;
			 tail=tail.getPrev();
			 tail.setNext(null);
			 temp.setPrev(null);
		}
		
		 
		 
		 
	 }
	
	 
	 public boolean isempty()
	 {
		 if(head==null)
		 return true;
		 else
		 return false;
		 
	 }
	 
	 
	 
	 public String toString()
		{
		 
			String str="";
			Node it=head;

		 	if(head==null)
		 	{
		 		str=str+"LL is epmty";
		 	}
			while(it!=null)
			{
				str=str+it+"-> \n";
				it=it.getNext();
			}
			return str;
		}
		
		
	
}
