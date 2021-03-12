package id.co.mandiri.day2.mandiriday2.services.impl;

import id.co.mandiri.day2.mandiriday2.repository.JobHistoryRepository;
import id.co.mandiri.day2.mandiriday2.services.JobHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Transactional
@Service
public class JobHistoryServiceImpl implements JobHistoryService {

    @Autowired
    JobHistoryRepository jobHistoryRepository;

    @Override
    public void mergeUpsertJobHistoryModifiedDate() {
        Integer result = jobHistoryRepository.mergeUpsertJobHistoryModifiedDate();
        System.out.println(result);
    }
}
