import static org.junit.Assert.*;

import org.junit.Test;

public class LCAtest {

	@Test
	public void testLCA() {
		
		LCA tree = new LCA();
		tree.root = new Node(8);
		tree.root.left = new Node(7);
		tree.root.right = new Node(6);
		tree.root.left.left = new Node(5);
		tree.root.left.right = new Node(3);
		tree.root.right.left = new Node(4);
		tree.root.right.right = new Node(2);
		
		assertEquals("LCA(4, 5): 8", 8, + tree.findLCA(tree.root, 4,5));
		assertEquals("LCA(4, 6): 6", 6, + tree.findLCA(tree.root, 4,6));
		assertEquals("LCA(3, 4): 8", 8, + tree.findLCA(tree.root, 3,4));
		assertEquals("LCA(2, 4): 6", 6, + tree.findLCA(tree.root, 2,4));
		assertEquals("LCA(4, 19) is -1 because 19 is not a root ", -1, tree.findLCA(tree.root, 4, 19));
	}

	@Test
	public void testFindPath() {
		LCA tree1 = new LCA();
		tree1.root = null;
		assertEquals("LCA(1, 6) is 5", -1, tree1.findLCA(tree1.root, 1, 6));
	}

}
