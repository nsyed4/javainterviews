package com.noor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AdjacencyMatrix implements Graph {

	private int[][] adjacencyMatrix;
	private int numVertices = 0;
	private GraphType graphType = GraphType.DIRECTED;

	public AdjacencyMatrix(int numVertices, GraphType graphType) {

		this.graphType = GraphType.DIRECTED;
		this.numVertices = numVertices;

		adjacencyMatrix = new int[numVertices][numVertices];

		for (int i = 0; i < numVertices; i++) {
			for (int j = 0; j < numVertices; j++) {
				adjacencyMatrix[i][j] = 0;
			}

		}
	}

	@Override
	public void addEdge(int v1, int v2) {
		if (v1 >= numVertices || v2 >= numVertices || v1 < 0 || v2 < 0) {
			throw new IllegalArgumentException("Vertex number is not valid");
		}

		adjacencyMatrix[v1][v2] = 1;
		if (graphType == GraphType.UNDIRECTED) {
			adjacencyMatrix[v2][v1] = 1;
		}

	}

	@Override
	public List<Integer> getAdjacentVertices(int v) {

		List<Integer> adjacentVertices = new ArrayList<Integer>();
		for (int i = 0; i < numVertices; i++) {
			if (adjacencyMatrix[v][i] == 1) {
				adjacentVertices.add(i);
			}

		}

		// Always return the vertices in ascending order.
		Collections.sort(adjacentVertices);

		return adjacentVertices;

	}

}
