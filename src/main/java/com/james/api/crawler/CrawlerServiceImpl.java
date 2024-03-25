package com.james.api.crawler;

import java.io.IOException;
import java.util.Map;


public class CrawlerServiceImpl implements CrawlerService {
    private static CrawlerServiceImpl instance = new CrawlerServiceImpl();

    private CrawlerRepository crawlerRepository;

    private CrawlerServiceImpl() {
        crawlerRepository = CrawlerRepository.getInstance();
    }
    public static CrawlerServiceImpl getInstance() {return instance;}


    @Override
    public Map<String, ?> findNamesFromWeb(Map<String, String> paraMap) throws IOException {
        return crawlerRepository.save(paraMap);
    }

    @Override
    public Map<String, ?> findNamesFromWebMelon(Map<String, String> paraMap) throws IOException {
        return crawlerRepository.saveMelon(paraMap);
    }

}
