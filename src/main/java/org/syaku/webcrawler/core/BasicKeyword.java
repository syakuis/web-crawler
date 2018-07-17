package org.syaku.webcrawler.core;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author Seok Kyun. Choi. 최석균 (Syaku)
 * @since 2018. 7. 17.
 */
@AllArgsConstructor
public abstract class BasicKeyword implements Keyword {
    @Getter
    private final String title;
    @Getter
    private final int rank;
}
