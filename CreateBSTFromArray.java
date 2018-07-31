
public class CreateBSTFromArray {
	
	public static void main(String[] args) {
		int [] arr= {1,2,3,4,5,6,6,7};
		Node head= createBST( 0, arr.length-1,arr);
		inOrder(head);
	}
	
	public static  Node createBST(int s,int e,int[] arr) {		
		if(s>e) return null;
		
		if(s==e) return new Node(arr[s]);
		int m=(s+e)/2;
		Node n=new Node(arr[m],createBST(s,m-1,arr),createBST(m+1,e,arr));	
		return n;	
	}
	
	public static void inOrder(Node n) {
		if(n==null) return;
		inOrder(n.left);
		System.out.println(n.val);
		inOrder(n.right);
	}

}


class Node{
	public int val;
	public Node left;
	public Node right;
	public Node(int i,Node l,Node r){
		val=i;
		left=l;
		right=r;
	}
	public Node(int i){
		val=i;
	}
}