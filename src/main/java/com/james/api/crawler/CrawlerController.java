package com.james.api.crawler;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CrawlerController {
    private CrawlerServiceImpl crawlerService = CrawlerServiceImpl.getInstance();




    public Map<String,?> findBugsMusic(Scanner sc) throws IOException {
        System.out.println("크롤링할 주소를 입력하세요");
        Map<String, String> paraMap = new HashMap<>();
        paraMap.put("URL", sc.next());

        return crawlerService.findNamesFromWeb(paraMap);
    }


    public Map<String,?> findMelonMusic(Scanner sc) throws IOException {
        System.out.println("크롤링할 주소를 입력하세요");
        Map<String, String> paraMap = new HashMap<>();
        paraMap.put("URL", sc.next());

        return crawlerService.findNamesFromWebMelon(paraMap);
    }
}
