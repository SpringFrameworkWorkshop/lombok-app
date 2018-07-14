package io.spring.lombok;

import lombok.extern.slf4j.Slf4j;

/*
Create a logs
*/

@Slf4j
public class LombokExample6 {
    public void tryIt () {
        log.info("info logs testing for lombok");
        log.warn("info logs testing for lombok");
        log.error("info logs testing for lombok");
    }
}

