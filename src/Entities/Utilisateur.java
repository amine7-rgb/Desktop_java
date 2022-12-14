/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

/**
 *
 * @author GhAlone
 */
public class Utilisateur {
    private int id ; 
    private String nom ;
    private String prenom ;
    private int num_tel ;
    private String mot_pass ;
    private String genre ;
    private String adress_email ;
    private String roles ;
    private String image ; 

    public Utilisateur(int id, String mot_pass, String adress_email) {
        this.id = id;
        this.mot_pass = mot_pass;
        this.adress_email = adress_email;
    }

    public Utilisateur(int id, String nom, String prenom, int num_tel, String mot_pass, String genre, String adress_email, String image) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.num_tel = num_tel;
        this.mot_pass = mot_pass;
        this.genre = genre;
        this.adress_email = adress_email;
        this.image = image;
    }

    public Utilisateur(int id, String nom, String prenom, String mot_pass, String genre, String adress_email, String roles) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.mot_pass = mot_pass;
        this.genre = genre;
        this.adress_email = adress_email;
        this.roles = roles;
    }


    public Utilisateur(int id) {
        this.id = id;
    }



    public Utilisateur(String mot_pass, String adress_email, String roles) {
        this.mot_pass = mot_pass;
        this.adress_email = adress_email;
        this.roles = roles;
    }

    public Utilisateur(String nom, String prenom, int num_tel, String genre, String adress_email, String image) {
        this.nom = nom;
        this.prenom = prenom;
        this.num_tel = num_tel;
        this.genre = genre;
        this.adress_email = adress_email;
        this.image = image;
    }

   

    
    
    public Utilisateur(String nom, String prenom, int num_tel, String mot_pass, String genre, String adress_email, String roles, String image) {
        this.nom = nom;
        this.prenom = prenom;
        this.num_tel = num_tel;
        this.mot_pass = mot_pass;
        this.genre = genre;
        this.adress_email = adress_email;
        this.roles = roles;
        this.image = image;
    }

    public Utilisateur(int id, String nom, String prenom, int num_tel, String mot_pass, String genre, String adress_email, String roles, String image) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.num_tel = num_tel;
        this.mot_pass = mot_pass;
        this.genre = genre;
        this.adress_email = adress_email;
        this.roles = roles;
        this.image = image;
    }

    public Utilisateur(String text, String text0, String text1, String text2, String hashPassword, String toString) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Utilisateur() {
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setName(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getNum_tel() {
        return num_tel;
    }

    public void setNum_tel(int num_tel) {
        this.num_tel = num_tel;
    }

    public String getMot_pass() {
        return mot_pass;
    }

    public void setMot_pass(String mot_pass) {
        this.mot_pass = mot_pass;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getAdress_email() {
        return adress_email;
    }

    public void setAdress_email(String adress_email) {
        this.adress_email = adress_email;
    }

   
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    @Override
    public String toString() {
        return "Utilisateur{" + "id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", num_tel=" + num_tel + ", mot_pass=" + mot_pass + ", genre=" + genre + ", adress_email=" + adress_email + ", roles=" + roles + ", image=" + image + '}';
    }

    
    
    
    
}
