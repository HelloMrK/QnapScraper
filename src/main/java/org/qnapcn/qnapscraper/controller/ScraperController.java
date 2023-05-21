package org.qnapcn.qnapscraper.controller;

import org.qnapcn.qnapscraper.model.ScraperData;
import org.qnapcn.qnapscraper.service.ScraperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/scraper")
public class ScraperController {

    @Autowired
    private ScraperService scraperService;

    @PostMapping("/scrape")
    public void scrapeAndSaveData() {
        ScraperData data = scraperService.scrapeData(); // 执行刮削操作
        scraperService.saveData(data); // 保存数据到 MongoDB
    }
}