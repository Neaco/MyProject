package com.json.decode;
import java.util.ArrayList;

public class Retour {
	ArrayList<Item> items;
	boolean has_more;
	long quota_max;
	long quota_remaining;
	private int i;
	
	// constructeur sans paramètres
	public Retour(){}
	
	public void afficher()
	{
		for(int i=0; i<items.size();i++)
		{
			System.out.println("Top answerer numero "+ (i+1));
			items.get(i).afficher();
			System.out.println();
		}
		
	}

}
