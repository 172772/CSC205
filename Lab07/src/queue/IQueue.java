package queue;

public interface IQueue<T> {
	public boolean isEmpty();

	public void insert(T item);

	public T delete();

	public T front();

}