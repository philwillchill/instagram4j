package com.github.instagram4j.Instagram4J.models.highlights;

import com.github.instagram4j.Instagram4J.models.IGBaseModel;
import com.github.instagram4j.Instagram4J.models.user.Profile;

import lombok.Data;

@Data
public class Highlight extends IGBaseModel {
    private String id;
    private long latest_reel_media;
    private Profile user;
    private String title;
    private int media_count;
}