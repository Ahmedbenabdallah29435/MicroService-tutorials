package com.example.gestionjob;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jobs")
public class JobController {

    private final JobService jobService;

    @Autowired
    public JobController(JobService jobService) {
        this.jobService = jobService;
    }

    @GetMapping("/")
    public List<Job> getAllJobs() {
        return jobService.getAllJobs();
    }

    @GetMapping("/{id}")
    public Job getJobById(@PathVariable Long id) {
        return jobService.getJobById(id);
    }

    @GetMapping("/service/{service}")
    public Job getJobByService(@PathVariable String service) {
        return jobService.getJobByService(service);
    }

    @PutMapping("/{id}")
    public void updateJobState(@PathVariable Long id, @RequestParam boolean disponible) {
        jobService.updateJobState(id, disponible);
    }
}
