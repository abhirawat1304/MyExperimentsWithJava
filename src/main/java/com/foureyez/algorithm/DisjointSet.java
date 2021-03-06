package com.foureyez.algorithm;

public class DisjointSet {
	int[] arr;

	// Create a disjoint set of length n
	public DisjointSet(int n) {
		arr = new int[n + 1];

		// Initially, every node is a parent of itself.
		for (int i = 0; i <= n; i++) {
			arr[i] = i;
		}
	}

	public int find(int s) {
		if (s == arr[s]) {
			return s;
		}

		return arr[s] = find(arr[s]);
	}

	public void union(int p, int q) {
		arr[q] = p;
	}
}
