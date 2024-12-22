package com.hannibal.tech.the_supervisor.planner;

import com.hannibal.tech.the_supervisor.service.ProductFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;

public class ThreadPlanner {

    private static final Logger LOGGER = LoggerFactory.getLogger(ThreadPlanner.class);

    @Autowired
    private ProductFilter productFilter;

    private String url;


    @Scheduled(cron="0 0 22 * * *")
    public void retrieveSaveData() {
        List<>
        retrieveDataFromUrlList();
    }



    private void retrieveDataFromUrlList() {
    }


}
