class RollerCoasterLine {

  public static void main(String[] args)
  {

    Queue<Character> line = new HashQueue<Character>();

    line.enqueue('A');
    line.enqueue('B');

    for(int i = 0; i < Integer.MAX_VALUE; i++)
    {
      try {
        line.dequeue();
      } catch(Exception ex) {
        System.exit(1);
      }
      line.enqueue(new Character((char) (i%57 + 65)));
    }

    System.out.println(line);
  }

}
