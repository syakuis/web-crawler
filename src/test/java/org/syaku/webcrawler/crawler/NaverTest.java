package org.syaku.webcrawler.crawler;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.syaku.webcrawler.core.Keyword;
import org.syaku.webcrawler.naver.NaverKeyword;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Seok Kyun. Choi. 최석균 (Syaku)
 * @since 2018. 7. 16.
 */
@Slf4j
public class NaverTest {
    @Test
    public void test() throws Exception {
        Map<String, List<Keyword>> result = new HashMap<>();
        Document doc = Jsoup.connect("https://datalab.naver.com/keyword/realtimeList.naver?where=main").get();
        Elements elements = doc.select(".section_lst_area .rank_inner");
        for (Element element : elements) {
            List<Keyword> keywords = new ArrayList<>();

            Elements rankList = element.select(".rank_list .title");
            for (Element rank : rankList) {
                keywords.add(new NaverKeyword(rank.text(), keywords.size() + 1));
            }

            result.put(element.dataset().get("datetime"), keywords);
        }

        result.entrySet().stream().forEach(o -> {
            log.debug("{}: {}", o.getKey(), o.getValue());
        });
    }
}
