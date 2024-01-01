package basic;

import java.util.*;

/*
https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/favourite-singer-a18e086a/?filter=all&sort=recent-comments&search=ja
*/

/*
Input:
5
1 1 2 2 4

Output: 2
*/

class FavoriteSinger {
	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // Not used, but needed as per the problem statement !!
		sc.nextLine();
		String[] ip = sc.nextLine().split(" ");
		sc.close();
		
		Map<String, Integer> mp = new HashMap<>();
		int mx = Integer.MIN_VALUE, res = 0;
		for (String s : ip) {
			int count = mp.getOrDefault(s, 0) + 1;
			mp.put(s, count);
			mx = count > mx ? count : mx;
		}

		for (Map.Entry<String, Integer> x : mp.entrySet()) {
			if (x.getValue() == mx) res++;
		}

		System.out.println(res);
	}
}
