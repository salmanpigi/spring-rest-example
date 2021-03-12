package id.co.mandiri.day2.mandiriday2.controller;

import id.co.mandiri.day2.mandiriday2.services.JobHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/job-history")
public class JobHistoryController {

    @Autowired
    JobHistoryService jobHistoryService;

    @PostMapping("/native-query-1/merge")
    public void mergeUpsertJobHistoryModifiedDate(){
        jobHistoryService.mergeUpsertJobHistoryModifiedDate();
    }
}
