package org.qnapcn.qnapscraper.model.official;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlRootElement(name = "plugins")
@XmlAccessorType(XmlAccessType.FIELD)
public class OfficialXmlRoot {

    @XmlElement(name = "cachechk")
    private String cachechk;

//    @XmlElementWrapper(name = "items")
    @XmlElement(name = "item")
    private List<Item> items;

    // Getter and Setter methods

    public String getCachechk() {
        return cachechk;
    }

    public void setCachechk(String cachechk) {
        this.cachechk = cachechk;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    // Item class

    @XmlAccessorType(XmlAccessType.FIELD)
    public static class Item {

        private String name;
        @XmlElement(name = "internalName")
        private String internalName;
        @XmlElement(name = "changeLog")
        private List<String> changeLogs;
        private String category;
        private String type;
        private String icon80;
        private String description;
        private String fwVersion;
        private String version;

//        @XmlElementWrapper(name = "platforms")
        @XmlElement(name = "platform")
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

        // Getter and Setter methods

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getInternalName() {
            return internalName;
        }

        public void setInternalName(String internalName) {
            this.internalName = internalName;
        }


        public String getCategory() {
            return category;
        }

        public void setCategory(String category) {
            this.category = category;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getIcon80() {
            return icon80;
        }

        public void setIcon80(String icon80) {
            this.icon80 = icon80;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getFwVersion() {
            return fwVersion;
        }

        public void setFwVersion(String fwVersion) {
            this.fwVersion = fwVersion;
        }

        public String getVersion() {
            return version;
        }

        public void setVersion(String version) {
            this.version = version;
        }

        public List<Platform> getPlatforms() {
            return platforms;
        }

        public void setPlatforms(List<Platform> platforms) {
            this.platforms = platforms;
        }

        public String getPublishedDate() {
            return publishedDate;
        }

        public void setPublishedDate(String publishedDate) {
            this.publishedDate = publishedDate;
        }

        public String getMaintainer() {
            return maintainer;
        }

        public void setMaintainer(String maintainer) {
            this.maintainer = maintainer;
        }

        public String getDeveloper() {
            return developer;
        }

        public void setDeveloper(String developer) {
            this.developer = developer;
        }

        public String getForumLink() {
            return forumLink;
        }

        public void setForumLink(String forumLink) {
            this.forumLink = forumLink;
        }

        public String getIcon100() {
            return icon100;
        }

        public void setIcon100(String icon100) {
            this.icon100 = icon100;
        }

        public String getLanguage() {
            return language;
        }

        public void setLanguage(String language) {
            this.language = language;
        }

        public String getSnapshot() {
            return snapshot;
        }

        public void setSnapshot(String snapshot) {
            this.snapshot = snapshot;
        }

        public String getBannerImg() {
            return bannerImg;
        }

        public void setBannerImg(String bannerImg) {
            this.bannerImg = bannerImg;
        }

        public String getTutorialLink() {
            return tutorialLink;
        }

        public void setTutorialLink(String tutorialLink) {
            this.tutorialLink = tutorialLink;
        }

        public List<String> getChangeLogs() {
            return changeLogs;
        }

        public void setChangeLogs(List<String> changeLogs) {
            this.changeLogs = changeLogs;
        }
    }

    // Platform class

    @XmlAccessorType(XmlAccessType.FIELD)
    public static class Platform {
        private String platformID;
        private String location;
        // Getter and Setter methods


        public String getPlatformID() {
            return platformID;
        }

        public void setPlatformID(String platformID) {
            this.platformID = platformID;
        }

        public String getLocation() {
            return location;
        }

        public void setLocation(String location) {
            this.location = location;
        }
    }
}
