package uk.co.teamstag.videorental.web;

import org.springframework.web.servlet.mvc.Controller;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Map;
import java.util.HashMap;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import uk.co.teamstag.videorental.service.VideoManager;

public class VideoListingController implements Controller {

    protected final Log logger = LogFactory.getLog(getClass());

    
    private VideoManager videoManager;

    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

//        String now = (new java.util.Date()).toString();
//        logger.info("returning hello view with " + now);

        Boolean ascending;
        String orderBy;





                Map<String, Object> myModel = new HashMap<String, Object>();
        //myModel.put("now", now);
        myModel.put("videos", this.videoManager.getVideos());

        return new ModelAndView("videolisting", "model", myModel);
    }


    public void setVideoManager(VideoManager videoManager) {
        this.videoManager = videoManager;
    }

}
