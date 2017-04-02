package com.noor;

import java.util.List;

public interface Graph {

	public enum GraphType {
		DIRECTED,
		UNDIRECTED
	}
	
	public void addEdge(int v1, int v2);
	public List<Integer> getAdjacentVertices(int v);
	
}
