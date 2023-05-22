package org.qnapcn.qnapscraper.service.impl;

import org.junit.jupiter.api.Test;
import org.qnapcn.qnapscraper.model.official.OfficialXmlRoot;
import org.qnapcn.qnapscraper.service.ScraperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.net.MalformedURLException;

@SpringBootTest
public class ScraperServiceImplTest {

    @Autowired
    private ScraperService service;
    @Test
    public void testScraperService(){
        OfficialXmlRoot scraperData = service.scrapeData();
        System.out.println(scraperData);
    }
}