import static org.junit.Assert.*;

import org.junit.Test;


public class GraphTest {
	
	private static final Graph.Edge[] GRAPH1 = {
	      new Graph.Edge("a", "b", 7),
	      new Graph.Edge("a", "c", 9),
	      new Graph.Edge("a", "f", 14),
	      new Graph.Edge("b", "c", 10),
	      new Graph.Edge("b", "d", 15),
	      new Graph.Edge("c", "d", 11),
	      new Graph.Edge("c", "f", 2),
	      new Graph.Edge("d", "e", 6),
	      new Graph.Edge("e", "f", 9),
	   };
	
	private static final Graph.Edge[] GRAPH2 = {
		new Graph.Edge("a","b",2)
	};
	
	private static final Graph.Edge[] GRAPH3 = {
		new Graph.Edge("a","b",2),
		new Graph.Edge("c","d",2)
	};
	
	private static final Graph.Edge[] GRAPH4 = {
		new Graph.Edge(Character.toString('\0'),"a",10)
	};
	
	private static final Graph.Edge[] GRAPH5 = {
		new Graph.Edge("a", "a", 10)
	};
	
	@Test
	public void graphTest01() {
		Graph g = new Graph(GRAPH2);
	    g.dijkstra("a");
	    assertEquals(g.getPath("b"),"a -> b(2)");
	}
	
	@Test
	public void graphTest02() {
		Graph g = new Graph(GRAPH2);
		g.dijkstra("a");
		assertNull(g.getPath("c"));
	}
	
	@Test
	public void graphTest03() {
		Graph g = new Graph(GRAPH3);
		g.dijkstra("a");
		assertEquals(g.getPath("c"),"c(unreached)");
	}
	
	@Test
	public void graphTest04() {
		Graph g = new Graph(GRAPH1);
		g.dijkstra("a");
		assertEquals(g.getPath("b"), "a -> b(7)");
	}
	
	@Test
	public void graphTest05() {
		Graph g = new Graph(GRAPH1);
		g.dijkstra("a");
		assertEquals(g.getPath("c"),"a -> c(9)");
	}
	
	@Test
	public void graphTest06() {
		Graph g = new Graph(GRAPH1);
		g.dijkstra("a");
		assertEquals(g.getPath("f"), "a -> c(9) -> f(11)");
	}
	
	@Test
	public void graphTest07() {
		Graph g = new Graph(GRAPH2);
		g.dijkstra("a");
		assertEquals(g.getPath("a"),"a");
	}
	
	@Test
	public void graphTest08() {
		Graph g = new Graph(GRAPH2);
		g.dijkstra("z");
		assertEquals(g.getPath("a"), "a(unreached)");
	}
	
	@Test
	public void graphTest09() {
		Graph g = new Graph(GRAPH3);
	    g.dijkstra("a");
	    assertEquals(g.getPath("b"),"a -> b(2)");
	}
	
	@Test
	public void graphTest10() {
		Graph g = new Graph(GRAPH3);
		g.dijkstra("a");
		assertEquals(g.getPath("c"), "c(unreached)");
	}
	
	
	@Test
	public void graphTest11() {
		Graph g = new Graph(GRAPH1);
		g.dijkstra("a");
		assertEquals(g.getPath("e"), "a -> c(9) -> d(20) -> e(26)");
	}
	
	@Test
	public void graphTest12() {
		Graph g = new Graph(GRAPH1);
		g.dijkstra("asdfasdfasdfasdf");
		assertEquals(g.getPath("c"),"c(unreached)");
	}
	
	@Test
	public void graphTest13() {
		Graph g = new Graph(GRAPH5);
		g.dijkstra("a");
		assertEquals(g.getPath("a"), "a");
	}
	
	@Test
	public void graphTest14() {
		Graph g = new Graph(GRAPH5);
		g.dijkstra("a");
		assertNull(g.getPath("b"));
	}
	
	@Test
	public void graphTest15() {
		Graph g = new Graph(GRAPH4);
		g.dijkstra(Character.toString('\0'));
		assertEquals(g.getPath("a"), "\0 -> a(10)");
	}
	
	


}
