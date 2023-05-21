package org.qnapcn.qnapscraper.model;

import lombok.Data;

import java.util.List;

@Data
public class Plugin {
    private String name;
    private String internalName;
    private String changeLog;
    private String category;
    private String type;
    private String icon80;
    private String description;
    private String fwVersion;
    private String version;
    private List<Platform> platforms;
    private String publishedDate;
    private String maintainer;
    private String developer;
    private String forumLink;
    private String icon100;
    private String language;
    private String snapshot;
    private String bannerImg;
    private String tutorialLink;
}
