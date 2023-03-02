package week7;

public class LinkedList 
{
	Node head;
	
	public LinkedList(Node head)
	{
		this.head = head;
	}
	
	public void add(Object ob)
	{
		Node toAdd = new Node(ob);
		Node lastNode = head;
		
		while(lastNode.next != null)
		{
			lastNode = lastNode.next;
		}
		
		lastNode.next = toAdd;
	}
	
	public Object get(int index)
	{
		return null;
	}
	
	public void insert(int index, Object ob)
	{}
	
	public void delete(int index)
	{
		
	}
	
	public void deleteAll()
	{
		
	}
	
	public String toString()
	{
		String outString = "";
		Node currentNode = head;
		while(currentNode != null)
		{
			outString += currentNode.data;
			outString += " -> ";
			
			currentNode = currentNode.next;
		}
		return outString;
	}
	
	public static void main(String[] args) 
	{
		Node a = new Node(1);
		LinkedList list = new LinkedList(a);
		System.out.println(list);
		
		list.add(2);
		System.out.println(list);
	}
	
	
	
	

}
