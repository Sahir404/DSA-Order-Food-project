package javaapplication5;



public class LinkedQueue implements Queue
{
	private Node head;
	private int size;

	public LinkedQueue()
	{
		head=new Node(null);
		size=0;
	}

	public Object first()
	{
		if(size==0)
			throw new IllegalStateException("Queue is Empty");
		return head.next.data;
	}
        public Object peek()
        {
           Object obj=head.next.data ;
           return obj;
        }
	public String toString(){
		if(size==0) return "[]";
		String buff= "[";
		for (Node p=head.next;p!=head;p=p.next)
			buff+=p.data+",";
		return buff+"\b]";
	}
	public Object removeBottomElement(){
		if(size==0) throw new IllegalStateException("Queue is Empty!");
		Object obj=head.prev.data;
		head.prev=head.prev.prev;
		head.prev.next=head;
		--size;
		return obj;
	}


	public boolean equals(LinkedQueue queue){
		if(this.size()!=queue.size()) return false;
		for (Node p=head.next,q=queue.head.next;p!=head;p=p.next,q=q.next) {
			if(!p.data.equals(q.data))
				return false;
		}
		return true;
	}



	
	public void add(Object obj)
	{
		head.prev.next = new Node(obj,head,head.prev);
		head.prev=head.prev.next;
		size++;
	}

	
	public Object remove()
	{
		if(size==0) {
                    return null;
                }
			
		Object obj=head.next.data;
		head.next=head.next.next;
		size--;
		return obj;
	}
	public void search(Object obj)
	{
		Node p = head;
		for(int i=0; i< size() ; i++)
		{
			p=p.next;
			if (p.next.data == obj)
			{
				return ;
			}
		}
	}
	public LinkedQueue clone(){
		if(size==0) return new LinkedQueue();
		LinkedQueue lk = new LinkedQueue();
		for (Node p=head.next;p!=head;p=p.next)
			lk.add(p.data);
		return lk;
	}

	




	
	public int size()
	{
		return size;
	}
	public class Node
	{
		private Object data;
		private Node next;
		private Node prev;

		public Node(Object data)
		{
			data=null;
			next=this;
			prev=this;
		}





		public Node(Object obj,Node next,Node prev)
		{
			data=obj;
			this.next=next;
			this.prev=prev;
		}

		public void setObject(Object data)
		{
			this.data=data;
		}

	}

	public static void main(String[] args) {


		LinkedQueue LQ1= new LinkedQueue();
		LQ1.add(123);
		LQ1.add(23);
		LQ1.add(56);
		LQ1.add("Hello!");
		System.out.println(LQ1.toString());

		LinkedQueue LQ2= new LinkedQueue();
		LQ2.add(64);
		LQ2.add(99);
		System.out.println(LQ1);
		System.out.println(LQ1.toString());
		System.out.println(LQ1.equals(LQ2));
		System.out.println(LQ1.clone().toString());
		System.out.println(LQ1.removeBottomElement());
		
		
		Object array[]=LQ1.toArray();
		for (int i=0;i<array.length;i++)
			System.out.print(array[i]+" ");
	}
	public Object[] toArray(){
		if(size==0) return new Object[0];
		Object array[]= new Object[size];
		int count=0;
		for (Node p=head.next;p!=head;p=p.next)
			array[count++]=p.data;
		return array;
	}

	

}


