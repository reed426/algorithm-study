import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int num = Integer.parseInt(br.readLine());

    Deque<String> q = new ArrayDeque<>();

    for (int i = 0; i < num; i++) {
      String[] str = br.readLine().split(" ");
      switch (str[0]) {
        case "push":
          q.add(str[1]);
          break;
        case "pop":
          if (q.isEmpty()) {
            bw.write("-1\n");
          } else {
            bw.write(q.remove() + "\n");
          }
          break;
        case "size":
          bw.write(q.size() + "\n");
          break;
        case "empty":
          if (q.isEmpty())
            bw.write("1\n");
          else
            bw.write("0\n");
          break;
        case "front":
          if (q.isEmpty())
            bw.write("-1\n");
          else
            bw.write(q.peekFirst() + "\n");
          break;
        case "back":
          if (q.isEmpty())
            bw.write("-1\n");
          else
            bw.write(q.peekLast() + "\n");
          break;
      }
    }
    bw.flush();

  }
}