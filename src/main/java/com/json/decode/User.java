package com.json.decode;

public class User {
	private long reputation;
	private long user_id;
	private String user_type;
	private long accept_rate;
	private String profile_image;
	private String display_name;
	private String link;
	
	public User(){}
	
	public void afficher()
	{
	System.out.println("ID :"+user_id +"	nom de profil :" + display_name + "		Type d'utilisateur: " + user_type);
	System.out.println("Reputation :" + reputation + "		Taux d'acceptation des réponses :" +accept_rate + "%");
	System.out.println("Lien vers le profil: " + link);
	}
}