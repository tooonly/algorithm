package com.tooonly.binarytree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeQuick {

    public static BinaryTreeNode quickCreateLinkedBinaryTree(Object[] objs){
        List<BinaryTreeNode> datas=new ArrayList<BinaryTreeNode>();
        for(Object o:objs){
            datas.add(new LinkedBinaryTreeNode(o));
        }
        BinaryTreeNode root=datas.get(0);
        for (int i = 0; i <objs.length/2; i++) {
            datas.get(i).setLeft(datas.get(i*2+1));
            if(i*2+2<datas.size()){//避免偶数的时候 下标越界
                datas.get(i).setRight(datas.get(i*2+2));
            }
        }
        datas = null;
        return root;
    }
}
