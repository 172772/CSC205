package queue;

import java.util.*;

public class ArrayListQueue<T> implements IQueue<T> {
	ArrayList<T> body;

	public ArrayListQueue() {
		body = new ArrayList<T>();
	}

	public boolean isEmpty() {
		return (body.size() == 0);
	}

	public void insert(T item) {
		body.add(item);
	}

	public T delete() {
		if (isEmpty())
			return null;
		T item = body.get(0);
		body.remove(0);
		return item;
	}

	public T front() {
		if (isEmpty())
			return null;
		T item = body.get(0);
		return item;
	}
	
	public int size() {
		return body.size();
	}

	public boolean equals(ArrayListQueue otherQueue) {
		if(this.body.size() != otherQueue.body.size()){
			return false;
		}
		
		for(int i = 0; i<this.body.size(); i++){
			if(this.body.get(i).equals(otherQueue.body.get(i))){
				return false;
			}
		}
		
		return true;
	}

	public String toString() {
		String res = "";
		for (int i = 0; i < body.size(); i++) {
			res = res + body.get(i) + "  ";
		}
		return res;
	}
}
