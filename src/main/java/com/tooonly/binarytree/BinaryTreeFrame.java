package com.tooonly.binarytree;

import javax.swing.*;
import java.awt.*;

public class BinaryTreeFrame extends JFrame {
    JScrollPane scrollPane;
    BinaryTreePanel panel;

    public BinaryTreeFrame(BinaryTreeNode t){
        panel = new BinaryTreePanel(t,20,20);
        panel.setPreferredSize(new Dimension(180, 180));
        scrollPane = new JScrollPane(panel);
        getContentPane().add(scrollPane, BorderLayout.CENTER);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        pack();  // cleans up the window panel
    }

    public static void main(String[] args) {
        BinaryTreeNode root = BinaryTreeQuick.quickCreateLinkedBinaryTree(new Object[]{"A","B","C","D","E","F","G"});
        JFrame dt = new BinaryTreeFrame(root);
        dt.setVisible(true);
    }
}
