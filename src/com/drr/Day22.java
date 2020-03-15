package com.drr;

import java.util.*;
import java.io.*;


class Day22{

	public static int getHeight(BinaryTreeNode root){
      //Write your code here
    }

    public static BinaryTreeNode insert(BinaryTreeNode root,int data){
        if(root==null){
            return new BinaryTreeNode(data);
        }
        else{
            BinaryTreeNode cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
	 public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        BinaryTreeNode root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        int height=getHeight(root);
        System.out.println(height);
    }
}

class BinaryTreeNode{
	BinaryTreeNode left,right;
    int data;
    BinaryTreeNode(int data){
        this.data=data;
        left=right=null;
    }
}