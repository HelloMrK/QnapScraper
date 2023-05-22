package org.qnapcn.qnapscraper.service;

import org.qnapcn.qnapscraper.model.official.OfficialXmlRoot;

import java.net.MalformedURLException;

public interface ScraperService {

    OfficialXmlRoot scrapeData();

    void saveData(OfficialXmlRoot data);
}
