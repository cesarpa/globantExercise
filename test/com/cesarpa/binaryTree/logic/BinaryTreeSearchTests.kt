package com.cesarpa.binaryTree.logic

import com.cesarpa.binaryTree.model.Node
import org.testng.annotations.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class BinaryTreeSearchTests {

    @Test
    fun testBinaryTreeSearch() {
        val tree = buildBinaryTree()
        assertTrue(tree.containsNode(6))
        assertTrue(tree.containsNode(4))

        assertFalse(tree.containsNode(1))
    }

    @Test
    fun testBinaryTreeDeleteRecursive() {
        val tree = buildBinaryTree()
        assertTrue(tree.containsNode(9));
        tree.delete(9);

        assertFalse(tree.containsNode(9))
    }

    @Test
    fun testInOrderSearch(){
        val tree = buildBinaryTree()
        println("In Order")
        tree.inOrderSearch(tree.root)
        println("\nPre Order")
        tree.preOrderSearch(tree.root)
        println("\nPost Order")
        tree.postOrderSearch(tree.root)

        assertTrue(true)
    }


    private fun buildBinaryTree(): BinaryTreeSearch {
        val tree = BinaryTreeSearch(Node(6))
        tree.add(4);
        tree.add(8);
        tree.add(3);
        tree.add(5);
        tree.add(7);
        tree.add(9);
        return tree
    }
}