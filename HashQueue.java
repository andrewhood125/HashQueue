import java.util.HashMap;

public class HashQueue<T> implements Queue<T>
{

  private int head, tail;

  HashMap<Integer, T> hm = new HashMap<Integer, T>();

  public void enqueue(T t)
  {
    hm.put(this.tail++, t);
  }

  public T dequeue() throws EmptyQueueException
  {
    if(hm.isEmpty())
      throw new EmptyQueueException("Empty Queue");
    return hm.remove(++this.head);
  }

  public String toString()
  {
    StringBuilder sb = new StringBuilder();
    hm.forEach((k, v) -> sb.append(k + "\t=>\t" + v + "\n"));
    return sb.toString();
  }
}
