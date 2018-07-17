package org.syaku.webcrawler.naver;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.syaku.webcrawler.core.BasicKeyword;

/**
 * @author Seok Kyun. Choi. 최석균 (Syaku)
 * @since 2018. 7. 17.
 */
public class NaverKeyword extends BasicKeyword implements Comparable<NaverKeyword> {
    public NaverKeyword(String title, int rank) {
        super(title, rank);
    }

    @Override
    public int compareTo(NaverKeyword o) {
        return super.getRank() - o.getRank();
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
