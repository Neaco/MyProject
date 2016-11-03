package com.json.decode;

import java.io.IOException;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import java.util.*;
import com.google.gson.*;

public class CallApi {
  OkHttpClient client = new OkHttpClient();

  String run(String url) throws IOException {
    Request request = new Request.Builder()
        .url(url)
        .build();

    try (Response response = client.newCall(request).execute()) {
      return response.body().string();
    }
  }

  public static void main(String[] args) throws IOException {
	Scanner sc=new Scanner(System.in);
	String tagname=null,number=null,time="time";
	String request="http://api.stackexchange.com/2.2/tags/TAGNAME/top-answerers/TIME?pagesize=NUMBER&site=stackoverflow";
	
	System.out.println("Les top answerers de quel tag voulez-vous chercher?");
     tagname= sc.nextLine();
    request =request.replace("TAGNAME", tagname);
    
    System.out.println("Combien de top answerers voulez-vous afficher?");
    number= sc.nextLine();
    request =request.replace("NUMBER", number);
    
    while(!time.equals("month")&& !time.equals("all_time"))
    {
    	System.out.println("Des 30 derniers jours ou de tous les temps? (month/all_time)");
    	time= sc.nextLine();
    }
    request =request.replace("TIME", time);  
    
    CallApi example = new CallApi();
    String response = example.run(request);
    System.out.println(response);   
    
    Gson gson=new Gson();
    Retour retour=gson.fromJson(response,Retour.class);
    retour.afficher();
    sc.close();
  }
}