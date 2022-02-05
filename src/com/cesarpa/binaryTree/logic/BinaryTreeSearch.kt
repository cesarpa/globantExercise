package com.cesarpa.binaryTree.logic

import com.cesarpa.binaryTree.model.Node

class BinaryTreeSearch(var root: Node?) {

    fun add(value: Int) = addNodeRecursive(root, value)


    fun addNodeRecursive(currentNode: Node?, value: Int): Node? {
        if (currentNode == null) {
            return Node(value)
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

    fun delete(value: Int) {
        root = deleteRecursive(root, value)
    }


    fun deleteRecursive(currentNode: Node?, value: Int): Node? {
        if (currentNode == null) {
            return null
        }

        if (currentNode.value == value) {
            currentNode.value = -1
            if (currentNode.right == null && currentNode.left == null) {
                return null
            }

            if (currentNode.right == null) {
                return currentNode.left
            }

            if (currentNode.left == null) {
                return currentNode.right
            }

            val smallestValue = findSmallestValue(currentNode.right)
            currentNode.value = smallestValue
            currentNode.right = deleteRecursive(currentNode.right, smallestValue)
            return currentNode

        }

        if (value < currentNode.value) {
            deleteRecursive(currentNode.left, value)
            return currentNode
        }
        deleteRecursive(currentNode.right, value)
        return currentNode
    }

    private fun findSmallestValue(node: Node?): Int =
        if (root?.left == null) root?.value!! else findSmallestValue(root?.left)

    fun containsNode(value: Int) = findRecursive(root, value)

    fun inOrderSearch(node: Node?){
        if(node != null){
            inOrderSearch(node.left)
            print(" ${node?.value}")
            inOrderSearch(node.right)
        }
    }

    fun preOrderSearch(node: Node?){
        if(node != null){
            print(" ${node?.value}")
            inOrderSearch(node.left)
            inOrderSearch(node.right)
        }
    }

    fun postOrderSearch(node: Node?){
        if(node != null){
            inOrderSearch(node.left)
            inOrderSearch(node.right)
            print(" ${node?.value}")
        }
    }
}