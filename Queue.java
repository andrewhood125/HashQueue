interface Queue<T>
{
  public T dequeue() throws EmptyQueueException;
  public void enqueue(T t);
}
