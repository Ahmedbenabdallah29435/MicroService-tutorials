package com.example.gestionjob;import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class JobService {

    private final JobRepository jobRepository;

    @Autowired
    public JobService(JobRepository jobRepository) {
        this.jobRepository = jobRepository;
    }

    public List<Job> getAllJobs() {
        return jobRepository.findAll();
    }

    public Job getJobById(Long id) {
        return jobRepository.findById(id).orElse(null);
    }

    public Job getJobByService(String service) {
        return jobRepository.findByService(service);
    }

    public void updateJobState(Long id, boolean disponible) {
        Job job = jobRepository.findById(id).orElse(null);
        if (job != null) {
            // Update the "etat" based on the availability condition
            if (disponible) {
                job.setEtat(true); // Available (Etat= oui)
            } else {
                job.setEtat(false); // Occupied (Etat= non)
            }
            jobRepository.save(job);
        }
    }
}
