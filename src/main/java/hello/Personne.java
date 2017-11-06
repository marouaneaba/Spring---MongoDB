package hello;
/*
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
*/

import org.springframework.data.annotation.Id;

public class Personne{
	
	@Id
	private long id;

	private String name;

	private String Prenom;
	

public Personne(){}


  public Personne(long id,String name,String Prenom){
	this.id = id;
    this.name = name;
    this.Prenom = Prenom;
  }
  
  public void setId(long id){
	  this.id = id;
  }
  
  public long getId(){
	  return this.id;
  }
  
  public void setName(String Name){
    this.name = Name;
  }

  public void setPrenom(String Prenom){
    this.Prenom = Prenom;
  }


  public String getName(){
    return name;
  }

  public String getPrenom(){
    return Prenom;
  }


  public String toString(){
    return "Name : "+this.name+" ,Prenom : "+this.Prenom;
  }

}
