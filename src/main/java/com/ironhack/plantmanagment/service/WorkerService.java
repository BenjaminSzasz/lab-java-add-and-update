package com.ironhack.plantmanagment.service;

import com.ironhack.plantmanagment.model.Worker;
import com.ironhack.plantmanagment.repository.WorkerRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class WorkerService {
    private final WorkerRepository workerRepository;
    //find all workers
    public List<Worker> getAllWorkers() {
        return workerRepository.findAll();
    }
    //Add one worker
    public Worker addWorker(Worker worker) {
        log.info("Adding worker {}", worker);
        return workerRepository.save(worker);
    }
    //Delete one worker
    public void deleteWorker(Long workerId) {
        log.info("Deleting worker {}", workerId);
        workerRepository.deleteById(workerId.intValue());
    }
    //Update worker
    public Worker updateWorker(Long workerId, Worker worker) {
        log.info("Updating worker {}", worker);
        var workerToUpdate = workerRepository.findById(workerId.intValue()).orElseThrow();
        workerToUpdate.setWorkerName(worker.getWorkerName());
        workerToUpdate.setWorkerAddress(worker.getWorkerAddress());
        return workerRepository.save(workerToUpdate);
    }

    }


