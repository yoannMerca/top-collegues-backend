package dev.top.entities;


public class NewCollegue {
    private String matricule;

    private String nom;

    private String prenom;

    private String photo;

    private String email;



    public NewCollegue(){
    }
    
    public NewCollegue(String matricule, String nom, String photo) {
    }
    
    public NewCollegue(String matricule, String nom, String prenom, String photo,String email ) {
    }

    /**
     * @return the matricule
     */
    public String getMatricule() {
        return matricule;
    }

    /**
     * @param matricule the matricule to set
     */
    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    /**
     * @return the pseudo
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param pseudo the pseudo to set
     */
    public void setNom(String pseudo) {
        this.nom = pseudo;
    }

    /**
     * @return the image
     */
    public String getPhoto() {
        return photo;
    }

    /**
     * @param image the image to set
     */
    public void setPhoto(String image) {
        this.photo = image;
    }

    
    @Override
    public String toString() {
       return "matricule =>"+ this.matricule +" pseudo =>" +this.nom +" image =>" +this.photo;
    }

    /**
     * @return the prenom
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * @param prenom the prenom to set
     */
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }
}