package com.json.decode;


public class Item {
	private User user;
	private long post_count;
	private long score;
	
	public Item(){}
	
	public void afficher()
	{
		user.afficher();
		System.out.println("A post� " + post_count + " r�ponses pour un score de " + score + " points.");
	}

}