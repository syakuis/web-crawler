package org.syaku.webcrawler.crawler;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Seok Kyun. Choi. 최석균 (Syaku)
 * @since 2018. 7. 16.
 */
@Slf4j
public class NaverTest {
    @Test
    public void test() throws Exception {
        Document doc = Jsoup.connect("http://en.wikipedia.org/").get();
        log.debug(doc.title());
        Elements newsHeadlines = doc.select("#mp-itn b a");
        for (Element headline : newsHeadlines) {
          log.debug("{}\n\t{}", headline.attr("title"), headline.absUrl("href"));
        }
    }
}
