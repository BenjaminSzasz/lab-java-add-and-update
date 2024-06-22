package com.ironhack.plantmanagment.controller;

import com.ironhack.plantmanagment.model.Worker;
import com.ironhack.plantmanagment.service.WorkerService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/workers")
@RequiredArgsConstructor
public class WorkerController {
    private final WorkerService workerService;
    @GetMapping
    public List<Worker> getAllWorkers() {
        return workerService.getAllWorkers();
    }
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Worker createWorker(@RequestBody @Valid Worker worker) {
        return workerService.addWorker(worker);

    }
    @PutMapping("/{workerId}")
    public Worker updateWorker(@PathVariable Long workerId, @RequestBody  Worker worker) {
        return workerService.updateWorker(workerId,worker);
    }
    @DeleteMapping("/{workerId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteWorker(@PathVariable("workerId") Long workerId) {
        workerService.deleteWorker(workerId);
    }


}
