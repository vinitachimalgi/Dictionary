package logic;
import trees.Trie;
import trees.Node;

import java.util.Scanner;

public class Dictionary {
	public static void main(String [] args)
	{
	   Trie Dictionary=new Trie();
	   System.out.println("Enter the number of words you want to insert: ");
	   Scanner sc=new Scanner(System.in);
	   int n=sc.nextInt();
	   for(int i=0;i<n;i++)
	   {
		   System.out.println("Enter the word: ");
		   String word;
		   word=sc.next();
		   System.out.println("Enter the meaning: ");
		   String meaning;
		   meaning=sc.next();
		   Dictionary.insert(word,meaning);
	   }
	   System.out.println("Enter the word you want to search: ");
	   String searchWord;
	   searchWord=sc.next();
	   Dictionary.search(searchWord);
	   String word=" ";
	   Dictionary.display(Dictionary.root,word);
	   sc.close();
	}

}
