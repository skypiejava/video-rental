package uk.co.teamstag.videorental.service;

import java.io.Serializable;
import java.util.List;

import uk.co.teamstag.videorental.domain.Video;

public interface VideoManager extends Serializable{

   // public void increasePrice(int percentage);

    public List<Video> getVideos();

}
