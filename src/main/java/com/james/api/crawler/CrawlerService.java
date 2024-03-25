package com.james.api.crawler;

import java.io.IOException;
import java.util.Map;

public interface CrawlerService {

    Map<String, ?> findNamesFromWeb(Map<String, String> paraMap) throws IOException;

    Map<String, ?> findNamesFromWebMelon(Map<String, String> paraMap) throws IOException;

}
