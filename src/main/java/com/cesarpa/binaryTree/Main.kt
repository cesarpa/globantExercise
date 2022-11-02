package com.cesarpa.binaryTree

import com.cesarpa.binaryTree.logic.BinaryTreeSearch
import com.cesarpa.binaryTree.model.Node

class Main {
}

fun main() {
    var n = Node(6)
    var tree = BinaryTreeSearch(n)
    tree.addNodeRecursive(tree.root, 6);
    tree.addNodeRecursive(tree.root, 4);
    tree.addNodeRecursive(tree.root, 8);
    tree.addNodeRecursive(tree.root, 3);
    tree.addNodeRecursive(tree.root, 5);
    tree.addNodeRecursive(tree.root, 7);
    tree.addNodeRecursive(tree.root, 9);

}