/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajoformativo_2;

/**
 *
 * @author pc
 */
public class Twitter extends Red_Social {
    private int id;
    private String noticia;
    private int date;

    public Twitter(int id, String noticia, int date, String usuario, int Password) {
        super(usuario, Password);
        this.id = id;
        this.noticia = noticia;
        this.date = date;
    }

    public Twitter() {
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNoticia() {
        return noticia;
    }

    public void setNoticia(String noticia) {
        this.noticia = noticia;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }
    
    
    
    
    
    
}
