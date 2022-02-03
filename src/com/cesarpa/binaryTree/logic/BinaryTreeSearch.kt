package com.cesarpa.binaryTree.logic

import com.cesarpa.binaryTree.model.Node

class BinaryTreeSearch(var root: Node) {

    fun addNodeRecursive(currentNode: Node?, value: Int): Node? {
        if (currentNode == null) {
            return currentNode
        }
        if (value < currentNode.value) {
            currentNode.left = addNodeRecursive(currentNode.left, value)
        } else if (value > currentNode.value) {
            currentNode.right = addNodeRecursive(currentNode.right, value)
        } else {
            // value already exist
            return currentNode
        }
        return currentNode
    }

    fun findRecursive(currentNode: Node?, value: Int): Boolean {
        if (currentNode == null) {
            return false
        }
        if (currentNode.value == value) {
            return true
        }
        return if (value < currentNode.value)
            findRecursive(currentNode.left, value)
        else findRecursive(currentNode.right, value)
    }

    fun containsNode(value: Int) = findRecursive(root, value)
}