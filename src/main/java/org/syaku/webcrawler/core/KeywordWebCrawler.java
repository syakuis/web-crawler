package org.syaku.webcrawler.core;

import java.util.List;
import java.util.Map;

/**
 * @author Seok Kyun. Choi. 최석균 (Syaku)
 * @since 2018. 7. 17.
 */
public interface KeywordWebCrawler {
    Map<String, List<Keyword>> start();
}
