import java.io.*;
import java.util.*;

class TrieNode {
    HashMap<Character,TrieNode> children;
    boolean isEndOfWord;

    TrieNode(){
        children = new HashMap<>();
        isEndOfWord = false;
    }
}

public class Main {
    static int cnt;
    static TrieNode root;
    static void insert(String word){
        TrieNode currentNode = root;
        for(char c: word.toCharArray()){
            currentNode.children.putIfAbsent(c,new TrieNode());
            currentNode = currentNode.children.get(c);
        }
        currentNode.isEndOfWord = true;
    }

    static boolean searchPrefix(String prefix){
        TrieNode currentNode = root;
        for(char c : prefix.toCharArray()){
            if(!currentNode.children.containsKey(c)){
                return false;
            }
            currentNode = currentNode.children.get(c);
        }
        return true;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        root = new TrieNode();
        for(int i=0;i<n;i++){
            String tmp = br.readLine();
            insert(tmp);
        }

        cnt=0;
        for(int i=0;i<m;i++){
            String tmp = br.readLine();
            if(searchPrefix(tmp)){
                cnt++;
            }
        }
        bw.write(cnt+"");



        bw.flush();
        bw.close();
    }
}
