package trees;

public class Trie {
	public Node root;
	
	public Trie()
	{
		root=new Node('\0');
	}	
	public void insert(String word,String meaning)
	{
		Node curr=root;
		for(int i=0;i<word.length();i++)
		{
		  char c=word.charAt(i);
		  if(curr.children[c-'a']==null)
		  {
			  curr.children[c-'a']=new Node(c);
		  }
		  curr=curr.children[c-'a'];
		}
		curr.isWord=true;
		curr.meaning=meaning;
	}
	public void search(String word)
	{
		boolean isPresent=((getNode(word)!=null)&&(getNode(word).isWord));
		if(isPresent)
		{
			System.out.println(getNode(word).meaning);
		}
		else
		{
			System.out.println("Word doesn't exist");
		}
	}
	public void display(Node root,String word)
	{
		Node curr=root;
		if(root.isWord)
		{
			word=word+curr.c;
			System.out.print(word+": "+root.meaning+",");
		}
		for(int i=0;i<26;i++)
		{
			if(curr.children[i]!=null)
			{
				word=word+curr.c;
				display(curr.children[i],word);
			}
		}
	}
	private Node getNode(String word)
	{
		Node curr=root;
		for(int i=0;i<word.length();i++)
		{
			char a=word.charAt(i);
			if(curr.children[a-'a']==null)
			{
				return null;
			}
			curr=curr.children[a-'a'];
		}
		return curr;
	}

}
