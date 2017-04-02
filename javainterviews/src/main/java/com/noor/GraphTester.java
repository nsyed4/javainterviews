package com.noor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.noor.Graph.GraphType;

public class GraphTester {

	private static Graph graph = new AdjacencyMatrix(6, GraphType.DIRECTED);
	private static List<Integer> suggestedFriends = new ArrayList<>();
	private static Map<Integer,String> map = new HashMap<>();
	
	static {
		map.put(0, "Alex");
		map.put(1, "Bob");
		map.put(2, "Tom");
		map.put(3, "Zaid");
		map.put(4, "Hares");
		map.put(5, "Hamza");
		
	}
	
	public static void main(String args[]) {

		graph.addEdge(0, 1);
		graph.addEdge(1, 2);
		graph.addEdge(1, 3);
		graph.addEdge(3, 4);
		graph.addEdge(3, 5);

		// System.out.println(getAdjacentVertices(0));

		int person=0;
		
		suggestFriends(person,true);

		System.out.println("Suggested friends of "+map.get(person)+" are: ");
		for(Integer i : suggestedFriends) {
			System.out.println(map.get(i));
		}
		

	}

	public static List<Integer> getAdjacentVertices(int v) {

		return graph.getAdjacentVertices(v);
	}

	public static List<Integer> suggestFriends(int v,boolean passOne) {

		List<Integer> friends = getAdjacentVertices(v);
		
		if (friends.size() == 0) {
			return friends;
		} else {
			for (int i = 0; i < friends.size(); i++) {
				
				int friend = friends.get(i);
				if(friend!=v) {
				if(!passOne)
				suggestedFriends.add(friend);
				
				suggestFriends(friend,false);
				}

			}

		}

		return suggestedFriends;

	}

}
