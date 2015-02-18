import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.InputStream;
 

public class Main {
	public static void main(String[] args) {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		InputReader in = new InputReader(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		BrushFire solver = new BrushFire();
		int testCount = Integer.parseInt(in.next());
		for (int i = 1; i <= testCount; i++)
			solver.solve(i, in, out);
		out.close();
	}
}
 
class BrushFire {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int N = in.nextInt();
        int s = in.nextInt()-1;
        int T = in.nextInt();
        boolean[] save = new boolean[N];
        ArrayList<ArrayList<Integer>> adjs = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < N; i++) {
            ArrayList<Integer> adj = new ArrayList<Integer>();
            int c = in.nextInt();
            for (int j = 0; j < c; j++) {
                adj.add(in.nextInt()-1);
            }
            adjs.add(adj);
        }
        for (int i = 0; i < T; i++) {
            save[in.nextInt()-1] = true;
        }
        if (!save[s] && dfs(s, -1, adjs, save)) {
            out.println("yes");
        } else {
            out.println("no");
        }
    }
 
    private boolean dfs(int cur, int p, ArrayList<ArrayList<Integer>> adjs, boolean[] save) {
        int need = 0;
        ArrayList<Integer> adj = adjs.get(cur);
        for (int a: adj) {
            if (a == p) continue;
            if (save[a] || !dfs(a, cur, adjs, save)) need++;
        }
        return need > 1 ? false : true;
    }
}
 
class InputReader {
    public BufferedReader reader;
    public StringTokenizer tokenizer;
 
    public InputReader(InputStream stream) {
        reader = new BufferedReader(new InputStreamReader(stream));
        tokenizer = null;
    }
 
    public String next() {
        while (tokenizer == null || !tokenizer.hasMoreTokens()) {
            try {
                tokenizer = new StringTokenizer(reader.readLine());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return tokenizer.nextToken();
    }
 
    public int nextInt() {
        return Integer.parseInt(next());
    }
 
}
 






