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
	   	   Boolean search = false;
	   search = Dictionary.search(searchWord);
	   if(!search)
	   {
		   System.out.println("Word doesn't exist");
	   }
	   
	   String word=" ";
	   Dictionary.display(Dictionary.getRoot(),word);
	   
	
	   System.out.println("Enter the word you want to delete: ");
	   String deleteWord;
	   deleteWord=sc.next();
	   Boolean delete = false;
	   delete = Dictionary.delete(deleteWord);
	   if(delete)
	   {
		   System.out.println("Word deleted");
	   }
	   else
	   {
		   System.out.println("Word doesn't exist");
	   }
	   
	   Dictionary.display(Dictionary.getRoot(),word);

	   String updateWord;
	   System.out.println("Enter the word to be updated ");
	   updateWord = sc.next();
	   Dictionary.update(Dictionary.getRoot(), updateWord);
	   
	   String prefixWord;
	   System.out.println("Enter the prefix :");
	   prefixWord = sc.next();
	   Dictionary.displayWithPrefix(Dictionary.getRoot(), prefixWord);
	   
	   sc.close();
	   

	}

}
