package uk.co.teamstag.videorental.service;

import java.util.List;

import uk.co.teamstag.videorental.domain.Video;

public class SimpleVideoManager implements VideoManager {

    private List<Video> videos;

    public List<Video> getVideos() {
        return videos;
    }

    /*public void increasePrice(int percentage) {
        if (products != null) {
            for (Product product : products) {
                double newPrice = product.getPrice().doubleValue() *
                                    (100 + percentage)/100;
                product.setPrice(newPrice);
            }
        }
    }*/

    public void setVideos(List<Video> videos) {
        this.videos = videos;
    }

}
