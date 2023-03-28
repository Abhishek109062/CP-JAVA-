import java.util.*;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.Vector;
public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Main m = new Main();
        int n = sc.nextInt();
        treewithtwo bt = m.new treewithtwo();
        ArrayList<Vector<Integer>> a = new ArrayList<>();
        bt.printverticle(bt.themainone, a);
        for(Vector<Integer> x : a){
            for(int y=0; y<x.size(); y++){
                System.out.print(x.get(y)+" ");
            }
        }
    }
    private class treewithtwo {
        private class Node {
            int val;
            Node uparseleft;
            Node uparseright;
        }
        private Node themainone;
        private int size;
        public treewithtwo() {
            this.themainone = this.input();
        }
        public Node input() {
            Queue<Node> q = new LinkedList<>();
            Node nn = new Node();
            int val = sc.nextInt();
            nn.val = val;
            themainone = nn;
            q.add(themainone);
            while(!q.isEmpty()){
                Node thor = q.remove();
                int uparseleft = sc.nextInt();
                int uparseright = sc.nextInt();
                if(uparseleft != -1){
                    Node trtrew = new Node();
                    trtrew.val = uparseleft;
                    thor.uparseleft = trtrew;
                    q.add(trtrew);
                }
                if(uparseright != -1){
                    Node dawn = new Node();
                    dawn.val=uparseright;
                    thor.uparseright = dawn;
                    q.add(dawn);
                }
            }
            return themainone;
        }
        public void seedheseedh(Node themainone, int hd, TreeMap<Integer, Vector<Integer> > m)
        {
            if (themainone == null){
                return;
            }
            Vector<Integer> get = m.get(hd);
            if (get == null) {
                get = new Vector<>();
                get.add(themainone.val);
            }
            else{
                get.add(themainone.val);
            }
            m.put(hd, get);
            seedheseedh(themainone.uparseleft, hd - 1, m);
            seedheseedh(themainone.uparseright, hd + 1, m);
        }
        public void printverticle(Node themainone, ArrayList<Vector<Integer>> a)
        {
            TreeMap<Integer, Vector<Integer> > m= new TreeMap<>();
            int hd = 0;
            seedheseedh(themainone, hd, m);
            for (Entry<Integer, Vector<Integer> > entry :
                    m.entrySet()) {
                a.add(entry.getValue());
            }
        }
    }
}
