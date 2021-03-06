import java.util.LinkedList;

public class Mary {
	public static int mary(int n, int k) {
		int i = -1;
		LinkedList<Integer> arr = new LinkedList<Integer>();

		for (int m = 1; m <= n; m++) 
			arr.add(m);
		
		while (arr.size() > 1) {
			i = (i + k) % arr.size();
			arr.remove(i);
			i--;

			if (i < 0) {
				i = i % arr.size();
				i += arr.size();
			}
		}

		return arr.get(0);
	}
}
