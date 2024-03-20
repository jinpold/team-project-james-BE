package com.james.api.crawler;

import org.jsoup.nodes.Element;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class CrawlerView {
    public static void main(Scanner sc) throws IOException {

        CrawlerController crawlerController= new CrawlerController();

        while (true) {
            System.out.println("[사용자메뉴] 0-종료\n " +
                    "1-벅스뮤직\n " +
                    "2-멜론뮤직\n ");
            switch (sc.next()) {
                case "0":
                    System.out.println("종료");
                    return;
                case "1":
                    System.out.println("1-벅스뮤직");
                    Map<String, ?> map = crawlerController.findBugsMusic(sc);
                    Iterator<Element> title = (Iterator<Element>) map.get("title");
                    Iterator<Element> artist = (Iterator<Element>) map.get("artist");
                    Iterator<Element> rank = (Iterator<Element>) map.get("rank");

                    System.out.println("벅스 뮤직 결과: ");
                    while (rank.hasNext()) {
                        System.out.println(rank.next().text() + "위 " + artist.next().text() + " - " + title.next().text());
                    }
                    break;
                case "2":
                    System.out.println("2-멜론뮤직");
                    Map<String, ?> map2 = crawlerController.findMelonMusic(sc);
                    Iterator<Element> title2 = (Iterator<Element>) map2.get("title2");
                    Iterator<Element> artist2 = (Iterator<Element>) map2.get("artist2");
                    Iterator<Element> rank2 = (Iterator<Element>) map2.get("rank2");

                    System.out.println("멜론 뮤직 결과: ");
                    while (rank2.hasNext()) {
                        System.out.println(rank2.next().text() + "위 " + artist2.next().text() + " - " + title2.next().text());
                    }
                    break;

            }
        }

    }
}


