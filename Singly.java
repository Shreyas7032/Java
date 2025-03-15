package SLL;

class Node
{
	int data;
	Node next;
	
	Node(int data)
	{
		this.data=data;
		this.next=null;
	}
}




public class Singly {

	Node head=null;
	Node tail=null;
	
	public void insert_at_front(int data)
	{
		Node newNode=new Node(data);
		if(head==null)
		{
			head=tail=newNode;
		}
		else
		{
			newNode.next=head;
			head=newNode;
		}
	}
	
	public void inser_at_end(int data)
	{
		Node newNode=new Node(data);
		if(tail==null)
		{
			head=tail=newNode;
		}
		else
		{
			tail.next=newNode;
			tail=newNode;
		}
	}
	
	public void display()
	{
	
		if(head==null)
		{
			System.out.println("LL Is Empty..");
		}
		else
		{
			Node temp=head; 
			while(temp!=null)
			{
				System.out.print(temp.data+" ");
				temp=temp.next;
			}
			
		}
		System.out.println();
	}
	
	public void insert_at_middle(int data,int pos)
	{
		Node newNode=new Node(data);
		Node temp=head;
		int currpos=1;
		if(pos==1)
		{
			insert_at_front(data);
			return;
		}
		else
		{
			while(temp!=null && currpos<pos-1)
			{
				temp=temp.next;
				currpos++;
			}
			newNode.next=temp.next;
			temp.next=newNode;
		}
	}
	
	public void delete_from_front()
	{
		if(head==null)
		{
			System.out.println("LL Is empty..");
		}
		else
		{
			head=head.next;
		}
	}
	
	public void delete_at_end()
	{
		Node temp=head;
		if(tail==null)
		{
			System.out.println("LL is empty");
		}
		else
		{
			while(temp.next.next!=null)
			{
				temp=temp.next;
			}
			temp.next=null;
			tail=temp;
		}
	}
	public void delete_from_middle(int pos)
	{
		Node temp=head;
		int currPos=1;
		if(pos==1)
		{
			delete_from_front();
			return;
		}
		else
		{
			while(temp!=null && currPos<pos-1)
			{
				temp=temp.next;
				currPos++;
			}
			temp.next=temp.next.next;
		}
	}
	
	public void find_Max()
	{
		Node temp=head;
		int maxValue=temp.data;
		while(temp!=null)
		{
			if(temp.data>maxValue)
			{
				maxValue=temp.data;
				
			}
			temp=temp.next;
			
		}
		System.out.println("Max Value is:"+maxValue);
	}
	
	public void find_Min()
	{
		Node temp=head;
		int minValue=temp.data;
		while(temp!=null)
		{
			if(temp.data<minValue)
			{
				minValue=temp.data;
			}
			temp=temp.next;
		}
		System.out.println("Min Node is:"+minValue);
	}
	public void count_Nodes()
	{
		int count=0;
		Node temp=head;
		while(temp!=null)
		{
			count++;
			temp=temp.next;
		}
		System.out.println("No of nodes in SLL is:"+count);
	}
}









