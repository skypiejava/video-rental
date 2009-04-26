/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package uk.co.teamstag.videorental.domain;

import java.io.Serializable;

/**
 *
 * @author James
 */
public class Video implements Serializable {

    private String title;
     private String genre;
    private String ageRating;

    public String getAgeRating() {
        return ageRating;
    }

    public void setAgeRating(String ageRating) {
        this.ageRating = ageRating;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
   



}
