package javaapplication5;

public interface Queue
{
	void add(Object object);

	Object first();

	Object remove();

	int size();
}