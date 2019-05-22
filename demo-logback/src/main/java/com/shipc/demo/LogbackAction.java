package com.shipc.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @ClassName LogbackAction
 * @Description
 * @Author shipc
 * @Date 2019/5/8 10:42
 * @Version 1.0
 */
public class LogbackAction {
    private final static Logger logger = LoggerFactory.getLogger(LogbackAction.class);

    public static void main(String[] args) {
        logger.info("logback info");
        logger.warn("logback warn");
        logger.error("logback error");
    }
}
