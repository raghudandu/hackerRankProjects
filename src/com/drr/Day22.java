package com.drr;

import java.util.*;

class Day22{

	public static int getHeight(BinaryTreeNode root){
      //Write your code here
		if(root !=null) {
			int leftHeight=0,rightHeight =0;
			if(root.left!=null)
				leftHeight=getHeight(root.left);
			if(root.right !=null)
				rightHeight = getHeight(root.right);
			return 1+Math.max(leftHeight, rightHeight);
			
		}else {
			return -1;
		}
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
        sc.close();
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
