package com.example;

import javafx.scene.Node;

import java.util.Queue;
import java.util.Set;

/**
 * @author Linbo Ge
 * @date 2020/6/30 9:35
 * 广度优先遍历伪代码
 */
public class BFS {

    int BFS(Node root, Node target){
        Queue<Node> queue;
        Set<Node> used;
        int step = 0;
        add root to queue;
        add node to used;
        while (queue is not empty){

            step = step + 1;

            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Node curr = the first node of queue;
                if(curr == target){
                    return step;
                }
                for (Node next : the neighbors of curr){
                    if (next is not in used){
                        add next to queue;
                        add next to used;
                    }
                }
                remove the first node from queue;
            }
        }
        return -1;
    }
}
